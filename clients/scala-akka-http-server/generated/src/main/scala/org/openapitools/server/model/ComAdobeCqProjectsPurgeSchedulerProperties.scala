package org.openapitools.server.model


/**
 * @param scheduledpurgeName  for example: ''null''
 * @param scheduledpurgePurgeActive  for example: ''null''
 * @param scheduledpurgeTemplates  for example: ''null''
 * @param scheduledpurgePurgeGroups  for example: ''null''
 * @param scheduledpurgePurgeAssets  for example: ''null''
 * @param scheduledpurgeTerminateRunningWorkflows  for example: ''null''
 * @param scheduledpurgeDaysold  for example: ''null''
 * @param scheduledpurgeSaveThreshold  for example: ''null''
*/
final case class ComAdobeCqProjectsPurgeSchedulerProperties (
  scheduledpurgeName: Option[ConfigNodePropertyString] = None,
  scheduledpurgePurgeActive: Option[ConfigNodePropertyBoolean] = None,
  scheduledpurgeTemplates: Option[ConfigNodePropertyArray] = None,
  scheduledpurgePurgeGroups: Option[ConfigNodePropertyBoolean] = None,
  scheduledpurgePurgeAssets: Option[ConfigNodePropertyBoolean] = None,
  scheduledpurgeTerminateRunningWorkflows: Option[ConfigNodePropertyBoolean] = None,
  scheduledpurgeDaysold: Option[ConfigNodePropertyInteger] = None,
  scheduledpurgeSaveThreshold: Option[ConfigNodePropertyInteger] = None
)

