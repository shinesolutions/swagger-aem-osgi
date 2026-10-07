namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeCqCommerceImplAssetDynamicImageHandlerProperties

module ComAdobeCqCommerceImplAssetDynamicImageHandlerInfo =

  //#region ComAdobeCqCommerceImplAssetDynamicImageHandlerInfo

  [<CLIMutable>]
  type ComAdobeCqCommerceImplAssetDynamicImageHandlerInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeCqCommerceImplAssetDynamicImageHandlerProperties;
  }

  //#endregion
