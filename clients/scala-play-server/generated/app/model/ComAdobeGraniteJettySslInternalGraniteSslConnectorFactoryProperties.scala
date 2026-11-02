package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-02T01:20:33.584884879Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties(
  comAdobeGraniteJettySslPort: Option[ConfigNodePropertyInteger],
  comAdobeGraniteJettySslKeystoreUser: Option[ConfigNodePropertyString],
  comAdobeGraniteJettySslKeystorePassword: Option[ConfigNodePropertyString],
  comAdobeGraniteJettySslCiphersuitesExcluded: Option[ConfigNodePropertyArray],
  comAdobeGraniteJettySslCiphersuitesIncluded: Option[ConfigNodePropertyArray],
  comAdobeGraniteJettySslClientCertificate: Option[ConfigNodePropertyDropDown]
)

object ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties {
  implicit lazy val comAdobeGraniteJettySslInternalGraniteSslConnectorFactoryPropertiesJsonFormat: Format[ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties] = Json.format[ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties]
}

