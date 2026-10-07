package org.openapitools.server.model


/**
 * @param osgiHttpWhiteboardServletPattern  for example: ''null''
 * @param osgiHttpWhiteboardContextSelect  for example: ''null''
*/
final case class OrgApacheFelixSystemreadyImplServletSystemReadyServletProperties (
  osgiHttpWhiteboardServletPattern: Option[ConfigNodePropertyString] = None,
  osgiHttpWhiteboardContextSelect: Option[ConfigNodePropertyString] = None
)

