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


class OrgApacheSlingCommonsMetricsInternalLogReporterProperties(object):
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
        'period': 'ConfigNodePropertyInteger',
        'time_unit': 'ConfigNodePropertyDropDown',
        'level': 'ConfigNodePropertyDropDown',
        'logger_name': 'ConfigNodePropertyString',
        'prefix': 'ConfigNodePropertyString',
        'pattern': 'ConfigNodePropertyString',
        'registry_name': 'ConfigNodePropertyString'
    }

    attribute_map = {
        'period': 'period',
        'time_unit': 'timeUnit',
        'level': 'level',
        'logger_name': 'loggerName',
        'prefix': 'prefix',
        'pattern': 'pattern',
        'registry_name': 'registryName'
    }

    def __init__(self, period=None, time_unit=None, level=None, logger_name=None, prefix=None, pattern=None, registry_name=None):  # noqa: E501
        """OrgApacheSlingCommonsMetricsInternalLogReporterProperties - a model defined in OpenAPI"""  # noqa: E501

        self._period = None
        self._time_unit = None
        self._level = None
        self._logger_name = None
        self._prefix = None
        self._pattern = None
        self._registry_name = None
        self.discriminator = None

        if period is not None:
            self.period = period
        if time_unit is not None:
            self.time_unit = time_unit
        if level is not None:
            self.level = level
        if logger_name is not None:
            self.logger_name = logger_name
        if prefix is not None:
            self.prefix = prefix
        if pattern is not None:
            self.pattern = pattern
        if registry_name is not None:
            self.registry_name = registry_name

    @property
    def period(self):
        """Gets the period of this OrgApacheSlingCommonsMetricsInternalLogReporterProperties.  # noqa: E501


        :return: The period of this OrgApacheSlingCommonsMetricsInternalLogReporterProperties.  # noqa: E501
        :rtype: ConfigNodePropertyInteger
        """
        return self._period

    @period.setter
    def period(self, period):
        """Sets the period of this OrgApacheSlingCommonsMetricsInternalLogReporterProperties.


        :param period: The period of this OrgApacheSlingCommonsMetricsInternalLogReporterProperties.  # noqa: E501
        :type: ConfigNodePropertyInteger
        """

        self._period = period

    @property
    def time_unit(self):
        """Gets the time_unit of this OrgApacheSlingCommonsMetricsInternalLogReporterProperties.  # noqa: E501


        :return: The time_unit of this OrgApacheSlingCommonsMetricsInternalLogReporterProperties.  # noqa: E501
        :rtype: ConfigNodePropertyDropDown
        """
        return self._time_unit

    @time_unit.setter
    def time_unit(self, time_unit):
        """Sets the time_unit of this OrgApacheSlingCommonsMetricsInternalLogReporterProperties.


        :param time_unit: The time_unit of this OrgApacheSlingCommonsMetricsInternalLogReporterProperties.  # noqa: E501
        :type: ConfigNodePropertyDropDown
        """

        self._time_unit = time_unit

    @property
    def level(self):
        """Gets the level of this OrgApacheSlingCommonsMetricsInternalLogReporterProperties.  # noqa: E501


        :return: The level of this OrgApacheSlingCommonsMetricsInternalLogReporterProperties.  # noqa: E501
        :rtype: ConfigNodePropertyDropDown
        """
        return self._level

    @level.setter
    def level(self, level):
        """Sets the level of this OrgApacheSlingCommonsMetricsInternalLogReporterProperties.


        :param level: The level of this OrgApacheSlingCommonsMetricsInternalLogReporterProperties.  # noqa: E501
        :type: ConfigNodePropertyDropDown
        """

        self._level = level

    @property
    def logger_name(self):
        """Gets the logger_name of this OrgApacheSlingCommonsMetricsInternalLogReporterProperties.  # noqa: E501


        :return: The logger_name of this OrgApacheSlingCommonsMetricsInternalLogReporterProperties.  # noqa: E501
        :rtype: ConfigNodePropertyString
        """
        return self._logger_name

    @logger_name.setter
    def logger_name(self, logger_name):
        """Sets the logger_name of this OrgApacheSlingCommonsMetricsInternalLogReporterProperties.


        :param logger_name: The logger_name of this OrgApacheSlingCommonsMetricsInternalLogReporterProperties.  # noqa: E501
        :type: ConfigNodePropertyString
        """

        self._logger_name = logger_name

    @property
    def prefix(self):
        """Gets the prefix of this OrgApacheSlingCommonsMetricsInternalLogReporterProperties.  # noqa: E501


        :return: The prefix of this OrgApacheSlingCommonsMetricsInternalLogReporterProperties.  # noqa: E501
        :rtype: ConfigNodePropertyString
        """
        return self._prefix

    @prefix.setter
    def prefix(self, prefix):
        """Sets the prefix of this OrgApacheSlingCommonsMetricsInternalLogReporterProperties.


        :param prefix: The prefix of this OrgApacheSlingCommonsMetricsInternalLogReporterProperties.  # noqa: E501
        :type: ConfigNodePropertyString
        """

        self._prefix = prefix

    @property
    def pattern(self):
        """Gets the pattern of this OrgApacheSlingCommonsMetricsInternalLogReporterProperties.  # noqa: E501


        :return: The pattern of this OrgApacheSlingCommonsMetricsInternalLogReporterProperties.  # noqa: E501
        :rtype: ConfigNodePropertyString
        """
        return self._pattern

    @pattern.setter
    def pattern(self, pattern):
        """Sets the pattern of this OrgApacheSlingCommonsMetricsInternalLogReporterProperties.


        :param pattern: The pattern of this OrgApacheSlingCommonsMetricsInternalLogReporterProperties.  # noqa: E501
        :type: ConfigNodePropertyString
        """

        self._pattern = pattern

    @property
    def registry_name(self):
        """Gets the registry_name of this OrgApacheSlingCommonsMetricsInternalLogReporterProperties.  # noqa: E501


        :return: The registry_name of this OrgApacheSlingCommonsMetricsInternalLogReporterProperties.  # noqa: E501
        :rtype: ConfigNodePropertyString
        """
        return self._registry_name

    @registry_name.setter
    def registry_name(self, registry_name):
        """Sets the registry_name of this OrgApacheSlingCommonsMetricsInternalLogReporterProperties.


        :param registry_name: The registry_name of this OrgApacheSlingCommonsMetricsInternalLogReporterProperties.  # noqa: E501
        :type: ConfigNodePropertyString
        """

        self._registry_name = registry_name

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
        if not isinstance(other, OrgApacheSlingCommonsMetricsInternalLogReporterProperties):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
