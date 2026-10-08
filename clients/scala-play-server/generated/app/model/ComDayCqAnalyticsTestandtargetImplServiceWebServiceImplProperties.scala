package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comDayCqAnalyticsTestandtargetImplServiceWebServiceImplProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplProperties(
  endpointUri: Option[ConfigNodePropertyString],
  connectionTimeout: Option[ConfigNodePropertyInteger],
  socketTimeout: Option[ConfigNodePropertyInteger]
)

object ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplProperties {
  implicit lazy val comDayCqAnalyticsTestandtargetImplServiceWebServiceImplPropertiesJsonFormat: Format[ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplProperties] = Json.format[ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplProperties]
}

