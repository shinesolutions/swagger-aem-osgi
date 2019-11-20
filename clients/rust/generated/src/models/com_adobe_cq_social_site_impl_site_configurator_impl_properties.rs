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
pub struct ComAdobeCqSocialSiteImplSiteConfiguratorImplProperties {
  #[serde(rename = "componentsUsingTags")]
  components_using_tags: Option<::models::ConfigNodePropertyArray>
}

impl ComAdobeCqSocialSiteImplSiteConfiguratorImplProperties {
  pub fn new() -> ComAdobeCqSocialSiteImplSiteConfiguratorImplProperties {
    ComAdobeCqSocialSiteImplSiteConfiguratorImplProperties {
      components_using_tags: None
    }
  }

  pub fn set_components_using_tags(&mut self, components_using_tags: ::models::ConfigNodePropertyArray) {
    self.components_using_tags = Some(components_using_tags);
  }

  pub fn with_components_using_tags(mut self, components_using_tags: ::models::ConfigNodePropertyArray) -> ComAdobeCqSocialSiteImplSiteConfiguratorImplProperties {
    self.components_using_tags = Some(components_using_tags);
    self
  }

  pub fn components_using_tags(&self) -> Option<&::models::ConfigNodePropertyArray> {
    self.components_using_tags.as_ref()
  }

  pub fn reset_components_using_tags(&mut self) {
    self.components_using_tags = None;
  }

}


