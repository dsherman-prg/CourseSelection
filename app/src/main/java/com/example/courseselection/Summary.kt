package com.example.courseselection

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import java.lang.StringBuilder

class Summary : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_summary)

        val extras = intent.extras
        if (extras != null){
            var firstName = extras.getString( "FirstName" )
            var lastName = extras.getString("LastName")
            var phone = extras.getString( "Phone")
            var birthDate = extras.getString("BirthDate")
            var isDegreeCert = extras.getString("isDegreeCert")
            var degreeCert = extras.getString("degreeCert")
            var class1 = extras.getString("Class1")
            var selected1 = extras.getString("Selected1")
            var class2 = extras.getString("Class2")
            var selected2 = extras.getString("Selected2")
            var class3 = extras.getString("Class3")
            var selected3 = extras.getString("Selected3")
            var class4 = extras.getString("Class4")
            var selected4 = extras.getString("Selected4")

            val txtStudent = findViewById<TextView>(R.id.txtStudent)
            val txtPhone = findViewById<TextView>(R.id.txtPhone2)
            val txtBirthDate = findViewById<TextView>(R.id.txtBirthDate)
            val txtDegreePlan = findViewById<TextView>(R.id.txtDegree)
            val txtMajor = findViewById<TextView>(R.id.txtMajor)
            val txtClassSchedule = findViewById<TextView>(R.id. txtClassSchedule)

            txtStudent.text = "$firstName $lastName"
            txtPhone.text = phone
            txtBirthDate.text = birthDate
            txtDegreePlan.text = isDegreeCert
            txtMajor.text = degreeCert

            val ClassSchedule = StringBuilder(250)
            if(class1 != ""){
                ClassSchedule.append(class1 + "\n" + selected1 + "\n\n")
            }
            if(class2 != ""){
                ClassSchedule.append(class2 + "\n" + selected2 + "\n\n")
            }
            if(class3 != ""){
                ClassSchedule.append(class3 + "\n" + selected3 + "\n\n")
            }
            if(class4 != ""){
                ClassSchedule.append(class4 + "\n" + selected4 + "\n\n")
            }

            txtClassSchedule.text = ClassSchedule
            txtClassSchedule.isEnabled = false
        }


}
}