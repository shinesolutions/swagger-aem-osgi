namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties

module ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplInfo =

  //#region ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplInfo

  [<CLIMutable>]
  type ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties;
  }

  //#endregion
