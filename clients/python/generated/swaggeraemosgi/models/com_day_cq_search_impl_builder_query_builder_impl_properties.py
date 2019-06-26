# coding: utf-8

"""
    Adobe Experience Manager OSGI config (AEM) API

    Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API  # noqa: E501

    The version of the OpenAPI document: 1.0.0
    Contact: opensource@shinesolutions.com
    Generated by: https://openapi-generator.tech
"""


import pprint
import re  # noqa: F401

import six


class ComDayCqSearchImplBuilderQueryBuilderImplProperties(object):
    """NOTE: This class is auto generated by OpenAPI Generator.
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """

    """
    Attributes:
      openapi_types (dict): The key is attribute name
                            and the value is attribute type.
      attribute_map (dict): The key is attribute name
                            and the value is json key in definition.
    """
    openapi_types = {
        'excerpt_properties': 'ConfigNodePropertyArray',
        'cache_max_entries': 'ConfigNodePropertyInteger',
        'cache_entry_lifetime': 'ConfigNodePropertyInteger',
        'xpath_union': 'ConfigNodePropertyBoolean'
    }

    attribute_map = {
        'excerpt_properties': 'excerpt.properties',
        'cache_max_entries': 'cache.max.entries',
        'cache_entry_lifetime': 'cache.entry.lifetime',
        'xpath_union': 'xpath.union'
    }

    def __init__(self, excerpt_properties=None, cache_max_entries=None, cache_entry_lifetime=None, xpath_union=None):  # noqa: E501
        """ComDayCqSearchImplBuilderQueryBuilderImplProperties - a model defined in OpenAPI"""  # noqa: E501

        self._excerpt_properties = None
        self._cache_max_entries = None
        self._cache_entry_lifetime = None
        self._xpath_union = None
        self.discriminator = None

        if excerpt_properties is not None:
            self.excerpt_properties = excerpt_properties
        if cache_max_entries is not None:
            self.cache_max_entries = cache_max_entries
        if cache_entry_lifetime is not None:
            self.cache_entry_lifetime = cache_entry_lifetime
        if xpath_union is not None:
            self.xpath_union = xpath_union

    @property
    def excerpt_properties(self):
        """Gets the excerpt_properties of this ComDayCqSearchImplBuilderQueryBuilderImplProperties.  # noqa: E501


        :return: The excerpt_properties of this ComDayCqSearchImplBuilderQueryBuilderImplProperties.  # noqa: E501
        :rtype: ConfigNodePropertyArray
        """
        return self._excerpt_properties

    @excerpt_properties.setter
    def excerpt_properties(self, excerpt_properties):
        """Sets the excerpt_properties of this ComDayCqSearchImplBuilderQueryBuilderImplProperties.


        :param excerpt_properties: The excerpt_properties of this ComDayCqSearchImplBuilderQueryBuilderImplProperties.  # noqa: E501
        :type: ConfigNodePropertyArray
        """

        self._excerpt_properties = excerpt_properties

    @property
    def cache_max_entries(self):
        """Gets the cache_max_entries of this ComDayCqSearchImplBuilderQueryBuilderImplProperties.  # noqa: E501


        :return: The cache_max_entries of this ComDayCqSearchImplBuilderQueryBuilderImplProperties.  # noqa: E501
        :rtype: ConfigNodePropertyInteger
        """
        return self._cache_max_entries

    @cache_max_entries.setter
    def cache_max_entries(self, cache_max_entries):
        """Sets the cache_max_entries of this ComDayCqSearchImplBuilderQueryBuilderImplProperties.


        :param cache_max_entries: The cache_max_entries of this ComDayCqSearchImplBuilderQueryBuilderImplProperties.  # noqa: E501
        :type: ConfigNodePropertyInteger
        """

        self._cache_max_entries = cache_max_entries

    @property
    def cache_entry_lifetime(self):
        """Gets the cache_entry_lifetime of this ComDayCqSearchImplBuilderQueryBuilderImplProperties.  # noqa: E501


        :return: The cache_entry_lifetime of this ComDayCqSearchImplBuilderQueryBuilderImplProperties.  # noqa: E501
        :rtype: ConfigNodePropertyInteger
        """
        return self._cache_entry_lifetime

    @cache_entry_lifetime.setter
    def cache_entry_lifetime(self, cache_entry_lifetime):
        """Sets the cache_entry_lifetime of this ComDayCqSearchImplBuilderQueryBuilderImplProperties.


        :param cache_entry_lifetime: The cache_entry_lifetime of this ComDayCqSearchImplBuilderQueryBuilderImplProperties.  # noqa: E501
        :type: ConfigNodePropertyInteger
        """

        self._cache_entry_lifetime = cache_entry_lifetime

    @property
    def xpath_union(self):
        """Gets the xpath_union of this ComDayCqSearchImplBuilderQueryBuilderImplProperties.  # noqa: E501


        :return: The xpath_union of this ComDayCqSearchImplBuilderQueryBuilderImplProperties.  # noqa: E501
        :rtype: ConfigNodePropertyBoolean
        """
        return self._xpath_union

    @xpath_union.setter
    def xpath_union(self, xpath_union):
        """Sets the xpath_union of this ComDayCqSearchImplBuilderQueryBuilderImplProperties.


        :param xpath_union: The xpath_union of this ComDayCqSearchImplBuilderQueryBuilderImplProperties.  # noqa: E501
        :type: ConfigNodePropertyBoolean
        """

        self._xpath_union = xpath_union

    def to_dict(self):
        """Returns the model properties as a dict"""
        result = {}

        for attr, _ in six.iteritems(self.openapi_types):
            value = getattr(self, attr)
            if isinstance(value, list):
                result[attr] = list(map(
                    lambda x: x.to_dict() if hasattr(x, "to_dict") else x,
                    value
                ))
            elif hasattr(value, "to_dict"):
                result[attr] = value.to_dict()
            elif isinstance(value, dict):
                result[attr] = dict(map(
                    lambda item: (item[0], item[1].to_dict())
                    if hasattr(item[1], "to_dict") else item,
                    value.items()
                ))
            else:
                result[attr] = value

        return result

    def to_str(self):
        """Returns the string representation of the model"""
        return pprint.pformat(self.to_dict())

    def __repr__(self):
        """For `print` and `pprint`"""
        return self.to_str()

    def __eq__(self, other):
        """Returns true if both objects are equal"""
        if not isinstance(other, ComDayCqSearchImplBuilderQueryBuilderImplProperties):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
