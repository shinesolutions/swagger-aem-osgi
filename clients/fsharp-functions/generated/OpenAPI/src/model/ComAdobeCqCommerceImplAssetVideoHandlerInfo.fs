namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeCqCommerceImplAssetVideoHandlerProperties

module ComAdobeCqCommerceImplAssetVideoHandlerInfo =

  //#region ComAdobeCqCommerceImplAssetVideoHandlerInfo

  [<CLIMutable>]
  type ComAdobeCqCommerceImplAssetVideoHandlerInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeCqCommerceImplAssetVideoHandlerProperties;
  }

  //#endregion
