namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray

module ComAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckProperties =

  //#region ComAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckProperties

  [<CLIMutable>]
  type ComAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckProperties = {
    [<JsonProperty(PropertyName = "hc.tags")>]
    HcTags : ConfigNodePropertyArray;
  }

  //#endregion
