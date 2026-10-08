
package org.openapitools.client.model


case class OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties (
    _ignorePropertyNameRegex: Option[ConfigNodePropertyArray],
    _configCollectionPropertiesResourceNames: Option[ConfigNodePropertyArray]
)
object OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties {
    def toStringBody(var_ignorePropertyNameRegex: Object, var_configCollectionPropertiesResourceNames: Object) =
        s"""
        | {
        | "ignorePropertyNameRegex":$var_ignorePropertyNameRegex,"configCollectionPropertiesResourceNames":$var_configCollectionPropertiesResourceNames
        | }
        """.stripMargin
}
