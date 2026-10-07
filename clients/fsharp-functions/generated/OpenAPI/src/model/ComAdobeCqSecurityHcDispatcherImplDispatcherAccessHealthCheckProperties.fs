namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyString

module ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties =

  //#region ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties

  [<CLIMutable>]
  type ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties = {
    [<JsonProperty(PropertyName = "hc.tags")>]
    HcTags : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "dispatcher.address")>]
    DispatcherAddress : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "dispatcher.filter.allowed")>]
    DispatcherFilterAllowed : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "dispatcher.filter.blocked")>]
    DispatcherFilterBlocked : ConfigNodePropertyArray;
  }

  //#endregion
