
package org.openapitools.client.model


case class ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties (
    _cqDamWebdavVersionLinkingEnable: Option[ConfigNodePropertyBoolean],
    _cqDamWebdavVersionLinkingSchedulerPeriod: Option[ConfigNodePropertyInteger],
    _cqDamWebdavVersionLinkingStagingTimeout: Option[ConfigNodePropertyInteger]
)
object ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties {
    def toStringBody(var_cqDamWebdavVersionLinkingEnable: Object, var_cqDamWebdavVersionLinkingSchedulerPeriod: Object, var_cqDamWebdavVersionLinkingStagingTimeout: Object) =
        s"""
        | {
        | "cqDamWebdavVersionLinkingEnable":$var_cqDamWebdavVersionLinkingEnable,"cqDamWebdavVersionLinkingSchedulerPeriod":$var_cqDamWebdavVersionLinkingSchedulerPeriod,"cqDamWebdavVersionLinkingStagingTimeout":$var_cqDamWebdavVersionLinkingStagingTimeout
        | }
        """.stripMargin
}
