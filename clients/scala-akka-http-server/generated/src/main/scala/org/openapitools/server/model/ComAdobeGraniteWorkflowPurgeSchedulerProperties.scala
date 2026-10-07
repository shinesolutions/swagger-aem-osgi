package org.openapitools.server.model


/**
 * @param scheduledpurgeName  for example: ''null''
 * @param scheduledpurgeWorkflowStatus  for example: ''null''
 * @param scheduledpurgeModelIds  for example: ''null''
 * @param scheduledpurgeDaysold  for example: ''null''
*/
final case class ComAdobeGraniteWorkflowPurgeSchedulerProperties (
  scheduledpurgeName: Option[ConfigNodePropertyString] = None,
  scheduledpurgeWorkflowStatus: Option[ConfigNodePropertyDropDown] = None,
  scheduledpurgeModelIds: Option[ConfigNodePropertyArray] = None,
  scheduledpurgeDaysold: Option[ConfigNodePropertyInteger] = None
)

