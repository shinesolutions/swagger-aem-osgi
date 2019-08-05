package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties]
                )

object ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobInfo {
    /**
     * Creates the codec for converting ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobInfo] = deriveEncoder
}
