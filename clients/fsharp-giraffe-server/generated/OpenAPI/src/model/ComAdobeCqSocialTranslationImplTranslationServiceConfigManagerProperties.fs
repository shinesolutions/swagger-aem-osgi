namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyDropDown
open OpenAPI.Model.ConfigNodePropertyString

module ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties =

  //#region ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties


  type comAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties = {
    TranslateLanguage : ConfigNodePropertyDropDown;
    TranslateDisplay : ConfigNodePropertyDropDown;
    TranslateAttribution : ConfigNodePropertyBoolean;
    TranslateCaching : ConfigNodePropertyDropDown;
    TranslateSmartRendering : ConfigNodePropertyDropDown;
    TranslateCachingDuration : ConfigNodePropertyString;
    TranslateSessionSaveInterval : ConfigNodePropertyString;
    TranslateSessionSaveBatchLimit : ConfigNodePropertyString;
  }
  //#endregion
