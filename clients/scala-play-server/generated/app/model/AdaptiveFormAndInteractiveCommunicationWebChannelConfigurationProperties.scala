package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for adaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties(
  showPlaceholder: Option[ConfigNodePropertyBoolean],
  maximumCacheEntries: Option[ConfigNodePropertyInteger],
  afScriptingCompatversion: Option[ConfigNodePropertyDropDown],
  makeFileNameUnique: Option[ConfigNodePropertyBoolean],
  generatingCompliantData: Option[ConfigNodePropertyBoolean]
)

object AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties {
  implicit lazy val adaptiveFormAndInteractiveCommunicationWebChannelConfigurationPropertiesJsonFormat: Format[AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties] = Json.format[AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties]
}

