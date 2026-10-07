namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties

module ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceInfo =

  //#region ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceInfo

  [<CLIMutable>]
  type ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties;
  }

  //#endregion
