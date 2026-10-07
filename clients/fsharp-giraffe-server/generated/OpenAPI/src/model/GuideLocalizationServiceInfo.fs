namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.GuideLocalizationServiceProperties

module GuideLocalizationServiceInfo =

  //#region GuideLocalizationServiceInfo


  type guideLocalizationServiceInfo = {
    Pid : string;
    Title : string;
    Description : string;
    Properties : GuideLocalizationServiceProperties;
  }
  //#endregion
