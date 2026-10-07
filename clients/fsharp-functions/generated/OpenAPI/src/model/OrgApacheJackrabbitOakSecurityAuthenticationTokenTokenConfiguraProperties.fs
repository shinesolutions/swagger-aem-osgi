namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties =

  //#region OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties

  [<CLIMutable>]
  type OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties = {
    [<JsonProperty(PropertyName = "tokenExpiration")>]
    TokenExpiration : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "tokenLength")>]
    TokenLength : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "tokenRefresh")>]
    TokenRefresh : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "tokenCleanupThreshold")>]
    TokenCleanupThreshold : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "passwordHashAlgorithm")>]
    PasswordHashAlgorithm : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "passwordHashIterations")>]
    PasswordHashIterations : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "passwordSaltSize")>]
    PasswordSaltSize : ConfigNodePropertyInteger;
  }

  //#endregion
