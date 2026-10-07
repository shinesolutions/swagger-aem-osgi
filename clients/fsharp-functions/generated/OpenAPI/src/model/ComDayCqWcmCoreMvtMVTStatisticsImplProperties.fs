namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyString

module ComDayCqWcmCoreMvtMVTStatisticsImplProperties =

  //#region ComDayCqWcmCoreMvtMVTStatisticsImplProperties

  [<CLIMutable>]
  type ComDayCqWcmCoreMvtMVTStatisticsImplProperties = {
    [<JsonProperty(PropertyName = "mvtstatistics.trackingurl")>]
    MvtstatisticsTrackingurl : ConfigNodePropertyString;
  }

  //#endregion
