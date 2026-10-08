
package org.openapitools.client.model


case class ComAdobeCqDamCfmImplConfFeatureConfigImplProperties (
    _damCfmResourceTypes: Option[ConfigNodePropertyArray],
    _damCfmReferenceProperties: Option[ConfigNodePropertyArray]
)
object ComAdobeCqDamCfmImplConfFeatureConfigImplProperties {
    def toStringBody(var_damCfmResourceTypes: Object, var_damCfmReferenceProperties: Object) =
        s"""
        | {
        | "damCfmResourceTypes":$var_damCfmResourceTypes,"damCfmReferenceProperties":$var_damCfmReferenceProperties
        | }
        """.stripMargin
}
