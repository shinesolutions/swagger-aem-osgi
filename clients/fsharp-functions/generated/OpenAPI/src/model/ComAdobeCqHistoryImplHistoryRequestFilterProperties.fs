namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray

module ComAdobeCqHistoryImplHistoryRequestFilterProperties =

  //#region ComAdobeCqHistoryImplHistoryRequestFilterProperties

  [<CLIMutable>]
  type ComAdobeCqHistoryImplHistoryRequestFilterProperties = {
    [<JsonProperty(PropertyName = "history.requestFilter.excludedSelectors")>]
    HistoryRequestFilterExcludedSelectors : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "history.requestFilter.excludedExtensions")>]
    HistoryRequestFilterExcludedExtensions : ConfigNodePropertyArray;
  }

  //#endregion
