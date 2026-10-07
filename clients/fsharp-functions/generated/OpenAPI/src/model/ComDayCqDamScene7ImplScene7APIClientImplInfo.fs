namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComDayCqDamScene7ImplScene7APIClientImplProperties

module ComDayCqDamScene7ImplScene7APIClientImplInfo =

  //#region ComDayCqDamScene7ImplScene7APIClientImplInfo

  [<CLIMutable>]
  type ComDayCqDamScene7ImplScene7APIClientImplInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComDayCqDamScene7ImplScene7APIClientImplProperties;
  }

  //#endregion
