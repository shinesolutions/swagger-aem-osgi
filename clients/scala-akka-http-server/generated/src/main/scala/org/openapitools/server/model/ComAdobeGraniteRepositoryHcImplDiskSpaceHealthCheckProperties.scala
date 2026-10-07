package org.openapitools.server.model


/**
 * @param hcTags  for example: ''null''
 * @param diskSpaceWarnThreshold  for example: ''null''
 * @param diskSpaceErrorThreshold  for example: ''null''
*/
final case class ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties (
  hcTags: Option[ConfigNodePropertyArray] = None,
  diskSpaceWarnThreshold: Option[ConfigNodePropertyInteger] = None,
  diskSpaceErrorThreshold: Option[ConfigNodePropertyInteger] = None
)

