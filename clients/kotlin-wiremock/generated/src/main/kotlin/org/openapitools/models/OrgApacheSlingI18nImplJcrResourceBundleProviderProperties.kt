@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class OrgApacheSlingI18nImplJcrResourceBundleProviderProperties(
    @field:JsonProperty("locale.default")
    val localeDefault: ConfigNodePropertyString? = null,

    @field:JsonProperty("preload.bundles")
    val preloadBundles: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("invalidation.delay")
    val invalidationDelay: ConfigNodePropertyInteger? = null,

)
