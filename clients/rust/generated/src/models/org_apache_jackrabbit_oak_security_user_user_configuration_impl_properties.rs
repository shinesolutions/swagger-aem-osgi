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
pub struct OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties {
  #[serde(rename = "usersPath")]
  users_path: Option<::models::ConfigNodePropertyString>,
  #[serde(rename = "groupsPath")]
  groups_path: Option<::models::ConfigNodePropertyString>,
  #[serde(rename = "systemRelativePath")]
  system_relative_path: Option<::models::ConfigNodePropertyString>,
  #[serde(rename = "defaultDepth")]
  default_depth: Option<::models::ConfigNodePropertyInteger>,
  #[serde(rename = "importBehavior")]
  import_behavior: Option<::models::ConfigNodePropertyDropDown>,
  #[serde(rename = "passwordHashAlgorithm")]
  password_hash_algorithm: Option<::models::ConfigNodePropertyString>,
  #[serde(rename = "passwordHashIterations")]
  password_hash_iterations: Option<::models::ConfigNodePropertyInteger>,
  #[serde(rename = "passwordSaltSize")]
  password_salt_size: Option<::models::ConfigNodePropertyInteger>,
  #[serde(rename = "omitAdminPw")]
  omit_admin_pw: Option<::models::ConfigNodePropertyBoolean>,
  #[serde(rename = "supportAutoSave")]
  support_auto_save: Option<::models::ConfigNodePropertyBoolean>,
  #[serde(rename = "passwordMaxAge")]
  password_max_age: Option<::models::ConfigNodePropertyInteger>,
  #[serde(rename = "initialPasswordChange")]
  initial_password_change: Option<::models::ConfigNodePropertyBoolean>,
  #[serde(rename = "passwordHistorySize")]
  password_history_size: Option<::models::ConfigNodePropertyInteger>,
  #[serde(rename = "passwordExpiryForAdmin")]
  password_expiry_for_admin: Option<::models::ConfigNodePropertyBoolean>,
  #[serde(rename = "cacheExpiration")]
  cache_expiration: Option<::models::ConfigNodePropertyInteger>,
  #[serde(rename = "enableRFC7613UsercaseMappedProfile")]
  enable_rfc7613_usercase_mapped_profile: Option<::models::ConfigNodePropertyBoolean>
}

impl OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties {
  pub fn new() -> OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties {
    OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties {
      users_path: None,
      groups_path: None,
      system_relative_path: None,
      default_depth: None,
      import_behavior: None,
      password_hash_algorithm: None,
      password_hash_iterations: None,
      password_salt_size: None,
      omit_admin_pw: None,
      support_auto_save: None,
      password_max_age: None,
      initial_password_change: None,
      password_history_size: None,
      password_expiry_for_admin: None,
      cache_expiration: None,
      enable_rfc7613_usercase_mapped_profile: None
    }
  }

  pub fn set_users_path(&mut self, users_path: ::models::ConfigNodePropertyString) {
    self.users_path = Some(users_path);
  }

  pub fn with_users_path(mut self, users_path: ::models::ConfigNodePropertyString) -> OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties {
    self.users_path = Some(users_path);
    self
  }

  pub fn users_path(&self) -> Option<&::models::ConfigNodePropertyString> {
    self.users_path.as_ref()
  }

  pub fn reset_users_path(&mut self) {
    self.users_path = None;
  }

  pub fn set_groups_path(&mut self, groups_path: ::models::ConfigNodePropertyString) {
    self.groups_path = Some(groups_path);
  }

  pub fn with_groups_path(mut self, groups_path: ::models::ConfigNodePropertyString) -> OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties {
    self.groups_path = Some(groups_path);
    self
  }

  pub fn groups_path(&self) -> Option<&::models::ConfigNodePropertyString> {
    self.groups_path.as_ref()
  }

  pub fn reset_groups_path(&mut self) {
    self.groups_path = None;
  }

  pub fn set_system_relative_path(&mut self, system_relative_path: ::models::ConfigNodePropertyString) {
    self.system_relative_path = Some(system_relative_path);
  }

  pub fn with_system_relative_path(mut self, system_relative_path: ::models::ConfigNodePropertyString) -> OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties {
    self.system_relative_path = Some(system_relative_path);
    self
  }

  pub fn system_relative_path(&self) -> Option<&::models::ConfigNodePropertyString> {
    self.system_relative_path.as_ref()
  }

