-module(openapi_org_apache_sling_caconfig_impl_override_osgi_configuration_override_provi_info).

-include("openapi.hrl").

-export([openapi_org_apache_sling_caconfig_impl_override_osgi_configuration_override_provi_info/0]).

-export([openapi_org_apache_sling_caconfig_impl_override_osgi_configuration_override_provi_info/1]).

-export_type([openapi_org_apache_sling_caconfig_impl_override_osgi_configuration_override_provi_info/0]).

-type openapi_org_apache_sling_caconfig_impl_override_osgi_configuration_override_provi_info() ::
  [ {'pid', binary() }
  | {'title', binary() }
  | {'description', binary() }
  | {'properties', openapi_org_apache_sling_caconfig_impl_override_osgi_configuration_override_provi_properties:openapi_org_apache_sling_caconfig_impl_override_osgi_configuration_override_provi_properties() }
  ].


openapi_org_apache_sling_caconfig_impl_override_osgi_configuration_override_provi_info() ->
    openapi_org_apache_sling_caconfig_impl_override_osgi_configuration_override_provi_info([]).

openapi_org_apache_sling_caconfig_impl_override_osgi_configuration_override_provi_info(Fields) ->
  Default = [ {'pid', binary() }
            , {'title', binary() }
            , {'description', binary() }
            , {'properties', openapi_org_apache_sling_caconfig_impl_override_osgi_configuration_override_provi_properties:openapi_org_apache_sling_caconfig_impl_override_osgi_configuration_override_provi_properties() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

