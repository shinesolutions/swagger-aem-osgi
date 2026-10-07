namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyDropDown
open OpenAPI.Model.ConfigNodePropertyString

module OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties =

  //#region OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties

  [<CLIMutable>]
  type OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties = {
    [<JsonProperty(PropertyName = "osgi.http.whiteboard.context.select")>]
    OsgiHttpWhiteboardContextSelect : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "osgi.http.whiteboard.listener")>]
    OsgiHttpWhiteboardListener : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "auth.sudo.cookie")>]
    AuthSudoCookie : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "auth.sudo.parameter")>]
    AuthSudoParameter : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "auth.annonymous")>]
    AuthAnnonymous : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "sling.auth.requirements")>]
    SlingAuthRequirements : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "sling.auth.anonymous.user")>]
    SlingAuthAnonymousUser : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "sling.auth.anonymous.password")>]
    SlingAuthAnonymousPassword : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "auth.http")>]
    AuthHttp : ConfigNodePropertyDropDown;
    [<JsonProperty(PropertyName = "auth.http.realm")>]
    AuthHttpRealm : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "auth.uri.suffix")>]
    AuthUriSuffix : ConfigNodePropertyArray;
  }

  //#endregion
