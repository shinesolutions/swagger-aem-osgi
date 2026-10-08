namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComDayCqDamCoreImplProcessTextExtractionProcessProperties

module ComDayCqDamCoreImplProcessTextExtractionProcessInfo =

  //#region ComDayCqDamCoreImplProcessTextExtractionProcessInfo

  [<CLIMutable>]
  type ComDayCqDamCoreImplProcessTextExtractionProcessInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComDayCqDamCoreImplProcessTextExtractionProcessProperties;
  }

  //#endregion
