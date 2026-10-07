-module(openapi_com_adobe_cq_security_hc_bundles_impl_html_library_manager_config_health_ch_info).

-export([encode/1]).

-export_type([openapi_com_adobe_cq_security_hc_bundles_impl_html_library_manager_config_health_ch_info/0]).

-type openapi_com_adobe_cq_security_hc_bundles_impl_html_library_manager_config_health_ch_info() ::
    #{ 'pid' => binary(),
       'title' => binary(),
       'description' => binary(),
       'properties' => openapi_com_adobe_cq_security_hc_bundles_impl_html_library_manager_config_health_ch_properties:openapi_com_adobe_cq_security_hc_bundles_impl_html_library_manager_config_health_ch_properties()
     }.

encode(#{ 'pid' := Pid,
          'title' := Title,
          'description' := Description,
          'properties' := Properties
        }) ->
    #{ 'pid' => Pid,
       'title' => Title,
       'description' => Description,
       'properties' => Properties
     }.
