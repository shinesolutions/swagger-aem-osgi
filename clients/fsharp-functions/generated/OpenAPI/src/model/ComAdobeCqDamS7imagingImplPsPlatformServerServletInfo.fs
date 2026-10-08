namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties

module ComAdobeCqDamS7imagingImplPsPlatformServerServletInfo =

  //#region ComAdobeCqDamS7imagingImplPsPlatformServerServletInfo

  [<CLIMutable>]
  type ComAdobeCqDamS7imagingImplPsPlatformServerServletInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties;
  }

  //#endregion
