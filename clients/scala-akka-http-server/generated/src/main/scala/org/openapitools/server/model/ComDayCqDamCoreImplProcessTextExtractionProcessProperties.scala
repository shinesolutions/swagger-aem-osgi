package org.openapitools.server.model


/**
 * @param mimeTypes  for example: ''null''
 * @param maxExtract  for example: ''null''
*/
final case class ComDayCqDamCoreImplProcessTextExtractionProcessProperties (
  mimeTypes: Option[ConfigNodePropertyArray] = None,
  maxExtract: Option[ConfigNodePropertyInteger] = None
)

