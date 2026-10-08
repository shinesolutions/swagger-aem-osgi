package org.openapitools.server.model


/**
 * @param defaultTransportAgentToWorkerPrefix  for example: ''null''
 * @param defaultTransportAgentToMasterPrefix  for example: ''null''
 * @param defaultTransportInputPackage  for example: ''null''
 * @param defaultTransportOutputPackage  for example: ''null''
 * @param defaultTransportReplicationSynchronous  for example: ''null''
 * @param defaultTransportContentpackage  for example: ''null''
 * @param offloadingTransporterDefaultEnabled  for example: ''null''
*/
final case class ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties (
  defaultTransportAgentToWorkerPrefix: Option[ConfigNodePropertyString] = None,
  defaultTransportAgentToMasterPrefix: Option[ConfigNodePropertyString] = None,
  defaultTransportInputPackage: Option[ConfigNodePropertyString] = None,
  defaultTransportOutputPackage: Option[ConfigNodePropertyString] = None,
  defaultTransportReplicationSynchronous: Option[ConfigNodePropertyBoolean] = None,
  defaultTransportContentpackage: Option[ConfigNodePropertyBoolean] = None,
  offloadingTransporterDefaultEnabled: Option[ConfigNodePropertyBoolean] = None
)

