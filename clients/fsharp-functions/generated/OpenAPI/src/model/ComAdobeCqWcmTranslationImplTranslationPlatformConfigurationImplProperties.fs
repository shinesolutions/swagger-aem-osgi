namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyDropDown
open OpenAPI.Model.ConfigNodePropertyString

module ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties =

  //#region ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties

  [<CLIMutable>]
  type ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties = {
    [<JsonProperty(PropertyName = "syncTranslationState.schedulingFormat")>]
    SyncTranslationStateSchedulingFormat : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "schedulingRepeatTranslation.schedulingFormat")>]
    SchedulingRepeatTranslationSchedulingFormat : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "syncTranslationState.lockTimeoutInMinutes")>]
    SyncTranslationStateLockTimeoutInMinutes : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "export.format")>]
    ExportFormat : ConfigNodePropertyDropDown;
  }

  //#endregion
