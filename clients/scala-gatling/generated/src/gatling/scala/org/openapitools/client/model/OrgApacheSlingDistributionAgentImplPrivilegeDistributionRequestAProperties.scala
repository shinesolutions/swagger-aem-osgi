
package org.openapitools.client.model


case class OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAProperties (
    _name: Option[ConfigNodePropertyString],
    _jcrPrivilege: Option[ConfigNodePropertyString]
)
object OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAProperties {
    def toStringBody(var_name: Object, var_jcrPrivilege: Object) =
        s"""
        | {
        | "name":$var_name,"jcrPrivilege":$var_jcrPrivilege
        | }
        """.stripMargin
}
