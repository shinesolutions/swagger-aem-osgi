namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComDayCqWcmFoundationImplPageImpressionsTrackerProperties

module ComDayCqWcmFoundationImplPageImpressionsTrackerInfo =

  //#region ComDayCqWcmFoundationImplPageImpressionsTrackerInfo

  [<CLIMutable>]
  type ComDayCqWcmFoundationImplPageImpressionsTrackerInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComDayCqWcmFoundationImplPageImpressionsTrackerProperties;
  }

  //#endregion
