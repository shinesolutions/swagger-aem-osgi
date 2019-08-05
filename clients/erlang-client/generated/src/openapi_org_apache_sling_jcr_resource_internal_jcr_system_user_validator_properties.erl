-module(openapi_org_apache_sling_jcr_resource_internal_jcr_system_user_validator_properties).

-export([encode/1]).

-export_type([openapi_org_apache_sling_jcr_resource_internal_jcr_system_user_validator_properties/0]).

-type openapi_org_apache_sling_jcr_resource_internal_jcr_system_user_validator_properties() ::
    #{ 'allow_only_system_user' => openapi_config_node_property_boolean:openapi_config_node_property_boolean()
     }.

encode(#{ 'allow_only_system_user' := AllowOnlySystemUser
        }) ->
    #{ 'allow.only.system.user' => AllowOnlySystemUser
     }.
