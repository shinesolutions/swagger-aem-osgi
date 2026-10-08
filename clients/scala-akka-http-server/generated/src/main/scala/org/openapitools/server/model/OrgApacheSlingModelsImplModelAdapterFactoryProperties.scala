package org.openapitools.server.model


/**
 * @param osgiHttpWhiteboardListener  for example: ''null''
 * @param osgiHttpWhiteboardContextSelect  for example: ''null''
 * @param maxRecursionDepth  for example: ''null''
 * @param cleanupJobPeriod  for example: ''null''
*/
final case class OrgApacheSlingModelsImplModelAdapterFactoryProperties (
  osgiHttpWhiteboardListener: Option[ConfigNodePropertyString] = None,
  osgiHttpWhiteboardContextSelect: Option[ConfigNodePropertyString] = None,
  maxRecursionDepth: Option[ConfigNodePropertyInteger] = None,
  cleanupJobPeriod: Option[ConfigNodePropertyInteger] = None
)

