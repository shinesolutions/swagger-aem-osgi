namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyString

module ComAdobeCqDeserfwImplDeserializationFirewallImplProperties =

  //#region ComAdobeCqDeserfwImplDeserializationFirewallImplProperties

  [<CLIMutable>]
  type ComAdobeCqDeserfwImplDeserializationFirewallImplProperties = {
    [<JsonProperty(PropertyName = "firewall.deserialization.whitelist")>]
    FirewallDeserializationWhitelist : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "firewall.deserialization.blacklist")>]
    FirewallDeserializationBlacklist : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "firewall.deserialization.diagnostics")>]
    FirewallDeserializationDiagnostics : ConfigNodePropertyString;
  }

  //#endregion
