namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyString

module ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskProperties =

  //#region ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskProperties

  [<CLIMutable>]
  type ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskProperties = {
    [<JsonProperty(PropertyName = "granite.maintenance.mandatory")>]
    GraniteMaintenanceMandatory : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "job.topics")>]
    JobTopics : ConfigNodePropertyString;
  }

  //#endregion
