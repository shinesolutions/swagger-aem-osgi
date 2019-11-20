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
pub struct OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties {
  #[serde(rename = "org.apache.sling.commons.log.file")]
  org_apache_sling_commons_log_file: Option<::models::ConfigNodePropertyString>,
  #[serde(rename = "org.apache.sling.commons.log.file.number")]
  org_apache_sling_commons_log_file_number: Option<::models::ConfigNodePropertyInteger>,
  #[serde(rename = "org.apache.sling.commons.log.file.size")]
  org_apache_sling_commons_log_file_size: Option<::models::ConfigNodePropertyString>,
  #[serde(rename = "org.apache.sling.commons.log.file.buffered")]
  org_apache_sling_commons_log_file_buffered: Option<::models::ConfigNodePropertyBoolean>
}

impl OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties {
  pub fn new() -> OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties {
    OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties {
      org_apache_sling_commons_log_file: None,
      org_apache_sling_commons_log_file_number: None,
      org_apache_sling_commons_log_file_size: None,
      org_apache_sling_commons_log_file_buffered: None
    }
  }

  pub fn set_org_apache_sling_commons_log_file(&mut self, org_apache_sling_commons_log_file: ::models::ConfigNodePropertyString) {
    self.org_apache_sling_commons_log_file = Some(org_apache_sling_commons_log_file);
  }

  pub fn with_org_apache_sling_commons_log_file(mut self, org_apache_sling_commons_log_file: ::models::ConfigNodePropertyString) -> OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties {
    self.org_apache_sling_commons_log_file = Some(org_apache_sling_commons_log_file);
    self
  }

  pub fn org_apache_sling_commons_log_file(&self) -> Option<&::models::ConfigNodePropertyString> {
    self.org_apache_sling_commons_log_file.as_ref()
  }

  pub fn reset_org_apache_sling_commons_log_file(&mut self) {
    self.org_apache_sling_commons_log_file = None;
  }

  pub fn set_org_apache_sling_commons_log_file_number(&mut self, org_apache_sling_commons_log_file_number: ::models::ConfigNodePropertyInteger) {
    self.org_apache_sling_commons_log_file_number = Some(org_apache_sling_commons_log_file_number);
  }

  pub fn with_org_apache_sling_commons_log_file_number(mut self, org_apache_sling_commons_log_file_number: ::models::ConfigNodePropertyInteger) -> OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties {
    self.org_apache_sling_commons_log_file_number = Some(org_apache_sling_commons_log_file_number);
    self
  }

  pub fn org_apache_sling_commons_log_file_number(&self) -> Option<&::models::ConfigNodePropertyInteger> {
    self.org_apache_sling_commons_log_file_number.as_ref()
  }

  pub fn reset_org_apache_sling_commons_log_file_number(&mut self) {
    self.org_apache_sling_commons_log_file_number = None;
  }

  pub fn set_org_apache_sling_commons_log_file_size(&mut self, org_apache_sling_commons_log_file_size: ::models::ConfigNodePropertyString) {
    self.org_apache_sling_commons_log_file_size = Some(org_apache_sling_commons_log_file_size);
  }

  pub fn with_org_apache_sling_commons_log_file_size(mut self, org_apache_sling_commons_log_file_size: ::models::ConfigNodePropertyString) -> OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties {
    self.org_apache_sling_commons_log_file_size = Some(org_apache_sling_commons_log_file_size);
    self
  }

  pub fn org_apache_sling_commons_log_file_size(&self) -> Option<&::models::ConfigNodePropertyString> {
    self.org_apache_sling_commons_log_file_size.as_ref()
  }

  pub fn reset_org_apache_sling_commons_log_file_size(&mut self) {
    self.org_apache_sling_commons_log_file_size = None;
  }

  pub fn set_org_apache_sling_commons_log_file_buffered(&mut self, org_apache_sling_commons_log_file_buffered: ::models::ConfigNodePropertyBoolean) {
    self.org_apache_sling_commons_log_file_buffered = Some(org_apache_sling_commons_log_file_buffered);
  }

  pub fn with_org_apache_sling_commons_log_file_buffered(mut self, org_apache_sling_commons_log_file_buffered: ::models::ConfigNodePropertyBoolean) -> OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties {
    self.org_apache_sling_commons_log_file_buffered = Some(org_apache_sling_commons_log_file_buffered);
    self
  }

  pub fn org_apache_sling_commons_log_file_buffered(&self) -> Option<&::models::ConfigNodePropertyBoolean> {
    self.org_apache_sling_commons_log_file_buffered.as_ref()
  }

  pub fn reset_org_apache_sling_commons_log_file_buffered(&mut self) {
    self.org_apache_sling_commons_log_file_buffered = None;
  }

}


