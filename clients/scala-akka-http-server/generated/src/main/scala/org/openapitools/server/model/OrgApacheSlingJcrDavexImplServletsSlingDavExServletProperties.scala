package org.openapitools.server.model


/**
 * @param alias  for example: ''null''
 * @param davCreateAbsoluteUri  for example: ''null''
 * @param davProtectedhandlers  for example: ''null''
*/
final case class OrgApacheSlingJcrDavexImplServletsSlingDavExServletProperties (
  alias: Option[ConfigNodePropertyString] = None,
  davCreateAbsoluteUri: Option[ConfigNodePropertyBoolean] = None,
  davProtectedhandlers: Option[ConfigNodePropertyString] = None
)

