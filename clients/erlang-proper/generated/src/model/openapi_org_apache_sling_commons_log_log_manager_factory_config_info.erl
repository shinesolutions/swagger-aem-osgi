-module(openapi_org_apache_sling_commons_log_log_manager_factory_config_info).

-include("openapi.hrl").

-export([openapi_org_apache_sling_commons_log_log_manager_factory_config_info/0]).

-export([openapi_org_apache_sling_commons_log_log_manager_factory_config_info/1]).

-export_type([openapi_org_apache_sling_commons_log_log_manager_factory_config_info/0]).

-type openapi_org_apache_sling_commons_log_log_manager_factory_config_info() ::
  [ {'pid', binary() }
  | {'title', binary() }
  | {'description', binary() }
  | {'properties', openapi_org_apache_sling_commons_log_log_manager_factory_config_properties:openapi_org_apache_sling_commons_log_log_manager_factory_config_properties() }
  ].


openapi_org_apache_sling_commons_log_log_manager_factory_config_info() ->
    openapi_org_apache_sling_commons_log_log_manager_factory_config_info([]).

openapi_org_apache_sling_commons_log_log_manager_factory_config_info(Fields) ->
  Default = [ {'pid', binary() }
            , {'title', binary() }
            , {'description', binary() }
            , {'properties', openapi_org_apache_sling_commons_log_log_manager_factory_config_properties:openapi_org_apache_sling_commons_log_log_manager_factory_config_properties() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

