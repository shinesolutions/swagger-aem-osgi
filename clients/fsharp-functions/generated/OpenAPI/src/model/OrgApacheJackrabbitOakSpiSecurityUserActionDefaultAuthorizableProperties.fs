namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyDropDown
open OpenAPI.Model.ConfigNodePropertyString

module OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties =

  //#region OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties

  [<CLIMutable>]
  type OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties = {
    [<JsonProperty(PropertyName = "enabledActions")>]
    EnabledActions : ConfigNodePropertyDropDown;
    [<JsonProperty(PropertyName = "userPrivilegeNames")>]
    UserPrivilegeNames : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "groupPrivilegeNames")>]
    GroupPrivilegeNames : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "constraint")>]
    Constraint : ConfigNodePropertyString;
  }

  //#endregion
