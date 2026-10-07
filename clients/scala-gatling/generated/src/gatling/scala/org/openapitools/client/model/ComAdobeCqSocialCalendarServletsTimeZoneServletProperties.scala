
package org.openapitools.client.model


case class ComAdobeCqSocialCalendarServletsTimeZoneServletProperties (
    _timezonesExpirytime: Option[ConfigNodePropertyInteger]
)
object ComAdobeCqSocialCalendarServletsTimeZoneServletProperties {
    def toStringBody(var_timezonesExpirytime: Object) =
        s"""
        | {
        | "timezonesExpirytime":$var_timezonesExpirytime
        | }
        """.stripMargin
}
