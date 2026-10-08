package org.openapitools.server.model


/**
 * @param payloadMoveWhiteList  for example: ''null''
 * @param payloadMoveHandleFromWorkflowProcess  for example: ''null''
*/
final case class ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperties (
  payloadMoveWhiteList: Option[ConfigNodePropertyArray] = None,
  payloadMoveHandleFromWorkflowProcess: Option[ConfigNodePropertyBoolean] = None
)

