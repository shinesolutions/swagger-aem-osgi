-module(openapi_com_day_cq_wcm_core_impl_language_manager_impl_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_wcm_core_impl_language_manager_impl_properties/0]).

-type openapi_com_day_cq_wcm_core_impl_language_manager_impl_properties() ::
    #{ 'langmgr_list_path' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'langmgr_country_default' => openapi_config_node_property_array:openapi_config_node_property_array()
     }.

encode(#{ 'langmgr_list_path' := LangmgrListPath,
          'langmgr_country_default' := LangmgrCountryDefault
        }) ->
    #{ 'langmgr.list.path' => LangmgrListPath,
       'langmgr.country.default' => LangmgrCountryDefault
     }.
