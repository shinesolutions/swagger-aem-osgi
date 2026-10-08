namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraProperties

module OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraInfo =

  //#region OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraInfo

  [<CLIMutable>]
  type OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraProperties;
  }

  //#endregion
