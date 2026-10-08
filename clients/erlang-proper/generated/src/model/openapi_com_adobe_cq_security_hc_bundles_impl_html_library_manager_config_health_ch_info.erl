-module(openapi_com_adobe_cq_security_hc_bundles_impl_html_library_manager_config_health_ch_info).

-include("openapi.hrl").

-export([openapi_com_adobe_cq_security_hc_bundles_impl_html_library_manager_config_health_ch_info/0]).

-export([openapi_com_adobe_cq_security_hc_bundles_impl_html_library_manager_config_health_ch_info/1]).

-export_type([openapi_com_adobe_cq_security_hc_bundles_impl_html_library_manager_config_health_ch_info/0]).

-type openapi_com_adobe_cq_security_hc_bundles_impl_html_library_manager_config_health_ch_info() ::
  [ {'pid', binary() }
  | {'title', binary() }
  | {'description', binary() }
  | {'properties', openapi_com_adobe_cq_security_hc_bundles_impl_html_library_manager_config_health_ch_properties:openapi_com_adobe_cq_security_hc_bundles_impl_html_library_manager_config_health_ch_properties() }
  ].


openapi_com_adobe_cq_security_hc_bundles_impl_html_library_manager_config_health_ch_info() ->
    openapi_com_adobe_cq_security_hc_bundles_impl_html_library_manager_config_health_ch_info([]).

openapi_com_adobe_cq_security_hc_bundles_impl_html_library_manager_config_health_ch_info(Fields) ->
  Default = [ {'pid', binary() }
            , {'title', binary() }
            , {'description', binary() }
            , {'properties', openapi_com_adobe_cq_security_hc_bundles_impl_html_library_manager_config_health_ch_properties:openapi_com_adobe_cq_security_hc_bundles_impl_html_library_manager_config_health_ch_properties() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

