namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyString

module ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletProperties =

  //#region ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletProperties

  [<CLIMutable>]
  type ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletProperties = {
    [<JsonProperty(PropertyName = "testandtarget.endpoint.url")>]
    TestandtargetEndpointUrl : ConfigNodePropertyString;
  }

  //#endregion
