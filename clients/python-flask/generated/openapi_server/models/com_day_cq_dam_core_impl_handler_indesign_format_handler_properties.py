# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model_ import Model
from openapi_server.models.config_node_property_array import ConfigNodePropertyArray  # noqa: F401,E501
from openapi_server import util


class ComDayCqDamCoreImplHandlerIndesignFormatHandlerProperties(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, mimetype: ConfigNodePropertyArray=None):  # noqa: E501
        """ComDayCqDamCoreImplHandlerIndesignFormatHandlerProperties - a model defined in OpenAPI

        :param mimetype: The mimetype of this ComDayCqDamCoreImplHandlerIndesignFormatHandlerProperties.  # noqa: E501
        :type mimetype: ConfigNodePropertyArray
        """
        self.openapi_types = {
            'mimetype': ConfigNodePropertyArray
        }

        self.attribute_map = {
            'mimetype': 'mimetype'
        }

        self._mimetype = mimetype

    @classmethod
    def from_dict(cls, dikt) -> 'ComDayCqDamCoreImplHandlerIndesignFormatHandlerProperties':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The comDayCqDamCoreImplHandlerIndesignFormatHandlerProperties of this ComDayCqDamCoreImplHandlerIndesignFormatHandlerProperties.  # noqa: E501
        :rtype: ComDayCqDamCoreImplHandlerIndesignFormatHandlerProperties
        """
        return util.deserialize_model(dikt, cls)

    @property
    def mimetype(self) -> ConfigNodePropertyArray:
        """Gets the mimetype of this ComDayCqDamCoreImplHandlerIndesignFormatHandlerProperties.


        :return: The mimetype of this ComDayCqDamCoreImplHandlerIndesignFormatHandlerProperties.
        :rtype: ConfigNodePropertyArray
        """
        return self._mimetype

    @mimetype.setter
    def mimetype(self, mimetype: ConfigNodePropertyArray):
        """Sets the mimetype of this ComDayCqDamCoreImplHandlerIndesignFormatHandlerProperties.


        :param mimetype: The mimetype of this ComDayCqDamCoreImplHandlerIndesignFormatHandlerProperties.
        :type mimetype: ConfigNodePropertyArray
        """

        self._mimetype = mimetype