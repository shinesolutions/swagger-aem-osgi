namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComDayCqDamCoreImplServletDamContentDispositionFilterProperties

module ComDayCqDamCoreImplServletDamContentDispositionFilterInfo =

  //#region ComDayCqDamCoreImplServletDamContentDispositionFilterInfo

  [<CLIMutable>]
  type ComDayCqDamCoreImplServletDamContentDispositionFilterInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComDayCqDamCoreImplServletDamContentDispositionFilterProperties;
  }

  //#endregion
