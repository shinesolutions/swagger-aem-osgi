namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyInteger

module ComAdobeCqAddressImplLocationLocationListServletProperties =

  //#region ComAdobeCqAddressImplLocationLocationListServletProperties

  [<CLIMutable>]
  type ComAdobeCqAddressImplLocationLocationListServletProperties = {
    [<JsonProperty(PropertyName = "cq.address.location.default.maxResults")>]
    CqAddressLocationDefaultMaxResults : ConfigNodePropertyInteger;
  }

  //#endregion
