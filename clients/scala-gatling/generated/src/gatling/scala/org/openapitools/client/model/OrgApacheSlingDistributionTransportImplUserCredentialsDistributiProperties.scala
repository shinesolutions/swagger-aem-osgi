
package org.openapitools.client.model


case class OrgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties (
    _name: Option[ConfigNodePropertyString],
    _username: Option[ConfigNodePropertyString],
    _password: Option[ConfigNodePropertyString]
)
object OrgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties {
    def toStringBody(var_name: Object, var_username: Object, var_password: Object) =
        s"""
        | {
        | "name":$var_name,"username":$var_username,"password":$var_password
        | }
        """.stripMargin
}
