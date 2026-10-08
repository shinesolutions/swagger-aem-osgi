
package org.openapitools.client.model


case class ComAdobeCqScreensDeviceImplDeviceServiceProperties (
    _comAdobeAemScreensPlayerPingfrequency: Option[ConfigNodePropertyInteger],
    _comAdobeAemScreensDevicePaswordSpecialchars: Option[ConfigNodePropertyString],
    _comAdobeAemScreensDevicePaswordMinlowercasechars: Option[ConfigNodePropertyInteger],
    _comAdobeAemScreensDevicePaswordMinuppercasechars: Option[ConfigNodePropertyInteger],
    _comAdobeAemScreensDevicePaswordMinnumberchars: Option[ConfigNodePropertyInteger],
    _comAdobeAemScreensDevicePaswordMinspecialchars: Option[ConfigNodePropertyInteger],
    _comAdobeAemScreensDevicePaswordMinlength: Option[ConfigNodePropertyInteger]
)
object ComAdobeCqScreensDeviceImplDeviceServiceProperties {
    def toStringBody(var_comAdobeAemScreensPlayerPingfrequency: Object, var_comAdobeAemScreensDevicePaswordSpecialchars: Object, var_comAdobeAemScreensDevicePaswordMinlowercasechars: Object, var_comAdobeAemScreensDevicePaswordMinuppercasechars: Object, var_comAdobeAemScreensDevicePaswordMinnumberchars: Object, var_comAdobeAemScreensDevicePaswordMinspecialchars: Object, var_comAdobeAemScreensDevicePaswordMinlength: Object) =
        s"""
        | {
        | "comAdobeAemScreensPlayerPingfrequency":$var_comAdobeAemScreensPlayerPingfrequency,"comAdobeAemScreensDevicePaswordSpecialchars":$var_comAdobeAemScreensDevicePaswordSpecialchars,"comAdobeAemScreensDevicePaswordMinlowercasechars":$var_comAdobeAemScreensDevicePaswordMinlowercasechars,"comAdobeAemScreensDevicePaswordMinuppercasechars":$var_comAdobeAemScreensDevicePaswordMinuppercasechars,"comAdobeAemScreensDevicePaswordMinnumberchars":$var_comAdobeAemScreensDevicePaswordMinnumberchars,"comAdobeAemScreensDevicePaswordMinspecialchars":$var_comAdobeAemScreensDevicePaswordMinspecialchars,"comAdobeAemScreensDevicePaswordMinlength":$var_comAdobeAemScreensDevicePaswordMinlength
        | }
        """.stripMargin
}
