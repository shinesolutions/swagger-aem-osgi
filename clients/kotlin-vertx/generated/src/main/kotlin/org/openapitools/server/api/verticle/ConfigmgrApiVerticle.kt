package org.openapitools.server.api.verticle
import io.vertx.core.Vertx
import io.vertx.core.AbstractVerticle
import io.vertx.serviceproxy.ServiceBinder

fun main(){
    Vertx.vertx().deployVerticle(ConfigmgrApiVerticle())
}

class ConfigmgrApiVerticle:AbstractVerticle() {

    override fun start() {
        val instance = (javaClass.classLoader.loadClass("org.openapitools.server.api.verticle.ConfigmgrApiImpl").newInstance() as ConfigmgrApi)
        instance.init(vertx,config())
        ServiceBinder(vertx)
            .setAddress(ConfigmgrApi.address)
            .register(ConfigmgrApi::class.java,instance)
    }
}