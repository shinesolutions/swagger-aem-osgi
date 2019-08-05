package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param formportalPeriodinterval 
 */
case class ComAdobeFdFpConfigFormsPortalSchedulerServiceProperties(formportalPeriodinterval: Option[ConfigNodePropertyString]
                )

object ComAdobeFdFpConfigFormsPortalSchedulerServiceProperties {
    /**
     * Creates the codec for converting ComAdobeFdFpConfigFormsPortalSchedulerServiceProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeFdFpConfigFormsPortalSchedulerServiceProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeFdFpConfigFormsPortalSchedulerServiceProperties] = deriveEncoder
}
