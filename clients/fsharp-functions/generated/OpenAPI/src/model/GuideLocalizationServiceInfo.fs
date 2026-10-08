namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.GuideLocalizationServiceProperties

module GuideLocalizationServiceInfo =

  //#region GuideLocalizationServiceInfo

  [<CLIMutable>]
  type GuideLocalizationServiceInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : GuideLocalizationServiceProperties;
  }

  //#endregion
