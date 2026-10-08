-module(openapi_com_adobe_cq_screens_device_registration_impl_registration_service_impl_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_cq_screens_device_registration_impl_registration_service_impl_properties/0]).

-export([openapi_com_adobe_cq_screens_device_registration_impl_registration_service_impl_properties/1]).

-export_type([openapi_com_adobe_cq_screens_device_registration_impl_registration_service_impl_properties/0]).

-type openapi_com_adobe_cq_screens_device_registration_impl_registration_service_impl_properties() ::
  [ {'deviceRegistrationTimeout', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  ].


openapi_com_adobe_cq_screens_device_registration_impl_registration_service_impl_properties() ->
    openapi_com_adobe_cq_screens_device_registration_impl_registration_service_impl_properties([]).

openapi_com_adobe_cq_screens_device_registration_impl_registration_service_impl_properties(Fields) ->
  Default = [ {'deviceRegistrationTimeout', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

