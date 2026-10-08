package org.openapitools.server.api.api

import misk.inject.KAbstractModule
import misk.web.WebActionModule
import jakarta.inject.Singleton
import org.openapitools.server.api.api.ConfigmgrApiAction

@Singleton
class OpenApiModule : KAbstractModule() {
    override fun configure() {
        install(WebActionModule.create<ConfigmgrApiAction>())
    }
}