
package org.openapitools.client.model


case class OrgApacheSlingServletsPostImplSlingPostServletProperties (
    _servletPostDateFormats: Option[ConfigNodePropertyArray],
    _servletPostNodeNameHints: Option[ConfigNodePropertyArray],
    _servletPostNodeNameMaxLength: Option[ConfigNodePropertyInteger],
    _servletPostCheckinNewVersionableNodes: Option[ConfigNodePropertyBoolean],
    _servletPostAutoCheckout: Option[ConfigNodePropertyBoolean],
    _servletPostAutoCheckin: Option[ConfigNodePropertyBoolean],
    _servletPostIgnorePattern: Option[ConfigNodePropertyString]
)
object OrgApacheSlingServletsPostImplSlingPostServletProperties {
    def toStringBody(var_servletPostDateFormats: Object, var_servletPostNodeNameHints: Object, var_servletPostNodeNameMaxLength: Object, var_servletPostCheckinNewVersionableNodes: Object, var_servletPostAutoCheckout: Object, var_servletPostAutoCheckin: Object, var_servletPostIgnorePattern: Object) =
        s"""
        | {
        | "servletPostDateFormats":$var_servletPostDateFormats,"servletPostNodeNameHints":$var_servletPostNodeNameHints,"servletPostNodeNameMaxLength":$var_servletPostNodeNameMaxLength,"servletPostCheckinNewVersionableNodes":$var_servletPostCheckinNewVersionableNodes,"servletPostAutoCheckout":$var_servletPostAutoCheckout,"servletPostAutoCheckin":$var_servletPostAutoCheckin,"servletPostIgnorePattern":$var_servletPostIgnorePattern
        | }
        """.stripMargin
}
