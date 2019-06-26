# SwaggerAemOsgiClient::ComAdobeCqProjectsPurgeSchedulerProperties

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**scheduledpurge_name** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**scheduledpurge_purge_active** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**scheduledpurge_templates** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**scheduledpurge_purge_groups** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**scheduledpurge_purge_assets** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**scheduledpurge_terminate_running_workflows** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**scheduledpurge_daysold** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**scheduledpurge_save_threshold** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 

## Code Sample

```ruby
require 'SwaggerAemOsgiClient'

instance = SwaggerAemOsgiClient::ComAdobeCqProjectsPurgeSchedulerProperties.new(scheduledpurge_name: null,
                                 scheduledpurge_purge_active: null,
                                 scheduledpurge_templates: null,
                                 scheduledpurge_purge_groups: null,
                                 scheduledpurge_purge_assets: null,
                                 scheduledpurge_terminate_running_workflows: null,
                                 scheduledpurge_daysold: null,
                                 scheduledpurge_save_threshold: null)
```


