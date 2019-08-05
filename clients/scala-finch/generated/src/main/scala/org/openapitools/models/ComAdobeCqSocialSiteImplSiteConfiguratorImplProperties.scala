package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray

/**
 * 
 * @param componentsUsingTags 
 */
case class ComAdobeCqSocialSiteImplSiteConfiguratorImplProperties(componentsUsingTags: Option[ConfigNodePropertyArray]
                )

object ComAdobeCqSocialSiteImplSiteConfiguratorImplProperties {
    /**
     * Creates the codec for converting ComAdobeCqSocialSiteImplSiteConfiguratorImplProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqSocialSiteImplSiteConfiguratorImplProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqSocialSiteImplSiteConfiguratorImplProperties] = deriveEncoder
}
