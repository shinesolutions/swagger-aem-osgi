namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray

module ComDayCqWcmCoreImplCommandsWCMCommandServletProperties =

  //#region ComDayCqWcmCoreImplCommandsWCMCommandServletProperties

  [<CLIMutable>]
  type ComDayCqWcmCoreImplCommandsWCMCommandServletProperties = {
    [<JsonProperty(PropertyName = "wcmcommandservlet.delete_whitelist")>]
    WcmcommandservletDeleteWhitelist : ConfigNodePropertyArray;
  }

  //#endregion
