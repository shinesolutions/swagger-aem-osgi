package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslInfo.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslInfo(
  pid: Option[String],
  title: Option[String],
  description: Option[String],
  properties: Option[ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties]
)

object ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslInfo {
  implicit lazy val comAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslInfoJsonFormat: Format[ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslInfo] = Json.format[ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslInfo]
}

