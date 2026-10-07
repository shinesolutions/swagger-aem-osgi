package org.openapitools.server.model


/**
 * @param redirectEnabled  for example: ''null''
 * @param redirectStatsEnabled  for example: ''null''
 * @param redirectExtensions  for example: ''null''
 * @param redirectPaths  for example: ''null''
*/
final case class ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties (
  redirectEnabled: Option[ConfigNodePropertyBoolean] = None,
  redirectStatsEnabled: Option[ConfigNodePropertyBoolean] = None,
  redirectExtensions: Option[ConfigNodePropertyArray] = None,
  redirectPaths: Option[ConfigNodePropertyArray] = None
)

