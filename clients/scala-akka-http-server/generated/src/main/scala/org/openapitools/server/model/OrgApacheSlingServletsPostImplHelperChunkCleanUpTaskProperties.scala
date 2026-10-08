package org.openapitools.server.model


/**
 * @param schedulerExpression  for example: ''null''
 * @param schedulerConcurrent  for example: ''null''
 * @param chunkCleanupAge  for example: ''null''
*/
final case class OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties (
  schedulerExpression: Option[ConfigNodePropertyString] = None,
  schedulerConcurrent: Option[ConfigNodePropertyBoolean] = None,
  chunkCleanupAge: Option[ConfigNodePropertyInteger] = None
)

