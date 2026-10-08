namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyDropDown
open OpenAPI.Model.ConfigNodePropertyInteger

module OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties =

  //#region OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties


  type orgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties = {
    PermissionsJr2 : ConfigNodePropertyDropDown;
    ImportBehavior : ConfigNodePropertyDropDown;
    ReadPaths : ConfigNodePropertyArray;
    AdministrativePrincipals : ConfigNodePropertyArray;
    ConfigurationRanking : ConfigNodePropertyInteger;
  }
  //#endregion
