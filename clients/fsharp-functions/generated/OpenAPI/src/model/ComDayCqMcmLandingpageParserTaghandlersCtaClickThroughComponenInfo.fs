namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenProperties

module ComDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenInfo =

  //#region ComDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenInfo

  [<CLIMutable>]
  type ComDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenProperties;
  }

  //#endregion
