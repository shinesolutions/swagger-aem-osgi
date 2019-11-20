# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model_ import Model
from openapi_server.models.config_node_property_array import ConfigNodePropertyArray  # noqa: F401,E501
from openapi_server.models.config_node_property_boolean import ConfigNodePropertyBoolean  # noqa: F401,E501
from openapi_server.models.config_node_property_string import ConfigNodePropertyString  # noqa: F401,E501
from openapi_server import util


class OrgApacheSlingHcCoreImplCompositeHealthCheckProperties(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, hc_name: ConfigNodePropertyString=None, hc_tags: ConfigNodePropertyArray=None, hc_mbean_name: ConfigNodePropertyString=None, filter_tags: ConfigNodePropertyArray=None, filter_combine_tags_with_or: ConfigNodePropertyBoolean=None):  # noqa: E501
        """OrgApacheSlingHcCoreImplCompositeHealthCheckProperties - a model defined in OpenAPI

        :param hc_name: The hc_name of this OrgApacheSlingHcCoreImplCompositeHealthCheckProperties.  # noqa: E501
        :type hc_name: ConfigNodePropertyString
        :param hc_tags: The hc_tags of this OrgApacheSlingHcCoreImplCompositeHealthCheckProperties.  # noqa: E501
        :type hc_tags: ConfigNodePropertyArray
        :param hc_mbean_name: The hc_mbean_name of this OrgApacheSlingHcCoreImplCompositeHealthCheckProperties.  # noqa: E501
        :type hc_mbean_name: ConfigNodePropertyString
        :param filter_tags: The filter_tags of this OrgApacheSlingHcCoreImplCompositeHealthCheckProperties.  # noqa: E501
        :type filter_tags: ConfigNodePropertyArray
        :param filter_combine_tags_with_or: The filter_combine_tags_with_or of this OrgApacheSlingHcCoreImplCompositeHealthCheckProperties.  # noqa: E501
        :type filter_combine_tags_with_or: ConfigNodePropertyBoolean
        """
        self.openapi_types = {
            'hc_name': ConfigNodePropertyString,
            'hc_tags': ConfigNodePropertyArray,
            'hc_mbean_name': ConfigNodePropertyString,
            'filter_tags': ConfigNodePropertyArray,
            'filter_combine_tags_with_or': ConfigNodePropertyBoolean
        }

        self.attribute_map = {
            'hc_name': 'hc.name',
            'hc_tags': 'hc.tags',
            'hc_mbean_name': 'hc.mbean.name',
            'filter_tags': 'filter.tags',
            'filter_combine_tags_with_or': 'filter.combineTagsWithOr'
        }

        self._hc_name = hc_name
        self._hc_tags = hc_tags
        self._hc_mbean_name = hc_mbean_name
        self._filter_tags = filter_tags
        self._filter_combine_tags_with_or = filter_combine_tags_with_or

    @classmethod
    def from_dict(cls, dikt) -> 'OrgApacheSlingHcCoreImplCompositeHealthCheckProperties':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The orgApacheSlingHcCoreImplCompositeHealthCheckProperties of this OrgApacheSlingHcCoreImplCompositeHealthCheckProperties.  # noqa: E501
        :rtype: OrgApacheSlingHcCoreImplCompositeHealthCheckProperties
        """
        return util.deserialize_model(dikt, cls)

    @property
    def hc_name(self) -> ConfigNodePropertyString:
        """Gets the hc_name of this OrgApacheSlingHcCoreImplCompositeHealthCheckProperties.


        :return: The hc_name of this OrgApacheSlingHcCoreImplCompositeHealthCheckProperties.
        :rtype: ConfigNodePropertyString
        """
        return self._hc_name

    @hc_name.setter
    def hc_name(self, hc_name: ConfigNodePropertyString):
        """Sets the hc_name of this OrgApacheSlingHcCoreImplCompositeHealthCheckProperties.


        :param hc_name: The hc_name of this OrgApacheSlingHcCoreImplCompositeHealthCheckProperties.
        :type hc_name: ConfigNodePropertyString
        """

        self._hc_name = hc_name

    @property
    def hc_tags(self) -> ConfigNodePropertyArray:
        """Gets the hc_tags of this OrgApacheSlingHcCoreImplCompositeHealthCheckProperties.


        :return: The hc_tags of this OrgApacheSlingHcCoreImplCompositeHealthCheckProperties.
        :rtype: ConfigNodePropertyArray
        """
        return self._hc_tags

    @hc_tags.setter
    def hc_tags(self, hc_tags: ConfigNodePropertyArray):
        """Sets the hc_tags of this OrgApacheSlingHcCoreImplCompositeHealthCheckProperties.


        :param hc_tags: The hc_tags of this OrgApacheSlingHcCoreImplCompositeHealthCheckProperties.
        :type hc_tags: ConfigNodePropertyArray
        """

        self._hc_tags = hc_tags

    @property
    def hc_mbean_name(self) -> ConfigNodePropertyString:
        """Gets the hc_mbean_name of this OrgApacheSlingHcCoreImplCompositeHealthCheckProperties.


        :return: The hc_mbean_name of this OrgApacheSlingHcCoreImplCompositeHealthCheckProperties.
        :rtype: ConfigNodePropertyString
        """
        return self._hc_mbean_name

    @hc_mbean_name.setter
    def hc_mbean_name(self, hc_mbean_name: ConfigNodePropertyString):
        """Sets the hc_mbean_name of this OrgApacheSlingHcCoreImplCompositeHealthCheckProperties.


        :param hc_mbean_name: The hc_mbean_name of this OrgApacheSlingHcCoreImplCompositeHealthCheckProperties.
        :type hc_mbean_name: ConfigNodePropertyString
        """

        self._hc_mbean_name = hc_mbean_name

    @property
    def filter_tags(self) -> ConfigNodePropertyArray:
        """Gets the filter_tags of this OrgApacheSlingHcCoreImplCompositeHealthCheckProperties.


        :return: The filter_tags of this OrgApacheSlingHcCoreImplCompositeHealthCheckProperties.
        :rtype: ConfigNodePropertyArray
        """
        return self._filter_tags

    @filter_tags.setter
    def filter_tags(self, filter_tags: ConfigNodePropertyArray):
        """Sets the filter_tags of this OrgApacheSlingHcCoreImplCompositeHealthCheckProperties.


        :param filter_tags: The filter_tags of this OrgApacheSlingHcCoreImplCompositeHealthCheckProperties.
        :type filter_tags: ConfigNodePropertyArray
        """

        self._filter_tags = filter_tags

    @property
    def filter_combine_tags_with_or(self) -> ConfigNodePropertyBoolean:
        """Gets the filter_combine_tags_with_or of this OrgApacheSlingHcCoreImplCompositeHealthCheckProperties.


        :return: The filter_combine_tags_with_or of this OrgApacheSlingHcCoreImplCompositeHealthCheckProperties.
        :rtype: ConfigNodePropertyBoolean
        """
        return self._filter_combine_tags_with_or

    @filter_combine_tags_with_or.setter
    def filter_combine_tags_with_or(self, filter_combine_tags_with_or: ConfigNodePropertyBoolean):
        """Sets the filter_combine_tags_with_or of this OrgApacheSlingHcCoreImplCompositeHealthCheckProperties.


        :param filter_combine_tags_with_or: The filter_combine_tags_with_or of this OrgApacheSlingHcCoreImplCompositeHealthCheckProperties.
        :type filter_combine_tags_with_or: ConfigNodePropertyBoolean
        """

        self._filter_combine_tags_with_or = filter_combine_tags_with_or