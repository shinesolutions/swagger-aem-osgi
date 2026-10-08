
package org.openapitools.client.model


case class OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties (
    _hcName: Option[ConfigNodePropertyString],
    _hcTags: Option[ConfigNodePropertyArray],
    _hcMbeanName: Option[ConfigNodePropertyString],
    _mbeanName: Option[ConfigNodePropertyString],
    _attributeName: Option[ConfigNodePropertyString],
    _attributeValueConstraint: Option[ConfigNodePropertyString]
)
object OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties {
    def toStringBody(var_hcName: Object, var_hcTags: Object, var_hcMbeanName: Object, var_mbeanName: Object, var_attributeName: Object, var_attributeValueConstraint: Object) =
        s"""
        | {
        | "hcName":$var_hcName,"hcTags":$var_hcTags,"hcMbeanName":$var_hcMbeanName,"mbeanName":$var_mbeanName,"attributeName":$var_attributeName,"attributeValueConstraint":$var_attributeValueConstraint
        | }
        """.stripMargin
}
