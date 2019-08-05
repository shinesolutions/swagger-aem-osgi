package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeCqSocialSrpImplSocialSolrConnectorProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeCqSocialSrpImplSocialSolrConnectorInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeCqSocialSrpImplSocialSolrConnectorProperties]
                )

object ComAdobeCqSocialSrpImplSocialSolrConnectorInfo {
    /**
     * Creates the codec for converting ComAdobeCqSocialSrpImplSocialSolrConnectorInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqSocialSrpImplSocialSolrConnectorInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqSocialSrpImplSocialSolrConnectorInfo] = deriveEncoder
}
