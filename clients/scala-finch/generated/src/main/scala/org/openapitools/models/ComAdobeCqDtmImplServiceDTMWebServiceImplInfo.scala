package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeCqDtmImplServiceDTMWebServiceImplProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeCqDtmImplServiceDTMWebServiceImplInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeCqDtmImplServiceDTMWebServiceImplProperties]
                )

object ComAdobeCqDtmImplServiceDTMWebServiceImplInfo {
    /**
     * Creates the codec for converting ComAdobeCqDtmImplServiceDTMWebServiceImplInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqDtmImplServiceDTMWebServiceImplInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqDtmImplServiceDTMWebServiceImplInfo] = deriveEncoder
}
