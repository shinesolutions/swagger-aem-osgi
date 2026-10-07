
package org.openapitools.client.model


case class OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryProperties (
    _providerType: Option[ConfigNodePropertyDropDown]
)
object OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryProperties {
    def toStringBody(var_providerType: Object) =
        s"""
        | {
        | "providerType":$var_providerType
        | }
        """.stripMargin
}
