namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties

module ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorInfo =

  //#region ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorInfo

  [<CLIMutable>]
  type ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties;
  }

  //#endregion
