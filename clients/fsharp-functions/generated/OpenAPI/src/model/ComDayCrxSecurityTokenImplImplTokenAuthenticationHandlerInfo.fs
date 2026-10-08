namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties

module ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerInfo =

  //#region ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerInfo

  [<CLIMutable>]
  type ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties;
    [<JsonProperty(PropertyName = "bundle_location")>]
    BundleLocation : string;
    [<JsonProperty(PropertyName = "service_location")>]
    ServiceLocation : string;
  }

  //#endregion
