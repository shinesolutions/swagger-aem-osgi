namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyString

module ComDayCqWcmFoundationImplHTTPAuthHandlerProperties =

  //#region ComDayCqWcmFoundationImplHTTPAuthHandlerProperties


  type comDayCqWcmFoundationImplHTTPAuthHandlerProperties = {
    Path : ConfigNodePropertyString;
    AuthHttpNologin : ConfigNodePropertyBoolean;
    AuthHttpRealm : ConfigNodePropertyString;
    AuthDefaultLoginpage : ConfigNodePropertyString;
    AuthCredForm : ConfigNodePropertyArray;
    AuthCredUtf8 : ConfigNodePropertyArray;
  }
  //#endregion
