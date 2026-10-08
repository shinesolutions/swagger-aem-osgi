namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties

module OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportInfo =

  //#region OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportInfo

  [<CLIMutable>]
  type OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties;
  }

  //#endregion
