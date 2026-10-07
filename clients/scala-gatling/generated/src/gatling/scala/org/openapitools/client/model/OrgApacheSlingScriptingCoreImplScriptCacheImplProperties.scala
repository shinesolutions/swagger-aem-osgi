
package org.openapitools.client.model


case class OrgApacheSlingScriptingCoreImplScriptCacheImplProperties (
    _orgApacheSlingScriptingCacheSize: Option[ConfigNodePropertyInteger],
    _orgApacheSlingScriptingCacheAdditionalExtensions: Option[ConfigNodePropertyArray]
)
object OrgApacheSlingScriptingCoreImplScriptCacheImplProperties {
    def toStringBody(var_orgApacheSlingScriptingCacheSize: Object, var_orgApacheSlingScriptingCacheAdditionalExtensions: Object) =
        s"""
        | {
        | "orgApacheSlingScriptingCacheSize":$var_orgApacheSlingScriptingCacheSize,"orgApacheSlingScriptingCacheAdditionalExtensions":$var_orgApacheSlingScriptingCacheAdditionalExtensions
        | }
        """.stripMargin
}
