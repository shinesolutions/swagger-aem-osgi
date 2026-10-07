namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeCqCdnRewriterImplCDNRewriterProperties

module ComAdobeCqCdnRewriterImplCDNRewriterInfo =

  //#region ComAdobeCqCdnRewriterImplCDNRewriterInfo

  [<CLIMutable>]
  type ComAdobeCqCdnRewriterImplCDNRewriterInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeCqCdnRewriterImplCDNRewriterProperties;
  }

  //#endregion
