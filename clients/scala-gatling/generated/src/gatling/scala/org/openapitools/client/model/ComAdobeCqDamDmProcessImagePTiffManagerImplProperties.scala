
package org.openapitools.client.model


case class ComAdobeCqDamDmProcessImagePTiffManagerImplProperties (
    _maxMemory: Option[ConfigNodePropertyInteger]
)
object ComAdobeCqDamDmProcessImagePTiffManagerImplProperties {
    def toStringBody(var_maxMemory: Object) =
        s"""
        | {
        | "maxMemory":$var_maxMemory
        | }
        """.stripMargin
}
