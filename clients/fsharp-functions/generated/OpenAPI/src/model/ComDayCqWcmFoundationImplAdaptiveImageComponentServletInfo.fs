namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComDayCqWcmFoundationImplAdaptiveImageComponentServletProperties

module ComDayCqWcmFoundationImplAdaptiveImageComponentServletInfo =

  //#region ComDayCqWcmFoundationImplAdaptiveImageComponentServletInfo

  [<CLIMutable>]
  type ComDayCqWcmFoundationImplAdaptiveImageComponentServletInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComDayCqWcmFoundationImplAdaptiveImageComponentServletProperties;
  }

  //#endregion
