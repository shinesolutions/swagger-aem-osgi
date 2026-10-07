namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties =

  //#region OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties


  type orgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties = {
    TokenExpiration : ConfigNodePropertyString;
    TokenLength : ConfigNodePropertyString;
    TokenRefresh : ConfigNodePropertyBoolean;
    TokenCleanupThreshold : ConfigNodePropertyInteger;
    PasswordHashAlgorithm : ConfigNodePropertyString;
    PasswordHashIterations : ConfigNodePropertyInteger;
    PasswordSaltSize : ConfigNodePropertyInteger;
  }
  //#endregion
