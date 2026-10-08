package org.openapitools.server.model


/**
 * @param cqDamEnableExtMetaExtraction  for example: ''null''
 * @param largeFileThreshold  for example: ''null''
 * @param largeCommentThreshold  for example: ''null''
*/
final case class ComDayCqDamCoreImplHandlerJpegHandlerProperties (
  cqDamEnableExtMetaExtraction: Option[ConfigNodePropertyBoolean] = None,
  largeFileThreshold: Option[ConfigNodePropertyInteger] = None,
  largeCommentThreshold: Option[ConfigNodePropertyInteger] = None
)

