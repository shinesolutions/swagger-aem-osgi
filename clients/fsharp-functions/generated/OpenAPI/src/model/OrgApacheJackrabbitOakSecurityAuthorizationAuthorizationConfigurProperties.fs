namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyDropDown
open OpenAPI.Model.ConfigNodePropertyInteger

module OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties =

  //#region OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties

  [<CLIMutable>]
  type OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties = {
    [<JsonProperty(PropertyName = "permissionsJr2")>]
    PermissionsJr2 : ConfigNodePropertyDropDown;
    [<JsonProperty(PropertyName = "importBehavior")>]
    ImportBehavior : ConfigNodePropertyDropDown;
    [<JsonProperty(PropertyName = "readPaths")>]
    ReadPaths : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "administrativePrincipals")>]
    AdministrativePrincipals : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "configurationRanking")>]
    ConfigurationRanking : ConfigNodePropertyInteger;
  }

  //#endregion
