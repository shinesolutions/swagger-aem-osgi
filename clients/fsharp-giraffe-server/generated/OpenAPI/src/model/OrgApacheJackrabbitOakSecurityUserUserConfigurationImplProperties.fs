namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyDropDown
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties =

  //#region OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties


  type orgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties = {
    UsersPath : ConfigNodePropertyString;
    GroupsPath : ConfigNodePropertyString;
    SystemRelativePath : ConfigNodePropertyString;
    DefaultDepth : ConfigNodePropertyInteger;
    ImportBehavior : ConfigNodePropertyDropDown;
    PasswordHashAlgorithm : ConfigNodePropertyString;
    PasswordHashIterations : ConfigNodePropertyInteger;
    PasswordSaltSize : ConfigNodePropertyInteger;
    OmitAdminPw : ConfigNodePropertyBoolean;
    SupportAutoSave : ConfigNodePropertyBoolean;
    PasswordMaxAge : ConfigNodePropertyInteger;
    InitialPasswordChange : ConfigNodePropertyBoolean;
    PasswordHistorySize : ConfigNodePropertyInteger;
    PasswordExpiryForAdmin : ConfigNodePropertyBoolean;
    CacheExpiration : ConfigNodePropertyInteger;
    EnableRFC7613UsercaseMappedProfile : ConfigNodePropertyBoolean;
  }
  //#endregion
