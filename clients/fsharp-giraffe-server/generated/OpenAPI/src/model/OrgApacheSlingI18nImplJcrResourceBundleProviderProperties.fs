namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module OrgApacheSlingI18nImplJcrResourceBundleProviderProperties =

  //#region OrgApacheSlingI18nImplJcrResourceBundleProviderProperties


  type orgApacheSlingI18nImplJcrResourceBundleProviderProperties = {
    LocaleDefault : ConfigNodePropertyString;
    PreloadBundles : ConfigNodePropertyBoolean;
    InvalidationDelay : ConfigNodePropertyInteger;
  }
  //#endregion
