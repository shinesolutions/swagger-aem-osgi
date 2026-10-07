package org.openapitools.server.model


/**
 * @param schedulerPeriod  for example: ''null''
 * @param schedulerConcurrent  for example: ''null''
 * @param goodLinkTestInterval  for example: ''null''
 * @param badLinkTestInterval  for example: ''null''
 * @param linkUnusedInterval  for example: ''null''
 * @param connectionTimeout  for example: ''null''
*/
final case class ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties (
  schedulerPeriod: Option[ConfigNodePropertyInteger] = None,
  schedulerConcurrent: Option[ConfigNodePropertyBoolean] = None,
  goodLinkTestInterval: Option[ConfigNodePropertyInteger] = None,
  badLinkTestInterval: Option[ConfigNodePropertyInteger] = None,
  linkUnusedInterval: Option[ConfigNodePropertyInteger] = None,
  connectionTimeout: Option[ConfigNodePropertyInteger] = None
)

