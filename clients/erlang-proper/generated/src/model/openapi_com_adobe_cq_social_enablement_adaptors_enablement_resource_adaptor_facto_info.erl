-module(openapi_com_adobe_cq_social_enablement_adaptors_enablement_resource_adaptor_facto_info).

-include("openapi.hrl").

-export([openapi_com_adobe_cq_social_enablement_adaptors_enablement_resource_adaptor_facto_info/0]).

-export([openapi_com_adobe_cq_social_enablement_adaptors_enablement_resource_adaptor_facto_info/1]).

-export_type([openapi_com_adobe_cq_social_enablement_adaptors_enablement_resource_adaptor_facto_info/0]).

-type openapi_com_adobe_cq_social_enablement_adaptors_enablement_resource_adaptor_facto_info() ::
  [ {'pid', binary() }
  | {'title', binary() }
  | {'description', binary() }
  | {'properties', openapi_com_adobe_cq_social_enablement_adaptors_enablement_resource_adaptor_facto_properties:openapi_com_adobe_cq_social_enablement_adaptors_enablement_resource_adaptor_facto_properties() }
  ].


openapi_com_adobe_cq_social_enablement_adaptors_enablement_resource_adaptor_facto_info() ->
    openapi_com_adobe_cq_social_enablement_adaptors_enablement_resource_adaptor_facto_info([]).

openapi_com_adobe_cq_social_enablement_adaptors_enablement_resource_adaptor_facto_info(Fields) ->
  Default = [ {'pid', binary() }
            , {'title', binary() }
            , {'description', binary() }
            , {'properties', openapi_com_adobe_cq_social_enablement_adaptors_enablement_resource_adaptor_facto_properties:openapi_com_adobe_cq_social_enablement_adaptors_enablement_resource_adaptor_facto_properties() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

