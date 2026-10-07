package org.openapitools.server.model


/**
 * @param pid  for example: ''null''
 * @param title  for example: ''null''
 * @param description  for example: ''null''
 * @param properties  for example: ''null''
 * @param additionalProperties  for example: ''null''
 * @param bundleLocation  for example: ''null''
 * @param serviceLocation  for example: ''null''
*/
final case class ComAdobeCqAccountApiAccountManagementServiceInfo (
  pid: Option[String] = None,
  title: Option[String] = None,
  description: Option[String] = None,
  properties: Option[ComAdobeCqAccountApiAccountManagementServiceProperties] = None,
  additionalProperties: Option[String] = None,
  bundleLocation: Option[String] = None,
  serviceLocation: Option[String] = None
)

