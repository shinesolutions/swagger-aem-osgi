namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyString

module ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperties =

  //#region ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperties

  [<CLIMutable>]
  type ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperties = {
    [<JsonProperty(PropertyName = "diffPath")>]
    DiffPath : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "serviceName")>]
    ServiceName : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "serviceUser.target")>]
    ServiceUserTarget : ConfigNodePropertyString;
  }

  //#endregion
