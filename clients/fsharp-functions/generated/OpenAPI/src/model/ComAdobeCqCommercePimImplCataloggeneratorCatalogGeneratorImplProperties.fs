namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties =

  //#region ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties

  [<CLIMutable>]
  type ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties = {
    [<JsonProperty(PropertyName = "cq.commerce.cataloggenerator.bucketsize")>]
    CqCommerceCataloggeneratorBucketsize : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "cq.commerce.cataloggenerator.bucketname")>]
    CqCommerceCataloggeneratorBucketname : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "cq.commerce.cataloggenerator.excludedtemplateproperties")>]
    CqCommerceCataloggeneratorExcludedtemplateproperties : ConfigNodePropertyArray;
  }

  //#endregion
