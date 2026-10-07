
package org.openapitools.client.model


case class ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties (
    _codeupgradetasks: Option[ConfigNodePropertyArray],
    _codeupgradetaskfilters: Option[ConfigNodePropertyArray]
)
object ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties {
    def toStringBody(var_codeupgradetasks: Object, var_codeupgradetaskfilters: Object) =
        s"""
        | {
        | "codeupgradetasks":$var_codeupgradetasks,"codeupgradetaskfilters":$var_codeupgradetaskfilters
        | }
        """.stripMargin
}
