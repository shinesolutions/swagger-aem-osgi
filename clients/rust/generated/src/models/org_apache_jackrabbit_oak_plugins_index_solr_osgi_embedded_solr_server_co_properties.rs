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
pub struct OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoProperties {
  #[serde(rename = "solr.home.path")]
  solr_home_path: Option<::models::ConfigNodePropertyString>,
  #[serde(rename = "solr.core.name")]
  solr_core_name: Option<::models::ConfigNodePropertyString>
}

impl OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoProperties {
  pub fn new() -> OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoProperties {
    OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoProperties {
      solr_home_path: None,
      solr_core_name: None
    }
  }

  pub fn set_solr_home_path(&mut self, solr_home_path: ::models::ConfigNodePropertyString) {
    self.solr_home_path = Some(solr_home_path);
  }

  pub fn with_solr_home_path(mut self, solr_home_path: ::models::ConfigNodePropertyString) -> OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoProperties {
    self.solr_home_path = Some(solr_home_path);
    self
  }

  pub fn solr_home_path(&self) -> Option<&::models::ConfigNodePropertyString> {
    self.solr_home_path.as_ref()
  }

  pub fn reset_solr_home_path(&mut self) {
    self.solr_home_path = None;
  }

  pub fn set_solr_core_name(&mut self, solr_core_name: ::models::ConfigNodePropertyString) {
    self.solr_core_name = Some(solr_core_name);
  }

  pub fn with_solr_core_name(mut self, solr_core_name: ::models::ConfigNodePropertyString) -> OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoProperties {
    self.solr_core_name = Some(solr_core_name);
    self
  }

  pub fn solr_core_name(&self) -> Option<&::models::ConfigNodePropertyString> {
    self.solr_core_name.as_ref()
  }

  pub fn reset_solr_core_name(&mut self) {
    self.solr_core_name = None;
  }

}


