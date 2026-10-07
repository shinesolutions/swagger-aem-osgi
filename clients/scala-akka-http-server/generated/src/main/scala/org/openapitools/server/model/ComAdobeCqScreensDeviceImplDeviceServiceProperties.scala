package org.openapitools.server.model


/**
 * @param comAdobeAemScreensPlayerPingfrequency  for example: ''null''
 * @param comAdobeAemScreensDevicePaswordSpecialchars  for example: ''null''
 * @param comAdobeAemScreensDevicePaswordMinlowercasechars  for example: ''null''
 * @param comAdobeAemScreensDevicePaswordMinuppercasechars  for example: ''null''
 * @param comAdobeAemScreensDevicePaswordMinnumberchars  for example: ''null''
 * @param comAdobeAemScreensDevicePaswordMinspecialchars  for example: ''null''
 * @param comAdobeAemScreensDevicePaswordMinlength  for example: ''null''
*/
final case class ComAdobeCqScreensDeviceImplDeviceServiceProperties (
  comAdobeAemScreensPlayerPingfrequency: Option[ConfigNodePropertyInteger] = None,
  comAdobeAemScreensDevicePaswordSpecialchars: Option[ConfigNodePropertyString] = None,
  comAdobeAemScreensDevicePaswordMinlowercasechars: Option[ConfigNodePropertyInteger] = None,
  comAdobeAemScreensDevicePaswordMinuppercasechars: Option[ConfigNodePropertyInteger] = None,
  comAdobeAemScreensDevicePaswordMinnumberchars: Option[ConfigNodePropertyInteger] = None,
  comAdobeAemScreensDevicePaswordMinspecialchars: Option[ConfigNodePropertyInteger] = None,
  comAdobeAemScreensDevicePaswordMinlength: Option[ConfigNodePropertyInteger] = None
)

