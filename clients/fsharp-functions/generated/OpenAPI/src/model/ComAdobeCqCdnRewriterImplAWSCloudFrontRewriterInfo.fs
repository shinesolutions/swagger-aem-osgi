namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties

module ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterInfo =

  //#region ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterInfo

  [<CLIMutable>]
  type ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties;
  }

  //#endregion
