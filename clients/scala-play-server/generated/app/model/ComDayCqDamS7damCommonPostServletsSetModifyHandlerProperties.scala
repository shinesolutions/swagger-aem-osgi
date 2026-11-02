package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comDayCqDamS7damCommonPostServletsSetModifyHandlerProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-02T01:20:33.584884879Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComDayCqDamS7damCommonPostServletsSetModifyHandlerProperties(
  slingPostOperation: Option[ConfigNodePropertyString],
  slingServletMethods: Option[ConfigNodePropertyString]
)

object ComDayCqDamS7damCommonPostServletsSetModifyHandlerProperties {
  implicit lazy val comDayCqDamS7damCommonPostServletsSetModifyHandlerPropertiesJsonFormat: Format[ComDayCqDamS7damCommonPostServletsSetModifyHandlerProperties] = Json.format[ComDayCqDamS7damCommonPostServletsSetModifyHandlerProperties]
}

