namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyInteger

module ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties =

  //#region ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties

  [<CLIMutable>]
  type ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties = {
    [<JsonProperty(PropertyName = "com.adobe.aem.screens.impl.remote.request_timeout")>]
    ComAdobeAemScreensImplRemoteRequestTimeout : ConfigNodePropertyInteger;
  }

  //#endregion
