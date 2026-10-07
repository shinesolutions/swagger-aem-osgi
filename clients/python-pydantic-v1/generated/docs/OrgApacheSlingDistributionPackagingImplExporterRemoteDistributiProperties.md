# OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiProperties


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**endpoints** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**pull_items** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**package_builder_target** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**transport_secret_provider_target** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 

## Example

```python
from openapi_client.models.org_apache_sling_distribution_packaging_impl_exporter_remote_distributi_properties import OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiProperties

# TODO update the JSON string below
json = "{}"
# create an instance of OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiProperties from a JSON string
org_apache_sling_distribution_packaging_impl_exporter_remote_distributi_properties_instance = OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiProperties.from_json(json)
# print the JSON string representation of the object
print OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiProperties.to_json()

# convert the object into a dict
org_apache_sling_distribution_packaging_impl_exporter_remote_distributi_properties_dict = org_apache_sling_distribution_packaging_impl_exporter_remote_distributi_properties_instance.to_dict()
# create an instance of OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiProperties from a dict
org_apache_sling_distribution_packaging_impl_exporter_remote_distributi_properties_from_dict = OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiProperties.from_dict(org_apache_sling_distribution_packaging_impl_exporter_remote_distributi_properties_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


