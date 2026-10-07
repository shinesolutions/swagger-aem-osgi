namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryProperties

module ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryInfo =

  //#region ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryInfo

  [<CLIMutable>]
  type ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryProperties;
  }

  //#endregion
