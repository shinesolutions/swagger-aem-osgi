namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyInteger

module ComDayCqSearchImplBuilderQueryBuilderImplProperties =

  //#region ComDayCqSearchImplBuilderQueryBuilderImplProperties


  type comDayCqSearchImplBuilderQueryBuilderImplProperties = {
    ExcerptProperties : ConfigNodePropertyArray;
    CacheMaxEntries : ConfigNodePropertyInteger;
    CacheEntryLifetime : ConfigNodePropertyInteger;
    XpathUnion : ConfigNodePropertyBoolean;
  }
  //#endregion
