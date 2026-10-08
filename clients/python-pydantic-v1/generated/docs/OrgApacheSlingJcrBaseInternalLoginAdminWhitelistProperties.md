# OrgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**whitelist_bypass** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**whitelist_bundles_regexp** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 

## Example

```python
from openapi_client.models.org_apache_sling_jcr_base_internal_login_admin_whitelist_properties import OrgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties

# TODO update the JSON string below
json = "{}"
# create an instance of OrgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties from a JSON string
org_apache_sling_jcr_base_internal_login_admin_whitelist_properties_instance = OrgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties.from_json(json)
# print the JSON string representation of the object
print OrgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties.to_json()

# convert the object into a dict
org_apache_sling_jcr_base_internal_login_admin_whitelist_properties_dict = org_apache_sling_jcr_base_internal_login_admin_whitelist_properties_instance.to_dict()
# create an instance of OrgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties from a dict
org_apache_sling_jcr_base_internal_login_admin_whitelist_properties_from_dict = OrgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties.from_dict(org_apache_sling_jcr_base_internal_login_admin_whitelist_properties_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


