# ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**jdbc_driver_class** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**jdbc_connection_uri** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**jdbc_username** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**jdbc_password** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**jdbc_validation_query** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**default_readonly** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**default_autocommit** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**pool_size** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**pool_max_wait_msec** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**datasource_name** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**datasource_svc_properties** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 

## Example

```python
from swaggeraemosgi.models.com_day_commons_datasource_jdbcpool_jdbc_pool_service_properties import ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties

# TODO update the JSON string below
json = "{}"
# create an instance of ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties from a JSON string
com_day_commons_datasource_jdbcpool_jdbc_pool_service_properties_instance = ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties.from_json(json)
# print the JSON string representation of the object
print(ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties.to_json())

# convert the object into a dict
com_day_commons_datasource_jdbcpool_jdbc_pool_service_properties_dict = com_day_commons_datasource_jdbcpool_jdbc_pool_service_properties_instance.to_dict()
# create an instance of ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties from a dict
com_day_commons_datasource_jdbcpool_jdbc_pool_service_properties_from_dict = ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties.from_dict(com_day_commons_datasource_jdbcpool_jdbc_pool_service_properties_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


