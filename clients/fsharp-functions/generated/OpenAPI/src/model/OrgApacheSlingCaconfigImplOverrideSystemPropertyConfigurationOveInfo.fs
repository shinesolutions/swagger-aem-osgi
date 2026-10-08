namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveProperties

module OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveInfo =

  //#region OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveInfo

  [<CLIMutable>]
  type OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveProperties;
  }

  //#endregion
