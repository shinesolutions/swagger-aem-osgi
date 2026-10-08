-module(openapi_com_adobe_cq_cloudconfig_core_impl_configuration_replication_event_handle_info).

-include("openapi.hrl").

-export([openapi_com_adobe_cq_cloudconfig_core_impl_configuration_replication_event_handle_info/0]).

-export([openapi_com_adobe_cq_cloudconfig_core_impl_configuration_replication_event_handle_info/1]).

-export_type([openapi_com_adobe_cq_cloudconfig_core_impl_configuration_replication_event_handle_info/0]).

-type openapi_com_adobe_cq_cloudconfig_core_impl_configuration_replication_event_handle_info() ::
  [ {'pid', binary() }
  | {'title', binary() }
  | {'description', binary() }
  | {'properties', openapi_com_adobe_cq_cloudconfig_core_impl_configuration_replication_event_handle_properties:openapi_com_adobe_cq_cloudconfig_core_impl_configuration_replication_event_handle_properties() }
  ].


openapi_com_adobe_cq_cloudconfig_core_impl_configuration_replication_event_handle_info() ->
    openapi_com_adobe_cq_cloudconfig_core_impl_configuration_replication_event_handle_info([]).

openapi_com_adobe_cq_cloudconfig_core_impl_configuration_replication_event_handle_info(Fields) ->
  Default = [ {'pid', binary() }
            , {'title', binary() }
            , {'description', binary() }
            , {'properties', openapi_com_adobe_cq_cloudconfig_core_impl_configuration_replication_event_handle_properties:openapi_com_adobe_cq_cloudconfig_core_impl_configuration_replication_event_handle_properties() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

