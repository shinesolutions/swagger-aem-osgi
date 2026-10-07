package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comDayCqAuthImplLoginSelectorHandlerProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComDayCqAuthImplLoginSelectorHandlerProperties(
  path: Option[ConfigNodePropertyString],
  serviceRanking: Option[ConfigNodePropertyInteger],
  authLoginselectorMappings: Option[ConfigNodePropertyArray],
  authLoginselectorChangepwMappings: Option[ConfigNodePropertyArray],
  authLoginselectorDefaultloginpage: Option[ConfigNodePropertyString],
  authLoginselectorDefaultchangepwpage: Option[ConfigNodePropertyString],
  authLoginselectorHandle: Option[ConfigNodePropertyArray],
  authLoginselectorHandleAllExtensions: Option[ConfigNodePropertyBoolean]
)

object ComDayCqAuthImplLoginSelectorHandlerProperties {
  implicit lazy val comDayCqAuthImplLoginSelectorHandlerPropertiesJsonFormat: Format[ComDayCqAuthImplLoginSelectorHandlerProperties] = Json.format[ComDayCqAuthImplLoginSelectorHandlerProperties]
}

