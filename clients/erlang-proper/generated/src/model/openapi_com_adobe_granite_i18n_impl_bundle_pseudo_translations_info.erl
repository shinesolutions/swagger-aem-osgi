-module(openapi_com_adobe_granite_i18n_impl_bundle_pseudo_translations_info).

-include("openapi.hrl").

-export([openapi_com_adobe_granite_i18n_impl_bundle_pseudo_translations_info/0]).

-export([openapi_com_adobe_granite_i18n_impl_bundle_pseudo_translations_info/1]).

-export_type([openapi_com_adobe_granite_i18n_impl_bundle_pseudo_translations_info/0]).

-type openapi_com_adobe_granite_i18n_impl_bundle_pseudo_translations_info() ::
  [ {'pid', binary() }
  | {'title', binary() }
  | {'description', binary() }
  | {'properties', openapi_com_adobe_granite_i18n_impl_bundle_pseudo_translations_properties:openapi_com_adobe_granite_i18n_impl_bundle_pseudo_translations_properties() }
  ].


openapi_com_adobe_granite_i18n_impl_bundle_pseudo_translations_info() ->
    openapi_com_adobe_granite_i18n_impl_bundle_pseudo_translations_info([]).

openapi_com_adobe_granite_i18n_impl_bundle_pseudo_translations_info(Fields) ->
  Default = [ {'pid', binary() }
            , {'title', binary() }
            , {'description', binary() }
            , {'properties', openapi_com_adobe_granite_i18n_impl_bundle_pseudo_translations_properties:openapi_com_adobe_granite_i18n_impl_bundle_pseudo_translations_properties() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

