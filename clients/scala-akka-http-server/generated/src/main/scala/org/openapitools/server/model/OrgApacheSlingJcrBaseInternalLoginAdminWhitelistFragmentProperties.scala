package org.openapitools.server.model


/**
 * @param whitelistName  for example: ''null''
 * @param whitelistBundles  for example: ''null''
*/
final case class OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties (
  whitelistName: Option[ConfigNodePropertyString] = None,
  whitelistBundles: Option[ConfigNodePropertyArray] = None
)

