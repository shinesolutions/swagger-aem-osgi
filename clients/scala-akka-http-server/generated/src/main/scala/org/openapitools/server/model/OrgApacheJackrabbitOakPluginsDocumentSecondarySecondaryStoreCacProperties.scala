package org.openapitools.server.model


/**
 * @param includedPaths  for example: ''null''
 * @param enableAsyncObserver  for example: ''null''
 * @param observerQueueSize  for example: ''null''
*/
final case class OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties (
  includedPaths: Option[ConfigNodePropertyArray] = None,
  enableAsyncObserver: Option[ConfigNodePropertyBoolean] = None,
  observerQueueSize: Option[ConfigNodePropertyInteger] = None
)

