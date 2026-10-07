namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ComAdobeGraniteAuthImsProperties

module ComAdobeGraniteAuthImsInfo =

  //#region ComAdobeGraniteAuthImsInfo


  type comAdobeGraniteAuthImsInfo = {
    Pid : string;
    Title : string;
    Description : string;
    Properties : ComAdobeGraniteAuthImsProperties;
    BundleLocation : string;
    ServiceLocation : string;
  }
  //#endregion
