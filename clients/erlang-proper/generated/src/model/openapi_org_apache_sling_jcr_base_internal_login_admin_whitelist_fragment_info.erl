-module(openapi_org_apache_sling_jcr_base_internal_login_admin_whitelist_fragment_info).

-include("openapi.hrl").

-export([openapi_org_apache_sling_jcr_base_internal_login_admin_whitelist_fragment_info/0]).

-export([openapi_org_apache_sling_jcr_base_internal_login_admin_whitelist_fragment_info/1]).

-export_type([openapi_org_apache_sling_jcr_base_internal_login_admin_whitelist_fragment_info/0]).

-type openapi_org_apache_sling_jcr_base_internal_login_admin_whitelist_fragment_info() ::
  [ {'pid', binary() }
  | {'title', binary() }
  | {'description', binary() }
  | {'properties', openapi_org_apache_sling_jcr_base_internal_login_admin_whitelist_fragment_properties:openapi_org_apache_sling_jcr_base_internal_login_admin_whitelist_fragment_properties() }
  ].


openapi_org_apache_sling_jcr_base_internal_login_admin_whitelist_fragment_info() ->
    openapi_org_apache_sling_jcr_base_internal_login_admin_whitelist_fragment_info([]).

openapi_org_apache_sling_jcr_base_internal_login_admin_whitelist_fragment_info(Fields) ->
  Default = [ {'pid', binary() }
            , {'title', binary() }
            , {'description', binary() }
            , {'properties', openapi_org_apache_sling_jcr_base_internal_login_admin_whitelist_fragment_properties:openapi_org_apache_sling_jcr_base_internal_login_admin_whitelist_fragment_properties() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

