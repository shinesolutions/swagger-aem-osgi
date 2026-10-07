namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeCqProjectsImplServletProjectImageServletProperties

module ComAdobeCqProjectsImplServletProjectImageServletInfo =

  //#region ComAdobeCqProjectsImplServletProjectImageServletInfo

  [<CLIMutable>]
  type ComAdobeCqProjectsImplServletProjectImageServletInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeCqProjectsImplServletProjectImageServletProperties;
  }

  //#endregion
