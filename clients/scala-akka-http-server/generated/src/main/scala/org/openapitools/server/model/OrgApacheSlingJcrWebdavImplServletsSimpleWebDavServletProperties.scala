package org.openapitools.server.model


/**
 * @param davRoot  for example: ''null''
 * @param davCreateAbsoluteUri  for example: ''null''
 * @param davRealm  for example: ''null''
 * @param collectionTypes  for example: ''null''
 * @param filterPrefixes  for example: ''null''
 * @param filterTypes  for example: ''null''
 * @param filterUris  for example: ''null''
 * @param typeCollections  for example: ''null''
 * @param typeNoncollections  for example: ''null''
 * @param typeContent  for example: ''null''
*/
final case class OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties (
  davRoot: Option[ConfigNodePropertyString] = None,
  davCreateAbsoluteUri: Option[ConfigNodePropertyBoolean] = None,
  davRealm: Option[ConfigNodePropertyString] = None,
  collectionTypes: Option[ConfigNodePropertyArray] = None,
  filterPrefixes: Option[ConfigNodePropertyArray] = None,
  filterTypes: Option[ConfigNodePropertyString] = None,
  filterUris: Option[ConfigNodePropertyString] = None,
  typeCollections: Option[ConfigNodePropertyString] = None,
  typeNoncollections: Option[ConfigNodePropertyString] = None,
  typeContent: Option[ConfigNodePropertyString] = None
)

