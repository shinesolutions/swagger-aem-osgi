package org.openapitools.server.model


/**
 * @param filepattern  for example: ''null''
 * @param buildPageNodes  for example: ''null''
 * @param buildClientLibs  for example: ''null''
 * @param buildCanvasComponent  for example: ''null''
*/
final case class ComDayCqWcmDesignimporterImplCanvasBuilderImplProperties (
  filepattern: Option[ConfigNodePropertyString] = None,
  buildPageNodes: Option[ConfigNodePropertyBoolean] = None,
  buildClientLibs: Option[ConfigNodePropertyBoolean] = None,
  buildCanvasComponent: Option[ConfigNodePropertyBoolean] = None
)

