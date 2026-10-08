
package org.openapitools.client.model


case class ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties (
    _automoderationSequence: Option[ConfigNodePropertyArray],
    _automoderationOnfailurestop: Option[ConfigNodePropertyBoolean]
)
object ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties {
    def toStringBody(var_automoderationSequence: Object, var_automoderationOnfailurestop: Object) =
        s"""
        | {
        | "automoderationSequence":$var_automoderationSequence,"automoderationOnfailurestop":$var_automoderationOnfailurestop
        | }
        """.stripMargin
}
