-module(openapi_com_adobe_cq_social_translation_impl_ugc_language_detector_info).

-include("openapi.hrl").

-export([openapi_com_adobe_cq_social_translation_impl_ugc_language_detector_info/0]).

-export([openapi_com_adobe_cq_social_translation_impl_ugc_language_detector_info/1]).

-export_type([openapi_com_adobe_cq_social_translation_impl_ugc_language_detector_info/0]).

-type openapi_com_adobe_cq_social_translation_impl_ugc_language_detector_info() ::
  [ {'pid', binary() }
  | {'title', binary() }
  | {'description', binary() }
  | {'properties', openapi_com_adobe_cq_social_translation_impl_ugc_language_detector_properties:openapi_com_adobe_cq_social_translation_impl_ugc_language_detector_properties() }
  ].


openapi_com_adobe_cq_social_translation_impl_ugc_language_detector_info() ->
    openapi_com_adobe_cq_social_translation_impl_ugc_language_detector_info([]).

openapi_com_adobe_cq_social_translation_impl_ugc_language_detector_info(Fields) ->
  Default = [ {'pid', binary() }
            , {'title', binary() }
            , {'description', binary() }
            , {'properties', openapi_com_adobe_cq_social_translation_impl_ugc_language_detector_properties:openapi_com_adobe_cq_social_translation_impl_ugc_language_detector_properties() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

