-module(openapi_com_adobe_aem_upgrade_prechecks_hc_impl_deprecate_indexes_hc_info).

-include("openapi.hrl").

-export([openapi_com_adobe_aem_upgrade_prechecks_hc_impl_deprecate_indexes_hc_info/0]).

-export([openapi_com_adobe_aem_upgrade_prechecks_hc_impl_deprecate_indexes_hc_info/1]).

-export_type([openapi_com_adobe_aem_upgrade_prechecks_hc_impl_deprecate_indexes_hc_info/0]).

-type openapi_com_adobe_aem_upgrade_prechecks_hc_impl_deprecate_indexes_hc_info() ::
  [ {'pid', binary() }
  | {'title', binary() }
  | {'description', binary() }
  | {'properties', openapi_com_adobe_aem_upgrade_prechecks_hc_impl_deprecate_indexes_hc_properties:openapi_com_adobe_aem_upgrade_prechecks_hc_impl_deprecate_indexes_hc_properties() }
  ].


openapi_com_adobe_aem_upgrade_prechecks_hc_impl_deprecate_indexes_hc_info() ->
    openapi_com_adobe_aem_upgrade_prechecks_hc_impl_deprecate_indexes_hc_info([]).

openapi_com_adobe_aem_upgrade_prechecks_hc_impl_deprecate_indexes_hc_info(Fields) ->
  Default = [ {'pid', binary() }
            , {'title', binary() }
            , {'description', binary() }
            , {'properties', openapi_com_adobe_aem_upgrade_prechecks_hc_impl_deprecate_indexes_hc_properties:openapi_com_adobe_aem_upgrade_prechecks_hc_impl_deprecate_indexes_hc_properties() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

