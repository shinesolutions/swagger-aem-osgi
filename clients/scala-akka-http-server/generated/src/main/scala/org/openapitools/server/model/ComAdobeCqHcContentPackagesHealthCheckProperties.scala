package org.openapitools.server.model


/**
 * @param hcName  for example: ''null''
 * @param hcTags  for example: ''null''
 * @param hcMbeanName  for example: ''null''
 * @param packageNames  for example: ''null''
*/
final case class ComAdobeCqHcContentPackagesHealthCheckProperties (
  hcName: Option[ConfigNodePropertyString] = None,
  hcTags: Option[ConfigNodePropertyArray] = None,
  hcMbeanName: Option[ConfigNodePropertyString] = None,
  packageNames: Option[ConfigNodePropertyArray] = None
)

