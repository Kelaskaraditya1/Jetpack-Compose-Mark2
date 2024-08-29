package com.starkindustries.jetpackcomposemark2
import android.graphics.Paint.Align
import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.windowInsetsBottomHeight
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.node.ModifierNodeElement
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.starkindustries.jetpackcomposemark2.ui.theme.JetPackComposeMark2Theme
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JetPackComposeMark2Theme {

            }
        }
    }
}
@Composable
fun ImageCompose(image_id:Int){
Image(painter = painterResource(id =image_id), contentDescription ="Image")
}
@Composable
fun TextCompose(name:String){
    Text(text = "I am "+name,
        modifier = Modifier.padding(10.dp))
}
@Composable
fun ColumnCompose(){
    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center) {
        TextCompose(name = "Ironman")
        TextCompose(name = "Batman")
    }
}
@Composable
fun RowCompose(){
    Row(modifier = Modifier.fillMaxSize(),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically) {
        TextCompose(name = "Ironman")
        TextCompose(name = "Batman")
    }
}

@Composable
fun CustomRow(imageId:Int,name:String,heroName:String){
    Row(modifier = Modifier.padding(10.dp)) {
        ImageCompose(image_id = imageId)
        Column(modifier = Modifier.padding(40.dp,10.dp,0.dp,0.dp)) {
            Text(text = heroName
            , fontSize = 30.sp,
                fontStyle = FontStyle.Normal,
                fontWeight = FontWeight.Bold
            )
            Text(text = name
                , fontSize = 20.sp,
                fontStyle = FontStyle.Normal,
                fontWeight = FontWeight.W300)
        }
    }
}
@Composable
fun TextComposeMark2(name:String){
    Text(text = name,
        textAlign = TextAlign.Center,
        modifier = Modifier
            .fillMaxSize()
            .padding(0.dp, 10.dp, 0.dp, 0.dp),
        fontSize = 20.sp,
        fontStyle = FontStyle.Normal,
        fontWeight = FontWeight.W300)
}
@Composable
fun ImageComposeMark2(imageId:Int){
    Image(painter = painterResource(id = imageId),
        contentDescription = "Kaam kar apna")
}
@Composable
fun ButtonComposeMark2(){
    Button(onClick = { },
        colors = ButtonDefaults.buttonColors(
            contentColor = Color.Black,
            containerColor = Color.Gray
        )) {
        ImageComposeMark2(imageId = R.drawable.batman)
        TextComposeMark2(name = "Aditya")
    }
}
@Composable
fun TextFieldComposeMark2(){
    val state = remember {
        mutableStateOf("")
    }
TextField(value = state.value, onValueChange = {
    state.value=it
},
    label = { TextComposeMark2(name = "Enter your name")})
}
@Composable
fun CircularImageCompose(){
    Image(painter = painterResource(id = R.drawable.ironman_arc_reactor), contentDescription = "Circle Image"
    , contentScale = ContentScale.Crop,
        modifier = Modifier
            .clickable { }
            .size(200.dp)
            .clip(CircleShape)
            .border(2.dp, Color.Red)
    )
}
@Composable
fun CustomRowMark1(){
    Row(modifier = Modifier
        .fillMaxWidth()
        .padding(0.dp, 10.dp, 0.dp, 0.dp)) {
        Image(painter = painterResource(id = R.drawable.batman), contentDescription = "batman",
            modifier = Modifier.padding(10.dp,10.dp,0.dp,0.dp))
        Column(modifier = Modifier.padding(40.dp,10.dp,0.dp,0.dp)) {
            Text(text = "Aditya",
                fontSize = 30.sp,
                fontWeight = FontWeight.W300)
            Text(text = "2021FHCO042",
                fontSize = 18.sp,
                fontWeight = FontWeight.W300,
                modifier = Modifier.padding(0.dp,10.dp,0.dp,0.dp)
            )
        }
    }
}
@Composable
@Preview(showSystemUi = true, showBackground = true)
fun PreviewFunction(){
//    Column {
//        CustomRow(R.drawable.batman,"Tony Stark","Ironman")
//        CustomRow(R.drawable.batman,"Tony Stark","Ironman")
//        CustomRow(R.drawable.batman,"Tony Stark","Ironman")
//    }
//    TextComposeMark2(name = "Aditya")
//    ImageComposeMark2(imageId = R.drawable.batman)
//    ButtonComposeMark2()
//    TextFieldComposeMark2()
    Column {
        CustomRowMark1()
        CustomRowMark1()
        CustomRowMark1()
    }
}

