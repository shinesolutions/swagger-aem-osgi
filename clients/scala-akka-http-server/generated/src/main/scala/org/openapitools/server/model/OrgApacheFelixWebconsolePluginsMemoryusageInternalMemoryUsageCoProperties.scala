package org.openapitools.server.model


/**
 * @param felixMemoryusageDumpThreshold  for example: ''null''
 * @param felixMemoryusageDumpInterval  for example: ''null''
 * @param felixMemoryusageDumpLocation  for example: ''null''
*/
final case class OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties (
  felixMemoryusageDumpThreshold: Option[ConfigNodePropertyInteger] = None,
  felixMemoryusageDumpInterval: Option[ConfigNodePropertyInteger] = None,
  felixMemoryusageDumpLocation: Option[ConfigNodePropertyString] = None
)

