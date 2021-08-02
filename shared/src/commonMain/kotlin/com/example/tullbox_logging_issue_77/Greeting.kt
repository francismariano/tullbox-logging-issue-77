package com.example.tullbox_logging_issue_77

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}