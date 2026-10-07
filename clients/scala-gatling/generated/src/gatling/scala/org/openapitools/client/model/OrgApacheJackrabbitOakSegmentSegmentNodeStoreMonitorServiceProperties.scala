
package org.openapitools.client.model


case class OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceProperties (
    _commitsTrackerWriterGroups: Option[ConfigNodePropertyArray]
)
object OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceProperties {
    def toStringBody(var_commitsTrackerWriterGroups: Object) =
        s"""
        | {
        | "commitsTrackerWriterGroups":$var_commitsTrackerWriterGroups
        | }
        """.stripMargin
}
