namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeCqDtmImplServiceDTMWebServiceImplProperties

module ComAdobeCqDtmImplServiceDTMWebServiceImplInfo =

  //#region ComAdobeCqDtmImplServiceDTMWebServiceImplInfo

  [<CLIMutable>]
  type ComAdobeCqDtmImplServiceDTMWebServiceImplInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeCqDtmImplServiceDTMWebServiceImplProperties;
  }

  //#endregion
