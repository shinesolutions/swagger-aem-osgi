namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module ComDayCqAuthImplLoginSelectorHandlerProperties =

  //#region ComDayCqAuthImplLoginSelectorHandlerProperties


  type comDayCqAuthImplLoginSelectorHandlerProperties = {
    Path : ConfigNodePropertyString;
    ServiceRanking : ConfigNodePropertyInteger;
    AuthLoginselectorMappings : ConfigNodePropertyArray;
    AuthLoginselectorChangepwMappings : ConfigNodePropertyArray;
    AuthLoginselectorDefaultloginpage : ConfigNodePropertyString;
    AuthLoginselectorDefaultchangepwpage : ConfigNodePropertyString;
    AuthLoginselectorHandle : ConfigNodePropertyArray;
    AuthLoginselectorHandleAllExtensions : ConfigNodePropertyBoolean;
  }
  //#endregion
