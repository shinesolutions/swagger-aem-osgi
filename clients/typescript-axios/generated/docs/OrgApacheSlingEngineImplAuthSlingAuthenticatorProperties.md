# OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**osgi_http_whiteboard_context_select** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] [default to undefined]
**osgi_http_whiteboard_listener** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] [default to undefined]
**auth_sudo_cookie** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] [default to undefined]
**auth_sudo_parameter** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] [default to undefined]
**auth_annonymous** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] [default to undefined]
**sling_auth_requirements** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] [default to undefined]
**sling_auth_anonymous_user** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] [default to undefined]
**sling_auth_anonymous_password** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] [default to undefined]
**auth_http** | [**ConfigNodePropertyDropDown**](ConfigNodePropertyDropDown.md) |  | [optional] [default to undefined]
**auth_http_realm** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] [default to undefined]
**auth_uri_suffix** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] [default to undefined]

## Example

```typescript
import { OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties } from './api';

const instance: OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties = {
    osgi_http_whiteboard_context_select,
    osgi_http_whiteboard_listener,
    auth_sudo_cookie,
    auth_sudo_parameter,
    auth_annonymous,
    sling_auth_requirements,
    sling_auth_anonymous_user,
    sling_auth_anonymous_password,
    auth_http,
    auth_http_realm,
    auth_uri_suffix,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
