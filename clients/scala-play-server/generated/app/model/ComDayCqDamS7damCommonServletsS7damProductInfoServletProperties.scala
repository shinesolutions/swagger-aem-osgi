package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comDayCqDamS7damCommonServletsS7damProductInfoServletProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-02T01:20:33.584884879Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComDayCqDamS7damCommonServletsS7damProductInfoServletProperties(
  slingServletPaths: Option[ConfigNodePropertyString],
  slingServletMethods: Option[ConfigNodePropertyString]
)

object ComDayCqDamS7damCommonServletsS7damProductInfoServletProperties {
  implicit lazy val comDayCqDamS7damCommonServletsS7damProductInfoServletPropertiesJsonFormat: Format[ComDayCqDamS7damCommonServletsS7damProductInfoServletProperties] = Json.format[ComDayCqDamS7damCommonServletsS7damProductInfoServletProperties]
}

