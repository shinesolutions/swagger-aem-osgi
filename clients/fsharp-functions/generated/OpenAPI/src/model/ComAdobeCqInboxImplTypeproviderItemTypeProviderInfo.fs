namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeCqInboxImplTypeproviderItemTypeProviderProperties

module ComAdobeCqInboxImplTypeproviderItemTypeProviderInfo =

  //#region ComAdobeCqInboxImplTypeproviderItemTypeProviderInfo

  [<CLIMutable>]
  type ComAdobeCqInboxImplTypeproviderItemTypeProviderInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeCqInboxImplTypeproviderItemTypeProviderProperties;
  }

  //#endregion
