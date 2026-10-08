
package org.openapitools.client.model


case class ComAdobeGraniteCorsImplCORSPolicyImplProperties (
    _alloworigin: Option[ConfigNodePropertyArray],
    _alloworiginregexp: Option[ConfigNodePropertyArray],
    _allowedpaths: Option[ConfigNodePropertyArray],
    _exposedheaders: Option[ConfigNodePropertyArray],
    _maxage: Option[ConfigNodePropertyInteger],
    _supportedheaders: Option[ConfigNodePropertyArray],
    _supportedmethods: Option[ConfigNodePropertyArray],
    _supportscredentials: Option[ConfigNodePropertyBoolean]
)
object ComAdobeGraniteCorsImplCORSPolicyImplProperties {
    def toStringBody(var_alloworigin: Object, var_alloworiginregexp: Object, var_allowedpaths: Object, var_exposedheaders: Object, var_maxage: Object, var_supportedheaders: Object, var_supportedmethods: Object, var_supportscredentials: Object) =
        s"""
        | {
        | "alloworigin":$var_alloworigin,"alloworiginregexp":$var_alloworiginregexp,"allowedpaths":$var_allowedpaths,"exposedheaders":$var_exposedheaders,"maxage":$var_maxage,"supportedheaders":$var_supportedheaders,"supportedmethods":$var_supportedmethods,"supportscredentials":$var_supportscredentials
        | }
        """.stripMargin
}
