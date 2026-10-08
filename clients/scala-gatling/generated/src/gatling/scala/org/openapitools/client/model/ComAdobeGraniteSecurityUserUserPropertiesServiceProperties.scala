
package org.openapitools.client.model


case class ComAdobeGraniteSecurityUserUserPropertiesServiceProperties (
    _adapterCondition: Option[ConfigNodePropertyString],
    _graniteUserpropertiesNodetypes: Option[ConfigNodePropertyArray],
    _graniteUserpropertiesResourcetypes: Option[ConfigNodePropertyArray]
)
object ComAdobeGraniteSecurityUserUserPropertiesServiceProperties {
    def toStringBody(var_adapterCondition: Object, var_graniteUserpropertiesNodetypes: Object, var_graniteUserpropertiesResourcetypes: Object) =
        s"""
        | {
        | "adapterCondition":$var_adapterCondition,"graniteUserpropertiesNodetypes":$var_graniteUserpropertiesNodetypes,"graniteUserpropertiesResourcetypes":$var_graniteUserpropertiesResourcetypes
        | }
        """.stripMargin
}
