namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module OrgApacheSlingI18nImplJcrResourceBundleProviderProperties =

  //#region OrgApacheSlingI18nImplJcrResourceBundleProviderProperties

  [<CLIMutable>]
  type OrgApacheSlingI18nImplJcrResourceBundleProviderProperties = {
    [<JsonProperty(PropertyName = "locale.default")>]
    LocaleDefault : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "preload.bundles")>]
    PreloadBundles : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "invalidation.delay")>]
    InvalidationDelay : ConfigNodePropertyInteger;
  }

  //#endregion
