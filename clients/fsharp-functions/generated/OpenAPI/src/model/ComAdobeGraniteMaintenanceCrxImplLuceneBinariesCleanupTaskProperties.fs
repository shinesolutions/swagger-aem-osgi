namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyString

module ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskProperties =

  //#region ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskProperties

  [<CLIMutable>]
  type ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskProperties = {
    [<JsonProperty(PropertyName = "job.topics")>]
    JobTopics : ConfigNodePropertyString;
  }

  //#endregion
