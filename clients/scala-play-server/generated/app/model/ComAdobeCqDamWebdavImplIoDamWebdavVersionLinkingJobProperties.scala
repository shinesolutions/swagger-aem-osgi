package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-02T01:20:33.584884879Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties(
  cqDamWebdavVersionLinkingEnable: Option[ConfigNodePropertyBoolean],
  cqDamWebdavVersionLinkingSchedulerPeriod: Option[ConfigNodePropertyInteger],
  cqDamWebdavVersionLinkingStagingTimeout: Option[ConfigNodePropertyInteger]
)

object ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties {
  implicit lazy val comAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobPropertiesJsonFormat: Format[ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties] = Json.format[ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties]
}

