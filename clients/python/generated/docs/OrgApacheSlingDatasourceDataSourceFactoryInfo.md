# OrgApacheSlingDatasourceDataSourceFactoryInfo


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pid** | **str** |  | [optional] 
**title** | **str** |  | [optional] 
**description** | **str** |  | [optional] 
**properties** | [**OrgApacheSlingDatasourceDataSourceFactoryProperties**](OrgApacheSlingDatasourceDataSourceFactoryProperties.md) |  | [optional] 

## Example

```python
from swaggeraemosgi.models.org_apache_sling_datasource_data_source_factory_info import OrgApacheSlingDatasourceDataSourceFactoryInfo

# TODO update the JSON string below
json = "{}"
# create an instance of OrgApacheSlingDatasourceDataSourceFactoryInfo from a JSON string
org_apache_sling_datasource_data_source_factory_info_instance = OrgApacheSlingDatasourceDataSourceFactoryInfo.from_json(json)
# print the JSON string representation of the object
print(OrgApacheSlingDatasourceDataSourceFactoryInfo.to_json())

# convert the object into a dict
org_apache_sling_datasource_data_source_factory_info_dict = org_apache_sling_datasource_data_source_factory_info_instance.to_dict()
# create an instance of OrgApacheSlingDatasourceDataSourceFactoryInfo from a dict
org_apache_sling_datasource_data_source_factory_info_from_dict = OrgApacheSlingDatasourceDataSourceFactoryInfo.from_dict(org_apache_sling_datasource_data_source_factory_info_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


