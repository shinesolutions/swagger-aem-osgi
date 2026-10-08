package org.openapitools.server.model


/**
 * @param enableTokenCleanupTask  for example: ''null''
 * @param schedulerExpression  for example: ''null''
 * @param batchSize  for example: ''null''
*/
final case class ComDayCrxSecurityTokenImplTokenCleanupTaskProperties (
  enableTokenCleanupTask: Option[ConfigNodePropertyBoolean] = None,
  schedulerExpression: Option[ConfigNodePropertyString] = None,
  batchSize: Option[ConfigNodePropertyInteger] = None
)

