
package org.openapitools.client.model


case class ComAdobeCqDamCfmImplComponentComponentConfigImplProperties (
    _damCfmComponentResourceType: Option[ConfigNodePropertyString],
    _damCfmComponentFileReferenceProp: Option[ConfigNodePropertyString],
    _damCfmComponentElementsProp: Option[ConfigNodePropertyString],
    _damCfmComponentVariationProp: Option[ConfigNodePropertyString]
)
object ComAdobeCqDamCfmImplComponentComponentConfigImplProperties {
    def toStringBody(var_damCfmComponentResourceType: Object, var_damCfmComponentFileReferenceProp: Object, var_damCfmComponentElementsProp: Object, var_damCfmComponentVariationProp: Object) =
        s"""
        | {
        | "damCfmComponentResourceType":$var_damCfmComponentResourceType,"damCfmComponentFileReferenceProp":$var_damCfmComponentFileReferenceProp,"damCfmComponentElementsProp":$var_damCfmComponentElementsProp,"damCfmComponentVariationProp":$var_damCfmComponentVariationProp
        | }
        """.stripMargin
}
