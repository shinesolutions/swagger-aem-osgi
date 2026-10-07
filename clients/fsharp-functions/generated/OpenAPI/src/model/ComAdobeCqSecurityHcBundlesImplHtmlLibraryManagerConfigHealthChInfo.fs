namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChProperties

module ComAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChInfo =

  //#region ComAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChInfo

  [<CLIMutable>]
  type ComAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChProperties;
  }

  //#endregion
