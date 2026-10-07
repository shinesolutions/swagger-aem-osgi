namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyInteger

module ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerProperties =

  //#region ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerProperties

  [<CLIMutable>]
  type ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerProperties = {
    [<JsonProperty(PropertyName = "bucketSize")>]
    BucketSize : ConfigNodePropertyInteger;
  }

  //#endregion
