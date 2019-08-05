package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties]
                )

object ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenInfo {
    /**
     * Creates the codec for converting ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenInfo] = deriveEncoder
}
