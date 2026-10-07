
package org.openapitools.client.model


case class OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties (
    _davRoot: Option[ConfigNodePropertyString],
    _davCreateAbsoluteUri: Option[ConfigNodePropertyBoolean],
    _davRealm: Option[ConfigNodePropertyString],
    _collectionTypes: Option[ConfigNodePropertyArray],
    _filterPrefixes: Option[ConfigNodePropertyArray],
    _filterTypes: Option[ConfigNodePropertyString],
    _filterUris: Option[ConfigNodePropertyString],
    _typeCollections: Option[ConfigNodePropertyString],
    _typeNoncollections: Option[ConfigNodePropertyString],
    _typeContent: Option[ConfigNodePropertyString]
)
object OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties {
    def toStringBody(var_davRoot: Object, var_davCreateAbsoluteUri: Object, var_davRealm: Object, var_collectionTypes: Object, var_filterPrefixes: Object, var_filterTypes: Object, var_filterUris: Object, var_typeCollections: Object, var_typeNoncollections: Object, var_typeContent: Object) =
        s"""
        | {
        | "davRoot":$var_davRoot,"davCreateAbsoluteUri":$var_davCreateAbsoluteUri,"davRealm":$var_davRealm,"collectionTypes":$var_collectionTypes,"filterPrefixes":$var_filterPrefixes,"filterTypes":$var_filterTypes,"filterUris":$var_filterUris,"typeCollections":$var_typeCollections,"typeNoncollections":$var_typeNoncollections,"typeContent":$var_typeContent
        | }
        """.stripMargin
}
