package org.openapitools.server.model


/**
 * @param defaultTimeout  for example: ''null''
 * @param maxTimeout  for example: ''null''
 * @param defaultPeriod  for example: ''null''
*/
final case class ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties (
  defaultTimeout: Option[ConfigNodePropertyInteger] = None,
  maxTimeout: Option[ConfigNodePropertyInteger] = None,
  defaultPeriod: Option[ConfigNodePropertyInteger] = None
)

