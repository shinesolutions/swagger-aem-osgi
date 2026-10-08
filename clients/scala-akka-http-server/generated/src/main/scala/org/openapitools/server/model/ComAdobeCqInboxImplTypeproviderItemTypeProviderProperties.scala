package org.openapitools.server.model


/**
 * @param inboxImplTypeproviderRegistrypaths  for example: ''null''
 * @param inboxImplTypeproviderLegacypaths  for example: ''null''
 * @param inboxImplTypeproviderDefaulturlFailureitem  for example: ''null''
 * @param inboxImplTypeproviderDefaulturlWorkitem  for example: ''null''
 * @param inboxImplTypeproviderDefaulturlTask  for example: ''null''
*/
final case class ComAdobeCqInboxImplTypeproviderItemTypeProviderProperties (
  inboxImplTypeproviderRegistrypaths: Option[ConfigNodePropertyArray] = None,
  inboxImplTypeproviderLegacypaths: Option[ConfigNodePropertyArray] = None,
  inboxImplTypeproviderDefaulturlFailureitem: Option[ConfigNodePropertyString] = None,
  inboxImplTypeproviderDefaulturlWorkitem: Option[ConfigNodePropertyString] = None,
  inboxImplTypeproviderDefaulturlTask: Option[ConfigNodePropertyString] = None
)

