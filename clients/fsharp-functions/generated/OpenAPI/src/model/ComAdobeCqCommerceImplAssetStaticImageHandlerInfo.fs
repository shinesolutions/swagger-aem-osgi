namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeCqCommerceImplAssetStaticImageHandlerProperties

module ComAdobeCqCommerceImplAssetStaticImageHandlerInfo =

  //#region ComAdobeCqCommerceImplAssetStaticImageHandlerInfo

  [<CLIMutable>]
  type ComAdobeCqCommerceImplAssetStaticImageHandlerInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeCqCommerceImplAssetStaticImageHandlerProperties;
  }

  //#endregion
