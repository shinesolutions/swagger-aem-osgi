namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties

module ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryInfo =

  //#region ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryInfo

  [<CLIMutable>]
  type ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties;
    [<JsonProperty(PropertyName = "bundle_location")>]
    BundleLocation : string;
    [<JsonProperty(PropertyName = "service_location")>]
    ServiceLocation : string;
  }

  //#endregion
