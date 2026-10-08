package org.openapitools.server.model


/**
 * @param hcTags  for example: ''null''
 * @param dispatcherAddress  for example: ''null''
 * @param dispatcherFilterAllowed  for example: ''null''
 * @param dispatcherFilterBlocked  for example: ''null''
*/
final case class ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties (
  hcTags: Option[ConfigNodePropertyArray] = None,
  dispatcherAddress: Option[ConfigNodePropertyString] = None,
  dispatcherFilterAllowed: Option[ConfigNodePropertyArray] = None,
  dispatcherFilterBlocked: Option[ConfigNodePropertyArray] = None
)

