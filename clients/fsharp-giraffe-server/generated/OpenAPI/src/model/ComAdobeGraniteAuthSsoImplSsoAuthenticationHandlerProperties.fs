namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties =

  //#region ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties


  type comAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties = {
    Path : ConfigNodePropertyString;
    ServiceRanking : ConfigNodePropertyInteger;
    JaasControlFlag : ConfigNodePropertyString;
    JaasRealmName : ConfigNodePropertyString;
    JaasRanking : ConfigNodePropertyInteger;
    Headers : ConfigNodePropertyArray;
    Cookies : ConfigNodePropertyArray;
    Parameters : ConfigNodePropertyArray;
    Usermap : ConfigNodePropertyArray;
    Format : ConfigNodePropertyString;
    TrustedCredentialsAttribute : ConfigNodePropertyString;
  }
  //#endregion
