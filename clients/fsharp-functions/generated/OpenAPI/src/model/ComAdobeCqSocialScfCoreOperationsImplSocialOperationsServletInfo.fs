namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProperties

module ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletInfo =

  //#region ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletInfo

  [<CLIMutable>]
  type ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProperties;
  }

  //#endregion
