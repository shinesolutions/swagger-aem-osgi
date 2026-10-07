-module(openapi_com_adobe_granite_auth_ims_impl_ims_config_provider_impl_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_granite_auth_ims_impl_ims_config_provider_impl_properties/0]).

-type openapi_com_adobe_granite_auth_ims_impl_ims_config_provider_impl_properties() ::
    #{ 'oauth_configmanager_ims_configid' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'ims_owningEntity' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'aem_instanceId' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'ims_serviceCode' => openapi_config_node_property_string:openapi_config_node_property_string()
     }.

encode(#{ 'oauth_configmanager_ims_configid' := OauthConfigmanagerImsConfigid,
          'ims_owningEntity' := ImsOwningEntity,
          'aem_instanceId' := AemInstanceId,
          'ims_serviceCode' := ImsServiceCode
        }) ->
    #{ 'oauth.configmanager.ims.configid' => OauthConfigmanagerImsConfigid,
       'ims.owningEntity' => ImsOwningEntity,
       'aem.instanceId' => AemInstanceId,
       'ims.serviceCode' => ImsServiceCode
     }.
