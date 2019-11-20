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
pub struct ComAdobeCqCdnRewriterImplCdnConfigServiceImplProperties {
  #[serde(rename = "cdn.config.distribution.domain")]
  cdn_config_distribution_domain: Option<::models::ConfigNodePropertyString>,
  #[serde(rename = "cdn.config.enable.rewriting")]
  cdn_config_enable_rewriting: Option<::models::ConfigNodePropertyBoolean>,
  #[serde(rename = "cdn.config.path.prefixes")]
  cdn_config_path_prefixes: Option<::models::ConfigNodePropertyArray>,
  #[serde(rename = "cdn.config.cdnttl")]
  cdn_config_cdnttl: Option<::models::ConfigNodePropertyInteger>,
  #[serde(rename = "cdn.config.application.protocol")]
  cdn_config_application_protocol: Option<::models::ConfigNodePropertyString>
}

impl ComAdobeCqCdnRewriterImplCdnConfigServiceImplProperties {
  pub fn new() -> ComAdobeCqCdnRewriterImplCdnConfigServiceImplProperties {
    ComAdobeCqCdnRewriterImplCdnConfigServiceImplProperties {
      cdn_config_distribution_domain: None,
      cdn_config_enable_rewriting: None,
      cdn_config_path_prefixes: None,
      cdn_config_cdnttl: None,
      cdn_config_application_protocol: None
    }
  }

  pub fn set_cdn_config_distribution_domain(&mut self, cdn_config_distribution_domain: ::models::ConfigNodePropertyString) {
    self.cdn_config_distribution_domain = Some(cdn_config_distribution_domain);
  }

  pub fn with_cdn_config_distribution_domain(mut self, cdn_config_distribution_domain: ::models::ConfigNodePropertyString) -> ComAdobeCqCdnRewriterImplCdnConfigServiceImplProperties {
    self.cdn_config_distribution_domain = Some(cdn_config_distribution_domain);
    self
  }

  pub fn cdn_config_distribution_domain(&self) -> Option<&::models::ConfigNodePropertyString> {
    self.cdn_config_distribution_domain.as_ref()
  }

  pub fn reset_cdn_config_distribution_domain(&mut self) {
    self.cdn_config_distribution_domain = None;
  }

  pub fn set_cdn_config_enable_rewriting(&mut self, cdn_config_enable_rewriting: ::models::ConfigNodePropertyBoolean) {
    self.cdn_config_enable_rewriting = Some(cdn_config_enable_rewriting);
  }

  pub fn with_cdn_config_enable_rewriting(mut self, cdn_config_enable_rewriting: ::models::ConfigNodePropertyBoolean) -> ComAdobeCqCdnRewriterImplCdnConfigServiceImplProperties {
    self.cdn_config_enable_rewriting = Some(cdn_config_enable_rewriting);
    self
  }

  pub fn cdn_config_enable_rewriting(&self) -> Option<&::models::ConfigNodePropertyBoolean> {
    self.cdn_config_enable_rewriting.as_ref()
  }

  pub fn reset_cdn_config_enable_rewriting(&mut self) {
    self.cdn_config_enable_rewriting = None;
  }

  pub fn set_cdn_config_path_prefixes(&mut self, cdn_config_path_prefixes: ::models::ConfigNodePropertyArray) {
    self.cdn_config_path_prefixes = Some(cdn_config_path_prefixes);
  }

  pub fn with_cdn_config_path_prefixes(mut self, cdn_config_path_prefixes: ::models::ConfigNodePropertyArray) -> ComAdobeCqCdnRewriterImplCdnConfigServiceImplProperties {
    self.cdn_config_path_prefixes = Some(cdn_config_path_prefixes);
    self
  }

  pub fn cdn_config_path_prefixes(&self) -> Option<&::models::ConfigNodePropertyArray> {
    self.cdn_config_path_prefixes.as_ref()
  }

  pub fn reset_cdn_config_path_prefixes(&mut self) {
    self.cdn_config_path_prefixes = None;
  }

  pub fn set_cdn_config_cdnttl(&mut self, cdn_config_cdnttl: ::models::ConfigNodePropertyInteger) {
    self.cdn_config_cdnttl = Some(cdn_config_cdnttl);
  }

  pub fn with_cdn_config_cdnttl(mut self, cdn_config_cdnttl: ::models::ConfigNodePropertyInteger) -> ComAdobeCqCdnRewriterImplCdnConfigServiceImplProperties {
    self.cdn_config_cdnttl = Some(cdn_config_cdnttl);
    self
  }

  pub fn cdn_config_cdnttl(&self) -> Option<&::models::ConfigNodePropertyInteger> {
    self.cdn_config_cdnttl.as_ref()
  }

  pub fn reset_cdn_config_cdnttl(&mut self) {
    self.cdn_config_cdnttl = None;
  }

  pub fn set_cdn_config_application_protocol(&mut self, cdn_config_application_protocol: ::models::ConfigNodePropertyString) {
    self.cdn_config_application_protocol = Some(cdn_config_application_protocol);
  }

  pub fn with_cdn_config_application_protocol(mut self, cdn_config_application_protocol: ::models::ConfigNodePropertyString) -> ComAdobeCqCdnRewriterImplCdnConfigServiceImplProperties {
    self.cdn_config_application_protocol = Some(cdn_config_application_protocol);
    self
  }

  pub fn cdn_config_application_protocol(&self) -> Option<&::models::ConfigNodePropertyString> {
    self.cdn_config_application_protocol.as_ref()
  }

  pub fn reset_cdn_config_application_protocol(&mut self) {
    self.cdn_config_application_protocol = None;
  }

}


