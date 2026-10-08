package org.openapitools

import api._
import play.api.inject.{Binding, Module => PlayModule}
import play.api.{Configuration, Environment}

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
class Module extends PlayModule {
  override def bindings(environment: Environment, configuration: Configuration): Seq[Binding[_]] = Seq(
    bind[ConfigmgrApi].to[ConfigmgrApiImpl]
  )
}
