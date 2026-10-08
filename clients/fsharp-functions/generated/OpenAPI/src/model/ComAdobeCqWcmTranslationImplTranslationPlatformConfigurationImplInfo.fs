namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties

module ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplInfo =

  //#region ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplInfo

  [<CLIMutable>]
  type ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties;
  }

  //#endregion
