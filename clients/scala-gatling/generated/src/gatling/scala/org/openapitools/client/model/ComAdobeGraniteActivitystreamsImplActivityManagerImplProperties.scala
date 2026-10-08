
package org.openapitools.client.model


case class ComAdobeGraniteActivitystreamsImplActivityManagerImplProperties (
    _aggregateRelationships: Option[ConfigNodePropertyArray],
    _aggregateDescendVirtual: Option[ConfigNodePropertyBoolean]
)
object ComAdobeGraniteActivitystreamsImplActivityManagerImplProperties {
    def toStringBody(var_aggregateRelationships: Object, var_aggregateDescendVirtual: Object) =
        s"""
        | {
        | "aggregateRelationships":$var_aggregateRelationships,"aggregateDescendVirtual":$var_aggregateDescendVirtual
        | }
        """.stripMargin
}
