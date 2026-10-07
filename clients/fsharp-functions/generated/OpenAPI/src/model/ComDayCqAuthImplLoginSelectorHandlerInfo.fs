namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComDayCqAuthImplLoginSelectorHandlerProperties

module ComDayCqAuthImplLoginSelectorHandlerInfo =

  //#region ComDayCqAuthImplLoginSelectorHandlerInfo

  [<CLIMutable>]
  type ComDayCqAuthImplLoginSelectorHandlerInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComDayCqAuthImplLoginSelectorHandlerProperties;
    [<JsonProperty(PropertyName = "bundle_location")>]
    BundleLocation : string;
    [<JsonProperty(PropertyName = "service_location")>]
    ServiceLocation : string;
  }

  //#endregion
