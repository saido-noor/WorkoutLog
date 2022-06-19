package dev.saido.workoutlog

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout
import dev.saido.workoutlog.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    lateinit var binding:ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnLogin.setOnClickListener {


            validateLogin()
        }
        binding.tvSingup.setOnClickListener {
            val intent = Intent(this,singupActivity::class.java)
            startActivity(intent)

        }

    }

    fun validateLogin(){
        val email = binding.etEmail.text.toString()
        val password = binding.etPassword.text.toString()
        var error = false

        if (email.isBlank()) {
            binding.tilEmail.error=getString(R.string.email_required)
            error=true
        
        }
        if(password.isBlank()){
            binding.tilPassword.error=getString(R.string.password_required)
            error=true
        }

        if(!error) {

            
        }
    }


}