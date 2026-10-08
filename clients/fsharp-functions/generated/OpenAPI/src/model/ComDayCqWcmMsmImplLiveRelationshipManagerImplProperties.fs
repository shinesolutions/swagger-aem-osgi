namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyString

module ComDayCqWcmMsmImplLiveRelationshipManagerImplProperties =

  //#region ComDayCqWcmMsmImplLiveRelationshipManagerImplProperties

  [<CLIMutable>]
  type ComDayCqWcmMsmImplLiveRelationshipManagerImplProperties = {
    [<JsonProperty(PropertyName = "liverelationshipmgr.relationsconfig.default")>]
    LiverelationshipmgrRelationsconfigDefault : ConfigNodePropertyString;
  }

  //#endregion
