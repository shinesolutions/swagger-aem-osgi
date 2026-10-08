namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyBoolean

module ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties =

  //#region ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties

  [<CLIMutable>]
  type ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties = {
    [<JsonProperty(PropertyName = "cq.searchpromote.confighandler.enabled")>]
    CqSearchpromoteConfighandlerEnabled : ConfigNodePropertyBoolean;
  }

  //#endregion
