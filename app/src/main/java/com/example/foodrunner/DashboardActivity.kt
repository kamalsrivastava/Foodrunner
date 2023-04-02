package com.example.foodrunner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class DashboardActivity : AppCompatActivity() {

    /*Declaring the textview used for displaying the data*/
    lateinit var txtData: TextView

    /*Life-cycle method*/
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.dashboard_acctivity)

        setContentView(R.layout.dashboard_acctivity)

        /*Initialising the textview and linking it with the textview created in XML*/

        txtData = findViewById(R.id.txtNameItem1)


        /*Checking whether any data was received through the intent or not*/
        if (intent != null) {

            /*Fetching the details from the intent*/
            val details = intent.getBundleExtra("details")

            /*Getting the value of data from the bundle object*/
            val data = details?.getString("data")

            /*Checking the location from which data was sent*/
            if (data == "register" || data == "forgot") {
                /*Creating the text to be displayed*/
                val text = "Mobile Number : ${details.getString("mobile")} \n " +
                        "Password : ${details.getString("password")}"
                txtData.text = text
            } else if(data == "login") {
                /*No data was received through the intent*/
                txtData.text = ""
            }
        }
    }
}