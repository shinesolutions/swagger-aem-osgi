namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeCqSocialSrpImplSocialSolrConnectorProperties

module ComAdobeCqSocialSrpImplSocialSolrConnectorInfo =

  //#region ComAdobeCqSocialSrpImplSocialSolrConnectorInfo

  [<CLIMutable>]
  type ComAdobeCqSocialSrpImplSocialSolrConnectorInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeCqSocialSrpImplSocialSolrConnectorProperties;
  }

  //#endregion
