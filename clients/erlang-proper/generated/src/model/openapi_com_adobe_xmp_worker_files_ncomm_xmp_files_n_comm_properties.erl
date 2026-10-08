-module(openapi_com_adobe_xmp_worker_files_ncomm_xmp_files_n_comm_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_xmp_worker_files_ncomm_xmp_files_n_comm_properties/0]).

-export([openapi_com_adobe_xmp_worker_files_ncomm_xmp_files_n_comm_properties/1]).

-export_type([openapi_com_adobe_xmp_worker_files_ncomm_xmp_files_n_comm_properties/0]).

-type openapi_com_adobe_xmp_worker_files_ncomm_xmp_files_n_comm_properties() ::
  [ {'maxConnections', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'maxRequests', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'requestTimeout', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'logDir', openapi_config_node_property_string:openapi_config_node_property_string() }
  ].


openapi_com_adobe_xmp_worker_files_ncomm_xmp_files_n_comm_properties() ->
    openapi_com_adobe_xmp_worker_files_ncomm_xmp_files_n_comm_properties([]).

openapi_com_adobe_xmp_worker_files_ncomm_xmp_files_n_comm_properties(Fields) ->
  Default = [ {'maxConnections', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'maxRequests', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'requestTimeout', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'logDir', openapi_config_node_property_string:openapi_config_node_property_string() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

