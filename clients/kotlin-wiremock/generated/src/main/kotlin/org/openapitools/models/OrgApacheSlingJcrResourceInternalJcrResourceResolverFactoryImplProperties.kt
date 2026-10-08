@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties(
    @field:JsonProperty("resource.resolver.searchpath")
    val resourceResolverSearchpath: ConfigNodePropertyArray? = null,

    @field:JsonProperty("resource.resolver.manglenamespaces")
    val resourceResolverManglenamespaces: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("resource.resolver.allowDirect")
    val resourceResolverAllowDirect: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("resource.resolver.required.providers")
    val resourceResolverRequiredProviders: ConfigNodePropertyArray? = null,

    @field:JsonProperty("resource.resolver.required.providernames")
    val resourceResolverRequiredProvidernames: ConfigNodePropertyArray? = null,

    @field:JsonProperty("resource.resolver.virtual")
    val resourceResolverVirtual: ConfigNodePropertyArray? = null,

    @field:JsonProperty("resource.resolver.mapping")
    val resourceResolverMapping: ConfigNodePropertyArray? = null,

    @field:JsonProperty("resource.resolver.map.location")
    val resourceResolverMapLocation: ConfigNodePropertyString? = null,

    @field:JsonProperty("resource.resolver.map.observation")
    val resourceResolverMapObservation: ConfigNodePropertyArray? = null,

    @field:JsonProperty("resource.resolver.default.vanity.redirect.status")
    val resourceResolverDefaultVanityRedirectStatus: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("resource.resolver.enable.vanitypath")
    val resourceResolverEnableVanitypath: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("resource.resolver.vanitypath.maxEntries")
    val resourceResolverVanitypathMaxEntries: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("resource.resolver.vanitypath.maxEntries.startup")
    val resourceResolverVanitypathMaxEntriesStartup: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("resource.resolver.vanitypath.bloomfilter.maxBytes")
    val resourceResolverVanitypathBloomfilterMaxBytes: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("resource.resolver.optimize.alias.resolution")
    val resourceResolverOptimizeAliasResolution: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("resource.resolver.vanitypath.whitelist")
    val resourceResolverVanitypathWhitelist: ConfigNodePropertyArray? = null,

    @field:JsonProperty("resource.resolver.vanitypath.blacklist")
    val resourceResolverVanitypathBlacklist: ConfigNodePropertyArray? = null,

    @field:JsonProperty("resource.resolver.vanity.precedence")
    val resourceResolverVanityPrecedence: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("resource.resolver.providerhandling.paranoid")
    val resourceResolverProviderhandlingParanoid: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("resource.resolver.log.closing")
    val resourceResolverLogClosing: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("resource.resolver.log.unclosed")
    val resourceResolverLogUnclosed: ConfigNodePropertyBoolean? = null,

)
