namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeCqDamCfmImplComponentComponentConfigImplProperties

module ComAdobeCqDamCfmImplComponentComponentConfigImplInfo =

  //#region ComAdobeCqDamCfmImplComponentComponentConfigImplInfo

  [<CLIMutable>]
  type ComAdobeCqDamCfmImplComponentComponentConfigImplInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeCqDamCfmImplComponentComponentConfigImplProperties;
  }

  //#endregion
