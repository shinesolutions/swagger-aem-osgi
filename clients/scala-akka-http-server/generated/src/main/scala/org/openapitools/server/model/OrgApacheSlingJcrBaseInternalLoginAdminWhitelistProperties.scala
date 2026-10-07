package org.openapitools.server.model


/**
 * @param whitelistBypass  for example: ''null''
 * @param whitelistBundlesRegexp  for example: ''null''
*/
final case class OrgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties (
  whitelistBypass: Option[ConfigNodePropertyBoolean] = None,
  whitelistBundlesRegexp: Option[ConfigNodePropertyString] = None
)

