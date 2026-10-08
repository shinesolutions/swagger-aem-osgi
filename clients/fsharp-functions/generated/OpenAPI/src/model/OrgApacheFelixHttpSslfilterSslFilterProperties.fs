namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyString

module OrgApacheFelixHttpSslfilterSslFilterProperties =

  //#region OrgApacheFelixHttpSslfilterSslFilterProperties

  [<CLIMutable>]
  type OrgApacheFelixHttpSslfilterSslFilterProperties = {
    [<JsonProperty(PropertyName = "ssl-forward.header")>]
    SslForwardHeader : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "ssl-forward.value")>]
    SslForwardValue : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "ssl-forward-cert.header")>]
    SslForwardCertHeader : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "rewrite.absolute.urls")>]
    RewriteAbsoluteUrls : ConfigNodePropertyBoolean;
  }

  //#endregion
