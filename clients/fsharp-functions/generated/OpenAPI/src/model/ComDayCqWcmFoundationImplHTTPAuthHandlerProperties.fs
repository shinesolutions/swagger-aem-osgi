namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyString

module ComDayCqWcmFoundationImplHTTPAuthHandlerProperties =

  //#region ComDayCqWcmFoundationImplHTTPAuthHandlerProperties

  [<CLIMutable>]
  type ComDayCqWcmFoundationImplHTTPAuthHandlerProperties = {
    [<JsonProperty(PropertyName = "path")>]
    Path : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "auth.http.nologin")>]
    AuthHttpNologin : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "auth.http.realm")>]
    AuthHttpRealm : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "auth.default.loginpage")>]
    AuthDefaultLoginpage : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "auth.cred.form")>]
    AuthCredForm : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "auth.cred.utf8")>]
    AuthCredUtf8 : ConfigNodePropertyArray;
  }

  //#endregion
