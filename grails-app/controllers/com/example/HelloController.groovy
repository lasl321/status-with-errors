package com.example

import grails.converters.JSON

class HelloController {
    def index() {
        def errors = [
            createError("error 1"),
            createError("error 2"),
            createError("error 3")
        ]

        render status: 500, text: errors as JSON, contentType: 'application/json'
    }

    //Error createError(String description) {
    Map createError(String description) {
        //new Error(description: description)
       [description: description] 
    }
}



