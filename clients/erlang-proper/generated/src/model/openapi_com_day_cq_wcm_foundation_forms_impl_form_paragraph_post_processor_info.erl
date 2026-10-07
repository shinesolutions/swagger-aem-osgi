-module(openapi_com_day_cq_wcm_foundation_forms_impl_form_paragraph_post_processor_info).

-include("openapi.hrl").

-export([openapi_com_day_cq_wcm_foundation_forms_impl_form_paragraph_post_processor_info/0]).

-export([openapi_com_day_cq_wcm_foundation_forms_impl_form_paragraph_post_processor_info/1]).

-export_type([openapi_com_day_cq_wcm_foundation_forms_impl_form_paragraph_post_processor_info/0]).

-type openapi_com_day_cq_wcm_foundation_forms_impl_form_paragraph_post_processor_info() ::
  [ {'pid', binary() }
  | {'title', binary() }
  | {'description', binary() }
  | {'properties', openapi_com_day_cq_wcm_foundation_forms_impl_form_paragraph_post_processor_properties:openapi_com_day_cq_wcm_foundation_forms_impl_form_paragraph_post_processor_properties() }
  ].


openapi_com_day_cq_wcm_foundation_forms_impl_form_paragraph_post_processor_info() ->
    openapi_com_day_cq_wcm_foundation_forms_impl_form_paragraph_post_processor_info([]).

openapi_com_day_cq_wcm_foundation_forms_impl_form_paragraph_post_processor_info(Fields) ->
  Default = [ {'pid', binary() }
            , {'title', binary() }
            , {'description', binary() }
            , {'properties', openapi_com_day_cq_wcm_foundation_forms_impl_form_paragraph_post_processor_properties:openapi_com_day_cq_wcm_foundation_forms_impl_form_paragraph_post_processor_properties() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

