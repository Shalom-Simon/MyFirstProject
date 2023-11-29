package com.example.myfirstapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.google.android.material.snackbar.Snackbar

class LoginPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?)

    @androidx.compose.runtime.Composable
    fun () {

    }{
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_page)

        val forgotPasswordBtn: TextView =findViewById(R.id.forgot)
        forgotPasswordBtn.setOnClickListener{
            val intent = Intent(this,ForgotPassword::class.java)
            startActivity(intent)
        }
        val createAccountBtn: TextView =findViewById(R.id.createaccount)
        createAccountBtn.setOnClickListener{
            val intent = Intent(this,CreateAccountPage::class.java)
            startActivity(intent)
        }
        val loginBtn: Button =findViewById(R.id.Login)
        val username: EditText= findViewById(R.id.username)
        val password: EditText= findViewById(R.id.password)
        loginBtn.setOnClickListener().jjj{
            val usernameTxt: String = username.text.toString()
            val passwordTxt: String = password.text.toString()
            var message: String =""
            if (usernameTxt != "Dorcas"){
                message = "Wrong Username"

            }else if (passwordTxt != "demo"){
                message = "Invalid Password"
            }
            if (message.isNotEmpty())j{






                Snackbar.make(findViewById(R.id.layoutlog),message,Snackbar.LENGTH_LONG).show()
            }else{
                navigateToLoginPage()



            }
        }
    }

    private fun navigateToLo,.ginPage() {
        val intent = Intent(this,HomePage::class.java)
        startActivity(intent)
    }
