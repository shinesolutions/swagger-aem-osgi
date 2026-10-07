namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties

module ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigInfo =

  //#region ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigInfo

  [<CLIMutable>]
  type ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties;
  }

  //#endregion
