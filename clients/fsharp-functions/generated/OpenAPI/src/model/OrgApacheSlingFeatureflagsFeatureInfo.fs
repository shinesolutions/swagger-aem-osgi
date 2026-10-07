namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.OrgApacheSlingFeatureflagsFeatureProperties

module OrgApacheSlingFeatureflagsFeatureInfo =

  //#region OrgApacheSlingFeatureflagsFeatureInfo

  [<CLIMutable>]
  type OrgApacheSlingFeatureflagsFeatureInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : OrgApacheSlingFeatureflagsFeatureProperties;
  }

  //#endregion
