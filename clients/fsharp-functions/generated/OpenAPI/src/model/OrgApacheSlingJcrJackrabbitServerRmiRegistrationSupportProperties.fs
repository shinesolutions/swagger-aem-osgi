namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyInteger

module OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties =

  //#region OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties

  [<CLIMutable>]
  type OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties = {
    [<JsonProperty(PropertyName = "port")>]
    Port : ConfigNodePropertyInteger;
  }

  //#endregion
