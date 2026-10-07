namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyString

module ComAdobeGraniteAuthImsImplIMSProviderImplProperties =

  //#region ComAdobeGraniteAuthImsImplIMSProviderImplProperties


  type comAdobeGraniteAuthImsImplIMSProviderImplProperties = {
    OauthProviderId : ConfigNodePropertyString;
    OauthProviderImsAuthorizationUrl : ConfigNodePropertyString;
    OauthProviderImsTokenUrl : ConfigNodePropertyString;
    OauthProviderImsProfileUrl : ConfigNodePropertyString;
    OauthProviderImsExtendedDetailsUrls : ConfigNodePropertyArray;
    OauthProviderImsValidateTokenUrl : ConfigNodePropertyString;
    OauthProviderImsSessionProperty : ConfigNodePropertyString;
    OauthProviderImsServiceTokenClientId : ConfigNodePropertyString;
    OauthProviderImsServiceTokenClientSecret : ConfigNodePropertyString;
    OauthProviderImsServiceToken : ConfigNodePropertyString;
    ImsOrgRef : ConfigNodePropertyString;
    ImsGroupMapping : ConfigNodePropertyArray;
    OauthProviderImsOnlyLicenseGroup : ConfigNodePropertyBoolean;
  }
  //#endregion
