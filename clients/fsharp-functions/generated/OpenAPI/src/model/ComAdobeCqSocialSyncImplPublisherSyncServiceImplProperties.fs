namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray

module ComAdobeCqSocialSyncImplPublisherSyncServiceImplProperties =

  //#region ComAdobeCqSocialSyncImplPublisherSyncServiceImplProperties

  [<CLIMutable>]
  type ComAdobeCqSocialSyncImplPublisherSyncServiceImplProperties = {
    [<JsonProperty(PropertyName = "activeRunModes")>]
    ActiveRunModes : ConfigNodePropertyArray;
  }

  //#endregion
