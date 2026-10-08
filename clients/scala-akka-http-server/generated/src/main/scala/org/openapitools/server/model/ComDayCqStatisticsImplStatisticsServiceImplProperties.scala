package org.openapitools.server.model


/**
 * @param schedulerPeriod  for example: ''null''
 * @param schedulerConcurrent  for example: ''null''
 * @param path  for example: ''null''
 * @param workspace  for example: ''null''
 * @param keywordsPath  for example: ''null''
 * @param asyncEntries  for example: ''null''
*/
final case class ComDayCqStatisticsImplStatisticsServiceImplProperties (
  schedulerPeriod: Option[ConfigNodePropertyInteger] = None,
  schedulerConcurrent: Option[ConfigNodePropertyBoolean] = None,
  path: Option[ConfigNodePropertyString] = None,
  workspace: Option[ConfigNodePropertyString] = None,
  keywordsPath: Option[ConfigNodePropertyString] = None,
  asyncEntries: Option[ConfigNodePropertyBoolean] = None
)

