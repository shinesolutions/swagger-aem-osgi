namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComDayCqSearchSuggestImplSuggestionIndexManagerImplProperties

module ComDayCqSearchSuggestImplSuggestionIndexManagerImplInfo =

  //#region ComDayCqSearchSuggestImplSuggestionIndexManagerImplInfo

  [<CLIMutable>]
  type ComDayCqSearchSuggestImplSuggestionIndexManagerImplInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComDayCqSearchSuggestImplSuggestionIndexManagerImplProperties;
  }

  //#endregion
