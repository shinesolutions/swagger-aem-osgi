package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comDayCqAuthImplCugCugSupportImplProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComDayCqAuthImplCugCugSupportImplProperties(
  cugExemptedPrincipals: Option[ConfigNodePropertyArray],
  cugEnabled: Option[ConfigNodePropertyBoolean],
  cugPrincipalsRegex: Option[ConfigNodePropertyString],
  cugPrincipalsReplacement: Option[ConfigNodePropertyString]
)

object ComDayCqAuthImplCugCugSupportImplProperties {
  implicit lazy val comDayCqAuthImplCugCugSupportImplPropertiesJsonFormat: Format[ComDayCqAuthImplCugCugSupportImplProperties] = Json.format[ComDayCqAuthImplCugCugSupportImplProperties]
}

