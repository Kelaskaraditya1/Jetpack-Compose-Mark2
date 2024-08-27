package com.starkindustries.jetpackcomposemark2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
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
@Preview(showSystemUi = true, showBackground = true)
fun PreviewFunction(){
    Column {
        CustomRow(R.drawable.batman,"Tony Stark","Ironman")
        CustomRow(R.drawable.batman,"Tony Stark","Ironman")
        CustomRow(R.drawable.batman,"Tony Stark","Ironman")
    }
}

