namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeCqDamDmProcessImagePTiffManagerImplProperties

module ComAdobeCqDamDmProcessImagePTiffManagerImplInfo =

  //#region ComAdobeCqDamDmProcessImagePTiffManagerImplInfo

  [<CLIMutable>]
  type ComAdobeCqDamDmProcessImagePTiffManagerImplInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeCqDamDmProcessImagePTiffManagerImplProperties;
  }

  //#endregion
