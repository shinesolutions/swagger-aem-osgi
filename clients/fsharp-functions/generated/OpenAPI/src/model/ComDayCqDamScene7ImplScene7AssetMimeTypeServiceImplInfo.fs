namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties

module ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplInfo =

  //#region ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplInfo

  [<CLIMutable>]
  type ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties;
  }

  //#endregion
