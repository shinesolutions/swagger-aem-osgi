-module(openapi_com_adobe_cq_social_site_endpoints_impl_site_operation_service_info).

-include("openapi.hrl").

-export([openapi_com_adobe_cq_social_site_endpoints_impl_site_operation_service_info/0]).

-export([openapi_com_adobe_cq_social_site_endpoints_impl_site_operation_service_info/1]).

-export_type([openapi_com_adobe_cq_social_site_endpoints_impl_site_operation_service_info/0]).

-type openapi_com_adobe_cq_social_site_endpoints_impl_site_operation_service_info() ::
  [ {'pid', binary() }
  | {'title', binary() }
  | {'description', binary() }
  | {'properties', openapi_com_adobe_cq_social_site_endpoints_impl_site_operation_service_properties:openapi_com_adobe_cq_social_site_endpoints_impl_site_operation_service_properties() }
  ].


openapi_com_adobe_cq_social_site_endpoints_impl_site_operation_service_info() ->
    openapi_com_adobe_cq_social_site_endpoints_impl_site_operation_service_info([]).

openapi_com_adobe_cq_social_site_endpoints_impl_site_operation_service_info(Fields) ->
  Default = [ {'pid', binary() }
            , {'title', binary() }
            , {'description', binary() }
            , {'properties', openapi_com_adobe_cq_social_site_endpoints_impl_site_operation_service_properties:openapi_com_adobe_cq_social_site_endpoints_impl_site_operation_service_properties() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

