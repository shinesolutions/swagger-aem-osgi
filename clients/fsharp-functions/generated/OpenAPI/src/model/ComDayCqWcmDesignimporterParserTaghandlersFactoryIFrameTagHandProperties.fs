namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module ComDayCqWcmDesignimporterParserTaghandlersFactoryIFrameTagHandProperties =

  //#region ComDayCqWcmDesignimporterParserTaghandlersFactoryIFrameTagHandProperties

  [<CLIMutable>]
  type ComDayCqWcmDesignimporterParserTaghandlersFactoryIFrameTagHandProperties = {
    [<JsonProperty(PropertyName = "service.ranking")>]
    ServiceRanking : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "tagpattern")>]
    Tagpattern : ConfigNodePropertyString;
  }

  //#endregion
