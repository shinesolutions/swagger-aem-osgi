/* 
 * Adobe Experience Manager OSGI config (AEM) API
 *
 * Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
 *
 * OpenAPI spec version: 1.0.0-pre.0
 * Contact: opensource@shinesolutions.com
 * Generated by: https://openapi-generator.tech
 */


#[allow(unused_imports)]
use serde_json::Value;

#[derive(Debug, Serialize, Deserialize)]
pub struct ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties {
  #[serde(rename = "operation")]
  operation: Option<::models::ConfigNodePropertyString>,
  #[serde(rename = "operationIcon")]
  operation_icon: Option<::models::ConfigNodePropertyString>,
  #[serde(rename = "topicName")]
  topic_name: Option<::models::ConfigNodePropertyString>,
  #[serde(rename = "emailEnabled")]
  email_enabled: Option<::models::ConfigNodePropertyBoolean>
}

impl ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties {
  pub fn new() -> ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties {
    ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties {
      operation: None,
      operation_icon: None,
      topic_name: None,
      email_enabled: None
    }
  }

  pub fn set_operation(&mut self, operation: ::models::ConfigNodePropertyString) {
    self.operation = Some(operation);
  }

  pub fn with_operation(mut self, operation: ::models::ConfigNodePropertyString) -> ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties {
    self.operation = Some(operation);
    self
  }

  pub fn operation(&self) -> Option<&::models::ConfigNodePropertyString> {
    self.operation.as_ref()
  }

  pub fn reset_operation(&mut self) {
    self.operation = None;
  }

  pub fn set_operation_icon(&mut self, operation_icon: ::models::ConfigNodePropertyString) {
    self.operation_icon = Some(operation_icon);
  }

  pub fn with_operation_icon(mut self, operation_icon: ::models::ConfigNodePropertyString) -> ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties {
    self.operation_icon = Some(operation_icon);
    self
  }

  pub fn operation_icon(&self) -> Option<&::models::ConfigNodePropertyString> {
    self.operation_icon.as_ref()
  }

  pub fn reset_operation_icon(&mut self) {
    self.operation_icon = None;
  }

  pub fn set_topic_name(&mut self, topic_name: ::models::ConfigNodePropertyString) {
    self.topic_name = Some(topic_name);
  }

  pub fn with_topic_name(mut self, topic_name: ::models::ConfigNodePropertyString) -> ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties {
    self.topic_name = Some(topic_name);
    self
  }

  pub fn topic_name(&self) -> Option<&::models::ConfigNodePropertyString> {
    self.topic_name.as_ref()
  }

  pub fn reset_topic_name(&mut self) {
    self.topic_name = None;
  }

  pub fn set_email_enabled(&mut self, email_enabled: ::models::ConfigNodePropertyBoolean) {
    self.email_enabled = Some(email_enabled);
  }

  pub fn with_email_enabled(mut self, email_enabled: ::models::ConfigNodePropertyBoolean) -> ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties {
    self.email_enabled = Some(email_enabled);
    self
  }

  pub fn email_enabled(&self) -> Option<&::models::ConfigNodePropertyBoolean> {
    self.email_enabled.as_ref()
  }

  pub fn reset_email_enabled(&mut self) {
    self.email_enabled = None;
  }

}



