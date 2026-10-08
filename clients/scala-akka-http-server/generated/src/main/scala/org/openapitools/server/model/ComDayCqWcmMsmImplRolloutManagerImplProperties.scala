package org.openapitools.server.model


/**
 * @param eventFilter  for example: ''null''
 * @param rolloutmgrExcludedpropsDefault  for example: ''null''
 * @param rolloutmgrExcludedparagraphpropsDefault  for example: ''null''
 * @param rolloutmgrExcludednodetypesDefault  for example: ''null''
 * @param rolloutmgrThreadpoolMaxsize  for example: ''null''
 * @param rolloutmgrThreadpoolMaxshutdowntime  for example: ''null''
 * @param rolloutmgrThreadpoolPriority  for example: ''null''
 * @param rolloutmgrCommitSize  for example: ''null''
 * @param rolloutmgrConflicthandlingEnabled  for example: ''null''
*/
final case class ComDayCqWcmMsmImplRolloutManagerImplProperties (
  eventFilter: Option[ConfigNodePropertyString] = None,
  rolloutmgrExcludedpropsDefault: Option[ConfigNodePropertyArray] = None,
  rolloutmgrExcludedparagraphpropsDefault: Option[ConfigNodePropertyArray] = None,
  rolloutmgrExcludednodetypesDefault: Option[ConfigNodePropertyArray] = None,
  rolloutmgrThreadpoolMaxsize: Option[ConfigNodePropertyInteger] = None,
  rolloutmgrThreadpoolMaxshutdowntime: Option[ConfigNodePropertyInteger] = None,
  rolloutmgrThreadpoolPriority: Option[ConfigNodePropertyDropDown] = None,
  rolloutmgrCommitSize: Option[ConfigNodePropertyInteger] = None,
  rolloutmgrConflicthandlingEnabled: Option[ConfigNodePropertyBoolean] = None
)

