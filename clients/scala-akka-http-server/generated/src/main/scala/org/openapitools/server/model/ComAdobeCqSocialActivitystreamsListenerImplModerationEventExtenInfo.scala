package org.openapitools.server.model


/**
 * @param pid  for example: ''null''
 * @param title  for example: ''null''
 * @param description  for example: ''null''
 * @param properties  for example: ''null''
*/
final case class ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenInfo (
  pid: Option[String] = None,
  title: Option[String] = None,
  description: Option[String] = None,
  properties: Option[ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenProperties] = None
)

