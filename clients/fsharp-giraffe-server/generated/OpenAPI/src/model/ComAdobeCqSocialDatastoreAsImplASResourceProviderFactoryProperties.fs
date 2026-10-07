namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties =

  //#region ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties


  type comAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties = {
    VersionId : ConfigNodePropertyString;
    CacheOn : ConfigNodePropertyBoolean;
    ConcurrencyLevel : ConfigNodePropertyInteger;
    CacheStartSize : ConfigNodePropertyInteger;
    CacheTtl : ConfigNodePropertyInteger;
    CacheSize : ConfigNodePropertyInteger;
    TimeLimit : ConfigNodePropertyInteger;
  }
  //#endregion
