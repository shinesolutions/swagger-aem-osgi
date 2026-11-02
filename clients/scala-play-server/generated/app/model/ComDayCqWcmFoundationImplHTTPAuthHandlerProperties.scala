package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comDayCqWcmFoundationImplHTTPAuthHandlerProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-02T01:20:33.584884879Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComDayCqWcmFoundationImplHTTPAuthHandlerProperties(
  path: Option[ConfigNodePropertyString],
  authHttpNologin: Option[ConfigNodePropertyBoolean],
  authHttpRealm: Option[ConfigNodePropertyString],
  authDefaultLoginpage: Option[ConfigNodePropertyString],
  authCredForm: Option[ConfigNodePropertyArray],
  authCredUtf8: Option[ConfigNodePropertyArray]
)

object ComDayCqWcmFoundationImplHTTPAuthHandlerProperties {
  implicit lazy val comDayCqWcmFoundationImplHTTPAuthHandlerPropertiesJsonFormat: Format[ComDayCqWcmFoundationImplHTTPAuthHandlerProperties] = Json.format[ComDayCqWcmFoundationImplHTTPAuthHandlerProperties]
}

