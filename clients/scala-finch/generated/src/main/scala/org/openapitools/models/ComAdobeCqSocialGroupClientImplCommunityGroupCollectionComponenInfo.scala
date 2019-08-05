package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties]
                )

object ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenInfo {
    /**
     * Creates the codec for converting ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenInfo] = deriveEncoder
}
