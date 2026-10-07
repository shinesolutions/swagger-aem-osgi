package org.openapitools.server.model


/**
 * @param adapterCondition  for example: ''null''
 * @param taskmanagerAdmingroups  for example: ''null''
*/
final case class ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties (
  adapterCondition: Option[ConfigNodePropertyString] = None,
  taskmanagerAdmingroups: Option[ConfigNodePropertyArray] = None
)

