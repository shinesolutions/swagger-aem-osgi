namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComDayCqMcmLandingpageParserTaghandlersCtaLeadFormCTAComponentProperties

module ComDayCqMcmLandingpageParserTaghandlersCtaLeadFormCTAComponentInfo =

  //#region ComDayCqMcmLandingpageParserTaghandlersCtaLeadFormCTAComponentInfo

  [<CLIMutable>]
  type ComDayCqMcmLandingpageParserTaghandlersCtaLeadFormCTAComponentInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComDayCqMcmLandingpageParserTaghandlersCtaLeadFormCTAComponentProperties;
  }

  //#endregion
