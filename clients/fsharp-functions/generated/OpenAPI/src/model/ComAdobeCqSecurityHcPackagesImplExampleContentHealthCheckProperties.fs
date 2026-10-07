namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray

module ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckProperties =

  //#region ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckProperties

  [<CLIMutable>]
  type ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckProperties = {
    [<JsonProperty(PropertyName = "hc.tags")>]
    HcTags : ConfigNodePropertyArray;
  }

  //#endregion
