namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray

module ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties =

  //#region ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties

  [<CLIMutable>]
  type ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties = {
    [<JsonProperty(PropertyName = "hc.tags")>]
    HcTags : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "account.logins")>]
    AccountLogins : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "console.logins")>]
    ConsoleLogins : ConfigNodePropertyArray;
  }

  //#endregion
