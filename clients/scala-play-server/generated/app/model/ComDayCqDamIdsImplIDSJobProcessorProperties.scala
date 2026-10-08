package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comDayCqDamIdsImplIDSJobProcessorProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComDayCqDamIdsImplIDSJobProcessorProperties(
  enableMultisession: Option[ConfigNodePropertyBoolean],
  idsCcEnable: Option[ConfigNodePropertyBoolean],
  enableRetry: Option[ConfigNodePropertyBoolean],
  enableRetryScripterror: Option[ConfigNodePropertyBoolean],
  externalizerDomainCqhost: Option[ConfigNodePropertyString],
  externalizerDomainHttp: Option[ConfigNodePropertyString]
)

object ComDayCqDamIdsImplIDSJobProcessorProperties {
  implicit lazy val comDayCqDamIdsImplIDSJobProcessorPropertiesJsonFormat: Format[ComDayCqDamIdsImplIDSJobProcessorProperties] = Json.format[ComDayCqDamIdsImplIDSJobProcessorProperties]
}

