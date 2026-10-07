
package org.openapitools.client.model


case class ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties (
    _patternTime: Option[ConfigNodePropertyString],
    _patternNewline: Option[ConfigNodePropertyString],
    _patternDayOfMonth: Option[ConfigNodePropertyString],
    _patternMonth: Option[ConfigNodePropertyString],
    _patternYear: Option[ConfigNodePropertyString],
    _patternDate: Option[ConfigNodePropertyString],
    _patternDateTime: Option[ConfigNodePropertyString],
    _patternEmail: Option[ConfigNodePropertyString]
)
object ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties {
    def toStringBody(var_patternTime: Object, var_patternNewline: Object, var_patternDayOfMonth: Object, var_patternMonth: Object, var_patternYear: Object, var_patternDate: Object, var_patternDateTime: Object, var_patternEmail: Object) =
        s"""
        | {
        | "patternTime":$var_patternTime,"patternNewline":$var_patternNewline,"patternDayOfMonth":$var_patternDayOfMonth,"patternMonth":$var_patternMonth,"patternYear":$var_patternYear,"patternDate":$var_patternDate,"patternDateTime":$var_patternDateTime,"patternEmail":$var_patternEmail
        | }
        """.stripMargin
}
