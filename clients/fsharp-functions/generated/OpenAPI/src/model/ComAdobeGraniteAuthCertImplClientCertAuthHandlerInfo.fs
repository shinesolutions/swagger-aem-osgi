namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeGraniteAuthCertImplClientCertAuthHandlerProperties

module ComAdobeGraniteAuthCertImplClientCertAuthHandlerInfo =

  //#region ComAdobeGraniteAuthCertImplClientCertAuthHandlerInfo

  [<CLIMutable>]
  type ComAdobeGraniteAuthCertImplClientCertAuthHandlerInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeGraniteAuthCertImplClientCertAuthHandlerProperties;
  }

  //#endregion
