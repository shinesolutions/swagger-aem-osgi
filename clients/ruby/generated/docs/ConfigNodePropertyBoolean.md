# SwaggerAemOsgiClient::ConfigNodePropertyBoolean

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **name** | **String** | property name | [optional] |
| **optional** | **Boolean** | True if optional | [optional] |
| **is_set** | **Boolean** | True if property is set | [optional] |
| **type** | **Integer** | Property type, 1&#x3D;String, 2&#x3D;Long, 3&#x3D;Integer, 7&#x3D;Float, 11&#x3D;Boolean, 12&#x3D;Secrets(String) | [optional] |
| **value** | **Boolean** | Property value | [optional] |
| **description** | **String** | Property description | [optional] |

## Example

```ruby
require 'swagger_aem_osgi'

instance = SwaggerAemOsgiClient::ConfigNodePropertyBoolean.new(
  name: null,
  optional: null,
  is_set: null,
  type: null,
  value: null,
  description: null
)
```

