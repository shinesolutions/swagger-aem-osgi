namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyDropDown
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties =

  //#region OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties

  [<CLIMutable>]
  type OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties = {
    [<JsonProperty(PropertyName = "usersPath")>]
    UsersPath : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "groupsPath")>]
    GroupsPath : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "systemRelativePath")>]
    SystemRelativePath : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "defaultDepth")>]
    DefaultDepth : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "importBehavior")>]
    ImportBehavior : ConfigNodePropertyDropDown;
    [<JsonProperty(PropertyName = "passwordHashAlgorithm")>]
    PasswordHashAlgorithm : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "passwordHashIterations")>]
    PasswordHashIterations : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "passwordSaltSize")>]
    PasswordSaltSize : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "omitAdminPw")>]
    OmitAdminPw : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "supportAutoSave")>]
    SupportAutoSave : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "passwordMaxAge")>]
    PasswordMaxAge : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "initialPasswordChange")>]
    InitialPasswordChange : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "passwordHistorySize")>]
    PasswordHistorySize : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "passwordExpiryForAdmin")>]
    PasswordExpiryForAdmin : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "cacheExpiration")>]
    CacheExpiration : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "enableRFC7613UsercaseMappedProfile")>]
    EnableRFC7613UsercaseMappedProfile : ConfigNodePropertyBoolean;
  }

  //#endregion
