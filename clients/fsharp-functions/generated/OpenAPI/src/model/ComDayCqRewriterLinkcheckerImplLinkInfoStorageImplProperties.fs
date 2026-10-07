namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyInteger

module ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties =

  //#region ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties

  [<CLIMutable>]
  type ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties = {
    [<JsonProperty(PropertyName = "service.max_links_per_host")>]
    ServiceMaxLinksPerHost : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "service.save_external_link_references")>]
    ServiceSaveExternalLinkReferences : ConfigNodePropertyBoolean;
  }

  //#endregion
