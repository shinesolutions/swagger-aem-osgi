namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyDropDown
open OpenAPI.Model.ConfigNodePropertyString

module ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties =

  //#region ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties

  [<CLIMutable>]
  type ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties = {
    [<JsonProperty(PropertyName = "translate.language")>]
    TranslateLanguage : ConfigNodePropertyDropDown;
    [<JsonProperty(PropertyName = "translate.display")>]
    TranslateDisplay : ConfigNodePropertyDropDown;
    [<JsonProperty(PropertyName = "translate.attribution")>]
    TranslateAttribution : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "translate.caching")>]
    TranslateCaching : ConfigNodePropertyDropDown;
    [<JsonProperty(PropertyName = "translate.smart.rendering")>]
    TranslateSmartRendering : ConfigNodePropertyDropDown;
    [<JsonProperty(PropertyName = "translate.caching.duration")>]
    TranslateCachingDuration : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "translate.session.save.interval")>]
    TranslateSessionSaveInterval : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "translate.session.save.batchLimit")>]
    TranslateSessionSaveBatchLimit : ConfigNodePropertyString;
  }

  //#endregion
