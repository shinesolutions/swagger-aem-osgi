namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray

module ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties =

  //#region ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties

  [<CLIMutable>]
  type ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties = {
    [<JsonProperty(PropertyName = "replicate.comment.resourceTypes")>]
    ReplicateCommentResourceTypes : ConfigNodePropertyArray;
  }

  //#endregion
