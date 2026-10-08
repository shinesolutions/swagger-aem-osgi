namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray

module ComAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChProperties =

  //#region ComAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChProperties

  [<CLIMutable>]
  type ComAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChProperties = {
    [<JsonProperty(PropertyName = "hc.tags")>]
    HcTags : ConfigNodePropertyArray;
  }

  //#endregion
