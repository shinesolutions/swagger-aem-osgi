namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletProperties

module ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletInfo =

  //#region ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletInfo

  [<CLIMutable>]
  type ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletProperties;
  }

  //#endregion
