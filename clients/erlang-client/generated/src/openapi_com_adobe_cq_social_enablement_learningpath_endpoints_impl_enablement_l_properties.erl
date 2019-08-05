-module(openapi_com_adobe_cq_social_enablement_learningpath_endpoints_impl_enablement_l_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_cq_social_enablement_learningpath_endpoints_impl_enablement_l_properties/0]).

-type openapi_com_adobe_cq_social_enablement_learningpath_endpoints_impl_enablement_l_properties() ::
    #{ 'fieldWhitelist' => openapi_config_node_property_array:openapi_config_node_property_array()
     }.

encode(#{ 'fieldWhitelist' := FieldWhitelist
        }) ->
    #{ 'fieldWhitelist' => FieldWhitelist
     }.
