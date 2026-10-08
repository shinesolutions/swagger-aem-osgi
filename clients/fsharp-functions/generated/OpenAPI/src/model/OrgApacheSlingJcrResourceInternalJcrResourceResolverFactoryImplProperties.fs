namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties =

  //#region OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties

  [<CLIMutable>]
  type OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties = {
    [<JsonProperty(PropertyName = "resource.resolver.searchpath")>]
    ResourceResolverSearchpath : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "resource.resolver.manglenamespaces")>]
    ResourceResolverManglenamespaces : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "resource.resolver.allowDirect")>]
    ResourceResolverAllowDirect : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "resource.resolver.required.providers")>]
    ResourceResolverRequiredProviders : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "resource.resolver.required.providernames")>]
    ResourceResolverRequiredProvidernames : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "resource.resolver.virtual")>]
    ResourceResolverVirtual : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "resource.resolver.mapping")>]
    ResourceResolverMapping : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "resource.resolver.map.location")>]
    ResourceResolverMapLocation : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "resource.resolver.map.observation")>]
    ResourceResolverMapObservation : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "resource.resolver.default.vanity.redirect.status")>]
    ResourceResolverDefaultVanityRedirectStatus : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "resource.resolver.enable.vanitypath")>]
    ResourceResolverEnableVanitypath : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "resource.resolver.vanitypath.maxEntries")>]
    ResourceResolverVanitypathMaxEntries : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "resource.resolver.vanitypath.maxEntries.startup")>]
    ResourceResolverVanitypathMaxEntriesStartup : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "resource.resolver.vanitypath.bloomfilter.maxBytes")>]
    ResourceResolverVanitypathBloomfilterMaxBytes : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "resource.resolver.optimize.alias.resolution")>]
    ResourceResolverOptimizeAliasResolution : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "resource.resolver.vanitypath.whitelist")>]
    ResourceResolverVanitypathWhitelist : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "resource.resolver.vanitypath.blacklist")>]
    ResourceResolverVanitypathBlacklist : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "resource.resolver.vanity.precedence")>]
    ResourceResolverVanityPrecedence : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "resource.resolver.providerhandling.paranoid")>]
    ResourceResolverProviderhandlingParanoid : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "resource.resolver.log.closing")>]
    ResourceResolverLogClosing : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "resource.resolver.log.unclosed")>]
    ResourceResolverLogUnclosed : ConfigNodePropertyBoolean;
  }

  //#endregion
