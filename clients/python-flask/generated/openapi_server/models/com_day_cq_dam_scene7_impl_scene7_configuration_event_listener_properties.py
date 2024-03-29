# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model_ import Model
from openapi_server.models.config_node_property_boolean import ConfigNodePropertyBoolean  # noqa: F401,E501
from openapi_server import util


class ComDayCqDamScene7ImplScene7ConfigurationEventListenerProperties(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, cq_dam_scene7_configurationeventlistener_enabled: ConfigNodePropertyBoolean=None):  # noqa: E501
        """ComDayCqDamScene7ImplScene7ConfigurationEventListenerProperties - a model defined in OpenAPI

        :param cq_dam_scene7_configurationeventlistener_enabled: The cq_dam_scene7_configurationeventlistener_enabled of this ComDayCqDamScene7ImplScene7ConfigurationEventListenerProperties.  # noqa: E501
        :type cq_dam_scene7_configurationeventlistener_enabled: ConfigNodePropertyBoolean
        """
        self.openapi_types = {
            'cq_dam_scene7_configurationeventlistener_enabled': ConfigNodePropertyBoolean
        }

        self.attribute_map = {
            'cq_dam_scene7_configurationeventlistener_enabled': 'cq.dam.scene7.configurationeventlistener.enabled'
        }

        self._cq_dam_scene7_configurationeventlistener_enabled = cq_dam_scene7_configurationeventlistener_enabled

    @classmethod
    def from_dict(cls, dikt) -> 'ComDayCqDamScene7ImplScene7ConfigurationEventListenerProperties':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The comDayCqDamScene7ImplScene7ConfigurationEventListenerProperties of this ComDayCqDamScene7ImplScene7ConfigurationEventListenerProperties.  # noqa: E501
        :rtype: ComDayCqDamScene7ImplScene7ConfigurationEventListenerProperties
        """
        return util.deserialize_model(dikt, cls)

    @property
    def cq_dam_scene7_configurationeventlistener_enabled(self) -> ConfigNodePropertyBoolean:
        """Gets the cq_dam_scene7_configurationeventlistener_enabled of this ComDayCqDamScene7ImplScene7ConfigurationEventListenerProperties.


        :return: The cq_dam_scene7_configurationeventlistener_enabled of this ComDayCqDamScene7ImplScene7ConfigurationEventListenerProperties.
        :rtype: ConfigNodePropertyBoolean
        """
        return self._cq_dam_scene7_configurationeventlistener_enabled

    @cq_dam_scene7_configurationeventlistener_enabled.setter
    def cq_dam_scene7_configurationeventlistener_enabled(self, cq_dam_scene7_configurationeventlistener_enabled: ConfigNodePropertyBoolean):
        """Sets the cq_dam_scene7_configurationeventlistener_enabled of this ComDayCqDamScene7ImplScene7ConfigurationEventListenerProperties.


        :param cq_dam_scene7_configurationeventlistener_enabled: The cq_dam_scene7_configurationeventlistener_enabled of this ComDayCqDamScene7ImplScene7ConfigurationEventListenerProperties.
        :type cq_dam_scene7_configurationeventlistener_enabled: ConfigNodePropertyBoolean
        """

        self._cq_dam_scene7_configurationeventlistener_enabled = cq_dam_scene7_configurationeventlistener_enabled
