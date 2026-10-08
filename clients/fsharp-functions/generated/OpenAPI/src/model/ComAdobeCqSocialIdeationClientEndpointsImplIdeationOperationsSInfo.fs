namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSProperties

module ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSInfo =

  //#region ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSInfo

  [<CLIMutable>]
  type ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSProperties;
  }

  //#endregion
