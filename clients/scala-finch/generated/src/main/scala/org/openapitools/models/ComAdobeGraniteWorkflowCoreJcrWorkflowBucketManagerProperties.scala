package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyInteger

/**
 * 
 * @param bucketSize 
 */
case class ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerProperties(bucketSize: Option[ConfigNodePropertyInteger]
                )

object ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerProperties {
    /**
     * Creates the codec for converting ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerProperties] = deriveEncoder
}
