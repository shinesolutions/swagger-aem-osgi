namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray

module ComAdobeCqHistoryImplHistoryServiceImplProperties =

  //#region ComAdobeCqHistoryImplHistoryServiceImplProperties

  [<CLIMutable>]
  type ComAdobeCqHistoryImplHistoryServiceImplProperties = {
    [<JsonProperty(PropertyName = "history.service.resourceTypes")>]
    HistoryServiceResourceTypes : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "history.service.pathFilter")>]
    HistoryServicePathFilter : ConfigNodePropertyArray;
  }

  //#endregion
