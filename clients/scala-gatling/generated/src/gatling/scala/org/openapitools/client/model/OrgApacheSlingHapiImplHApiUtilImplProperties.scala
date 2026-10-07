
package org.openapitools.client.model


case class OrgApacheSlingHapiImplHApiUtilImplProperties (
    _orgApacheSlingHapiToolsResourcetype: Option[ConfigNodePropertyString],
    _orgApacheSlingHapiToolsCollectionresourcetype: Option[ConfigNodePropertyString],
    _orgApacheSlingHapiToolsSearchpaths: Option[ConfigNodePropertyArray],
    _orgApacheSlingHapiToolsExternalurl: Option[ConfigNodePropertyString],
    _orgApacheSlingHapiToolsEnabled: Option[ConfigNodePropertyBoolean]
)
object OrgApacheSlingHapiImplHApiUtilImplProperties {
    def toStringBody(var_orgApacheSlingHapiToolsResourcetype: Object, var_orgApacheSlingHapiToolsCollectionresourcetype: Object, var_orgApacheSlingHapiToolsSearchpaths: Object, var_orgApacheSlingHapiToolsExternalurl: Object, var_orgApacheSlingHapiToolsEnabled: Object) =
        s"""
        | {
        | "orgApacheSlingHapiToolsResourcetype":$var_orgApacheSlingHapiToolsResourcetype,"orgApacheSlingHapiToolsCollectionresourcetype":$var_orgApacheSlingHapiToolsCollectionresourcetype,"orgApacheSlingHapiToolsSearchpaths":$var_orgApacheSlingHapiToolsSearchpaths,"orgApacheSlingHapiToolsExternalurl":$var_orgApacheSlingHapiToolsExternalurl,"orgApacheSlingHapiToolsEnabled":$var_orgApacheSlingHapiToolsEnabled
        | }
        """.stripMargin
}
