namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyDropDown
open OpenAPI.Model.ConfigNodePropertyString

module ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties =

  //#region ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties


  type comAdobeCqSocialConnectOauthImplTwitterProviderImplProperties = {
    OauthProviderId : ConfigNodePropertyString;
    OauthCloudConfigRoot : ConfigNodePropertyString;
    ProviderConfigRoot : ConfigNodePropertyString;
    ProviderConfigUserFolder : ConfigNodePropertyDropDown;
    ProviderConfigTwitterEnableParams : ConfigNodePropertyBoolean;
    ProviderConfigTwitterParams : ConfigNodePropertyArray;
    ProviderConfigRefreshUserdataEnabled : ConfigNodePropertyBoolean;
  }
  //#endregion
