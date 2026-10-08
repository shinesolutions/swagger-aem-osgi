
package org.openapitools.client.model


case class OrgApacheSlingI18nImplJcrResourceBundleProviderProperties (
    _localeDefault: Option[ConfigNodePropertyString],
    _preloadBundles: Option[ConfigNodePropertyBoolean],
    _invalidationDelay: Option[ConfigNodePropertyInteger]
)
object OrgApacheSlingI18nImplJcrResourceBundleProviderProperties {
    def toStringBody(var_localeDefault: Object, var_preloadBundles: Object, var_invalidationDelay: Object) =
        s"""
        | {
        | "localeDefault":$var_localeDefault,"preloadBundles":$var_preloadBundles,"invalidationDelay":$var_invalidationDelay
        | }
        """.stripMargin
}
