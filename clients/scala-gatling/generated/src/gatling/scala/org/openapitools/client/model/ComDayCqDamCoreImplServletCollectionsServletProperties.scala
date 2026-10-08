
package org.openapitools.client.model


case class ComDayCqDamCoreImplServletCollectionsServletProperties (
    _cqDamBatchCollectionsProperties: Option[ConfigNodePropertyArray],
    _cqDamBatchCollectionsLimit: Option[ConfigNodePropertyInteger]
)
object ComDayCqDamCoreImplServletCollectionsServletProperties {
    def toStringBody(var_cqDamBatchCollectionsProperties: Object, var_cqDamBatchCollectionsLimit: Object) =
        s"""
        | {
        | "cqDamBatchCollectionsProperties":$var_cqDamBatchCollectionsProperties,"cqDamBatchCollectionsLimit":$var_cqDamBatchCollectionsLimit
        | }
        """.stripMargin
}
