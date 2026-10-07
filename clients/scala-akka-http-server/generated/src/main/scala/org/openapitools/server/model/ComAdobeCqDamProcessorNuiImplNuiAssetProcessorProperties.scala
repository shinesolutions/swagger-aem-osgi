package org.openapitools.server.model


/**
 * @param nuiEnabled  for example: ''null''
 * @param nuiServiceUrl  for example: ''null''
 * @param nuiApiKey  for example: ''null''
*/
final case class ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties (
  nuiEnabled: Option[ConfigNodePropertyBoolean] = None,
  nuiServiceUrl: Option[ConfigNodePropertyString] = None,
  nuiApiKey: Option[ConfigNodePropertyString] = None
)

