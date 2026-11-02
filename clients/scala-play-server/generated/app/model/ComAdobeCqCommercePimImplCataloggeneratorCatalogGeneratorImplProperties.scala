package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-02T01:20:33.584884879Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties(
  cqCommerceCataloggeneratorBucketsize: Option[ConfigNodePropertyInteger],
  cqCommerceCataloggeneratorBucketname: Option[ConfigNodePropertyString],
  cqCommerceCataloggeneratorExcludedtemplateproperties: Option[ConfigNodePropertyArray]
)

object ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties {
  implicit lazy val comAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplPropertiesJsonFormat: Format[ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties] = Json.format[ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties]
}

