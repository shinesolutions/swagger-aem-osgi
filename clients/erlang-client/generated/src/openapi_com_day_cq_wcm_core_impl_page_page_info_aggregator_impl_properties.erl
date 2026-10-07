-module(openapi_com_day_cq_wcm_core_impl_page_page_info_aggregator_impl_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_wcm_core_impl_page_page_info_aggregator_impl_properties/0]).

-type openapi_com_day_cq_wcm_core_impl_page_page_info_aggregator_impl_properties() ::
    #{ 'page_info_provider_property_regex_default' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'page_info_provider_property_name' => openapi_config_node_property_string:openapi_config_node_property_string()
     }.

encode(#{ 'page_info_provider_property_regex_default' := PageInfoProviderPropertyRegexDefault,
          'page_info_provider_property_name' := PageInfoProviderPropertyName
        }) ->
    #{ 'page.info.provider.property.regex.default' => PageInfoProviderPropertyRegexDefault,
       'page.info.provider.property.name' => PageInfoProviderPropertyName
     }.
