package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties]
                )

object ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplInfo {
    /**
     * Creates the codec for converting ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplInfo] = deriveEncoder
}
