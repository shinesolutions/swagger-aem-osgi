-module(openapi_com_adobe_granite_replication_hc_impl_replication_transport_users_health_c_info).

-include("openapi.hrl").

-export([openapi_com_adobe_granite_replication_hc_impl_replication_transport_users_health_c_info/0]).

-export([openapi_com_adobe_granite_replication_hc_impl_replication_transport_users_health_c_info/1]).

-export_type([openapi_com_adobe_granite_replication_hc_impl_replication_transport_users_health_c_info/0]).

-type openapi_com_adobe_granite_replication_hc_impl_replication_transport_users_health_c_info() ::
  [ {'pid', binary() }
  | {'title', binary() }
  | {'description', binary() }
  | {'properties', openapi_com_adobe_granite_replication_hc_impl_replication_transport_users_health_c_properties:openapi_com_adobe_granite_replication_hc_impl_replication_transport_users_health_c_properties() }
  ].


openapi_com_adobe_granite_replication_hc_impl_replication_transport_users_health_c_info() ->
    openapi_com_adobe_granite_replication_hc_impl_replication_transport_users_health_c_info([]).

openapi_com_adobe_granite_replication_hc_impl_replication_transport_users_health_c_info(Fields) ->
  Default = [ {'pid', binary() }
            , {'title', binary() }
            , {'description', binary() }
            , {'properties', openapi_com_adobe_granite_replication_hc_impl_replication_transport_users_health_c_properties:openapi_com_adobe_granite_replication_hc_impl_replication_transport_users_health_c_properties() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

