-module(openapi_org_apache_sling_caconfig_impl_override_system_property_configuration_ove_info).

-include("openapi.hrl").

-export([openapi_org_apache_sling_caconfig_impl_override_system_property_configuration_ove_info/0]).

-export([openapi_org_apache_sling_caconfig_impl_override_system_property_configuration_ove_info/1]).

-export_type([openapi_org_apache_sling_caconfig_impl_override_system_property_configuration_ove_info/0]).

-type openapi_org_apache_sling_caconfig_impl_override_system_property_configuration_ove_info() ::
  [ {'pid', binary() }
  | {'title', binary() }
  | {'description', binary() }
  | {'properties', openapi_org_apache_sling_caconfig_impl_override_system_property_configuration_ove_properties:openapi_org_apache_sling_caconfig_impl_override_system_property_configuration_ove_properties() }
  ].


openapi_org_apache_sling_caconfig_impl_override_system_property_configuration_ove_info() ->
    openapi_org_apache_sling_caconfig_impl_override_system_property_configuration_ove_info([]).

openapi_org_apache_sling_caconfig_impl_override_system_property_configuration_ove_info(Fields) ->
  Default = [ {'pid', binary() }
            , {'title', binary() }
            , {'description', binary() }
            , {'properties', openapi_org_apache_sling_caconfig_impl_override_system_property_configuration_ove_properties:openapi_org_apache_sling_caconfig_impl_override_system_property_configuration_ove_properties() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

