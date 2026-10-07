namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties =

  //#region ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties


  type comAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties = {
    SolrZkTimeout : ConfigNodePropertyString;
    SolrCommit : ConfigNodePropertyString;
    CacheOn : ConfigNodePropertyBoolean;
    ConcurrencyLevel : ConfigNodePropertyInteger;
    CacheStartSize : ConfigNodePropertyInteger;
    CacheTtl : ConfigNodePropertyInteger;
    CacheSize : ConfigNodePropertyInteger;
  }
  //#endregion
