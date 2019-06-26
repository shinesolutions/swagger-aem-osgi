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


class ComDayCqWcmDesignimporterImplEntryPreprocessorImplProperties(object):
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
        'search_pattern': 'ConfigNodePropertyString',
        'replace_pattern': 'ConfigNodePropertyString'
    }

    attribute_map = {
        'search_pattern': 'search.pattern',
        'replace_pattern': 'replace.pattern'
    }

    def __init__(self, search_pattern=None, replace_pattern=None):  # noqa: E501
        """ComDayCqWcmDesignimporterImplEntryPreprocessorImplProperties - a model defined in OpenAPI"""  # noqa: E501

        self._search_pattern = None
        self._replace_pattern = None
        self.discriminator = None

        if search_pattern is not None:
            self.search_pattern = search_pattern
        if replace_pattern is not None:
            self.replace_pattern = replace_pattern

    @property
    def search_pattern(self):
        """Gets the search_pattern of this ComDayCqWcmDesignimporterImplEntryPreprocessorImplProperties.  # noqa: E501


        :return: The search_pattern of this ComDayCqWcmDesignimporterImplEntryPreprocessorImplProperties.  # noqa: E501
        :rtype: ConfigNodePropertyString
        """
        return self._search_pattern

    @search_pattern.setter
    def search_pattern(self, search_pattern):
        """Sets the search_pattern of this ComDayCqWcmDesignimporterImplEntryPreprocessorImplProperties.


        :param search_pattern: The search_pattern of this ComDayCqWcmDesignimporterImplEntryPreprocessorImplProperties.  # noqa: E501
        :type: ConfigNodePropertyString
        """

        self._search_pattern = search_pattern

    @property
    def replace_pattern(self):
        """Gets the replace_pattern of this ComDayCqWcmDesignimporterImplEntryPreprocessorImplProperties.  # noqa: E501


        :return: The replace_pattern of this ComDayCqWcmDesignimporterImplEntryPreprocessorImplProperties.  # noqa: E501
        :rtype: ConfigNodePropertyString
        """
        return self._replace_pattern

    @replace_pattern.setter
    def replace_pattern(self, replace_pattern):
        """Sets the replace_pattern of this ComDayCqWcmDesignimporterImplEntryPreprocessorImplProperties.


        :param replace_pattern: The replace_pattern of this ComDayCqWcmDesignimporterImplEntryPreprocessorImplProperties.  # noqa: E501
        :type: ConfigNodePropertyString
        """

        self._replace_pattern = replace_pattern

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
        if not isinstance(other, ComDayCqWcmDesignimporterImplEntryPreprocessorImplProperties):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other