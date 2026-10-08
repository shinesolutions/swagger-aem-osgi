namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyString

module OrgApacheFelixHttpSslfilterSslFilterProperties =

  //#region OrgApacheFelixHttpSslfilterSslFilterProperties


  type orgApacheFelixHttpSslfilterSslFilterProperties = {
    SslForwardHeader : ConfigNodePropertyString;
    SslForwardValue : ConfigNodePropertyString;
    SslForwardCertHeader : ConfigNodePropertyString;
    RewriteAbsoluteUrls : ConfigNodePropertyBoolean;
  }
  //#endregion
