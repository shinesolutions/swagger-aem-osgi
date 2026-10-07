namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyDropDown
open OpenAPI.Model.ConfigNodePropertyString

module OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties =

  //#region OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties


  type orgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties = {
    EnabledActions : ConfigNodePropertyDropDown;
    UserPrivilegeNames : ConfigNodePropertyArray;
    GroupPrivilegeNames : ConfigNodePropertyArray;
    Constraint : ConfigNodePropertyString;
  }
  //#endregion
