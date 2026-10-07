namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyDropDown
open OpenAPI.Model.ConfigNodePropertyString

module OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties =

  //#region OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties


  type orgApacheSlingEngineImplAuthSlingAuthenticatorProperties = {
    OsgiHttpWhiteboardContextSelect : ConfigNodePropertyString;
    OsgiHttpWhiteboardListener : ConfigNodePropertyString;
    AuthSudoCookie : ConfigNodePropertyString;
    AuthSudoParameter : ConfigNodePropertyString;
    AuthAnnonymous : ConfigNodePropertyBoolean;
    SlingAuthRequirements : ConfigNodePropertyArray;
    SlingAuthAnonymousUser : ConfigNodePropertyString;
    SlingAuthAnonymousPassword : ConfigNodePropertyString;
    AuthHttp : ConfigNodePropertyDropDown;
    AuthHttpRealm : ConfigNodePropertyString;
    AuthUriSuffix : ConfigNodePropertyArray;
  }
  //#endregion
