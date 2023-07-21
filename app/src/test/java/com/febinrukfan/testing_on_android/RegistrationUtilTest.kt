package com.febinrukfan.testing_on_android

import com.google.common.truth.Truth.assertThat
import org.junit.Test


class RegistrationUtilTest{

    @Test
    fun `empty username returns false`(){
        val result = RegistrationUtil.validateRegistrationInput(
            "",
            "122",
            "122"
        )
        assertThat(result).isFalse()

    }

    @Test
    fun `existing username returns false`(){

        val result = RegistrationUtil.validateRegistrationInput(
            "febin",
            "122",
            "122"
        )
        assertThat(result).isFalse()

    }

    @Test
    fun `valid username and matching passwords returns true`(){

        val result = RegistrationUtil.validateRegistrationInput(
            "James",
            "122",
            "122"
        )
        assertThat(result).isTrue()

    }

    @Test
    fun `empty passwords returns false`(){

        val result = RegistrationUtil.validateRegistrationInput(
            "James",
            "",
            ""
        )
        assertThat(result).isFalse()

    }

    @Test
    fun `incorrect passwords returns false`(){

        val result = RegistrationUtil.validateRegistrationInput(
            "James",
            "121",
            "123"
        )
        assertThat(result).isFalse()

    }

    @Test
    fun `passwords less than 2 returns false`(){

        val result = RegistrationUtil.validateRegistrationInput(
            "James",
            "1",
            "1"
        )
        assertThat(result).isFalse()

    }


}