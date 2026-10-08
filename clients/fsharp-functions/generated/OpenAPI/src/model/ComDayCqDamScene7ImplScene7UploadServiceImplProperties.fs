namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyInteger

module ComDayCqDamScene7ImplScene7UploadServiceImplProperties =

  //#region ComDayCqDamScene7ImplScene7UploadServiceImplProperties

  [<CLIMutable>]
  type ComDayCqDamScene7ImplScene7UploadServiceImplProperties = {
    [<JsonProperty(PropertyName = "cq.dam.scene7.uploadservice.activejobtimeout.label")>]
    CqDamScene7UploadserviceActivejobtimeoutLabel : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "cq.dam.scene7.uploadservice.connectionmaxperroute.label")>]
    CqDamScene7UploadserviceConnectionmaxperrouteLabel : ConfigNodePropertyInteger;
  }

  //#endregion
