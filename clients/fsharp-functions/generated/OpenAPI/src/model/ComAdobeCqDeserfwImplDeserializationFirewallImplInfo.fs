namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeCqDeserfwImplDeserializationFirewallImplProperties

module ComAdobeCqDeserfwImplDeserializationFirewallImplInfo =

  //#region ComAdobeCqDeserfwImplDeserializationFirewallImplInfo

  [<CLIMutable>]
  type ComAdobeCqDeserfwImplDeserializationFirewallImplInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeCqDeserfwImplDeserializationFirewallImplProperties;
  }

  //#endregion
