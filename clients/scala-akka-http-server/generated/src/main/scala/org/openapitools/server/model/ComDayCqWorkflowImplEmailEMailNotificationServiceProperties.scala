package org.openapitools.server.model


/**
 * @param fromAddress  for example: ''null''
 * @param hostPrefix  for example: ''null''
 * @param notifyOnabort  for example: ''null''
 * @param notifyOncomplete  for example: ''null''
 * @param notifyOncontainercomplete  for example: ''null''
 * @param notifyUseronly  for example: ''null''
*/
final case class ComDayCqWorkflowImplEmailEMailNotificationServiceProperties (
  fromAddress: Option[ConfigNodePropertyString] = None,
  hostPrefix: Option[ConfigNodePropertyString] = None,
  notifyOnabort: Option[ConfigNodePropertyBoolean] = None,
  notifyOncomplete: Option[ConfigNodePropertyBoolean] = None,
  notifyOncontainercomplete: Option[ConfigNodePropertyBoolean] = None,
  notifyUseronly: Option[ConfigNodePropertyBoolean] = None
)

