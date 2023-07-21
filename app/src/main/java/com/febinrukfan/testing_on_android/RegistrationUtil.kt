package com.febinrukfan.testing_on_android

object RegistrationUtil {

    private val existingNames = listOf("febin","subin")

    /**
     * False Cases
     * 1. empty user name / password
     * 2. existing username
     * 3. un-matching passwords
     * 4. password less than 2
     */

    fun validateRegistrationInput(
        username: String,
        password: String,
        confirmedPassword: String
    ): Boolean{
        if(username.isEmpty() || password.isEmpty()){
            return false
        }
        if(username in existingNames){
            return false
        }
        if(password != confirmedPassword){
            return false
        }
        if(password.count {it.isDigit()} < 2){
            return false
        }
        return true
    }
}