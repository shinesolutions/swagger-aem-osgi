namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties

module ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryInfo =

  //#region ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryInfo

  [<CLIMutable>]
  type ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties;
  }

  //#endregion
