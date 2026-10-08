namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeCqAccountImplAccountManagementServletProperties

module ComAdobeCqAccountImplAccountManagementServletInfo =

  //#region ComAdobeCqAccountImplAccountManagementServletInfo

  [<CLIMutable>]
  type ComAdobeCqAccountImplAccountManagementServletInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeCqAccountImplAccountManagementServletProperties;
  }

  //#endregion
