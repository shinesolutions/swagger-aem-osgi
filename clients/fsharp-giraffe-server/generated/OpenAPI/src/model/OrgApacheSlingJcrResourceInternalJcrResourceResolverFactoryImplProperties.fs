namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties =

  //#region OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties


  type orgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties = {
    ResourceResolverSearchpath : ConfigNodePropertyArray;
    ResourceResolverManglenamespaces : ConfigNodePropertyBoolean;
    ResourceResolverAllowDirect : ConfigNodePropertyBoolean;
    ResourceResolverRequiredProviders : ConfigNodePropertyArray;
    ResourceResolverRequiredProvidernames : ConfigNodePropertyArray;
    ResourceResolverVirtual : ConfigNodePropertyArray;
    ResourceResolverMapping : ConfigNodePropertyArray;
    ResourceResolverMapLocation : ConfigNodePropertyString;
    ResourceResolverMapObservation : ConfigNodePropertyArray;
    ResourceResolverDefaultVanityRedirectStatus : ConfigNodePropertyInteger;
    ResourceResolverEnableVanitypath : ConfigNodePropertyBoolean;
    ResourceResolverVanitypathMaxEntries : ConfigNodePropertyInteger;
    ResourceResolverVanitypathMaxEntriesStartup : ConfigNodePropertyBoolean;
    ResourceResolverVanitypathBloomfilterMaxBytes : ConfigNodePropertyInteger;
    ResourceResolverOptimizeAliasResolution : ConfigNodePropertyBoolean;
    ResourceResolverVanitypathWhitelist : ConfigNodePropertyArray;
    ResourceResolverVanitypathBlacklist : ConfigNodePropertyArray;
    ResourceResolverVanityPrecedence : ConfigNodePropertyBoolean;
    ResourceResolverProviderhandlingParanoid : ConfigNodePropertyBoolean;
    ResourceResolverLogClosing : ConfigNodePropertyBoolean;
    ResourceResolverLogUnclosed : ConfigNodePropertyBoolean;
  }
  //#endregion
