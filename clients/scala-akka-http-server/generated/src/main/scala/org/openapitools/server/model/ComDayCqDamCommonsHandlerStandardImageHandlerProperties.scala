package org.openapitools.server.model


/**
 * @param largeFileThreshold  for example: ''null''
 * @param largeCommentThreshold  for example: ''null''
 * @param cqDamEnableExtMetaExtraction  for example: ''null''
*/
final case class ComDayCqDamCommonsHandlerStandardImageHandlerProperties (
  largeFileThreshold: Option[ConfigNodePropertyInteger] = None,
  largeCommentThreshold: Option[ConfigNodePropertyInteger] = None,
  cqDamEnableExtMetaExtraction: Option[ConfigNodePropertyBoolean] = None
)

