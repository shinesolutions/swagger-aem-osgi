namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyDropDown
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties =

  //#region ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties


  type comAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties = {
    ComAdobeGraniteJettySslPort : ConfigNodePropertyInteger;
    ComAdobeGraniteJettySslKeystoreUser : ConfigNodePropertyString;
    ComAdobeGraniteJettySslKeystorePassword : ConfigNodePropertyString;
    ComAdobeGraniteJettySslCiphersuitesExcluded : ConfigNodePropertyArray;
    ComAdobeGraniteJettySslCiphersuitesIncluded : ConfigNodePropertyArray;
    ComAdobeGraniteJettySslClientCertificate : ConfigNodePropertyDropDown;
  }
  //#endregion
