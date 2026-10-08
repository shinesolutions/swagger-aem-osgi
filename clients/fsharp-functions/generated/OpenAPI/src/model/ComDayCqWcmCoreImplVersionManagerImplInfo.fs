namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComDayCqWcmCoreImplVersionManagerImplProperties

module ComDayCqWcmCoreImplVersionManagerImplInfo =

  //#region ComDayCqWcmCoreImplVersionManagerImplInfo

  [<CLIMutable>]
  type ComDayCqWcmCoreImplVersionManagerImplInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComDayCqWcmCoreImplVersionManagerImplProperties;
  }

  //#endregion
