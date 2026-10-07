-module(openapi_org_apache_aries_jmx_framework_state_config_properties).

-export([encode/1]).

-export_type([openapi_org_apache_aries_jmx_framework_state_config_properties/0]).

-type openapi_org_apache_aries_jmx_framework_state_config_properties() ::
    #{ 'attributeChangeNotificationEnabled' => openapi_config_node_property_boolean:openapi_config_node_property_boolean()
     }.

encode(#{ 'attributeChangeNotificationEnabled' := AttributeChangeNotificationEnabled
        }) ->
    #{ 'attributeChangeNotificationEnabled' => AttributeChangeNotificationEnabled
     }.
