package org.openapitools.server.model


/**
 * @param operation  for example: ''null''
 * @param operationIcon  for example: ''null''
 * @param topicName  for example: ''null''
 * @param emailEnabled  for example: ''null''
*/
final case class ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties (
  operation: Option[ConfigNodePropertyString] = None,
  operationIcon: Option[ConfigNodePropertyString] = None,
  topicName: Option[ConfigNodePropertyString] = None,
  emailEnabled: Option[ConfigNodePropertyBoolean] = None
)

