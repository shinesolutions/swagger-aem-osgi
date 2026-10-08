namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougProperties

module ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougInfo =

  //#region ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougInfo

  [<CLIMutable>]
  type ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougProperties;
  }

  //#endregion
