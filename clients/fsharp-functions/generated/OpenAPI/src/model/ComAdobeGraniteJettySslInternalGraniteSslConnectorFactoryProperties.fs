namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyDropDown
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties =

  //#region ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties

  [<CLIMutable>]
  type ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties = {
    [<JsonProperty(PropertyName = "com.adobe.granite.jetty.ssl.port")>]
    ComAdobeGraniteJettySslPort : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "com.adobe.granite.jetty.ssl.keystore.user")>]
    ComAdobeGraniteJettySslKeystoreUser : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "com.adobe.granite.jetty.ssl.keystore.password")>]
    ComAdobeGraniteJettySslKeystorePassword : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "com.adobe.granite.jetty.ssl.ciphersuites.excluded")>]
    ComAdobeGraniteJettySslCiphersuitesExcluded : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "com.adobe.granite.jetty.ssl.ciphersuites.included")>]
    ComAdobeGraniteJettySslCiphersuitesIncluded : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "com.adobe.granite.jetty.ssl.client.certificate")>]
    ComAdobeGraniteJettySslClientCertificate : ConfigNodePropertyDropDown;
  }

  //#endregion
