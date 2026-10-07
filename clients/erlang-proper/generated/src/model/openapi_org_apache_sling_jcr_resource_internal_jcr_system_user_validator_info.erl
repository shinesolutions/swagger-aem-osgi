-module(openapi_org_apache_sling_jcr_resource_internal_jcr_system_user_validator_info).

-include("openapi.hrl").

-export([openapi_org_apache_sling_jcr_resource_internal_jcr_system_user_validator_info/0]).

-export([openapi_org_apache_sling_jcr_resource_internal_jcr_system_user_validator_info/1]).

-export_type([openapi_org_apache_sling_jcr_resource_internal_jcr_system_user_validator_info/0]).

-type openapi_org_apache_sling_jcr_resource_internal_jcr_system_user_validator_info() ::
  [ {'pid', binary() }
  | {'title', binary() }
  | {'description', binary() }
  | {'properties', openapi_org_apache_sling_jcr_resource_internal_jcr_system_user_validator_properties:openapi_org_apache_sling_jcr_resource_internal_jcr_system_user_validator_properties() }
  ].


openapi_org_apache_sling_jcr_resource_internal_jcr_system_user_validator_info() ->
    openapi_org_apache_sling_jcr_resource_internal_jcr_system_user_validator_info([]).

openapi_org_apache_sling_jcr_resource_internal_jcr_system_user_validator_info(Fields) ->
  Default = [ {'pid', binary() }
            , {'title', binary() }
            , {'description', binary() }
            , {'properties', openapi_org_apache_sling_jcr_resource_internal_jcr_system_user_validator_properties:openapi_org_apache_sling_jcr_resource_internal_jcr_system_user_validator_properties() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

