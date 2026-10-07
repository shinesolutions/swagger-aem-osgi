# OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**path_desc_field** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**path_child_field** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**path_parent_field** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**path_exact_field** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**catch_all_field** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**collapsed_path_field** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**path_depth_field** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**commit_policy** | [**ConfigNodePropertyDropDown**](ConfigNodePropertyDropDown.md) |  | [optional] 
**rows** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**path_restrictions** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**property_restrictions** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**primarytypes_restrictions** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**ignored_properties** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**used_properties** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**type_mappings** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**property_mappings** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**collapse_jcrcontent_nodes** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 

## Example

```python
from swaggeraemosgi.models.org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties import OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties

# TODO update the JSON string below
json = "{}"
# create an instance of OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties from a JSON string
org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties_instance = OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties.from_json(json)
# print the JSON string representation of the object
print(OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties.to_json())

# convert the object into a dict
org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties_dict = org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties_instance.to_dict()
# create an instance of OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties from a dict
org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties_from_dict = OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties.from_dict(org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_properties_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


