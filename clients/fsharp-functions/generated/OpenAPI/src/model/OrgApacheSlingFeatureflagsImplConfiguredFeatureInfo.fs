namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.OrgApacheSlingFeatureflagsImplConfiguredFeatureProperties

module OrgApacheSlingFeatureflagsImplConfiguredFeatureInfo =

  //#region OrgApacheSlingFeatureflagsImplConfiguredFeatureInfo

  [<CLIMutable>]
  type OrgApacheSlingFeatureflagsImplConfiguredFeatureInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : OrgApacheSlingFeatureflagsImplConfiguredFeatureProperties;
  }

  //#endregion
