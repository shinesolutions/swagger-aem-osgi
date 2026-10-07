namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeCqAddressImplLocationLocationListServletProperties

module ComAdobeCqAddressImplLocationLocationListServletInfo =

  //#region ComAdobeCqAddressImplLocationLocationListServletInfo

  [<CLIMutable>]
  type ComAdobeCqAddressImplLocationLocationListServletInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeCqAddressImplLocationLocationListServletProperties;
  }

  //#endregion
