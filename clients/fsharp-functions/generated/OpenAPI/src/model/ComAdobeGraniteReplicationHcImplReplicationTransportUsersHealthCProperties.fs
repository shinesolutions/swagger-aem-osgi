namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray

module ComAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCProperties =

  //#region ComAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCProperties

  [<CLIMutable>]
  type ComAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCProperties = {
    [<JsonProperty(PropertyName = "hc.tags")>]
    HcTags : ConfigNodePropertyArray;
  }

  //#endregion
