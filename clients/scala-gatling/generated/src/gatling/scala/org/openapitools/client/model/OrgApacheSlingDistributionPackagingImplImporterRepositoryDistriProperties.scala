
package org.openapitools.client.model


case class OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties (
    _name: Option[ConfigNodePropertyString],
    _serviceName: Option[ConfigNodePropertyString],
    _path: Option[ConfigNodePropertyString],
    _privilegeName: Option[ConfigNodePropertyString]
)
object OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties {
    def toStringBody(var_name: Object, var_serviceName: Object, var_path: Object, var_privilegeName: Object) =
        s"""
        | {
        | "name":$var_name,"serviceName":$var_serviceName,"path":$var_path,"privilegeName":$var_privilegeName
        | }
        """.stripMargin
}
