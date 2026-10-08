namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryProperties

module ComDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryInfo =

  //#region ComDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryInfo

  [<CLIMutable>]
  type ComDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryProperties;
  }

  //#endregion
