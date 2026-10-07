
package org.openapitools.client.model


case class ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProperties (
    _comAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProjectPath: Option[ConfigNodePropertyArray],
    _comAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplScheduleFrequency: Option[ConfigNodePropertyString]
)
object ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProperties {
    def toStringBody(var_comAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProjectPath: Object, var_comAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplScheduleFrequency: Object) =
        s"""
        | {
        | "comAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProjectPath":$var_comAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProjectPath,"comAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplScheduleFrequency":$var_comAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplScheduleFrequency
        | }
        """.stripMargin
}
