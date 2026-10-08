package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.Nulls
import org.openapitools.model.ConfigNodePropertyArray
import org.openapitools.model.ConfigNodePropertyBoolean
import org.openapitools.model.ConfigNodePropertyInteger
import org.openapitools.model.ConfigNodePropertyString
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Email
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid
import io.swagger.v3.oas.annotations.media.Schema

/**
 * 
 * @param resourceResolverSearchpath 
 * @param resourceResolverManglenamespaces 
 * @param resourceResolverAllowDirect 
 * @param resourceResolverRequiredProviders 
 * @param resourceResolverRequiredProvidernames 
 * @param resourceResolverVirtual 
 * @param resourceResolverMapping 
 * @param resourceResolverMapLocation 
 * @param resourceResolverMapObservation 
 * @param resourceResolverDefaultVanityRedirectStatus 
 * @param resourceResolverEnableVanitypath 
 * @param resourceResolverVanitypathMaxEntries 
 * @param resourceResolverVanitypathMaxEntriesStartup 
 * @param resourceResolverVanitypathBloomfilterMaxBytes 
 * @param resourceResolverOptimizeAliasResolution 
 * @param resourceResolverVanitypathWhitelist 
 * @param resourceResolverVanitypathBlacklist 
 * @param resourceResolverVanityPrecedence 
 * @param resourceResolverProviderhandlingParanoid 
 * @param resourceResolverLogClosing 
 * @param resourceResolverLogUnclosed 
 */
data class OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties(

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("resource.resolver.searchpath")
    @get:JsonProperty("resource.resolver.searchpath") val resourceResolverSearchpath: ConfigNodePropertyArray? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("resource.resolver.manglenamespaces")
    @get:JsonProperty("resource.resolver.manglenamespaces") val resourceResolverManglenamespaces: ConfigNodePropertyBoolean? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("resource.resolver.allowDirect")
    @get:JsonProperty("resource.resolver.allowDirect") val resourceResolverAllowDirect: ConfigNodePropertyBoolean? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("resource.resolver.required.providers")
    @get:JsonProperty("resource.resolver.required.providers") val resourceResolverRequiredProviders: ConfigNodePropertyArray? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("resource.resolver.required.providernames")
    @get:JsonProperty("resource.resolver.required.providernames") val resourceResolverRequiredProvidernames: ConfigNodePropertyArray? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("resource.resolver.virtual")
    @get:JsonProperty("resource.resolver.virtual") val resourceResolverVirtual: ConfigNodePropertyArray? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("resource.resolver.mapping")
    @get:JsonProperty("resource.resolver.mapping") val resourceResolverMapping: ConfigNodePropertyArray? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("resource.resolver.map.location")
    @get:JsonProperty("resource.resolver.map.location") val resourceResolverMapLocation: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("resource.resolver.map.observation")
    @get:JsonProperty("resource.resolver.map.observation") val resourceResolverMapObservation: ConfigNodePropertyArray? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("resource.resolver.default.vanity.redirect.status")
    @get:JsonProperty("resource.resolver.default.vanity.redirect.status") val resourceResolverDefaultVanityRedirectStatus: ConfigNodePropertyInteger? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("resource.resolver.enable.vanitypath")
    @get:JsonProperty("resource.resolver.enable.vanitypath") val resourceResolverEnableVanitypath: ConfigNodePropertyBoolean? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("resource.resolver.vanitypath.maxEntries")
    @get:JsonProperty("resource.resolver.vanitypath.maxEntries") val resourceResolverVanitypathMaxEntries: ConfigNodePropertyInteger? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("resource.resolver.vanitypath.maxEntries.startup")
    @get:JsonProperty("resource.resolver.vanitypath.maxEntries.startup") val resourceResolverVanitypathMaxEntriesStartup: ConfigNodePropertyBoolean? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("resource.resolver.vanitypath.bloomfilter.maxBytes")
    @get:JsonProperty("resource.resolver.vanitypath.bloomfilter.maxBytes") val resourceResolverVanitypathBloomfilterMaxBytes: ConfigNodePropertyInteger? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("resource.resolver.optimize.alias.resolution")
    @get:JsonProperty("resource.resolver.optimize.alias.resolution") val resourceResolverOptimizeAliasResolution: ConfigNodePropertyBoolean? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("resource.resolver.vanitypath.whitelist")
    @get:JsonProperty("resource.resolver.vanitypath.whitelist") val resourceResolverVanitypathWhitelist: ConfigNodePropertyArray? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("resource.resolver.vanitypath.blacklist")
    @get:JsonProperty("resource.resolver.vanitypath.blacklist") val resourceResolverVanitypathBlacklist: ConfigNodePropertyArray? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("resource.resolver.vanity.precedence")
    @get:JsonProperty("resource.resolver.vanity.precedence") val resourceResolverVanityPrecedence: ConfigNodePropertyBoolean? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("resource.resolver.providerhandling.paranoid")
    @get:JsonProperty("resource.resolver.providerhandling.paranoid") val resourceResolverProviderhandlingParanoid: ConfigNodePropertyBoolean? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("resource.resolver.log.closing")
    @get:JsonProperty("resource.resolver.log.closing") val resourceResolverLogClosing: ConfigNodePropertyBoolean? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("resource.resolver.log.unclosed")
    @get:JsonProperty("resource.resolver.log.unclosed") val resourceResolverLogUnclosed: ConfigNodePropertyBoolean? = null
) {

}

