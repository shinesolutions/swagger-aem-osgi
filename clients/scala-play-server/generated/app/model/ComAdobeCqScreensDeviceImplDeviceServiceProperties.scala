package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comAdobeCqScreensDeviceImplDeviceServiceProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-02T01:20:33.584884879Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComAdobeCqScreensDeviceImplDeviceServiceProperties(
  comAdobeAemScreensPlayerPingfrequency: Option[ConfigNodePropertyInteger],
  comAdobeAemScreensDevicePaswordSpecialchars: Option[ConfigNodePropertyString],
  comAdobeAemScreensDevicePaswordMinlowercasechars: Option[ConfigNodePropertyInteger],
  comAdobeAemScreensDevicePaswordMinuppercasechars: Option[ConfigNodePropertyInteger],
  comAdobeAemScreensDevicePaswordMinnumberchars: Option[ConfigNodePropertyInteger],
  comAdobeAemScreensDevicePaswordMinspecialchars: Option[ConfigNodePropertyInteger],
  comAdobeAemScreensDevicePaswordMinlength: Option[ConfigNodePropertyInteger]
)

object ComAdobeCqScreensDeviceImplDeviceServiceProperties {
  implicit lazy val comAdobeCqScreensDeviceImplDeviceServicePropertiesJsonFormat: Format[ComAdobeCqScreensDeviceImplDeviceServiceProperties] = Json.format[ComAdobeCqScreensDeviceImplDeviceServiceProperties]
}

