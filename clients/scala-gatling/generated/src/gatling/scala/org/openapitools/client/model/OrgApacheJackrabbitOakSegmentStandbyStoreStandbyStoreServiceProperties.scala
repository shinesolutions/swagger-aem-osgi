
package org.openapitools.client.model


case class OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties (
    _orgApacheSlingInstallerConfigurationPersist: Option[ConfigNodePropertyBoolean],
    _mode: Option[ConfigNodePropertyDropDown],
    _port: Option[ConfigNodePropertyInteger],
    _primaryHost: Option[ConfigNodePropertyString],
    _interval: Option[ConfigNodePropertyInteger],
    _primaryAllowedClientIpRanges: Option[ConfigNodePropertyArray],
    _secure: Option[ConfigNodePropertyBoolean],
    _standbyReadtimeout: Option[ConfigNodePropertyInteger],
    _standbyAutoclean: Option[ConfigNodePropertyBoolean]
)
object OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties {
    def toStringBody(var_orgApacheSlingInstallerConfigurationPersist: Object, var_mode: Object, var_port: Object, var_primaryHost: Object, var_interval: Object, var_primaryAllowedClientIpRanges: Object, var_secure: Object, var_standbyReadtimeout: Object, var_standbyAutoclean: Object) =
        s"""
        | {
        | "orgApacheSlingInstallerConfigurationPersist":$var_orgApacheSlingInstallerConfigurationPersist,"mode":$var_mode,"port":$var_port,"primaryHost":$var_primaryHost,"interval":$var_interval,"primaryAllowedClientIpRanges":$var_primaryAllowedClientIpRanges,"secure":$var_secure,"standbyReadtimeout":$var_standbyReadtimeout,"standbyAutoclean":$var_standbyAutoclean
        | }
        """.stripMargin
}
