
package org.openapitools.client.model


case class OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties (
    _orgApacheJackrabbitOakAuthenticationAppName: Option[ConfigNodePropertyString],
    _orgApacheJackrabbitOakAuthenticationConfigSpiName: Option[ConfigNodePropertyString]
)
object OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties {
    def toStringBody(var_orgApacheJackrabbitOakAuthenticationAppName: Object, var_orgApacheJackrabbitOakAuthenticationConfigSpiName: Object) =
        s"""
        | {
        | "orgApacheJackrabbitOakAuthenticationAppName":$var_orgApacheJackrabbitOakAuthenticationAppName,"orgApacheJackrabbitOakAuthenticationConfigSpiName":$var_orgApacheJackrabbitOakAuthenticationConfigSpiName
        | }
        """.stripMargin
}
