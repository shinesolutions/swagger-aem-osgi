namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.OrgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraProperties

module OrgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraInfo =

  //#region OrgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraInfo

  [<CLIMutable>]
  type OrgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : OrgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraProperties;
  }

  //#endregion
