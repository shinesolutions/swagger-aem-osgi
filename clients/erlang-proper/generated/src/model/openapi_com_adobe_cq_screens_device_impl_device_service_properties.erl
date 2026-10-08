-module(openapi_com_adobe_cq_screens_device_impl_device_service_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_cq_screens_device_impl_device_service_properties/0]).

-export([openapi_com_adobe_cq_screens_device_impl_device_service_properties/1]).

-export_type([openapi_com_adobe_cq_screens_device_impl_device_service_properties/0]).

-type openapi_com_adobe_cq_screens_device_impl_device_service_properties() ::
  [ {'com_adobe_aem_screens_player_pingfrequency', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'com_adobe_aem_screens_device_pasword_specialchars', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'com_adobe_aem_screens_device_pasword_minlowercasechars', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'com_adobe_aem_screens_device_pasword_minuppercasechars', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'com_adobe_aem_screens_device_pasword_minnumberchars', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'com_adobe_aem_screens_device_pasword_minspecialchars', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'com_adobe_aem_screens_device_pasword_minlength', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  ].


openapi_com_adobe_cq_screens_device_impl_device_service_properties() ->
    openapi_com_adobe_cq_screens_device_impl_device_service_properties([]).

openapi_com_adobe_cq_screens_device_impl_device_service_properties(Fields) ->
  Default = [ {'com.adobe.aem.screens.player.pingfrequency', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'com.adobe.aem.screens.device.pasword.specialchars', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'com.adobe.aem.screens.device.pasword.minlowercasechars', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'com.adobe.aem.screens.device.pasword.minuppercasechars', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'com.adobe.aem.screens.device.pasword.minnumberchars', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'com.adobe.aem.screens.device.pasword.minspecialchars', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'com.adobe.aem.screens.device.pasword.minlength', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

