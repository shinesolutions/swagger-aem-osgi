namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyString

module ComDayCqWcmDesignimporterImplEntryPreprocessorImplProperties =

  //#region ComDayCqWcmDesignimporterImplEntryPreprocessorImplProperties

  [<CLIMutable>]
  type ComDayCqWcmDesignimporterImplEntryPreprocessorImplProperties = {
    [<JsonProperty(PropertyName = "search.pattern")>]
    SearchPattern : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "replace.pattern")>]
    ReplacePattern : ConfigNodePropertyString;
  }

  //#endregion
