namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties

module ComAdobeCqSocialAccountverificationImplAccountManagementConfigImInfo =

  //#region ComAdobeCqSocialAccountverificationImplAccountManagementConfigImInfo

  [<CLIMutable>]
  type ComAdobeCqSocialAccountverificationImplAccountManagementConfigImInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties;
  }

  //#endregion
