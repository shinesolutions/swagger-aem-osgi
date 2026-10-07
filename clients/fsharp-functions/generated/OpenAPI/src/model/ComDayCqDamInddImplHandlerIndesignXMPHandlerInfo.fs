namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComDayCqDamInddImplHandlerIndesignXMPHandlerProperties

module ComDayCqDamInddImplHandlerIndesignXMPHandlerInfo =

  //#region ComDayCqDamInddImplHandlerIndesignXMPHandlerInfo

  [<CLIMutable>]
  type ComDayCqDamInddImplHandlerIndesignXMPHandlerInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComDayCqDamInddImplHandlerIndesignXMPHandlerProperties;
  }

  //#endregion
