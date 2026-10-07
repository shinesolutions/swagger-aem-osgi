namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyDropDown
open OpenAPI.Model.ConfigNodePropertyString

module ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties =

  //#region ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties


  type comAdobeCqSocialConnectOauthImplFacebookProviderImplProperties = {
    OauthProviderId : ConfigNodePropertyString;
    OauthCloudConfigRoot : ConfigNodePropertyString;
    ProviderConfigRoot : ConfigNodePropertyString;
    ProviderConfigCreateTagsEnabled : ConfigNodePropertyBoolean;
    ProviderConfigUserFolder : ConfigNodePropertyDropDown;
    ProviderConfigFacebookFetchFields : ConfigNodePropertyBoolean;
    ProviderConfigFacebookFields : ConfigNodePropertyArray;
    ProviderConfigRefreshUserdataEnabled : ConfigNodePropertyBoolean;
  }
  //#endregion
