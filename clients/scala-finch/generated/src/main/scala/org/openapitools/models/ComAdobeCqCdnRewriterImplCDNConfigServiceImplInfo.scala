package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeCqCdnRewriterImplCDNConfigServiceImplInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties]
                )

object ComAdobeCqCdnRewriterImplCDNConfigServiceImplInfo {
    /**
     * Creates the codec for converting ComAdobeCqCdnRewriterImplCDNConfigServiceImplInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqCdnRewriterImplCDNConfigServiceImplInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqCdnRewriterImplCDNConfigServiceImplInfo] = deriveEncoder
}
