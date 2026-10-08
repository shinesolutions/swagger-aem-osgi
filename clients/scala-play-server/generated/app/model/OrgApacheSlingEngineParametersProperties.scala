package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for orgApacheSlingEngineParametersProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class OrgApacheSlingEngineParametersProperties(
  slingDefaultParameterEncoding: Option[ConfigNodePropertyString],
  slingDefaultMaxParameters: Option[ConfigNodePropertyInteger],
  fileLocation: Option[ConfigNodePropertyString],
  fileThreshold: Option[ConfigNodePropertyInteger],
  fileMax: Option[ConfigNodePropertyInteger],
  requestMax: Option[ConfigNodePropertyInteger],
  slingDefaultParameterCheckForAdditionalContainerParameters: Option[ConfigNodePropertyBoolean]
)

object OrgApacheSlingEngineParametersProperties {
  implicit lazy val orgApacheSlingEngineParametersPropertiesJsonFormat: Format[OrgApacheSlingEngineParametersProperties] = Json.format[OrgApacheSlingEngineParametersProperties]
}

