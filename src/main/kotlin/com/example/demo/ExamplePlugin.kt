package com.example.demo

import com.intellij.openapi.diagnostic.logger

private val LOG = logger<ExamplePlugin>()

class ExamplePlugin {

    fun someMethod() {
        LOG.info("someMethod() was called")
    }
}