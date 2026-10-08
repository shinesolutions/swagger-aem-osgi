namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeCqDtmReactorImplServiceWebServiceImplProperties

module ComAdobeCqDtmReactorImplServiceWebServiceImplInfo =

  //#region ComAdobeCqDtmReactorImplServiceWebServiceImplInfo

  [<CLIMutable>]
  type ComAdobeCqDtmReactorImplServiceWebServiceImplInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeCqDtmReactorImplServiceWebServiceImplProperties;
  }

  //#endregion
