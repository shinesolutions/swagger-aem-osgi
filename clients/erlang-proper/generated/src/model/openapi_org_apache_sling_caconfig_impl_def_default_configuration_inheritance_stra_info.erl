-module(openapi_org_apache_sling_caconfig_impl_def_default_configuration_inheritance_stra_info).

-include("openapi.hrl").

-export([openapi_org_apache_sling_caconfig_impl_def_default_configuration_inheritance_stra_info/0]).

-export([openapi_org_apache_sling_caconfig_impl_def_default_configuration_inheritance_stra_info/1]).

-export_type([openapi_org_apache_sling_caconfig_impl_def_default_configuration_inheritance_stra_info/0]).

-type openapi_org_apache_sling_caconfig_impl_def_default_configuration_inheritance_stra_info() ::
  [ {'pid', binary() }
  | {'title', binary() }
  | {'description', binary() }
  | {'properties', openapi_org_apache_sling_caconfig_impl_def_default_configuration_inheritance_stra_properties:openapi_org_apache_sling_caconfig_impl_def_default_configuration_inheritance_stra_properties() }
  ].


openapi_org_apache_sling_caconfig_impl_def_default_configuration_inheritance_stra_info() ->
    openapi_org_apache_sling_caconfig_impl_def_default_configuration_inheritance_stra_info([]).

openapi_org_apache_sling_caconfig_impl_def_default_configuration_inheritance_stra_info(Fields) ->
  Default = [ {'pid', binary() }
            , {'title', binary() }
            , {'description', binary() }
            , {'properties', openapi_org_apache_sling_caconfig_impl_def_default_configuration_inheritance_stra_properties:openapi_org_apache_sling_caconfig_impl_def_default_configuration_inheritance_stra_properties() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

