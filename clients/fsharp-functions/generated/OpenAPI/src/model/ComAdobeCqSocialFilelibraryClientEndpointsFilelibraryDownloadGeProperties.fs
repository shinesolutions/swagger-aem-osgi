namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyString

module ComAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGeProperties =

  //#region ComAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGeProperties

  [<CLIMutable>]
  type ComAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGeProperties = {
    [<JsonProperty(PropertyName = "sling.servlet.selectors")>]
    SlingServletSelectors : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "sling.servlet.extensions")>]
    SlingServletExtensions : ConfigNodePropertyString;
  }

  //#endregion
