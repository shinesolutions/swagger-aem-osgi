-module(openapi_com_adobe_cq_upgrades_cleanup_impl_upgrade_content_cleanup_info).

-include("openapi.hrl").

-export([openapi_com_adobe_cq_upgrades_cleanup_impl_upgrade_content_cleanup_info/0]).

-export([openapi_com_adobe_cq_upgrades_cleanup_impl_upgrade_content_cleanup_info/1]).

-export_type([openapi_com_adobe_cq_upgrades_cleanup_impl_upgrade_content_cleanup_info/0]).

-type openapi_com_adobe_cq_upgrades_cleanup_impl_upgrade_content_cleanup_info() ::
  [ {'pid', binary() }
  | {'title', binary() }
  | {'description', binary() }
  | {'properties', openapi_com_adobe_cq_upgrades_cleanup_impl_upgrade_content_cleanup_properties:openapi_com_adobe_cq_upgrades_cleanup_impl_upgrade_content_cleanup_properties() }
  ].


openapi_com_adobe_cq_upgrades_cleanup_impl_upgrade_content_cleanup_info() ->
    openapi_com_adobe_cq_upgrades_cleanup_impl_upgrade_content_cleanup_info([]).

openapi_com_adobe_cq_upgrades_cleanup_impl_upgrade_content_cleanup_info(Fields) ->
  Default = [ {'pid', binary() }
            , {'title', binary() }
            , {'description', binary() }
            , {'properties', openapi_com_adobe_cq_upgrades_cleanup_impl_upgrade_content_cleanup_properties:openapi_com_adobe_cq_upgrades_cleanup_impl_upgrade_content_cleanup_properties() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

