package org.openapitools.server.model


/**
 * @param processLabel  for example: ''null''
 * @param cqDamEnableSha1  for example: ''null''
 * @param cqDamMetadataXssprotectedProperties  for example: ''null''
*/
final case class ComDayCqDamCoreProcessMetadataProcessorProcessProperties (
  processLabel: Option[ConfigNodePropertyString] = None,
  cqDamEnableSha1: Option[ConfigNodePropertyBoolean] = None,
  cqDamMetadataXssprotectedProperties: Option[ConfigNodePropertyArray] = None
)

