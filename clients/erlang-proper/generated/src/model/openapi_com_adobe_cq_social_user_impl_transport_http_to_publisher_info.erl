-module(openapi_com_adobe_cq_social_user_impl_transport_http_to_publisher_info).

-include("openapi.hrl").

-export([openapi_com_adobe_cq_social_user_impl_transport_http_to_publisher_info/0]).

-export([openapi_com_adobe_cq_social_user_impl_transport_http_to_publisher_info/1]).

-export_type([openapi_com_adobe_cq_social_user_impl_transport_http_to_publisher_info/0]).

-type openapi_com_adobe_cq_social_user_impl_transport_http_to_publisher_info() ::
  [ {'pid', binary() }
  | {'title', binary() }
  | {'description', binary() }
  | {'properties', openapi_com_adobe_cq_social_user_impl_transport_http_to_publisher_properties:openapi_com_adobe_cq_social_user_impl_transport_http_to_publisher_properties() }
  ].


openapi_com_adobe_cq_social_user_impl_transport_http_to_publisher_info() ->
    openapi_com_adobe_cq_social_user_impl_transport_http_to_publisher_info([]).

openapi_com_adobe_cq_social_user_impl_transport_http_to_publisher_info(Fields) ->
  Default = [ {'pid', binary() }
            , {'title', binary() }
            , {'description', binary() }
            , {'properties', openapi_com_adobe_cq_social_user_impl_transport_http_to_publisher_properties:openapi_com_adobe_cq_social_user_impl_transport_http_to_publisher_properties() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

