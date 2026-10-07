package org.openapitools.server.model


/**
 * @param comAdobeCqScreensAnalyticsImplUrl  for example: ''null''
 * @param comAdobeCqScreensAnalyticsImplApikey  for example: ''null''
 * @param comAdobeCqScreensAnalyticsImplProject  for example: ''null''
 * @param comAdobeCqScreensAnalyticsImplEnvironment  for example: ''null''
 * @param comAdobeCqScreensAnalyticsImplSendFrequency  for example: ''null''
*/
final case class ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties (
  comAdobeCqScreensAnalyticsImplUrl: Option[ConfigNodePropertyString] = None,
  comAdobeCqScreensAnalyticsImplApikey: Option[ConfigNodePropertyString] = None,
  comAdobeCqScreensAnalyticsImplProject: Option[ConfigNodePropertyString] = None,
  comAdobeCqScreensAnalyticsImplEnvironment: Option[ConfigNodePropertyDropDown] = None,
  comAdobeCqScreensAnalyticsImplSendFrequency: Option[ConfigNodePropertyInteger] = None
)

