package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties._

case class ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties (
  solrZkTimeout: Option[ConfigNodePropertyString],
solrCommit: Option[ConfigNodePropertyString],
cacheOn: Option[ConfigNodePropertyBoolean],
concurrencyLevel: Option[ConfigNodePropertyInteger],
cacheStartSize: Option[ConfigNodePropertyInteger],
cacheTtl: Option[ConfigNodePropertyInteger],
cacheSize: Option[ConfigNodePropertyInteger])

object ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties {
  import DateTimeCodecs._

  implicit val ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryPropertiesCodecJson: CodecJson[ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties] = CodecJson.derive[ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties]
  implicit val ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryPropertiesDecoder: EntityDecoder[ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties] = jsonOf[ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties]
  implicit val ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryPropertiesEncoder: EntityEncoder[ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties] = jsonEncoderOf[ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties]
}