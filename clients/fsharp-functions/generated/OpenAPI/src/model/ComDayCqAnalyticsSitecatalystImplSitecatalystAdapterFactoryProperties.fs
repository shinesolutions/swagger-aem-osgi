namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray

module ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryProperties =

  //#region ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryProperties

  [<CLIMutable>]
  type ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryProperties = {
    [<JsonProperty(PropertyName = "cq.analytics.adapterfactory.contextstores")>]
    CqAnalyticsAdapterfactoryContextstores : ConfigNodePropertyArray;
  }

  //#endregion
