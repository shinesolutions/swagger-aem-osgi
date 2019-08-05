package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray
import org.openapitools.models.ConfigNodePropertyInteger
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param cqPeriodcommercePeriodcataloggeneratorPeriodbucketsize 
 * @param cqPeriodcommercePeriodcataloggeneratorPeriodbucketname 
 * @param cqPeriodcommercePeriodcataloggeneratorPeriodexcludedtemplateproperties 
 */
case class ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties(cqPeriodcommercePeriodcataloggeneratorPeriodbucketsize: Option[ConfigNodePropertyInteger],
                cqPeriodcommercePeriodcataloggeneratorPeriodbucketname: Option[ConfigNodePropertyString],
                cqPeriodcommercePeriodcataloggeneratorPeriodexcludedtemplateproperties: Option[ConfigNodePropertyArray]
                )

object ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties {
    /**
     * Creates the codec for converting ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties] = deriveEncoder
}
