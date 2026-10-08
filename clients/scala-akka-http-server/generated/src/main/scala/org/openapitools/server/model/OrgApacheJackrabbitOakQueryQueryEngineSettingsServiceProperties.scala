package org.openapitools.server.model


/**
 * @param queryLimitInMemory  for example: ''null''
 * @param queryLimitReads  for example: ''null''
 * @param queryFailTraversal  for example: ''null''
 * @param fastQuerySize  for example: ''null''
*/
final case class OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties (
  queryLimitInMemory: Option[ConfigNodePropertyInteger] = None,
  queryLimitReads: Option[ConfigNodePropertyInteger] = None,
  queryFailTraversal: Option[ConfigNodePropertyBoolean] = None,
  fastQuerySize: Option[ConfigNodePropertyBoolean] = None
)

