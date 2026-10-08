package org.openapitools.server.model


/**
 * @param enabled  for example: ''null''
 * @param agentName  for example: ''null''
 * @param diffPath  for example: ''null''
 * @param propertyNames  for example: ''null''
*/
final case class ComAdobeCqSocialSyncImplDiffChangesObserverProperties (
  enabled: Option[ConfigNodePropertyBoolean] = None,
  agentName: Option[ConfigNodePropertyString] = None,
  diffPath: Option[ConfigNodePropertyString] = None,
  propertyNames: Option[ConfigNodePropertyString] = None
)

