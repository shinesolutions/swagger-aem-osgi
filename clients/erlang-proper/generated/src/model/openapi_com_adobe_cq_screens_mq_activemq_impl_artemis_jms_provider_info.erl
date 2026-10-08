-module(openapi_com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_info).

-include("openapi.hrl").

-export([openapi_com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_info/0]).

-export([openapi_com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_info/1]).

-export_type([openapi_com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_info/0]).

-type openapi_com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_info() ::
  [ {'pid', binary() }
  | {'title', binary() }
  | {'description', binary() }
  | {'properties', openapi_com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties:openapi_com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties() }
  ].


openapi_com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_info() ->
    openapi_com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_info([]).

openapi_com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_info(Fields) ->
  Default = [ {'pid', binary() }
            , {'title', binary() }
            , {'description', binary() }
            , {'properties', openapi_com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties:openapi_com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

