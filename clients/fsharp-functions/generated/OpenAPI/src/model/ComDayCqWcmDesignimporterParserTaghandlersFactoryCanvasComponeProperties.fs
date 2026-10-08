namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module ComDayCqWcmDesignimporterParserTaghandlersFactoryCanvasComponeProperties =

  //#region ComDayCqWcmDesignimporterParserTaghandlersFactoryCanvasComponeProperties

  [<CLIMutable>]
  type ComDayCqWcmDesignimporterParserTaghandlersFactoryCanvasComponeProperties = {
    [<JsonProperty(PropertyName = "service.ranking")>]
    ServiceRanking : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "tagpattern")>]
    Tagpattern : ConfigNodePropertyString;
  }

  //#endregion
