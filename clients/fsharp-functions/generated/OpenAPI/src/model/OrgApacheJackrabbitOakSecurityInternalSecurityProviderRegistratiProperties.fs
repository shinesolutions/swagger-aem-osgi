namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyDropDown

module OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties =

  //#region OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties

  [<CLIMutable>]
  type OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties = {
    [<JsonProperty(PropertyName = "requiredServicePids")>]
    RequiredServicePids : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "authorizationCompositionType")>]
    AuthorizationCompositionType : ConfigNodePropertyDropDown;
  }

  //#endregion
