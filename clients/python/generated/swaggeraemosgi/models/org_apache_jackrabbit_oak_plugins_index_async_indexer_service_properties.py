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


class OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties(object):
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
        'async_configs': 'ConfigNodePropertyArray',
        'lease_time_out_minutes': 'ConfigNodePropertyInteger',
        'failing_index_timeout_seconds': 'ConfigNodePropertyInteger',
        'error_warn_interval_seconds': 'ConfigNodePropertyInteger'
    }

    attribute_map = {
        'async_configs': 'asyncConfigs',
        'lease_time_out_minutes': 'leaseTimeOutMinutes',
        'failing_index_timeout_seconds': 'failingIndexTimeoutSeconds',
        'error_warn_interval_seconds': 'errorWarnIntervalSeconds'
    }

    def __init__(self, async_configs=None, lease_time_out_minutes=None, failing_index_timeout_seconds=None, error_warn_interval_seconds=None):  # noqa: E501
        """OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties - a model defined in OpenAPI"""  # noqa: E501

        self._async_configs = None
        self._lease_time_out_minutes = None
        self._failing_index_timeout_seconds = None
        self._error_warn_interval_seconds = None
        self.discriminator = None

        if async_configs is not None:
            self.async_configs = async_configs
        if lease_time_out_minutes is not None:
            self.lease_time_out_minutes = lease_time_out_minutes
        if failing_index_timeout_seconds is not None:
            self.failing_index_timeout_seconds = failing_index_timeout_seconds
        if error_warn_interval_seconds is not None:
            self.error_warn_interval_seconds = error_warn_interval_seconds

    @property
    def async_configs(self):
        """Gets the async_configs of this OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties.  # noqa: E501


        :return: The async_configs of this OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties.  # noqa: E501
        :rtype: ConfigNodePropertyArray
        """
        return self._async_configs

    @async_configs.setter
    def async_configs(self, async_configs):
        """Sets the async_configs of this OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties.


        :param async_configs: The async_configs of this OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties.  # noqa: E501
        :type: ConfigNodePropertyArray
        """

        self._async_configs = async_configs

    @property
    def lease_time_out_minutes(self):
        """Gets the lease_time_out_minutes of this OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties.  # noqa: E501


        :return: The lease_time_out_minutes of this OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties.  # noqa: E501
        :rtype: ConfigNodePropertyInteger
        """
        return self._lease_time_out_minutes

    @lease_time_out_minutes.setter
    def lease_time_out_minutes(self, lease_time_out_minutes):
        """Sets the lease_time_out_minutes of this OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties.


        :param lease_time_out_minutes: The lease_time_out_minutes of this OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties.  # noqa: E501
        :type: ConfigNodePropertyInteger
        """

        self._lease_time_out_minutes = lease_time_out_minutes

    @property
    def failing_index_timeout_seconds(self):
        """Gets the failing_index_timeout_seconds of this OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties.  # noqa: E501


        :return: The failing_index_timeout_seconds of this OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties.  # noqa: E501
        :rtype: ConfigNodePropertyInteger
        """
        return self._failing_index_timeout_seconds

    @failing_index_timeout_seconds.setter
    def failing_index_timeout_seconds(self, failing_index_timeout_seconds):
        """Sets the failing_index_timeout_seconds of this OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties.


        :param failing_index_timeout_seconds: The failing_index_timeout_seconds of this OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties.  # noqa: E501
        :type: ConfigNodePropertyInteger
        """

        self._failing_index_timeout_seconds = failing_index_timeout_seconds

    @property
    def error_warn_interval_seconds(self):
        """Gets the error_warn_interval_seconds of this OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties.  # noqa: E501


        :return: The error_warn_interval_seconds of this OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties.  # noqa: E501
        :rtype: ConfigNodePropertyInteger
        """
        return self._error_warn_interval_seconds

    @error_warn_interval_seconds.setter
    def error_warn_interval_seconds(self, error_warn_interval_seconds):
        """Sets the error_warn_interval_seconds of this OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties.


        :param error_warn_interval_seconds: The error_warn_interval_seconds of this OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties.  # noqa: E501
        :type: ConfigNodePropertyInteger
        """

        self._error_warn_interval_seconds = error_warn_interval_seconds

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
        if not isinstance(other, OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other