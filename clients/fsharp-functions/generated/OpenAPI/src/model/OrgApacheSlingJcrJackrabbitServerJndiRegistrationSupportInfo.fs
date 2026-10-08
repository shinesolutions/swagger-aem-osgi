namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportProperties

module OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportInfo =

  //#region OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportInfo

  [<CLIMutable>]
  type OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportProperties;
  }

  //#endregion
