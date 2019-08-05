package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyBoolean
import org.openapitools.models.ConfigNodePropertyInteger

/**
 * 
 * @param groupPeriodlistingPeriodpaginationPeriodenable 
 * @param groupPeriodlistingPeriodlazyloadingPeriodenable 
 * @param pagePeriodsize 
 * @param priority 
 */
case class ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties(groupPeriodlistingPeriodpaginationPeriodenable: Option[ConfigNodePropertyBoolean],
                groupPeriodlistingPeriodlazyloadingPeriodenable: Option[ConfigNodePropertyBoolean],
                pagePeriodsize: Option[ConfigNodePropertyInteger],
                priority: Option[ConfigNodePropertyInteger]
                )

object ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties {
    /**
     * Creates the codec for converting ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties] = deriveEncoder
}
