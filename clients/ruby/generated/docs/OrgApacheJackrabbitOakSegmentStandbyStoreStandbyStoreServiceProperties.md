# SwaggerAemOsgiClient::OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**org_apache_sling_installer_configuration_persist** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**mode** | [**ConfigNodePropertyDropDown**](ConfigNodePropertyDropDown.md) |  | [optional] 
**port** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**primary_host** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**interval** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**primary_allowed_client_ip_ranges** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**secure** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**standby_readtimeout** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**standby_autoclean** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 

## Code Sample

```ruby
require 'SwaggerAemOsgiClient'

instance = SwaggerAemOsgiClient::OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties.new(org_apache_sling_installer_configuration_persist: null,
                                 mode: null,
                                 port: null,
                                 primary_host: null,
                                 interval: null,
                                 primary_allowed_client_ip_ranges: null,
                                 secure: null,
                                 standby_readtimeout: null,
                                 standby_autoclean: null)
```


