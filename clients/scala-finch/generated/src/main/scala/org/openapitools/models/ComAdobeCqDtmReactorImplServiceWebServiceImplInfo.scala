package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeCqDtmReactorImplServiceWebServiceImplProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeCqDtmReactorImplServiceWebServiceImplInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeCqDtmReactorImplServiceWebServiceImplProperties]
                )

object ComAdobeCqDtmReactorImplServiceWebServiceImplInfo {
    /**
     * Creates the codec for converting ComAdobeCqDtmReactorImplServiceWebServiceImplInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqDtmReactorImplServiceWebServiceImplInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqDtmReactorImplServiceWebServiceImplInfo] = deriveEncoder
}
