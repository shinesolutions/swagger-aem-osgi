namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeCqDamS7imagingImplIsImageServerComponentProperties

module ComAdobeCqDamS7imagingImplIsImageServerComponentInfo =

  //#region ComAdobeCqDamS7imagingImplIsImageServerComponentInfo

  [<CLIMutable>]
  type ComAdobeCqDamS7imagingImplIsImageServerComponentInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeCqDamS7imagingImplIsImageServerComponentProperties;
  }

  //#endregion
