namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ConfigNodePropertyArray

module GuideLocalizationServiceProperties =

  //#region GuideLocalizationServiceProperties


  type guideLocalizationServiceProperties = {
    SupportedLocales : ConfigNodePropertyArray;
    LocalizableProperties : ConfigNodePropertyArray;
  }
  //#endregion
