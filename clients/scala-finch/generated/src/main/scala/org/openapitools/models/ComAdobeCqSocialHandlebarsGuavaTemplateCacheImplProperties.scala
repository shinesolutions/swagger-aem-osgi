package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyBoolean
import org.openapitools.models.ConfigNodePropertyInteger
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param parameterPeriodguavaPeriodcachePeriodenabled 
 * @param parameterPeriodguavaPeriodcachePeriodparams 
 * @param parameterPeriodguavaPeriodcachePeriodreload 
 * @param servicePeriodranking 
 */
case class ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplProperties(parameterPeriodguavaPeriodcachePeriodenabled: Option[ConfigNodePropertyBoolean],
                parameterPeriodguavaPeriodcachePeriodparams: Option[ConfigNodePropertyString],
                parameterPeriodguavaPeriodcachePeriodreload: Option[ConfigNodePropertyBoolean],
                servicePeriodranking: Option[ConfigNodePropertyInteger]
                )

object ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplProperties {
    /**
     * Creates the codec for converting ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplProperties] = deriveEncoder
}
