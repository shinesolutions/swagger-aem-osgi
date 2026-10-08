
package org.openapitools.client.model


case class OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameProperties (
    _length: Option[ConfigNodePropertyInteger]
)
object OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameProperties {
    def toStringBody(var_length: Object) =
        s"""
        | {
        | "length":$var_length
        | }
        """.stripMargin
}
