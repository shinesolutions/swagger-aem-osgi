package org.openapitools.server.model


/**
 * @param accountName  for example: ''null''
 * @param containerName  for example: ''null''
 * @param accessKey  for example: ''null''
 * @param rootPath  for example: ''null''
 * @param connectionURL  for example: ''null''
*/
final case class OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties (
  accountName: Option[ConfigNodePropertyString] = None,
  containerName: Option[ConfigNodePropertyString] = None,
  accessKey: Option[ConfigNodePropertyString] = None,
  rootPath: Option[ConfigNodePropertyString] = None,
  connectionURL: Option[ConfigNodePropertyString] = None
)

