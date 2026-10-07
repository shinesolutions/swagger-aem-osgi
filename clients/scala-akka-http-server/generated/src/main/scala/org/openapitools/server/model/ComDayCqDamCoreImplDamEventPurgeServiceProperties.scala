package org.openapitools.server.model


/**
 * @param schedulerExpression  for example: ''null''
 * @param maxSavedActivities  for example: ''null''
 * @param saveInterval  for example: ''null''
 * @param enableActivityPurge  for example: ''null''
 * @param eventTypes  for example: ''null''
*/
final case class ComDayCqDamCoreImplDamEventPurgeServiceProperties (
  schedulerExpression: Option[ConfigNodePropertyString] = None,
  maxSavedActivities: Option[ConfigNodePropertyInteger] = None,
  saveInterval: Option[ConfigNodePropertyInteger] = None,
  enableActivityPurge: Option[ConfigNodePropertyBoolean] = None,
  eventTypes: Option[ConfigNodePropertyDropDown] = None
)

