namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyBoolean

module ComAdobeCqCommercePimImplPageEventListenerProperties =

  //#region ComAdobeCqCommercePimImplPageEventListenerProperties

  [<CLIMutable>]
  type ComAdobeCqCommercePimImplPageEventListenerProperties = {
    [<JsonProperty(PropertyName = "cq.commerce.pageeventlistener.enabled")>]
    CqCommercePageeventlistenerEnabled : ConfigNodePropertyBoolean;
  }

  //#endregion
