namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyString

module ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties =

  //#region ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties

  [<CLIMutable>]
  type ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties = {
    [<JsonProperty(PropertyName = "hc.tags")>]
    HcTags : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "webserver.address")>]
    WebserverAddress : ConfigNodePropertyString;
  }

  //#endregion
