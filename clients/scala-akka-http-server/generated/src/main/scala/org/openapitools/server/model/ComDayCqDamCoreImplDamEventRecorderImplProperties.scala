package org.openapitools.server.model


/**
 * @param eventFilter  for example: ''null''
 * @param eventQueueLength  for example: ''null''
 * @param eventrecorderEnabled  for example: ''null''
 * @param eventrecorderBlacklist  for example: ''null''
 * @param eventrecorderEventtypes  for example: ''null''
*/
final case class ComDayCqDamCoreImplDamEventRecorderImplProperties (
  eventFilter: Option[ConfigNodePropertyString] = None,
  eventQueueLength: Option[ConfigNodePropertyInteger] = None,
  eventrecorderEnabled: Option[ConfigNodePropertyBoolean] = None,
  eventrecorderBlacklist: Option[ConfigNodePropertyArray] = None,
  eventrecorderEventtypes: Option[ConfigNodePropertyDropDown] = None
)

