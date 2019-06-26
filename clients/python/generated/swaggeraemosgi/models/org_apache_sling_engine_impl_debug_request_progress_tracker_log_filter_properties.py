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


class OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties(object):
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
        'extensions': 'ConfigNodePropertyArray',
        'min_duration_ms': 'ConfigNodePropertyInteger',
        'max_duration_ms': 'ConfigNodePropertyInteger',
        'compact_log_format': 'ConfigNodePropertyBoolean'
    }

    attribute_map = {
        'extensions': 'extensions',
        'min_duration_ms': 'minDurationMs',
        'max_duration_ms': 'maxDurationMs',
        'compact_log_format': 'compactLogFormat'
    }

    def __init__(self, extensions=None, min_duration_ms=None, max_duration_ms=None, compact_log_format=None):  # noqa: E501
        """OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties - a model defined in OpenAPI"""  # noqa: E501

        self._extensions = None
        self._min_duration_ms = None
        self._max_duration_ms = None
        self._compact_log_format = None
        self.discriminator = None

        if extensions is not None:
            self.extensions = extensions
        if min_duration_ms is not None:
            self.min_duration_ms = min_duration_ms
        if max_duration_ms is not None:
            self.max_duration_ms = max_duration_ms
        if compact_log_format is not None:
            self.compact_log_format = compact_log_format

    @property
    def extensions(self):
        """Gets the extensions of this OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties.  # noqa: E501


        :return: The extensions of this OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties.  # noqa: E501
        :rtype: ConfigNodePropertyArray
        """
        return self._extensions

    @extensions.setter
    def extensions(self, extensions):
        """Sets the extensions of this OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties.


        :param extensions: The extensions of this OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties.  # noqa: E501
        :type: ConfigNodePropertyArray
        """

        self._extensions = extensions

    @property
    def min_duration_ms(self):
        """Gets the min_duration_ms of this OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties.  # noqa: E501


        :return: The min_duration_ms of this OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties.  # noqa: E501
        :rtype: ConfigNodePropertyInteger
        """
        return self._min_duration_ms

    @min_duration_ms.setter
    def min_duration_ms(self, min_duration_ms):
        """Sets the min_duration_ms of this OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties.


        :param min_duration_ms: The min_duration_ms of this OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties.  # noqa: E501
        :type: ConfigNodePropertyInteger
        """

        self._min_duration_ms = min_duration_ms

    @property
    def max_duration_ms(self):
        """Gets the max_duration_ms of this OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties.  # noqa: E501


        :return: The max_duration_ms of this OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties.  # noqa: E501
        :rtype: ConfigNodePropertyInteger
        """
        return self._max_duration_ms

    @max_duration_ms.setter
    def max_duration_ms(self, max_duration_ms):
        """Sets the max_duration_ms of this OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties.


        :param max_duration_ms: The max_duration_ms of this OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties.  # noqa: E501
        :type: ConfigNodePropertyInteger
        """

        self._max_duration_ms = max_duration_ms

    @property
    def compact_log_format(self):
        """Gets the compact_log_format of this OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties.  # noqa: E501


        :return: The compact_log_format of this OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties.  # noqa: E501
        :rtype: ConfigNodePropertyBoolean
        """
        return self._compact_log_format

    @compact_log_format.setter
    def compact_log_format(self, compact_log_format):
        """Sets the compact_log_format of this OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties.


        :param compact_log_format: The compact_log_format of this OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties.  # noqa: E501
        :type: ConfigNodePropertyBoolean
        """

        self._compact_log_format = compact_log_format

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
        if not isinstance(other, OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other