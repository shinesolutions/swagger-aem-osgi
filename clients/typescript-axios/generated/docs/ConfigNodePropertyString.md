# ConfigNodePropertyString


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **string** | property name | [optional] [default to undefined]
**optional** | **boolean** | True if optional | [optional] [default to undefined]
**is_set** | **boolean** | True if property is set | [optional] [default to undefined]
**type** | **number** | Property type, 1&#x3D;String, 2&#x3D;Long, 3&#x3D;Integer, 7&#x3D;Float, 11&#x3D;Boolean, 12&#x3D;Secrets(String) | [optional] [default to undefined]
**value** | **string** | Property value | [optional] [default to undefined]
**description** | **string** | Property description | [optional] [default to undefined]

## Example

```typescript
import { ConfigNodePropertyString } from './api';

const instance: ConfigNodePropertyString = {
    name,
    optional,
    is_set,
    type,
    value,
    description,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
