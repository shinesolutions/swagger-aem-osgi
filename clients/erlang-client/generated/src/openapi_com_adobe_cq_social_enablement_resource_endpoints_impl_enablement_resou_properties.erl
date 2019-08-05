-module(openapi_com_adobe_cq_social_enablement_resource_endpoints_impl_enablement_resou_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_cq_social_enablement_resource_endpoints_impl_enablement_resou_properties/0]).

-type openapi_com_adobe_cq_social_enablement_resource_endpoints_impl_enablement_resou_properties() ::
    #{ 'fieldWhitelist' => openapi_config_node_property_array:openapi_config_node_property_array()
     }.

encode(#{ 'fieldWhitelist' := FieldWhitelist
        }) ->
    #{ 'fieldWhitelist' => FieldWhitelist
     }.
