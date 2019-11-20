package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureProperties._

case class ComAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureProperties (
  enabled: Option[ConfigNodePropertyBoolean])

object ComAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureProperties {
  import DateTimeCodecs._

  implicit val ComAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeaturePropertiesCodecJson: CodecJson[ComAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureProperties] = CodecJson.derive[ComAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureProperties]
  implicit val ComAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeaturePropertiesDecoder: EntityDecoder[ComAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureProperties] = jsonOf[ComAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureProperties]
  implicit val ComAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeaturePropertiesEncoder: EntityEncoder[ComAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureProperties] = jsonEncoderOf[ComAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureProperties]
}