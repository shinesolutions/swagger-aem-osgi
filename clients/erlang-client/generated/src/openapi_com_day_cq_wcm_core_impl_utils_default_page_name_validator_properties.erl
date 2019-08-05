-module(openapi_com_day_cq_wcm_core_impl_utils_default_page_name_validator_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_wcm_core_impl_utils_default_page_name_validator_properties/0]).

-type openapi_com_day_cq_wcm_core_impl_utils_default_page_name_validator_properties() ::
    #{ 'nonValidChars' => openapi_config_node_property_string:openapi_config_node_property_string()
     }.

encode(#{ 'nonValidChars' := NonValidChars
        }) ->
    #{ 'nonValidChars' => NonValidChars
     }.
