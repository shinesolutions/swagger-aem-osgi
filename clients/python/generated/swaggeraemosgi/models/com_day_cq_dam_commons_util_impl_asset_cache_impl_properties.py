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


class ComDayCqDamCommonsUtilImplAssetCacheImplProperties(object):
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
        'large_file_min': 'ConfigNodePropertyInteger',
        'cache_apply': 'ConfigNodePropertyBoolean',
        'mime_types': 'ConfigNodePropertyArray'
    }

    attribute_map = {
        'large_file_min': 'large.file.min',
        'cache_apply': 'cache.apply',
        'mime_types': 'mime.types'
    }

    def __init__(self, large_file_min=None, cache_apply=None, mime_types=None):  # noqa: E501
        """ComDayCqDamCommonsUtilImplAssetCacheImplProperties - a model defined in OpenAPI"""  # noqa: E501

        self._large_file_min = None
        self._cache_apply = None
        self._mime_types = None
        self.discriminator = None

        if large_file_min is not None:
            self.large_file_min = large_file_min
        if cache_apply is not None:
            self.cache_apply = cache_apply
        if mime_types is not None:
            self.mime_types = mime_types

    @property
    def large_file_min(self):
        """Gets the large_file_min of this ComDayCqDamCommonsUtilImplAssetCacheImplProperties.  # noqa: E501


        :return: The large_file_min of this ComDayCqDamCommonsUtilImplAssetCacheImplProperties.  # noqa: E501
        :rtype: ConfigNodePropertyInteger
        """
        return self._large_file_min

    @large_file_min.setter
    def large_file_min(self, large_file_min):
        """Sets the large_file_min of this ComDayCqDamCommonsUtilImplAssetCacheImplProperties.


        :param large_file_min: The large_file_min of this ComDayCqDamCommonsUtilImplAssetCacheImplProperties.  # noqa: E501
        :type: ConfigNodePropertyInteger
        """

        self._large_file_min = large_file_min

    @property
    def cache_apply(self):
        """Gets the cache_apply of this ComDayCqDamCommonsUtilImplAssetCacheImplProperties.  # noqa: E501


        :return: The cache_apply of this ComDayCqDamCommonsUtilImplAssetCacheImplProperties.  # noqa: E501
        :rtype: ConfigNodePropertyBoolean
        """
        return self._cache_apply

    @cache_apply.setter
    def cache_apply(self, cache_apply):
        """Sets the cache_apply of this ComDayCqDamCommonsUtilImplAssetCacheImplProperties.


        :param cache_apply: The cache_apply of this ComDayCqDamCommonsUtilImplAssetCacheImplProperties.  # noqa: E501
        :type: ConfigNodePropertyBoolean
        """

        self._cache_apply = cache_apply

    @property
    def mime_types(self):
        """Gets the mime_types of this ComDayCqDamCommonsUtilImplAssetCacheImplProperties.  # noqa: E501


        :return: The mime_types of this ComDayCqDamCommonsUtilImplAssetCacheImplProperties.  # noqa: E501
        :rtype: ConfigNodePropertyArray
        """
        return self._mime_types

    @mime_types.setter
    def mime_types(self, mime_types):
        """Sets the mime_types of this ComDayCqDamCommonsUtilImplAssetCacheImplProperties.


        :param mime_types: The mime_types of this ComDayCqDamCommonsUtilImplAssetCacheImplProperties.  # noqa: E501
        :type: ConfigNodePropertyArray
        """

        self._mime_types = mime_types

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
        if not isinstance(other, ComDayCqDamCommonsUtilImplAssetCacheImplProperties):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
