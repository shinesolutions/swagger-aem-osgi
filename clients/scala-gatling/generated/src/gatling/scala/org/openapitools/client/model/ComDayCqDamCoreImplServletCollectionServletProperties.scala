
package org.openapitools.client.model


case class ComDayCqDamCoreImplServletCollectionServletProperties (
    _cqDamBatchCollectionProperties: Option[ConfigNodePropertyArray],
    _cqDamBatchCollectionMaxcollections: Option[ConfigNodePropertyInteger]
)
object ComDayCqDamCoreImplServletCollectionServletProperties {
    def toStringBody(var_cqDamBatchCollectionProperties: Object, var_cqDamBatchCollectionMaxcollections: Object) =
        s"""
        | {
        | "cqDamBatchCollectionProperties":$var_cqDamBatchCollectionProperties,"cqDamBatchCollectionMaxcollections":$var_cqDamBatchCollectionMaxcollections
        | }
        """.stripMargin
}
