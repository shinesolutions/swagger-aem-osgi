namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties =

  //#region ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties

  [<CLIMutable>]
  type ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties = {
    [<JsonProperty(PropertyName = "cq.analytics.testandtarget.api.url")>]
    CqAnalyticsTestandtargetApiUrl : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "cq.analytics.testandtarget.timeout")>]
    CqAnalyticsTestandtargetTimeout : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "cq.analytics.testandtarget.sockettimeout")>]
    CqAnalyticsTestandtargetSockettimeout : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "cq.analytics.testandtarget.recommendations.url.replace")>]
    CqAnalyticsTestandtargetRecommendationsUrlReplace : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "cq.analytics.testandtarget.recommendations.url.replacewith")>]
    CqAnalyticsTestandtargetRecommendationsUrlReplacewith : ConfigNodePropertyString;
  }

  //#endregion
