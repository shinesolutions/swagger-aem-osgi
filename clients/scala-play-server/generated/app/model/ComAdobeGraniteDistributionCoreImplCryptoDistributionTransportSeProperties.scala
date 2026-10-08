package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeProperties(
  name: Option[ConfigNodePropertyString],
  username: Option[ConfigNodePropertyString],
  encryptedPassword: Option[ConfigNodePropertyString]
)

object ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeProperties {
  implicit lazy val comAdobeGraniteDistributionCoreImplCryptoDistributionTransportSePropertiesJsonFormat: Format[ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeProperties] = Json.format[ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeProperties]
}

