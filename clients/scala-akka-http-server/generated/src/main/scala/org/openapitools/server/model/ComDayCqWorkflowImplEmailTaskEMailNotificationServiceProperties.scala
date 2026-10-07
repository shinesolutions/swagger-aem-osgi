package org.openapitools.server.model


/**
 * @param notifyOnupdate  for example: ''null''
 * @param notifyOncomplete  for example: ''null''
*/
final case class ComDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties (
  notifyOnupdate: Option[ConfigNodePropertyBoolean] = None,
  notifyOncomplete: Option[ConfigNodePropertyBoolean] = None
)