  pub fn reset_system_relative_path(&mut self) {
    self.system_relative_path = None;
  }

  pub fn set_default_depth(&mut self, default_depth: ::models::ConfigNodePropertyInteger) {
    self.default_depth = Some(default_depth);
  }

  pub fn with_default_depth(mut self, default_depth: ::models::ConfigNodePropertyInteger) -> OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties {
    self.default_depth = Some(default_depth);
    self
  }

  pub fn default_depth(&self) -> Option<&::models::ConfigNodePropertyInteger> {
    self.default_depth.as_ref()
  }

  pub fn reset_default_depth(&mut self) {
    self.default_depth = None;
  }

  pub fn set_import_behavior(&mut self, import_behavior: ::models::ConfigNodePropertyDropDown) {
    self.import_behavior = Some(import_behavior);
  }

  pub fn with_import_behavior(mut self, import_behavior: ::models::ConfigNodePropertyDropDown) -> OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties {
    self.import_behavior = Some(import_behavior);
    self
  }

  pub fn import_behavior(&self) -> Option<&::models::ConfigNodePropertyDropDown> {
    self.import_behavior.as_ref()
  }

  pub fn reset_import_behavior(&mut self) {
    self.import_behavior = None;
  }

  pub fn set_password_hash_algorithm(&mut self, password_hash_algorithm: ::models::ConfigNodePropertyString) {
    self.password_hash_algorithm = Some(password_hash_algorithm);
  }

  pub fn with_password_hash_algorithm(mut self, password_hash_algorithm: ::models::ConfigNodePropertyString) -> OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties {
    self.password_hash_algorithm = Some(password_hash_algorithm);
    self
  }

  pub fn password_hash_algorithm(&self) -> Option<&::models::ConfigNodePropertyString> {
    self.password_hash_algorithm.as_ref()
  }

  pub fn reset_password_hash_algorithm(&mut self) {
    self.password_hash_algorithm = None;
  }

  pub fn set_password_hash_iterations(&mut self, password_hash_iterations: ::models::ConfigNodePropertyInteger) {
    self.password_hash_iterations = Some(password_hash_iterations);
  }

  pub fn with_password_hash_iterations(mut self, password_hash_iterations: ::models::ConfigNodePropertyInteger) -> OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties {
    self.password_hash_iterations = Some(password_hash_iterations);
    self
  }

  pub fn password_hash_iterations(&self) -> Option<&::models::ConfigNodePropertyInteger> {
    self.password_hash_iterations.as_ref()
  }

  pub fn reset_password_hash_iterations(&mut self) {
    self.password_hash_iterations = None;
  }

  pub fn set_password_salt_size(&mut self, password_salt_size: ::models::ConfigNodePropertyInteger) {
    self.password_salt_size = Some(password_salt_size);
  }

  pub fn with_password_salt_size(mut self, password_salt_size: ::models::ConfigNodePropertyInteger) -> OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties {
    self.password_salt_size = Some(password_salt_size);
    self
  }

  pub fn password_salt_size(&self) -> Option<&::models::ConfigNodePropertyInteger> {
    self.password_salt_size.as_ref()
  }

  pub fn reset_password_salt_size(&mut self) {
    self.password_salt_size = None;
  }

  pub fn set_omit_admin_pw(&mut self, omit_admin_pw: ::models::ConfigNodePropertyBoolean) {
    self.omit_admin_pw = Some(omit_admin_pw);
  }

  pub fn with_omit_admin_pw(mut self, omit_admin_pw: ::models::ConfigNodePropertyBoolean) -> OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties {
    self.omit_admin_pw = Some(omit_admin_pw);
    self
  }

  pub fn omit_admin_pw(&self) -> Option<&::models::ConfigNodePropertyBoolean> {
    self.omit_admin_pw.as_ref()
  }

  pub fn reset_omit_admin_pw(&mut self) {
    self.omit_admin_pw = None;
  }

  pub fn set_support_auto_save(&mut self, support_auto_save: ::models::ConfigNodePropertyBoolean) {
    self.support_auto_save = Some(support_auto_save);
  }

  pub fn with_support_auto_save(mut self, support_auto_save: ::models::ConfigNodePropertyBoolean) -> OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties {
    self.support_auto_save = Some(support_auto_save);
    self
  }

