# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model_ import Model
from openapi_server.models.config_node_property_array import ConfigNodePropertyArray  # noqa: F401,E501
from openapi_server.models.config_node_property_boolean import ConfigNodePropertyBoolean  # noqa: F401,E501
from openapi_server import util


class ComDayCqDamCoreImplServletDamContentDispositionFilterProperties(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, cq_mime_type_blacklist: ConfigNodePropertyArray=None, cq_dam_empty_mime: ConfigNodePropertyBoolean=None):  # noqa: E501
        """ComDayCqDamCoreImplServletDamContentDispositionFilterProperties - a model defined in OpenAPI

        :param cq_mime_type_blacklist: The cq_mime_type_blacklist of this ComDayCqDamCoreImplServletDamContentDispositionFilterProperties.  # noqa: E501
        :type cq_mime_type_blacklist: ConfigNodePropertyArray
        :param cq_dam_empty_mime: The cq_dam_empty_mime of this ComDayCqDamCoreImplServletDamContentDispositionFilterProperties.  # noqa: E501
        :type cq_dam_empty_mime: ConfigNodePropertyBoolean
        """
        self.openapi_types = {
            'cq_mime_type_blacklist': ConfigNodePropertyArray,
            'cq_dam_empty_mime': ConfigNodePropertyBoolean
        }

        self.attribute_map = {
            'cq_mime_type_blacklist': 'cq.mime.type.blacklist',
            'cq_dam_empty_mime': 'cq.dam.empty.mime'
        }

        self._cq_mime_type_blacklist = cq_mime_type_blacklist
        self._cq_dam_empty_mime = cq_dam_empty_mime

    @classmethod
    def from_dict(cls, dikt) -> 'ComDayCqDamCoreImplServletDamContentDispositionFilterProperties':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The comDayCqDamCoreImplServletDamContentDispositionFilterProperties of this ComDayCqDamCoreImplServletDamContentDispositionFilterProperties.  # noqa: E501
        :rtype: ComDayCqDamCoreImplServletDamContentDispositionFilterProperties
        """
        return util.deserialize_model(dikt, cls)

    @property
    def cq_mime_type_blacklist(self) -> ConfigNodePropertyArray:
        """Gets the cq_mime_type_blacklist of this ComDayCqDamCoreImplServletDamContentDispositionFilterProperties.


        :return: The cq_mime_type_blacklist of this ComDayCqDamCoreImplServletDamContentDispositionFilterProperties.
        :rtype: ConfigNodePropertyArray
        """
        return self._cq_mime_type_blacklist

    @cq_mime_type_blacklist.setter
    def cq_mime_type_blacklist(self, cq_mime_type_blacklist: ConfigNodePropertyArray):
        """Sets the cq_mime_type_blacklist of this ComDayCqDamCoreImplServletDamContentDispositionFilterProperties.


        :param cq_mime_type_blacklist: The cq_mime_type_blacklist of this ComDayCqDamCoreImplServletDamContentDispositionFilterProperties.
        :type cq_mime_type_blacklist: ConfigNodePropertyArray
        """

        self._cq_mime_type_blacklist = cq_mime_type_blacklist

    @property
    def cq_dam_empty_mime(self) -> ConfigNodePropertyBoolean:
        """Gets the cq_dam_empty_mime of this ComDayCqDamCoreImplServletDamContentDispositionFilterProperties.


        :return: The cq_dam_empty_mime of this ComDayCqDamCoreImplServletDamContentDispositionFilterProperties.
        :rtype: ConfigNodePropertyBoolean
        """
        return self._cq_dam_empty_mime

    @cq_dam_empty_mime.setter
    def cq_dam_empty_mime(self, cq_dam_empty_mime: ConfigNodePropertyBoolean):
        """Sets the cq_dam_empty_mime of this ComDayCqDamCoreImplServletDamContentDispositionFilterProperties.


        :param cq_dam_empty_mime: The cq_dam_empty_mime of this ComDayCqDamCoreImplServletDamContentDispositionFilterProperties.
        :type cq_dam_empty_mime: ConfigNodePropertyBoolean
        """

        self._cq_dam_empty_mime = cq_dam_empty_mime