package org.openapitools.server.model


/**
 * @param enabled  for example: ''null''
 * @param agentName  for example: ''null''
 * @param diffPath  for example: ''null''
 * @param observedPath  for example: ''null''
 * @param serviceName  for example: ''null''
 * @param propertyNames  for example: ''null''
 * @param distributionDelay  for example: ''null''
 * @param serviceUserTarget  for example: ''null''
*/
final case class ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties (
  enabled: Option[ConfigNodePropertyBoolean] = None,
  agentName: Option[ConfigNodePropertyString] = None,
  diffPath: Option[ConfigNodePropertyString] = None,
  observedPath: Option[ConfigNodePropertyString] = None,
  serviceName: Option[ConfigNodePropertyString] = None,
  propertyNames: Option[ConfigNodePropertyString] = None,
  distributionDelay: Option[ConfigNodePropertyInteger] = None,
  serviceUserTarget: Option[ConfigNodePropertyString] = None
)

