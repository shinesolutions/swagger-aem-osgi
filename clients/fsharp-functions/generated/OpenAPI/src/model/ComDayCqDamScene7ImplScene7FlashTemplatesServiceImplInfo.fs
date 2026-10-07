namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties

module ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplInfo =

  //#region ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplInfo

  [<CLIMutable>]
  type ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties;
  }

  //#endregion
