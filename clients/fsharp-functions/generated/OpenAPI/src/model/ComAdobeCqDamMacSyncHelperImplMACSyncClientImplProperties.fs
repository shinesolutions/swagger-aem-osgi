namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyInteger

module ComAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties =

  //#region ComAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties

  [<CLIMutable>]
  type ComAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties = {
    [<JsonProperty(PropertyName = "com.adobe.dam.mac.sync.client.so.timeout")>]
    ComAdobeDamMacSyncClientSoTimeout : ConfigNodePropertyInteger;
  }

  //#endregion
