namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module ComDayCqWcmDesignimporterParserTaghandlersFactoryTitleTagHandlProperties =

  //#region ComDayCqWcmDesignimporterParserTaghandlersFactoryTitleTagHandlProperties

  [<CLIMutable>]
  type ComDayCqWcmDesignimporterParserTaghandlersFactoryTitleTagHandlProperties = {
    [<JsonProperty(PropertyName = "service.ranking")>]
    ServiceRanking : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "tagpattern")>]
    Tagpattern : ConfigNodePropertyString;
  }

  //#endregion
