
package org.openapitools.client.model


case class OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties (
    _users: Option[ConfigNodePropertyArray],
    _groups: Option[ConfigNodePropertyArray]
)
object OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties {
    def toStringBody(var_users: Object, var_groups: Object) =
        s"""
        | {
        | "users":$var_users,"groups":$var_groups
        | }
        """.stripMargin
}
