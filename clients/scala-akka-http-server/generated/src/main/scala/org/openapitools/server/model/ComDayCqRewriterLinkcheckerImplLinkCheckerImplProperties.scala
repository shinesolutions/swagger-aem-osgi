package org.openapitools.server.model


/**
 * @param schedulerPeriod  for example: ''null''
 * @param schedulerConcurrent  for example: ''null''
 * @param serviceBadLinkToleranceInterval  for example: ''null''
 * @param serviceCheckOverridePatterns  for example: ''null''
 * @param serviceCacheBrokenInternalLinks  for example: ''null''
 * @param serviceSpecialLinkPrefix  for example: ''null''
 * @param serviceSpecialLinkPatterns  for example: ''null''
*/
final case class ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties (
  schedulerPeriod: Option[ConfigNodePropertyInteger] = None,
  schedulerConcurrent: Option[ConfigNodePropertyBoolean] = None,
  serviceBadLinkToleranceInterval: Option[ConfigNodePropertyInteger] = None,
  serviceCheckOverridePatterns: Option[ConfigNodePropertyArray] = None,
  serviceCacheBrokenInternalLinks: Option[ConfigNodePropertyBoolean] = None,
  serviceSpecialLinkPrefix: Option[ConfigNodePropertyArray] = None,
  serviceSpecialLinkPatterns: Option[ConfigNodePropertyArray] = None
)

