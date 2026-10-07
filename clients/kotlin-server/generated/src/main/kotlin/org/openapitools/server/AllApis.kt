package org.openapitools.server

import io.ktor.server.routing.*
import org.openapitools.server.apis.ConfigmgrApi



fun Route.AllApis() {
    ConfigmgrApi()
}
