package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties]
                )

object ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceInfo {
    /**
     * Creates the codec for converting ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceInfo] = deriveEncoder
}
