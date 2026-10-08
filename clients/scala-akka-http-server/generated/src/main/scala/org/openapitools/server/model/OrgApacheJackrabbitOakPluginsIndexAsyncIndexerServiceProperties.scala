package org.openapitools.server.model


/**
 * @param asyncConfigs  for example: ''null''
 * @param leaseTimeOutMinutes  for example: ''null''
 * @param failingIndexTimeoutSeconds  for example: ''null''
 * @param errorWarnIntervalSeconds  for example: ''null''
*/
final case class OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties (
  asyncConfigs: Option[ConfigNodePropertyArray] = None,
  leaseTimeOutMinutes: Option[ConfigNodePropertyInteger] = None,
  failingIndexTimeoutSeconds: Option[ConfigNodePropertyInteger] = None,
  errorWarnIntervalSeconds: Option[ConfigNodePropertyInteger] = None
)

