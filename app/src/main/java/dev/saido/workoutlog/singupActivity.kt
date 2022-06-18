package dev.saido.workoutlog

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class singupActivity : AppCompatActivity() {
    lateinit var btnSignup:Button
    lateinit var tilFirstname:TextInputLayout
    lateinit var tilLastname:TextInputLayout
    lateinit var tilEmail:TextInputLayout
    lateinit var tilPassword:TextInputLayout
    lateinit var tilConfirm:TextInputLayout
    lateinit var etFirstname:TextInputEditText
    lateinit var etLastname:TextInputEditText
    lateinit var etEmail:TextInputEditText
    lateinit var etPassword:TextInputEditText
    lateinit var etConfirm:TextInputEditText
    lateinit var tvSingup:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_singup)
        btnSignup=findViewById(R.id.btnSignup)
        tvSingup=findViewById(R.id.tvSingup)
        tilFirstname=findViewById(R.id.tilFirstname)
        tilLastname=findViewById(R.id.tilLastname)
        tilEmail=findViewById(R.id.tilEmail)
        tilPassword=findViewById(R.id.tilPassword)
        tilConfirm=findViewById(R.id.tilConfirm)
        etFirstname=findViewById(R.id.etFirstname)
        etLastname=findViewById(R.id.etLastname)
        etEmail=findViewById(R.id.etEmail)
        etPassword=findViewById(R.id.etPassword)
        etConfirm=findViewById(R.id.etConfirm)

        btnSignup.setOnClickListener {

            validateSignup()
        }
        tvSingup.setOnClickListener {
            val intent = Intent(this,LoginActivity::class.java)
            startActivity(intent)

        }
    }

    fun validateSignup(){
        val firstname= etFirstname.text.toString()
        val lastname= etLastname.text.toString()
        val email = etEmail.text.toString()
        val password = etPassword.text.toString()
        val confirm = etConfirm.text.toString()
        if (firstname.isBlank()){
            tilFirstname.error= getString(R.string.first_name)
        }
        if (lastname.isBlank()){
            tilLastname.error= getString(R.string.last_name)
        }
        if (email.isBlank()){
            tilEmail.error= getString(R.string.email_signup)
        }
        if (password.isBlank()){
            tilPassword.error= getString(R.string.password_require)
        }

        if (confirm.isBlank()){
            tilConfirm.error=getString(R.string.confirmation_required)
        }

        if(password == confirm){
            tilConfirm.error=getString(R.string.confirmerror)
        }
        if(password != confirm){
            tilConfirm.error=getString(R.string.passworderror)
        }


    }


}