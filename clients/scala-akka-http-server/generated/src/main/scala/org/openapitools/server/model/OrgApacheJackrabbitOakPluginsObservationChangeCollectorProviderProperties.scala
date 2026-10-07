package org.openapitools.server.model


/**
 * @param maxItems  for example: ''null''
 * @param maxPathDepth  for example: ''null''
 * @param enabled  for example: ''null''
*/
final case class OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties (
  maxItems: Option[ConfigNodePropertyInteger] = None,
  maxPathDepth: Option[ConfigNodePropertyInteger] = None,
  enabled: Option[ConfigNodePropertyBoolean] = None
)

