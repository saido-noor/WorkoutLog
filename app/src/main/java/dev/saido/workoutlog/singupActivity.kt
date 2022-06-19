package dev.saido.workoutlog

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout
import dev.saido.workoutlog.databinding.ActivitySingupBinding

class singupActivity : AppCompatActivity() {
    lateinit var binding:ActivitySingupBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySingupBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnSignup.setOnClickListener {

            validateSignup()
        }
        binding.tvSingup.setOnClickListener {
            val intent = Intent(this,LoginActivity::class.java)
            startActivity(intent)

        }
    }

    fun validateSignup(){
        val firstname= binding.etFirstname.text.toString()
        val lastname= binding.etLastname.text.toString()
        val email = binding.etEmail.text.toString()
        val password = binding.etPassword.text.toString()
        val confirm = binding.etConfirm.text.toString()
        if (firstname.isBlank()){
            binding.tilFirstname.error= getString(R.string.first_name)
        }
        if (lastname.isBlank()){
            binding.tilLastname.error= getString(R.string.last_name)
        }
        if (email.isBlank()){
            binding.tilEmail.error= getString(R.string.email_signup)
        }
        if (password.isBlank()){
            binding.tilPassword.error= getString(R.string.password_require)
        }

        if (confirm.isBlank()){
            binding.tilConfirm.error=getString(R.string.confirmation_required)
        }

        if(password == confirm){
            binding.tilConfirm.error=getString(R.string.confirmerror)
        }
        if(password != confirm){
            binding.tilConfirm.error=getString(R.string.passworderror)
        }


    }


}