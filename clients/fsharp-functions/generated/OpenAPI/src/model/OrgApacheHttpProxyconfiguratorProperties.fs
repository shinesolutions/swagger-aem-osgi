namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module OrgApacheHttpProxyconfiguratorProperties =

  //#region OrgApacheHttpProxyconfiguratorProperties

  [<CLIMutable>]
  type OrgApacheHttpProxyconfiguratorProperties = {
    [<JsonProperty(PropertyName = "proxy.enabled")>]
    ProxyEnabled : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "proxy.host")>]
    ProxyHost : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "proxy.port")>]
    ProxyPort : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "proxy.user")>]
    ProxyUser : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "proxy.password")>]
    ProxyPassword : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "proxy.exceptions")>]
    ProxyExceptions : ConfigNodePropertyArray;
  }

  //#endregion
