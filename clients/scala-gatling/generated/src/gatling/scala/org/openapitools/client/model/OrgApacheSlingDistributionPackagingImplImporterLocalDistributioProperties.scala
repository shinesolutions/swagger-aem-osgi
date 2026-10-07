
package org.openapitools.client.model


case class OrgApacheSlingDistributionPackagingImplImporterLocalDistributioProperties (
    _name: Option[ConfigNodePropertyString],
    _packageBuilderTarget: Option[ConfigNodePropertyString]
)
object OrgApacheSlingDistributionPackagingImplImporterLocalDistributioProperties {
    def toStringBody(var_name: Object, var_packageBuilderTarget: Object) =
        s"""
        | {
        | "name":$var_name,"packageBuilderTarget":$var_packageBuilderTarget
        | }
        """.stripMargin
}
