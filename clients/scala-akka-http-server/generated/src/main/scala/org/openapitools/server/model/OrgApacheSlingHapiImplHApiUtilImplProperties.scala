package org.openapitools.server.model


/**
 * @param orgApacheSlingHapiToolsResourcetype  for example: ''null''
 * @param orgApacheSlingHapiToolsCollectionresourcetype  for example: ''null''
 * @param orgApacheSlingHapiToolsSearchpaths  for example: ''null''
 * @param orgApacheSlingHapiToolsExternalurl  for example: ''null''
 * @param orgApacheSlingHapiToolsEnabled  for example: ''null''
*/
final case class OrgApacheSlingHapiImplHApiUtilImplProperties (
  orgApacheSlingHapiToolsResourcetype: Option[ConfigNodePropertyString] = None,
  orgApacheSlingHapiToolsCollectionresourcetype: Option[ConfigNodePropertyString] = None,
  orgApacheSlingHapiToolsSearchpaths: Option[ConfigNodePropertyArray] = None,
  orgApacheSlingHapiToolsExternalurl: Option[ConfigNodePropertyString] = None,
  orgApacheSlingHapiToolsEnabled: Option[ConfigNodePropertyBoolean] = None
)

