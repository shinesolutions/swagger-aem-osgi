
package org.openapitools.client.model


case class ComAdobeGraniteThreaddumpThreadDumpCollectorProperties (
    _schedulerPeriod: Option[ConfigNodePropertyInteger],
    _schedulerRunOn: Option[ConfigNodePropertyDropDown],
    _graniteThreaddumpEnabled: Option[ConfigNodePropertyBoolean],
    _graniteThreaddumpDumpsPerFile: Option[ConfigNodePropertyInteger],
    _graniteThreaddumpEnableGzipCompression: Option[ConfigNodePropertyBoolean],
    _graniteThreaddumpEnableDirectoriesCompression: Option[ConfigNodePropertyBoolean],
    _graniteThreaddumpEnableJStack: Option[ConfigNodePropertyBoolean],
    _graniteThreaddumpMaxBackupDays: Option[ConfigNodePropertyInteger],
    _graniteThreaddumpBackupCleanTrigger: Option[ConfigNodePropertyString]
)
object ComAdobeGraniteThreaddumpThreadDumpCollectorProperties {
    def toStringBody(var_schedulerPeriod: Object, var_schedulerRunOn: Object, var_graniteThreaddumpEnabled: Object, var_graniteThreaddumpDumpsPerFile: Object, var_graniteThreaddumpEnableGzipCompression: Object, var_graniteThreaddumpEnableDirectoriesCompression: Object, var_graniteThreaddumpEnableJStack: Object, var_graniteThreaddumpMaxBackupDays: Object, var_graniteThreaddumpBackupCleanTrigger: Object) =
        s"""
        | {
        | "schedulerPeriod":$var_schedulerPeriod,"schedulerRunOn":$var_schedulerRunOn,"graniteThreaddumpEnabled":$var_graniteThreaddumpEnabled,"graniteThreaddumpDumpsPerFile":$var_graniteThreaddumpDumpsPerFile,"graniteThreaddumpEnableGzipCompression":$var_graniteThreaddumpEnableGzipCompression,"graniteThreaddumpEnableDirectoriesCompression":$var_graniteThreaddumpEnableDirectoriesCompression,"graniteThreaddumpEnableJStack":$var_graniteThreaddumpEnableJStack,"graniteThreaddumpMaxBackupDays":$var_graniteThreaddumpMaxBackupDays,"graniteThreaddumpBackupCleanTrigger":$var_graniteThreaddumpBackupCleanTrigger
        | }
        """.stripMargin
}
