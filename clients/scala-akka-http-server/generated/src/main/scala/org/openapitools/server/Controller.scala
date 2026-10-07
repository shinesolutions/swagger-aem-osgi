package org.openapitools.server

import akka.http.scaladsl.Http
import akka.http.scaladsl.server.Route
import org.openapitools.server.api.ConfigmgrApi

import akka.http.scaladsl.server.Directives._
import akka.actor.ActorSystem
import akka.stream.Materializer

class Controller(configmgr: ConfigmgrApi)(implicit system: ActorSystem, materializer: Materializer) {

    lazy val routes: Route = configmgr.route 

    Http().newServerAt("0.0.0.0", 9000).bind(routes)
}
