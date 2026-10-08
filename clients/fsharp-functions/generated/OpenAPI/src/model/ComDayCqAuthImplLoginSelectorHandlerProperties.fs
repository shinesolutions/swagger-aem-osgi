namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module ComDayCqAuthImplLoginSelectorHandlerProperties =

  //#region ComDayCqAuthImplLoginSelectorHandlerProperties

  [<CLIMutable>]
  type ComDayCqAuthImplLoginSelectorHandlerProperties = {
    [<JsonProperty(PropertyName = "path")>]
    Path : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "service.ranking")>]
    ServiceRanking : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "auth.loginselector.mappings")>]
    AuthLoginselectorMappings : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "auth.loginselector.changepw.mappings")>]
    AuthLoginselectorChangepwMappings : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "auth.loginselector.defaultloginpage")>]
    AuthLoginselectorDefaultloginpage : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "auth.loginselector.defaultchangepwpage")>]
    AuthLoginselectorDefaultchangepwpage : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "auth.loginselector.handle")>]
    AuthLoginselectorHandle : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "auth.loginselector.handle.all.extensions")>]
    AuthLoginselectorHandleAllExtensions : ConfigNodePropertyBoolean;
  }

  //#endregion
