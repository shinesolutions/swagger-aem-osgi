namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyInteger

module OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties =

  //#region OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties

  [<CLIMutable>]
  type OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties = {
    [<JsonProperty(PropertyName = "cugSupportedPaths")>]
    CugSupportedPaths : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "cugEnabled")>]
    CugEnabled : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "configurationRanking")>]
    ConfigurationRanking : ConfigNodePropertyInteger;
  }

  //#endregion
