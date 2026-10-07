namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyString

module ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties =

  //#region ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties

  [<CLIMutable>]
  type ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties = {
    [<JsonProperty(PropertyName = "scene7FlashTemplates.rti")>]
    Scene7FlashTemplatesRti : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "scene7FlashTemplates.rsi")>]
    Scene7FlashTemplatesRsi : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "scene7FlashTemplates.rb")>]
    Scene7FlashTemplatesRb : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "scene7FlashTemplates.rurl")>]
    Scene7FlashTemplatesRurl : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "scene7FlashTemplate.urlFormatParameter")>]
    Scene7FlashTemplateUrlFormatParameter : ConfigNodePropertyString;
  }

  //#endregion
