namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties

module ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorInfo =

  //#region ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorInfo

  [<CLIMutable>]
  type ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties;
  }

  //#endregion
