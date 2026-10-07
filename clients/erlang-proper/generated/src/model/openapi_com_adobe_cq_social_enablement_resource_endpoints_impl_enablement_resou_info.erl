-module(openapi_com_adobe_cq_social_enablement_resource_endpoints_impl_enablement_resou_info).

-include("openapi.hrl").

-export([openapi_com_adobe_cq_social_enablement_resource_endpoints_impl_enablement_resou_info/0]).

-export([openapi_com_adobe_cq_social_enablement_resource_endpoints_impl_enablement_resou_info/1]).

-export_type([openapi_com_adobe_cq_social_enablement_resource_endpoints_impl_enablement_resou_info/0]).

-type openapi_com_adobe_cq_social_enablement_resource_endpoints_impl_enablement_resou_info() ::
  [ {'pid', binary() }
  | {'title', binary() }
  | {'description', binary() }
  | {'properties', openapi_com_adobe_cq_social_enablement_resource_endpoints_impl_enablement_resou_properties:openapi_com_adobe_cq_social_enablement_resource_endpoints_impl_enablement_resou_properties() }
  ].


openapi_com_adobe_cq_social_enablement_resource_endpoints_impl_enablement_resou_info() ->
    openapi_com_adobe_cq_social_enablement_resource_endpoints_impl_enablement_resou_info([]).

openapi_com_adobe_cq_social_enablement_resource_endpoints_impl_enablement_resou_info(Fields) ->
  Default = [ {'pid', binary() }
            , {'title', binary() }
            , {'description', binary() }
            , {'properties', openapi_com_adobe_cq_social_enablement_resource_endpoints_impl_enablement_resou_properties:openapi_com_adobe_cq_social_enablement_resource_endpoints_impl_enablement_resou_properties() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

