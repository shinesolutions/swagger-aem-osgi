namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties

module ComAdobeCqSocialTranslationImplUGCLanguageDetectorInfo =

  //#region ComAdobeCqSocialTranslationImplUGCLanguageDetectorInfo

  [<CLIMutable>]
  type ComAdobeCqSocialTranslationImplUGCLanguageDetectorInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties;
  }

  //#endregion
