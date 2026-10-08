
package org.openapitools.client.model


case class OrgApacheSlingHcCoreImplCompositeHealthCheckProperties (
    _hcName: Option[ConfigNodePropertyString],
    _hcTags: Option[ConfigNodePropertyArray],
    _hcMbeanName: Option[ConfigNodePropertyString],
    _filterTags: Option[ConfigNodePropertyArray],
    _filterCombineTagsWithOr: Option[ConfigNodePropertyBoolean]
)
object OrgApacheSlingHcCoreImplCompositeHealthCheckProperties {
    def toStringBody(var_hcName: Object, var_hcTags: Object, var_hcMbeanName: Object, var_filterTags: Object, var_filterCombineTagsWithOr: Object) =
        s"""
        | {
        | "hcName":$var_hcName,"hcTags":$var_hcTags,"hcMbeanName":$var_hcMbeanName,"filterTags":$var_filterTags,"filterCombineTagsWithOr":$var_filterCombineTagsWithOr
        | }
        """.stripMargin
}
