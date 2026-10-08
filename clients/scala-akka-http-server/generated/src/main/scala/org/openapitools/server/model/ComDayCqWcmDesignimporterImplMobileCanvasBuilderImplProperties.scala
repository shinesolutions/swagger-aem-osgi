package org.openapitools.server.model


/**
 * @param filepattern  for example: ''null''
 * @param deviceGroups  for example: ''null''
 * @param buildPageNodes  for example: ''null''
 * @param buildClientLibs  for example: ''null''
 * @param buildCanvasComponent  for example: ''null''
*/
final case class ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties (
  filepattern: Option[ConfigNodePropertyString] = None,
  deviceGroups: Option[ConfigNodePropertyArray] = None,
  buildPageNodes: Option[ConfigNodePropertyBoolean] = None,
  buildClientLibs: Option[ConfigNodePropertyBoolean] = None,
  buildCanvasComponent: Option[ConfigNodePropertyBoolean] = None
)

