# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model_ import Model
from openapi_server.models.config_node_property_boolean import ConfigNodePropertyBoolean  # noqa: F401,E501
from openapi_server import util


class ComAdobeGraniteOffloadingImplOffloadingJobClonerProperties(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, offloading_jobcloner_enabled: ConfigNodePropertyBoolean=None):  # noqa: E501
        """ComAdobeGraniteOffloadingImplOffloadingJobClonerProperties - a model defined in OpenAPI

        :param offloading_jobcloner_enabled: The offloading_jobcloner_enabled of this ComAdobeGraniteOffloadingImplOffloadingJobClonerProperties.  # noqa: E501
        :type offloading_jobcloner_enabled: ConfigNodePropertyBoolean
        """
        self.openapi_types = {
            'offloading_jobcloner_enabled': ConfigNodePropertyBoolean
        }

        self.attribute_map = {
            'offloading_jobcloner_enabled': 'offloading.jobcloner.enabled'
        }

        self._offloading_jobcloner_enabled = offloading_jobcloner_enabled

    @classmethod
    def from_dict(cls, dikt) -> 'ComAdobeGraniteOffloadingImplOffloadingJobClonerProperties':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The comAdobeGraniteOffloadingImplOffloadingJobClonerProperties of this ComAdobeGraniteOffloadingImplOffloadingJobClonerProperties.  # noqa: E501
        :rtype: ComAdobeGraniteOffloadingImplOffloadingJobClonerProperties
        """
        return util.deserialize_model(dikt, cls)

    @property
    def offloading_jobcloner_enabled(self) -> ConfigNodePropertyBoolean:
        """Gets the offloading_jobcloner_enabled of this ComAdobeGraniteOffloadingImplOffloadingJobClonerProperties.


        :return: The offloading_jobcloner_enabled of this ComAdobeGraniteOffloadingImplOffloadingJobClonerProperties.
        :rtype: ConfigNodePropertyBoolean
        """
        return self._offloading_jobcloner_enabled

    @offloading_jobcloner_enabled.setter
    def offloading_jobcloner_enabled(self, offloading_jobcloner_enabled: ConfigNodePropertyBoolean):
        """Sets the offloading_jobcloner_enabled of this ComAdobeGraniteOffloadingImplOffloadingJobClonerProperties.


        :param offloading_jobcloner_enabled: The offloading_jobcloner_enabled of this ComAdobeGraniteOffloadingImplOffloadingJobClonerProperties.
        :type offloading_jobcloner_enabled: ConfigNodePropertyBoolean
        """

        self._offloading_jobcloner_enabled = offloading_jobcloner_enabled