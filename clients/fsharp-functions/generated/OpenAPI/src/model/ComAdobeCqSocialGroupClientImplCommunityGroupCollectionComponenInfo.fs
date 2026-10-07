namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties

module ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenInfo =

  //#region ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenInfo

  [<CLIMutable>]
  type ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties;
  }

  //#endregion
