
package org.openapitools.client.model


case class OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties (
    _accountName: Option[ConfigNodePropertyString],
    _containerName: Option[ConfigNodePropertyString],
    _accessKey: Option[ConfigNodePropertyString],
    _rootPath: Option[ConfigNodePropertyString],
    _connectionURL: Option[ConfigNodePropertyString]
)
object OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties {
    def toStringBody(var_accountName: Object, var_containerName: Object, var_accessKey: Object, var_rootPath: Object, var_connectionURL: Object) =
        s"""
        | {
        | "accountName":$var_accountName,"containerName":$var_containerName,"accessKey":$var_accessKey,"rootPath":$var_rootPath,"connectionURL":$var_connectionURL
        | }
        """.stripMargin
}
