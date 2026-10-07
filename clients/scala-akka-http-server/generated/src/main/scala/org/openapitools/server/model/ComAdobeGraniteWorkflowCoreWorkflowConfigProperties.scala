package org.openapitools.server.model


/**
 * @param cqWorkflowConfigWorkflowPackagesRootPath  for example: ''null''
 * @param cqWorkflowConfigWorkflowProcessLegacyMode  for example: ''null''
 * @param cqWorkflowConfigAllowLocking  for example: ''null''
*/
final case class ComAdobeGraniteWorkflowCoreWorkflowConfigProperties (
  cqWorkflowConfigWorkflowPackagesRootPath: Option[ConfigNodePropertyArray] = None,
  cqWorkflowConfigWorkflowProcessLegacyMode: Option[ConfigNodePropertyBoolean] = None,
  cqWorkflowConfigAllowLocking: Option[ConfigNodePropertyBoolean] = None
)

