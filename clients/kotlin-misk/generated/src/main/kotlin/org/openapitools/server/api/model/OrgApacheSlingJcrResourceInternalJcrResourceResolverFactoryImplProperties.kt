package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyArray
import org.openapitools.server.api.model.ConfigNodePropertyBoolean
import org.openapitools.server.api.model.ConfigNodePropertyInteger
import org.openapitools.server.api.model.ConfigNodePropertyString
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties(
    val resourceResolverSearchpath: ConfigNodePropertyArray? = null,
    val resourceResolverManglenamespaces: ConfigNodePropertyBoolean? = null,
    val resourceResolverAllowDirect: ConfigNodePropertyBoolean? = null,
    val resourceResolverRequiredProviders: ConfigNodePropertyArray? = null,
    val resourceResolverRequiredProvidernames: ConfigNodePropertyArray? = null,
    val resourceResolverVirtual: ConfigNodePropertyArray? = null,
    val resourceResolverMapping: ConfigNodePropertyArray? = null,
    val resourceResolverMapLocation: ConfigNodePropertyString? = null,
    val resourceResolverMapObservation: ConfigNodePropertyArray? = null,
    val resourceResolverDefaultVanityRedirectStatus: ConfigNodePropertyInteger? = null,
    val resourceResolverEnableVanitypath: ConfigNodePropertyBoolean? = null,
    val resourceResolverVanitypathMaxEntries: ConfigNodePropertyInteger? = null,
    val resourceResolverVanitypathMaxEntriesStartup: ConfigNodePropertyBoolean? = null,
    val resourceResolverVanitypathBloomfilterMaxBytes: ConfigNodePropertyInteger? = null,
    val resourceResolverOptimizeAliasResolution: ConfigNodePropertyBoolean? = null,
    val resourceResolverVanitypathWhitelist: ConfigNodePropertyArray? = null,
    val resourceResolverVanitypathBlacklist: ConfigNodePropertyArray? = null,
    val resourceResolverVanityPrecedence: ConfigNodePropertyBoolean? = null,
    val resourceResolverProviderhandlingParanoid: ConfigNodePropertyBoolean? = null,
    val resourceResolverLogClosing: ConfigNodePropertyBoolean? = null,
    val resourceResolverLogUnclosed: ConfigNodePropertyBoolean? = null
)
