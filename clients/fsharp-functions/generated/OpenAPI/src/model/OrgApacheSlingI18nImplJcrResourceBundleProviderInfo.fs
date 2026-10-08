namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.OrgApacheSlingI18nImplJcrResourceBundleProviderProperties

module OrgApacheSlingI18nImplJcrResourceBundleProviderInfo =

  //#region OrgApacheSlingI18nImplJcrResourceBundleProviderInfo

  [<CLIMutable>]
  type OrgApacheSlingI18nImplJcrResourceBundleProviderInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : OrgApacheSlingI18nImplJcrResourceBundleProviderProperties;
    [<JsonProperty(PropertyName = "additionalProperties")>]
    AdditionalProperties : string;
    [<JsonProperty(PropertyName = "bundle_location")>]
    BundleLocation : string;
    [<JsonProperty(PropertyName = "service_location")>]
    ServiceLocation : string;
  }

  //#endregion
