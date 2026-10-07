-module(openapi_com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_info).

-include("openapi.hrl").

-export([openapi_com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_info/0]).

-export([openapi_com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_info/1]).

-export_type([openapi_com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_info/0]).

-type openapi_com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_info() ::
  [ {'pid', binary() }
  | {'title', binary() }
  | {'description', binary() }
  | {'properties', openapi_com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties:openapi_com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties() }
  ].


openapi_com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_info() ->
    openapi_com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_info([]).

openapi_com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_info(Fields) ->
  Default = [ {'pid', binary() }
            , {'title', binary() }
            , {'description', binary() }
            , {'properties', openapi_com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties:openapi_com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_properties() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

