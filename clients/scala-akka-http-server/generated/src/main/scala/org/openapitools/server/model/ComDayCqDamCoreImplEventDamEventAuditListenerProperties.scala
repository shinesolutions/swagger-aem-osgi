package org.openapitools.server.model


/**
 * @param eventFilter  for example: ''null''
 * @param enabled  for example: ''null''
*/
final case class ComDayCqDamCoreImplEventDamEventAuditListenerProperties (
  eventFilter: Option[ConfigNodePropertyString] = None,
  enabled: Option[ConfigNodePropertyBoolean] = None
)

