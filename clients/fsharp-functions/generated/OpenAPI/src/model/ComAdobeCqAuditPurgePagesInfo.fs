namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeCqAuditPurgePagesProperties

module ComAdobeCqAuditPurgePagesInfo =

  //#region ComAdobeCqAuditPurgePagesInfo

  [<CLIMutable>]
  type ComAdobeCqAuditPurgePagesInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeCqAuditPurgePagesProperties;
  }

  //#endregion
