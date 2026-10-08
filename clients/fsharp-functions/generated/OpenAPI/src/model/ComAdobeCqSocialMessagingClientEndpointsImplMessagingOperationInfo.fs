namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties

module ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationInfo =

  //#region ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationInfo

  [<CLIMutable>]
  type ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties;
  }

  //#endregion
