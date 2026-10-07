-module(openapi_org_apache_sling_distribution_transport_impl_user_credentials_distributi_info).

-include("openapi.hrl").

-export([openapi_org_apache_sling_distribution_transport_impl_user_credentials_distributi_info/0]).

-export([openapi_org_apache_sling_distribution_transport_impl_user_credentials_distributi_info/1]).

-export_type([openapi_org_apache_sling_distribution_transport_impl_user_credentials_distributi_info/0]).

-type openapi_org_apache_sling_distribution_transport_impl_user_credentials_distributi_info() ::
  [ {'pid', binary() }
  | {'title', binary() }
  | {'description', binary() }
  | {'properties', openapi_org_apache_sling_distribution_transport_impl_user_credentials_distributi_properties:openapi_org_apache_sling_distribution_transport_impl_user_credentials_distributi_properties() }
  ].


openapi_org_apache_sling_distribution_transport_impl_user_credentials_distributi_info() ->
    openapi_org_apache_sling_distribution_transport_impl_user_credentials_distributi_info([]).

openapi_org_apache_sling_distribution_transport_impl_user_credentials_distributi_info(Fields) ->
  Default = [ {'pid', binary() }
            , {'title', binary() }
            , {'description', binary() }
            , {'properties', openapi_org_apache_sling_distribution_transport_impl_user_credentials_distributi_properties:openapi_org_apache_sling_distribution_transport_impl_user_credentials_distributi_properties() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