  pub fn support_auto_save(&self) -> Option<&::models::ConfigNodePropertyBoolean> {
    self.support_auto_save.as_ref()
  }

  pub fn reset_support_auto_save(&mut self) {
    self.support_auto_save = None;
  }

  pub fn set_password_max_age(&mut self, password_max_age: ::models::ConfigNodePropertyInteger) {
    self.password_max_age = Some(password_max_age);
  }

  pub fn with_password_max_age(mut self, password_max_age: ::models::ConfigNodePropertyInteger) -> OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties {
    self.password_max_age = Some(password_max_age);
    self
  }

  pub fn password_max_age(&self) -> Option<&::models::ConfigNodePropertyInteger> {
    self.password_max_age.as_ref()
  }

  pub fn reset_password_max_age(&mut self) {
    self.password_max_age = None;
  }

  pub fn set_initial_password_change(&mut self, initial_password_change: ::models::ConfigNodePropertyBoolean) {
    self.initial_password_change = Some(initial_password_change);
  }

  pub fn with_initial_password_change(mut self, initial_password_change: ::models::ConfigNodePropertyBoolean) -> OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties {
    self.initial_password_change = Some(initial_password_change);
    self
  }

  pub fn initial_password_change(&self) -> Option<&::models::ConfigNodePropertyBoolean> {
    self.initial_password_change.as_ref()
  }

  pub fn reset_initial_password_change(&mut self) {
    self.initial_password_change = None;
  }

  pub fn set_password_history_size(&mut self, password_history_size: ::models::ConfigNodePropertyInteger) {
    self.password_history_size = Some(password_history_size);
  }

  pub fn with_password_history_size(mut self, password_history_size: ::models::ConfigNodePropertyInteger) -> OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties {
    self.password_history_size = Some(password_history_size);
    self
  }

  pub fn password_history_size(&self) -> Option<&::models::ConfigNodePropertyInteger> {
    self.password_history_size.as_ref()
  }

  pub fn reset_password_history_size(&mut self) {
    self.password_history_size = None;
  }

  pub fn set_password_expiry_for_admin(&mut self, password_expiry_for_admin: ::models::ConfigNodePropertyBoolean) {
    self.password_expiry_for_admin = Some(password_expiry_for_admin);
  }

  pub fn with_password_expiry_for_admin(mut self, password_expiry_for_admin: ::models::ConfigNodePropertyBoolean) -> OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties {
    self.password_expiry_for_admin = Some(password_expiry_for_admin);
    self
  }

  pub fn password_expiry_for_admin(&self) -> Option<&::models::ConfigNodePropertyBoolean> {
    self.password_expiry_for_admin.as_ref()
  }

  pub fn reset_password_expiry_for_admin(&mut self) {
    self.password_expiry_for_admin = None;
  }

  pub fn set_cache_expiration(&mut self, cache_expiration: ::models::ConfigNodePropertyInteger) {
    self.cache_expiration = Some(cache_expiration);
  }

  pub fn with_cache_expiration(mut self, cache_expiration: ::models::ConfigNodePropertyInteger) -> OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties {
    self.cache_expiration = Some(cache_expiration);
    self
  }

  pub fn cache_expiration(&self) -> Option<&::models::ConfigNodePropertyInteger> {
    self.cache_expiration.as_ref()
  }

  pub fn reset_cache_expiration(&mut self) {
    self.cache_expiration = None;
  }

  pub fn set_enable_rfc7613_usercase_mapped_profile(&mut self, enable_rfc7613_usercase_mapped_profile: ::models::ConfigNodePropertyBoolean) {
    self.enable_rfc7613_usercase_mapped_profile = Some(enable_rfc7613_usercase_mapped_profile);
  }

  pub fn with_enable_rfc7613_usercase_mapped_profile(mut self, enable_rfc7613_usercase_mapped_profile: ::models::ConfigNodePropertyBoolean) -> OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties {
    self.enable_rfc7613_usercase_mapped_profile = Some(enable_rfc7613_usercase_mapped_profile);
    self
  }

  pub fn enable_rfc7613_usercase_mapped_profile(&self) -> Option<&::models::ConfigNodePropertyBoolean> {
    self.enable_rfc7613_usercase_mapped_profile.as_ref()
  }

  pub fn reset_enable_rfc7613_usercase_mapped_profile(&mut self) {
    self.enable_rfc7613_usercase_mapped_profile = None;
  }

}


