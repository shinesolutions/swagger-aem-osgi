# coding: utf-8

"""
    Adobe Experience Manager OSGI config (AEM) API

    Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API  # noqa: E501

    The version of the OpenAPI document: 1.0.0-pre.0
    Contact: opensource@shinesolutions.com
    Generated by: https://openapi-generator.tech
"""


import pprint
import re  # noqa: F401

import six


class OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties(object):
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
        'max_recursion_levels': 'ConfigNodePropertyInteger'
    }

    attribute_map = {
        'max_recursion_levels': 'max.recursion.levels'
    }

    def __init__(self, max_recursion_levels=None):  # noqa: E501
        """OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties - a model defined in OpenAPI"""  # noqa: E501

        self._max_recursion_levels = None
        self.discriminator = None

        if max_recursion_levels is not None:
            self.max_recursion_levels = max_recursion_levels

    @property
    def max_recursion_levels(self):
        """Gets the max_recursion_levels of this OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties.  # noqa: E501


        :return: The max_recursion_levels of this OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties.  # noqa: E501
        :rtype: ConfigNodePropertyInteger
        """
        return self._max_recursion_levels

    @max_recursion_levels.setter
    def max_recursion_levels(self, max_recursion_levels):
        """Sets the max_recursion_levels of this OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties.


        :param max_recursion_levels: The max_recursion_levels of this OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties.  # noqa: E501
        :type: ConfigNodePropertyInteger
        """

        self._max_recursion_levels = max_recursion_levels

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
        if not isinstance(other, OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
