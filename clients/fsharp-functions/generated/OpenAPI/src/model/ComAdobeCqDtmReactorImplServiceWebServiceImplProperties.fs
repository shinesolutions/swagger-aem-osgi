namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module ComAdobeCqDtmReactorImplServiceWebServiceImplProperties =

  //#region ComAdobeCqDtmReactorImplServiceWebServiceImplProperties

  [<CLIMutable>]
  type ComAdobeCqDtmReactorImplServiceWebServiceImplProperties = {
    [<JsonProperty(PropertyName = "endpointUri")>]
    EndpointUri : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "connectionTimeout")>]
    ConnectionTimeout : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "socketTimeout")>]
    SocketTimeout : ConfigNodePropertyInteger;
  }

  //#endregion
