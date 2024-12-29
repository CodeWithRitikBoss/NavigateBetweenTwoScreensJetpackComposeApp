package com.ritikcoder.navigatebetweentwoscreensjetpackcomposeapp

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

//@Preview(showBackground = true)
@Composable
fun ScreenA(navController: NavController){
    var name by remember {
        mutableStateOf("")
    }
    Column (
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){
        Text(text = "Screen A", fontSize = 30.sp, fontWeight = FontWeight.Bold)
        Spacer(modifier = Modifier.size(20.dp))
        OutlinedTextField(value = name, onValueChange = {
            name= it
        }, label = {Text(text = "Your name")})
        Spacer(modifier = Modifier.size(20.dp))
        Button(onClick = {
            navController.navigate(Routes.screenB+"/$name")
        }) {
            Text(text = "Goto Screen B", fontSize = 18.sp, fontWeight = FontWeight.Bold)
        }
    }
}