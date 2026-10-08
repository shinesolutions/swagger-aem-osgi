# SwaggerAemOsgiClient::OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **provider_name** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] |
| **host_name** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] |
| **host_port** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] |
| **host_ssl** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] |
| **host_tls** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] |
| **host_no_cert_check** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] |
| **bind_dn** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] |
| **bind_password** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] |
| **search_timeout** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] |
| **admin_pool_max_active** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] |
| **admin_pool_lookup_on_validate** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] |
| **user_pool_max_active** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] |
| **user_pool_lookup_on_validate** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] |
| **user_base_dn** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] |
| **user_objectclass** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] |
| **user_id_attribute** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] |
| **user_extra_filter** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] |
| **user_make_dn_path** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] |
| **group_base_dn** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] |
| **group_objectclass** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] |
| **group_name_attribute** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] |
| **group_extra_filter** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] |
| **group_make_dn_path** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] |
| **group_member_attribute** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] |
| **use_uid_for_ext_id** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] |
| **customattributes** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] |

## Example

```ruby
require 'swagger_aem_osgi'

instance = SwaggerAemOsgiClient::OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties.new(
  provider_name: null,
  host_name: null,
  host_port: null,
  host_ssl: null,
  host_tls: null,
  host_no_cert_check: null,
  bind_dn: null,
  bind_password: null,
  search_timeout: null,
  admin_pool_max_active: null,
  admin_pool_lookup_on_validate: null,
  user_pool_max_active: null,
  user_pool_lookup_on_validate: null,
  user_base_dn: null,
  user_objectclass: null,
  user_id_attribute: null,
  user_extra_filter: null,
  user_make_dn_path: null,
  group_base_dn: null,
  group_objectclass: null,
  group_name_attribute: null,
  group_extra_filter: null,
  group_make_dn_path: null,
  group_member_attribute: null,
  use_uid_for_ext_id: null,
  customattributes: null
)
```

