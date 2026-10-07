package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for orgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties(
  maxItems: Option[ConfigNodePropertyInteger],
  maxPathDepth: Option[ConfigNodePropertyInteger],
  enabled: Option[ConfigNodePropertyBoolean]
)

object OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties {
  implicit lazy val orgApacheJackrabbitOakPluginsObservationChangeCollectorProviderPropertiesJsonFormat: Format[OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties] = Json.format[OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties]
}

