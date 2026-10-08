namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ComAdobeGraniteAuthOauthProviderProperties

module ComAdobeGraniteAuthOauthProviderInfo =

  //#region ComAdobeGraniteAuthOauthProviderInfo


  type comAdobeGraniteAuthOauthProviderInfo = {
    Pid : string;
    Title : string;
    Description : string;
    Properties : ComAdobeGraniteAuthOauthProviderProperties;
  }
  //#endregion
