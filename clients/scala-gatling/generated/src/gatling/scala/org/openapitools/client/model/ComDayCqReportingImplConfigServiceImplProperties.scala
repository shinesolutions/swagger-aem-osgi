
package org.openapitools.client.model


case class ComDayCqReportingImplConfigServiceImplProperties (
    _repconfTimezone: Option[ConfigNodePropertyString],
    _repconfLocale: Option[ConfigNodePropertyString],
    _repconfSnapshots: Option[ConfigNodePropertyString],
    _repconfRepdir: Option[ConfigNodePropertyString],
    _repconfHourofday: Option[ConfigNodePropertyInteger],
    _repconfMinofhour: Option[ConfigNodePropertyInteger],
    _repconfMaxrows: Option[ConfigNodePropertyInteger],
    _repconfFakedata: Option[ConfigNodePropertyBoolean],
    _repconfSnapshotuser: Option[ConfigNodePropertyString],
    _repconfEnforcesnapshotuser: Option[ConfigNodePropertyBoolean]
)
object ComDayCqReportingImplConfigServiceImplProperties {
    def toStringBody(var_repconfTimezone: Object, var_repconfLocale: Object, var_repconfSnapshots: Object, var_repconfRepdir: Object, var_repconfHourofday: Object, var_repconfMinofhour: Object, var_repconfMaxrows: Object, var_repconfFakedata: Object, var_repconfSnapshotuser: Object, var_repconfEnforcesnapshotuser: Object) =
        s"""
        | {
        | "repconfTimezone":$var_repconfTimezone,"repconfLocale":$var_repconfLocale,"repconfSnapshots":$var_repconfSnapshots,"repconfRepdir":$var_repconfRepdir,"repconfHourofday":$var_repconfHourofday,"repconfMinofhour":$var_repconfMinofhour,"repconfMaxrows":$var_repconfMaxrows,"repconfFakedata":$var_repconfFakedata,"repconfSnapshotuser":$var_repconfSnapshotuser,"repconfEnforcesnapshotuser":$var_repconfEnforcesnapshotuser
        | }
        """.stripMargin
}
