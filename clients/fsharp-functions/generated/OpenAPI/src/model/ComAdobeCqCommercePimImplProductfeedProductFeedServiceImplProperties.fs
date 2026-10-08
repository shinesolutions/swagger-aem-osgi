namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyDropDown

module ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties =

  //#region ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties

  [<CLIMutable>]
  type ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties = {
    [<JsonProperty(PropertyName = "Feed generator algorithm")>]
    FeedGeneratorAlgorithm : ConfigNodePropertyDropDown;
  }

  //#endregion
