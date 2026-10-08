namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyInteger

module ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties =

  //#region ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties

  [<CLIMutable>]
  type ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties = {
    [<JsonProperty(PropertyName = "minThreadPoolSize")>]
    MinThreadPoolSize : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "maxThreadPoolSize")>]
    MaxThreadPoolSize : ConfigNodePropertyInteger;
  }

  //#endregion
