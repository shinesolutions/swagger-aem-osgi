namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties

module ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerInfo =

  //#region ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerInfo

  [<CLIMutable>]
  type ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties;
  }

  //#endregion
