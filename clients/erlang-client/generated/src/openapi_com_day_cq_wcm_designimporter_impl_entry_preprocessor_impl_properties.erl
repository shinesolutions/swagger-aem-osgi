-module(openapi_com_day_cq_wcm_designimporter_impl_entry_preprocessor_impl_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_wcm_designimporter_impl_entry_preprocessor_impl_properties/0]).

-type openapi_com_day_cq_wcm_designimporter_impl_entry_preprocessor_impl_properties() ::
    #{ 'search_pattern' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'replace_pattern' => openapi_config_node_property_string:openapi_config_node_property_string()
     }.

encode(#{ 'search_pattern' := SearchPattern,
          'replace_pattern' := ReplacePattern
        }) ->
    #{ 'search.pattern' => SearchPattern,
       'replace.pattern' => ReplacePattern
     }.
