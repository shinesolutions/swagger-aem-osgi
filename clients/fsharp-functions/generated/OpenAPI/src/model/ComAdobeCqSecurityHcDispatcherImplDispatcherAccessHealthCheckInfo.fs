namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties

module ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckInfo =

  //#region ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckInfo

  [<CLIMutable>]
  type ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties;
  }

  //#endregion
