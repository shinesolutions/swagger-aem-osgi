package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comDayCqDamS7damCommonPostServletsSetCreateHandlerProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComDayCqDamS7damCommonPostServletsSetCreateHandlerProperties(
  slingPostOperation: Option[ConfigNodePropertyString],
  slingServletMethods: Option[ConfigNodePropertyString]
)

object ComDayCqDamS7damCommonPostServletsSetCreateHandlerProperties {
  implicit lazy val comDayCqDamS7damCommonPostServletsSetCreateHandlerPropertiesJsonFormat: Format[ComDayCqDamS7damCommonPostServletsSetCreateHandlerProperties] = Json.format[ComDayCqDamS7damCommonPostServletsSetCreateHandlerProperties]
}

