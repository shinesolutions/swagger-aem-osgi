-module(openapi_org_apache_sling_serviceusermapping_impl_service_user_mapper_impl_amended_info).

-include("openapi.hrl").

-export([openapi_org_apache_sling_serviceusermapping_impl_service_user_mapper_impl_amended_info/0]).

-export([openapi_org_apache_sling_serviceusermapping_impl_service_user_mapper_impl_amended_info/1]).

-export_type([openapi_org_apache_sling_serviceusermapping_impl_service_user_mapper_impl_amended_info/0]).

-type openapi_org_apache_sling_serviceusermapping_impl_service_user_mapper_impl_amended_info() ::
  [ {'pid', binary() }
  | {'title', binary() }
  | {'description', binary() }
  | {'properties', openapi_org_apache_sling_serviceusermapping_impl_service_user_mapper_impl_amended_properties:openapi_org_apache_sling_serviceusermapping_impl_service_user_mapper_impl_amended_properties() }
  ].


openapi_org_apache_sling_serviceusermapping_impl_service_user_mapper_impl_amended_info() ->
    openapi_org_apache_sling_serviceusermapping_impl_service_user_mapper_impl_amended_info([]).

openapi_org_apache_sling_serviceusermapping_impl_service_user_mapper_impl_amended_info(Fields) ->
  Default = [ {'pid', binary() }
            , {'title', binary() }
            , {'description', binary() }
            , {'properties', openapi_org_apache_sling_serviceusermapping_impl_service_user_mapper_impl_amended_properties:openapi_org_apache_sling_serviceusermapping_impl_service_user_mapper_impl_amended_properties() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

