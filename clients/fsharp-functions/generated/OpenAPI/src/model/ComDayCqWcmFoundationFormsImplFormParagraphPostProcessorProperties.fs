namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyBoolean

module ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties =

  //#region ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties

  [<CLIMutable>]
  type ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties = {
    [<JsonProperty(PropertyName = "forms.formparagraphpostprocessor.enabled")>]
    FormsFormparagraphpostprocessorEnabled : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "forms.formparagraphpostprocessor.formresourcetypes")>]
    FormsFormparagraphpostprocessorFormresourcetypes : ConfigNodePropertyArray;
  }

  //#endregion
