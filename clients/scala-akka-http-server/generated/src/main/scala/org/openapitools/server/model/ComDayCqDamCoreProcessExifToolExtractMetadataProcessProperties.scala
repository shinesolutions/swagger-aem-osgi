package org.openapitools.server.model


/**
 * @param processLabel  for example: ''null''
 * @param cqDamEnableSha1  for example: ''null''
*/
final case class ComDayCqDamCoreProcessExifToolExtractMetadataProcessProperties (
  processLabel: Option[ConfigNodePropertyString] = None,
  cqDamEnableSha1: Option[ConfigNodePropertyBoolean] = None
)

