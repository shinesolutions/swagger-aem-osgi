namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.OrgApacheSlingCaconfigImplConfigurationBindingsValueProviderProperties

module OrgApacheSlingCaconfigImplConfigurationBindingsValueProviderInfo =

  //#region OrgApacheSlingCaconfigImplConfigurationBindingsValueProviderInfo

  [<CLIMutable>]
  type OrgApacheSlingCaconfigImplConfigurationBindingsValueProviderInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : OrgApacheSlingCaconfigImplConfigurationBindingsValueProviderProperties;
  }

  //#endregion
