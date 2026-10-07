namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComDayCqMcmCampaignImplIntegrationConfigImplProperties

module ComDayCqMcmCampaignImplIntegrationConfigImplInfo =

  //#region ComDayCqMcmCampaignImplIntegrationConfigImplInfo

  [<CLIMutable>]
  type ComDayCqMcmCampaignImplIntegrationConfigImplInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComDayCqMcmCampaignImplIntegrationConfigImplProperties;
  }

  //#endregion
