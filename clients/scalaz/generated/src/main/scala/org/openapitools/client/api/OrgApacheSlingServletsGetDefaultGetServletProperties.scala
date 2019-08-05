package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import OrgApacheSlingServletsGetDefaultGetServletProperties._

case class OrgApacheSlingServletsGetDefaultGetServletProperties (
  aliases: Option[ConfigNodePropertyArray],
index: Option[ConfigNodePropertyBoolean],
indexFiles: Option[ConfigNodePropertyArray],
enableHtml: Option[ConfigNodePropertyBoolean],
enableJson: Option[ConfigNodePropertyBoolean],
enableTxt: Option[ConfigNodePropertyBoolean],
enableXml: Option[ConfigNodePropertyBoolean],
jsonMaximumresults: Option[ConfigNodePropertyInteger],
ecmaSuport: Option[ConfigNodePropertyBoolean])

object OrgApacheSlingServletsGetDefaultGetServletProperties {
  import DateTimeCodecs._

  implicit val OrgApacheSlingServletsGetDefaultGetServletPropertiesCodecJson: CodecJson[OrgApacheSlingServletsGetDefaultGetServletProperties] = CodecJson.derive[OrgApacheSlingServletsGetDefaultGetServletProperties]
  implicit val OrgApacheSlingServletsGetDefaultGetServletPropertiesDecoder: EntityDecoder[OrgApacheSlingServletsGetDefaultGetServletProperties] = jsonOf[OrgApacheSlingServletsGetDefaultGetServletProperties]
  implicit val OrgApacheSlingServletsGetDefaultGetServletPropertiesEncoder: EntityEncoder[OrgApacheSlingServletsGetDefaultGetServletProperties] = jsonEncoderOf[OrgApacheSlingServletsGetDefaultGetServletProperties]
}
