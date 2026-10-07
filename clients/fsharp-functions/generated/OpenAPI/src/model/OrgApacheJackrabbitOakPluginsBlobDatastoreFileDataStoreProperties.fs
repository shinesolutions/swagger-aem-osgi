namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyString

module OrgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreProperties =

  //#region OrgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreProperties

  [<CLIMutable>]
  type OrgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreProperties = {
    [<JsonProperty(PropertyName = "path")>]
    Path : ConfigNodePropertyString;
  }

  //#endregion
