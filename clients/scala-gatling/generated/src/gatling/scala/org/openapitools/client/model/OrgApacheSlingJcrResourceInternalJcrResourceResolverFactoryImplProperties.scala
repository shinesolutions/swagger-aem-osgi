
package org.openapitools.client.model


case class OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties (
    _resourceResolverSearchpath: Option[ConfigNodePropertyArray],
    _resourceResolverManglenamespaces: Option[ConfigNodePropertyBoolean],
    _resourceResolverAllowDirect: Option[ConfigNodePropertyBoolean],
    _resourceResolverRequiredProviders: Option[ConfigNodePropertyArray],
    _resourceResolverRequiredProvidernames: Option[ConfigNodePropertyArray],
    _resourceResolverVirtual: Option[ConfigNodePropertyArray],
    _resourceResolverMapping: Option[ConfigNodePropertyArray],
    _resourceResolverMapLocation: Option[ConfigNodePropertyString],
    _resourceResolverMapObservation: Option[ConfigNodePropertyArray],
    _resourceResolverDefaultVanityRedirectStatus: Option[ConfigNodePropertyInteger],
    _resourceResolverEnableVanitypath: Option[ConfigNodePropertyBoolean],
    _resourceResolverVanitypathMaxEntries: Option[ConfigNodePropertyInteger],
    _resourceResolverVanitypathMaxEntriesStartup: Option[ConfigNodePropertyBoolean],
    _resourceResolverVanitypathBloomfilterMaxBytes: Option[ConfigNodePropertyInteger],
    _resourceResolverOptimizeAliasResolution: Option[ConfigNodePropertyBoolean],
    _resourceResolverVanitypathWhitelist: Option[ConfigNodePropertyArray],
    _resourceResolverVanitypathBlacklist: Option[ConfigNodePropertyArray],
    _resourceResolverVanityPrecedence: Option[ConfigNodePropertyBoolean],
    _resourceResolverProviderhandlingParanoid: Option[ConfigNodePropertyBoolean],
    _resourceResolverLogClosing: Option[ConfigNodePropertyBoolean],
    _resourceResolverLogUnclosed: Option[ConfigNodePropertyBoolean]
)
object OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties {
    def toStringBody(var_resourceResolverSearchpath: Object, var_resourceResolverManglenamespaces: Object, var_resourceResolverAllowDirect: Object, var_resourceResolverRequiredProviders: Object, var_resourceResolverRequiredProvidernames: Object, var_resourceResolverVirtual: Object, var_resourceResolverMapping: Object, var_resourceResolverMapLocation: Object, var_resourceResolverMapObservation: Object, var_resourceResolverDefaultVanityRedirectStatus: Object, var_resourceResolverEnableVanitypath: Object, var_resourceResolverVanitypathMaxEntries: Object, var_resourceResolverVanitypathMaxEntriesStartup: Object, var_resourceResolverVanitypathBloomfilterMaxBytes: Object, var_resourceResolverOptimizeAliasResolution: Object, var_resourceResolverVanitypathWhitelist: Object, var_resourceResolverVanitypathBlacklist: Object, var_resourceResolverVanityPrecedence: Object, var_resourceResolverProviderhandlingParanoid: Object, var_resourceResolverLogClosing: Object, var_resourceResolverLogUnclosed: Object) =
        s"""
        | {
        | "resourceResolverSearchpath":$var_resourceResolverSearchpath,"resourceResolverManglenamespaces":$var_resourceResolverManglenamespaces,"resourceResolverAllowDirect":$var_resourceResolverAllowDirect,"resourceResolverRequiredProviders":$var_resourceResolverRequiredProviders,"resourceResolverRequiredProvidernames":$var_resourceResolverRequiredProvidernames,"resourceResolverVirtual":$var_resourceResolverVirtual,"resourceResolverMapping":$var_resourceResolverMapping,"resourceResolverMapLocation":$var_resourceResolverMapLocation,"resourceResolverMapObservation":$var_resourceResolverMapObservation,"resourceResolverDefaultVanityRedirectStatus":$var_resourceResolverDefaultVanityRedirectStatus,"resourceResolverEnableVanitypath":$var_resourceResolverEnableVanitypath,"resourceResolverVanitypathMaxEntries":$var_resourceResolverVanitypathMaxEntries,"resourceResolverVanitypathMaxEntriesStartup":$var_resourceResolverVanitypathMaxEntriesStartup,"resourceResolverVanitypathBloomfilterMaxBytes":$var_resourceResolverVanitypathBloomfilterMaxBytes,"resourceResolverOptimizeAliasResolution":$var_resourceResolverOptimizeAliasResolution,"resourceResolverVanitypathWhitelist":$var_resourceResolverVanitypathWhitelist,"resourceResolverVanitypathBlacklist":$var_resourceResolverVanitypathBlacklist,"resourceResolverVanityPrecedence":$var_resourceResolverVanityPrecedence,"resourceResolverProviderhandlingParanoid":$var_resourceResolverProviderhandlingParanoid,"resourceResolverLogClosing":$var_resourceResolverLogClosing,"resourceResolverLogUnclosed":$var_resourceResolverLogUnclosed
        | }
        """.stripMargin
}
