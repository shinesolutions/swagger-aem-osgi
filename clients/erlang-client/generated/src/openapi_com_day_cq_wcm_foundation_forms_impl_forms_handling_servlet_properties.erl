-module(openapi_com_day_cq_wcm_foundation_forms_impl_forms_handling_servlet_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_wcm_foundation_forms_impl_forms_handling_servlet_properties/0]).

-type openapi_com_day_cq_wcm_foundation_forms_impl_forms_handling_servlet_properties() ::
    #{ 'name_whitelist' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'allow_expressions' => openapi_config_node_property_boolean:openapi_config_node_property_boolean()
     }.

encode(#{ 'name_whitelist' := NameWhitelist,
          'allow_expressions' := AllowExpressions
        }) ->
    #{ 'name.whitelist' => NameWhitelist,
       'allow.expressions' => AllowExpressions
     }.
