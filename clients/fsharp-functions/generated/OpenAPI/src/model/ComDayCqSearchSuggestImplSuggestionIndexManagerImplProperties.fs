namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyString

module ComDayCqSearchSuggestImplSuggestionIndexManagerImplProperties =

  //#region ComDayCqSearchSuggestImplSuggestionIndexManagerImplProperties

  [<CLIMutable>]
  type ComDayCqSearchSuggestImplSuggestionIndexManagerImplProperties = {
    [<JsonProperty(PropertyName = "pathBuilder.target")>]
    PathBuilderTarget : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "suggest.basepath")>]
    SuggestBasepath : ConfigNodePropertyString;
  }

  //#endregion
