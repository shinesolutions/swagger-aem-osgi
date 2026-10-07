namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyString

module OrgApacheSlingFeatureflagsImplConfiguredFeatureProperties =

  //#region OrgApacheSlingFeatureflagsImplConfiguredFeatureProperties

  [<CLIMutable>]
  type OrgApacheSlingFeatureflagsImplConfiguredFeatureProperties = {
    [<JsonProperty(PropertyName = "name")>]
    Name : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "description")>]
    Description : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "enabled")>]
    Enabled : ConfigNodePropertyBoolean;
  }

  //#endregion
