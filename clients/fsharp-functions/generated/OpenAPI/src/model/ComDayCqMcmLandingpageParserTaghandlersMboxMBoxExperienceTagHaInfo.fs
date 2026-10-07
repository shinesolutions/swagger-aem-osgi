namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHaProperties

module ComDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHaInfo =

  //#region ComDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHaInfo

  [<CLIMutable>]
  type ComDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHaInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHaProperties;
  }

  //#endregion
