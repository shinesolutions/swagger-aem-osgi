-module(openapi_org_apache_sling_engine_impl_auth_sling_authenticator_info).

-include("openapi.hrl").

-export([openapi_org_apache_sling_engine_impl_auth_sling_authenticator_info/0]).

-export([openapi_org_apache_sling_engine_impl_auth_sling_authenticator_info/1]).

-export_type([openapi_org_apache_sling_engine_impl_auth_sling_authenticator_info/0]).

-type openapi_org_apache_sling_engine_impl_auth_sling_authenticator_info() ::
  [ {'pid', binary() }
  | {'title', binary() }
  | {'description', binary() }
  | {'properties', openapi_org_apache_sling_engine_impl_auth_sling_authenticator_properties:openapi_org_apache_sling_engine_impl_auth_sling_authenticator_properties() }
  | {'bundle_location', binary() }
  | {'service_location', binary() }
  ].


openapi_org_apache_sling_engine_impl_auth_sling_authenticator_info() ->
    openapi_org_apache_sling_engine_impl_auth_sling_authenticator_info([]).

openapi_org_apache_sling_engine_impl_auth_sling_authenticator_info(Fields) ->
  Default = [ {'pid', binary() }
            , {'title', binary() }
            , {'description', binary() }
            , {'properties', openapi_org_apache_sling_engine_impl_auth_sling_authenticator_properties:openapi_org_apache_sling_engine_impl_auth_sling_authenticator_properties() }
            , {'bundle_location', binary() }
            , {'service_location', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

