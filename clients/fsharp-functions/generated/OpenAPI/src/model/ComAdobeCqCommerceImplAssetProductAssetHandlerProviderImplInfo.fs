namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties

module ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplInfo =

  //#region ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplInfo

  [<CLIMutable>]
  type ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties;
  }

  //#endregion
