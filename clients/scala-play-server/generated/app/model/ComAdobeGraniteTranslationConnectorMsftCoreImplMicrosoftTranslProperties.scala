package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties(
  translationFactory: Option[ConfigNodePropertyString],
  defaultConnectorLabel: Option[ConfigNodePropertyString],
  defaultConnectorAttribution: Option[ConfigNodePropertyString],
  defaultConnectorWorkspaceId: Option[ConfigNodePropertyString],
  defaultConnectorSubscriptionKey: Option[ConfigNodePropertyString],
  languageMapLocation: Option[ConfigNodePropertyString],
  categoryMapLocation: Option[ConfigNodePropertyString],
  retryAttempts: Option[ConfigNodePropertyInteger],
  timeoutCount: Option[ConfigNodePropertyInteger]
)

object ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties {
  implicit lazy val comAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslPropertiesJsonFormat: Format[ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties] = Json.format[ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties]
}

