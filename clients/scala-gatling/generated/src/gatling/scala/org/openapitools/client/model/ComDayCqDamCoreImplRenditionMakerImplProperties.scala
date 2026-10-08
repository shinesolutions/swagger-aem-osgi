
package org.openapitools.client.model


case class ComDayCqDamCoreImplRenditionMakerImplProperties (
    _xmpPropagate: Option[ConfigNodePropertyBoolean],
    _xmpExcludes: Option[ConfigNodePropertyArray]
)
object ComDayCqDamCoreImplRenditionMakerImplProperties {
    def toStringBody(var_xmpPropagate: Object, var_xmpExcludes: Object) =
        s"""
        | {
        | "xmpPropagate":$var_xmpPropagate,"xmpExcludes":$var_xmpExcludes
        | }
        """.stripMargin
}
