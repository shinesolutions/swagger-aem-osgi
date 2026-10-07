namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyInteger

module ComAdobeCqDtmImplServiceDTMWebServiceImplProperties =

  //#region ComAdobeCqDtmImplServiceDTMWebServiceImplProperties

  [<CLIMutable>]
  type ComAdobeCqDtmImplServiceDTMWebServiceImplProperties = {
    [<JsonProperty(PropertyName = "connection.timeout")>]
    ConnectionTimeout : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "socket.timeout")>]
    SocketTimeout : ConfigNodePropertyInteger;
  }

  //#endregion
