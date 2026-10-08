namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyDropDown
open OpenAPI.Model.ConfigNodePropertyString

module ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties =

  //#region ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties


  type comDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties = {
    Path : ConfigNodePropertyString;
    TokenRequiredAttr : ConfigNodePropertyDropDown;
    TokenAlternateUrl : ConfigNodePropertyString;
    TokenEncapsulated : ConfigNodePropertyBoolean;
    SkipTokenRefresh : ConfigNodePropertyArray;
  }
  //#endregion
