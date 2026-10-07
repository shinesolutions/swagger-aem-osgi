namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties

module ComAdobeCqCdnRewriterImplCDNConfigServiceImplInfo =

  //#region ComAdobeCqCdnRewriterImplCDNConfigServiceImplInfo

  [<CLIMutable>]
  type ComAdobeCqCdnRewriterImplCDNConfigServiceImplInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties;
  }

  //#endregion
