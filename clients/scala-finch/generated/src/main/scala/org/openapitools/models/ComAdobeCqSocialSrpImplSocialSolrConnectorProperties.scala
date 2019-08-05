package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param srpPeriodtype 
 */
case class ComAdobeCqSocialSrpImplSocialSolrConnectorProperties(srpPeriodtype: Option[ConfigNodePropertyString]
                )

object ComAdobeCqSocialSrpImplSocialSolrConnectorProperties {
    /**
     * Creates the codec for converting ComAdobeCqSocialSrpImplSocialSolrConnectorProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqSocialSrpImplSocialSolrConnectorProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqSocialSrpImplSocialSolrConnectorProperties] = deriveEncoder
}
