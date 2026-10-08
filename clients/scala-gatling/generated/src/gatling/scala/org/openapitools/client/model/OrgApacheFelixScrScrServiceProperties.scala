
package org.openapitools.client.model


case class OrgApacheFelixScrScrServiceProperties (
    _dsLoglevel: Option[ConfigNodePropertyDropDown],
    _dsFactoryEnabled: Option[ConfigNodePropertyBoolean],
    _dsDelayedKeepInstances: Option[ConfigNodePropertyBoolean],
    _dsLockTimeoutMilliseconds: Option[ConfigNodePropertyInteger],
    _dsStopTimeoutMilliseconds: Option[ConfigNodePropertyInteger],
    _dsGlobalExtender: Option[ConfigNodePropertyBoolean]
)
object OrgApacheFelixScrScrServiceProperties {
    def toStringBody(var_dsLoglevel: Object, var_dsFactoryEnabled: Object, var_dsDelayedKeepInstances: Object, var_dsLockTimeoutMilliseconds: Object, var_dsStopTimeoutMilliseconds: Object, var_dsGlobalExtender: Object) =
        s"""
        | {
        | "dsLoglevel":$var_dsLoglevel,"dsFactoryEnabled":$var_dsFactoryEnabled,"dsDelayedKeepInstances":$var_dsDelayedKeepInstances,"dsLockTimeoutMilliseconds":$var_dsLockTimeoutMilliseconds,"dsStopTimeoutMilliseconds":$var_dsStopTimeoutMilliseconds,"dsGlobalExtender":$var_dsGlobalExtender
        | }
        """.stripMargin
}
