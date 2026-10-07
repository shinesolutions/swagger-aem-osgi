
package org.openapitools.client.model


case class OrgApacheSlingServletsGetDefaultGetServletProperties (
    _aliases: Option[ConfigNodePropertyArray],
    _index: Option[ConfigNodePropertyBoolean],
    _indexFiles: Option[ConfigNodePropertyArray],
    _enableHtml: Option[ConfigNodePropertyBoolean],
    _enableJson: Option[ConfigNodePropertyBoolean],
    _enableTxt: Option[ConfigNodePropertyBoolean],
    _enableXml: Option[ConfigNodePropertyBoolean],
    _jsonMaximumresults: Option[ConfigNodePropertyInteger],
    _ecmaSuport: Option[ConfigNodePropertyBoolean]
)
object OrgApacheSlingServletsGetDefaultGetServletProperties {
    def toStringBody(var_aliases: Object, var_index: Object, var_indexFiles: Object, var_enableHtml: Object, var_enableJson: Object, var_enableTxt: Object, var_enableXml: Object, var_jsonMaximumresults: Object, var_ecmaSuport: Object) =
        s"""
        | {
        | "aliases":$var_aliases,"index":$var_index,"indexFiles":$var_indexFiles,"enableHtml":$var_enableHtml,"enableJson":$var_enableJson,"enableTxt":$var_enableTxt,"enableXml":$var_enableXml,"jsonMaximumresults":$var_jsonMaximumresults,"ecmaSuport":$var_ecmaSuport
        | }
        """.stripMargin
}
