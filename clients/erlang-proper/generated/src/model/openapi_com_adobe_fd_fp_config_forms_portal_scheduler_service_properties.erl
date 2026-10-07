-module(openapi_com_adobe_fd_fp_config_forms_portal_scheduler_service_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_fd_fp_config_forms_portal_scheduler_service_properties/0]).

-export([openapi_com_adobe_fd_fp_config_forms_portal_scheduler_service_properties/1]).

-export_type([openapi_com_adobe_fd_fp_config_forms_portal_scheduler_service_properties/0]).

-type openapi_com_adobe_fd_fp_config_forms_portal_scheduler_service_properties() ::
  [ {'formportal_interval', openapi_config_node_property_string:openapi_config_node_property_string() }
  ].


openapi_com_adobe_fd_fp_config_forms_portal_scheduler_service_properties() ->
    openapi_com_adobe_fd_fp_config_forms_portal_scheduler_service_properties([]).

openapi_com_adobe_fd_fp_config_forms_portal_scheduler_service_properties(Fields) ->
  Default = [ {'formportal.interval', openapi_config_node_property_string:openapi_config_node_property_string() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

