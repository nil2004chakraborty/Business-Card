package com.example.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscard.ui.theme.BusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    BusinessCard()
                }
            }
        }
    }
}

@Composable
fun TopSection(){
    Column{
        Image(
            painter = painterResource(id = R.drawable.jetpack_compose_icon_rgb),
            contentDescription = null,
            modifier = Modifier
                .wrapContentSize()
                .padding(top = 120.dp)
                .height(223.dp)
                .width(545.dp)
        )

        Text(
            text = stringResource(id = R.string.business_card_name),
            fontSize = 35.sp,
            color = Color.White,
            fontStyle = FontStyle.Italic,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(start = 24.dp)
        )

        Text(
            text= stringResource(id = R.string.title),
            fontSize = 16.sp,
            color = Color(0xFF3ddc84),
            textAlign = TextAlign.Center
        )
        Spacer(modifier = Modifier.height(160.dp))

    }
}

@Composable
fun BottomSection(){
    Column{
        Row{
            Spacer(modifier = Modifier.width(50.dp))
            Icon(
                painter = painterResource(id = R.drawable.baseline_call_white_24dp),
                contentDescription = "Call",
                modifier = Modifier
                    .height(35.dp)
                    .width(25.dp)
            )
            
            Spacer(modifier = Modifier.width(45.dp))

            Text(
                text = stringResource(id = R.string.phone_num),
                fontSize = 18.sp,
                color = Color(0xFF3ddc84)
            )
        }

    }
    Column {
        Row{
            Spacer(modifier = Modifier.width(50.dp))
            Icon(
                painter = painterResource(id = R.drawable.baseline_email_white_24dp),
                contentDescription = "Email",
                modifier = Modifier
                    .height(35.dp)
                    .width(25.dp)
            )

            Spacer(modifier = Modifier.width(45.dp))

            Text(
                text = stringResource(id = R.string.mail),
                fontSize = 18.sp,
                color = Color(0xFF3ddc84)
            )
        }
    }
    
    Spacer(modifier = Modifier.height(12.dp))
    Column {
        Row {
            Spacer(modifier = Modifier.width(50.dp))
            Icon(
                painter = painterResource(id = R.drawable.baseline_chat_white_24dp),
                contentDescription = "Chat",
                modifier = Modifier
                    .height(35.dp)
                    .width(25.dp)
            )

            Spacer(modifier = Modifier.width(45.dp))

            Text(
                text = stringResource(id = R.string.chat),
                fontSize = 18.sp,
                color = Color(0xFF3ddc84)
            )
        }
    }
}


@Composable
fun BusinessCard(){
    Column(modifier = Modifier.background(color = Color(red = 0, green = 56, blue = 85))){
        TopSection()
        BottomSection()
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    BusinessCardTheme {
        BusinessCard()
    }
}