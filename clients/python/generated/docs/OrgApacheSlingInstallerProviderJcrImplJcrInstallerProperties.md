# OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**handler_schemes** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**sling_jcrinstall_folder_name_regexp** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**sling_jcrinstall_folder_max_depth** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**sling_jcrinstall_search_path** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**sling_jcrinstall_new_config_path** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**sling_jcrinstall_signal_path** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**sling_jcrinstall_enable_writeback** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 

## Example

```python
from swaggeraemosgi.models.org_apache_sling_installer_provider_jcr_impl_jcr_installer_properties import OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties

# TODO update the JSON string below
json = "{}"
# create an instance of OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties from a JSON string
org_apache_sling_installer_provider_jcr_impl_jcr_installer_properties_instance = OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties.from_json(json)
# print the JSON string representation of the object
print(OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties.to_json())

# convert the object into a dict
org_apache_sling_installer_provider_jcr_impl_jcr_installer_properties_dict = org_apache_sling_installer_provider_jcr_impl_jcr_installer_properties_instance.to_dict()
# create an instance of OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties from a dict
org_apache_sling_installer_provider_jcr_impl_jcr_installer_properties_from_dict = OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties.from_dict(org_apache_sling_installer_provider_jcr_impl_jcr_installer_properties_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


