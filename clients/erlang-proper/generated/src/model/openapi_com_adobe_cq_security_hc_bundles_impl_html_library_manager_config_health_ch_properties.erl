-module(openapi_com_adobe_cq_security_hc_bundles_impl_html_library_manager_config_health_ch_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_cq_security_hc_bundles_impl_html_library_manager_config_health_ch_properties/0]).

-export([openapi_com_adobe_cq_security_hc_bundles_impl_html_library_manager_config_health_ch_properties/1]).

-export_type([openapi_com_adobe_cq_security_hc_bundles_impl_html_library_manager_config_health_ch_properties/0]).

-type openapi_com_adobe_cq_security_hc_bundles_impl_html_library_manager_config_health_ch_properties() ::
  [ {'hc_tags', openapi_config_node_property_array:openapi_config_node_property_array() }
  ].


openapi_com_adobe_cq_security_hc_bundles_impl_html_library_manager_config_health_ch_properties() ->
    openapi_com_adobe_cq_security_hc_bundles_impl_html_library_manager_config_health_ch_properties([]).

openapi_com_adobe_cq_security_hc_bundles_impl_html_library_manager_config_health_ch_properties(Fields) ->
  Default = [ {'hc.tags', openapi_config_node_property_array:openapi_config_node_property_array() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

