namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComDayCqDamScene7ImplScene7UploadServiceImplProperties

module ComDayCqDamScene7ImplScene7UploadServiceImplInfo =

  //#region ComDayCqDamScene7ImplScene7UploadServiceImplInfo

  [<CLIMutable>]
  type ComDayCqDamScene7ImplScene7UploadServiceImplInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComDayCqDamScene7ImplScene7UploadServiceImplProperties;
  }

  //#endregion
