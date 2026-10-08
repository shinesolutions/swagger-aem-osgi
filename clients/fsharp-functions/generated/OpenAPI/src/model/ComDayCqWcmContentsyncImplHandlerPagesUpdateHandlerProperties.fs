namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray

module ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties =

  //#region ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties

  [<CLIMutable>]
  type ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties = {
    [<JsonProperty(PropertyName = "cq.pagesupdatehandler.imageresourcetypes")>]
    CqPagesupdatehandlerImageresourcetypes : ConfigNodePropertyArray;
  }

  //#endregion
