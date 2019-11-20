# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model_ import Model
from openapi_server.models.config_node_property_array import ConfigNodePropertyArray  # noqa: F401,E501
from openapi_server import util


class ComDayCqWcmCoreImplServletsFindReplaceServletProperties(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, scope: ConfigNodePropertyArray=None):  # noqa: E501
        """ComDayCqWcmCoreImplServletsFindReplaceServletProperties - a model defined in OpenAPI

        :param scope: The scope of this ComDayCqWcmCoreImplServletsFindReplaceServletProperties.  # noqa: E501
        :type scope: ConfigNodePropertyArray
        """
        self.openapi_types = {
            'scope': ConfigNodePropertyArray
        }

        self.attribute_map = {
            'scope': 'scope'
        }

        self._scope = scope

    @classmethod
    def from_dict(cls, dikt) -> 'ComDayCqWcmCoreImplServletsFindReplaceServletProperties':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The comDayCqWcmCoreImplServletsFindReplaceServletProperties of this ComDayCqWcmCoreImplServletsFindReplaceServletProperties.  # noqa: E501
        :rtype: ComDayCqWcmCoreImplServletsFindReplaceServletProperties
        """
        return util.deserialize_model(dikt, cls)

    @property
    def scope(self) -> ConfigNodePropertyArray:
        """Gets the scope of this ComDayCqWcmCoreImplServletsFindReplaceServletProperties.


        :return: The scope of this ComDayCqWcmCoreImplServletsFindReplaceServletProperties.
        :rtype: ConfigNodePropertyArray
        """
        return self._scope

    @scope.setter
    def scope(self, scope: ConfigNodePropertyArray):
        """Sets the scope of this ComDayCqWcmCoreImplServletsFindReplaceServletProperties.


        :param scope: The scope of this ComDayCqWcmCoreImplServletsFindReplaceServletProperties.
        :type scope: ConfigNodePropertyArray
        """

        self._scope = scope