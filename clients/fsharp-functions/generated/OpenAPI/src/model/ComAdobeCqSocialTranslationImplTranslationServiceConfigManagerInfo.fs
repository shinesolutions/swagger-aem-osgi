namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties

module ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerInfo =

  //#region ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerInfo

  [<CLIMutable>]
  type ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties;
  }

  //#endregion
