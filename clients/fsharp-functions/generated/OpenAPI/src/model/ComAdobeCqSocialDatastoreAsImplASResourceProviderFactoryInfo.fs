namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties

module ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryInfo =

  //#region ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryInfo

  [<CLIMutable>]
  type ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties;
  }

  //#endregion
