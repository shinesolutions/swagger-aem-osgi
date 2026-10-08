# OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**datasource_name** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**datasource_svc_prop_name** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**datasource_jndi_name** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**jndi_properties** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 

## Example

```python
from openapi_client.models.org_apache_sling_datasource_jndi_data_source_factory_properties import OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties

# TODO update the JSON string below
json = "{}"
# create an instance of OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties from a JSON string
org_apache_sling_datasource_jndi_data_source_factory_properties_instance = OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties.from_json(json)
# print the JSON string representation of the object
print OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties.to_json()

# convert the object into a dict
org_apache_sling_datasource_jndi_data_source_factory_properties_dict = org_apache_sling_datasource_jndi_data_source_factory_properties_instance.to_dict()
# create an instance of OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties from a dict
org_apache_sling_datasource_jndi_data_source_factory_properties_from_dict = OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties.from_dict(org_apache_sling_datasource_jndi_data_source_factory_properties_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


