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


class ComAdobeGraniteThreaddumpThreadDumpCollectorProperties(object):
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
        'scheduler_period': 'ConfigNodePropertyInteger',
        'scheduler_run_on': 'ConfigNodePropertyDropDown',
        'granite_threaddump_enabled': 'ConfigNodePropertyBoolean',
        'granite_threaddump_dumps_per_file': 'ConfigNodePropertyInteger',
        'granite_threaddump_enable_gzip_compression': 'ConfigNodePropertyBoolean',
        'granite_threaddump_enable_directories_compression': 'ConfigNodePropertyBoolean',
        'granite_threaddump_enable_j_stack': 'ConfigNodePropertyBoolean',
        'granite_threaddump_max_backup_days': 'ConfigNodePropertyInteger',
        'granite_threaddump_backup_clean_trigger': 'ConfigNodePropertyString'
    }

    attribute_map = {
        'scheduler_period': 'scheduler.period',
        'scheduler_run_on': 'scheduler.runOn',
        'granite_threaddump_enabled': 'granite.threaddump.enabled',
        'granite_threaddump_dumps_per_file': 'granite.threaddump.dumpsPerFile',
        'granite_threaddump_enable_gzip_compression': 'granite.threaddump.enableGzipCompression',
        'granite_threaddump_enable_directories_compression': 'granite.threaddump.enableDirectoriesCompression',
        'granite_threaddump_enable_j_stack': 'granite.threaddump.enableJStack',
        'granite_threaddump_max_backup_days': 'granite.threaddump.maxBackupDays',
        'granite_threaddump_backup_clean_trigger': 'granite.threaddump.backupCleanTrigger'
    }

    def __init__(self, scheduler_period=None, scheduler_run_on=None, granite_threaddump_enabled=None, granite_threaddump_dumps_per_file=None, granite_threaddump_enable_gzip_compression=None, granite_threaddump_enable_directories_compression=None, granite_threaddump_enable_j_stack=None, granite_threaddump_max_backup_days=None, granite_threaddump_backup_clean_trigger=None):  # noqa: E501
        """ComAdobeGraniteThreaddumpThreadDumpCollectorProperties - a model defined in OpenAPI"""  # noqa: E501

        self._scheduler_period = None
        self._scheduler_run_on = None
        self._granite_threaddump_enabled = None
        self._granite_threaddump_dumps_per_file = None
        self._granite_threaddump_enable_gzip_compression = None
        self._granite_threaddump_enable_directories_compression = None
        self._granite_threaddump_enable_j_stack = None
        self._granite_threaddump_max_backup_days = None
        self._granite_threaddump_backup_clean_trigger = None
        self.discriminator = None

        if scheduler_period is not None:
            self.scheduler_period = scheduler_period
        if scheduler_run_on is not None:
            self.scheduler_run_on = scheduler_run_on
        if granite_threaddump_enabled is not None:
            self.granite_threaddump_enabled = granite_threaddump_enabled
        if granite_threaddump_dumps_per_file is not None:
            self.granite_threaddump_dumps_per_file = granite_threaddump_dumps_per_file
        if granite_threaddump_enable_gzip_compression is not None:
            self.granite_threaddump_enable_gzip_compression = granite_threaddump_enable_gzip_compression
        if granite_threaddump_enable_directories_compression is not None:
            self.granite_threaddump_enable_directories_compression = granite_threaddump_enable_directories_compression
        if granite_threaddump_enable_j_stack is not None:
            self.granite_threaddump_enable_j_stack = granite_threaddump_enable_j_stack
        if granite_threaddump_max_backup_days is not None:
            self.granite_threaddump_max_backup_days = granite_threaddump_max_backup_days
        if granite_threaddump_backup_clean_trigger is not None:
            self.granite_threaddump_backup_clean_trigger = granite_threaddump_backup_clean_trigger

    @property
    def scheduler_period(self):
        """Gets the scheduler_period of this ComAdobeGraniteThreaddumpThreadDumpCollectorProperties.  # noqa: E501


        :return: The scheduler_period of this ComAdobeGraniteThreaddumpThreadDumpCollectorProperties.  # noqa: E501
        :rtype: ConfigNodePropertyInteger
        """
        return self._scheduler_period

    @scheduler_period.setter
    def scheduler_period(self, scheduler_period):
        """Sets the scheduler_period of this ComAdobeGraniteThreaddumpThreadDumpCollectorProperties.


        :param scheduler_period: The scheduler_period of this ComAdobeGraniteThreaddumpThreadDumpCollectorProperties.  # noqa: E501
        :type: ConfigNodePropertyInteger
        """

        self._scheduler_period = scheduler_period

    @property
    def scheduler_run_on(self):
        """Gets the scheduler_run_on of this ComAdobeGraniteThreaddumpThreadDumpCollectorProperties.  # noqa: E501


        :return: The scheduler_run_on of this ComAdobeGraniteThreaddumpThreadDumpCollectorProperties.  # noqa: E501
        :rtype: ConfigNodePropertyDropDown
        """
        return self._scheduler_run_on

    @scheduler_run_on.setter
    def scheduler_run_on(self, scheduler_run_on):
        """Sets the scheduler_run_on of this ComAdobeGraniteThreaddumpThreadDumpCollectorProperties.


        :param scheduler_run_on: The scheduler_run_on of this ComAdobeGraniteThreaddumpThreadDumpCollectorProperties.  # noqa: E501
        :type: ConfigNodePropertyDropDown
        """

        self._scheduler_run_on = scheduler_run_on

    @property
    def granite_threaddump_enabled(self):
        """Gets the granite_threaddump_enabled of this ComAdobeGraniteThreaddumpThreadDumpCollectorProperties.  # noqa: E501


        :return: The granite_threaddump_enabled of this ComAdobeGraniteThreaddumpThreadDumpCollectorProperties.  # noqa: E501
        :rtype: ConfigNodePropertyBoolean
        """
        return self._granite_threaddump_enabled

    @granite_threaddump_enabled.setter
    def granite_threaddump_enabled(self, granite_threaddump_enabled):
        """Sets the granite_threaddump_enabled of this ComAdobeGraniteThreaddumpThreadDumpCollectorProperties.


        :param granite_threaddump_enabled: The granite_threaddump_enabled of this ComAdobeGraniteThreaddumpThreadDumpCollectorProperties.  # noqa: E501
        :type: ConfigNodePropertyBoolean
        """

        self._granite_threaddump_enabled = granite_threaddump_enabled

    @property
    def granite_threaddump_dumps_per_file(self):
        """Gets the granite_threaddump_dumps_per_file of this ComAdobeGraniteThreaddumpThreadDumpCollectorProperties.  # noqa: E501


        :return: The granite_threaddump_dumps_per_file of this ComAdobeGraniteThreaddumpThreadDumpCollectorProperties.  # noqa: E501
        :rtype: ConfigNodePropertyInteger
        """
        return self._granite_threaddump_dumps_per_file

    @granite_threaddump_dumps_per_file.setter
    def granite_threaddump_dumps_per_file(self, granite_threaddump_dumps_per_file):
        """Sets the granite_threaddump_dumps_per_file of this ComAdobeGraniteThreaddumpThreadDumpCollectorProperties.


        :param granite_threaddump_dumps_per_file: The granite_threaddump_dumps_per_file of this ComAdobeGraniteThreaddumpThreadDumpCollectorProperties.  # noqa: E501
        :type: ConfigNodePropertyInteger
        """

        self._granite_threaddump_dumps_per_file = granite_threaddump_dumps_per_file

    @property
    def granite_threaddump_enable_gzip_compression(self):
        """Gets the granite_threaddump_enable_gzip_compression of this ComAdobeGraniteThreaddumpThreadDumpCollectorProperties.  # noqa: E501


        :return: The granite_threaddump_enable_gzip_compression of this ComAdobeGraniteThreaddumpThreadDumpCollectorProperties.  # noqa: E501
        :rtype: ConfigNodePropertyBoolean
        """
        return self._granite_threaddump_enable_gzip_compression

    @granite_threaddump_enable_gzip_compression.setter
    def granite_threaddump_enable_gzip_compression(self, granite_threaddump_enable_gzip_compression):
        """Sets the granite_threaddump_enable_gzip_compression of this ComAdobeGraniteThreaddumpThreadDumpCollectorProperties.


        :param granite_threaddump_enable_gzip_compression: The granite_threaddump_enable_gzip_compression of this ComAdobeGraniteThreaddumpThreadDumpCollectorProperties.  # noqa: E501
        :type: ConfigNodePropertyBoolean
        """

        self._granite_threaddump_enable_gzip_compression = granite_threaddump_enable_gzip_compression

    @property
    def granite_threaddump_enable_directories_compression(self):
        """Gets the granite_threaddump_enable_directories_compression of this ComAdobeGraniteThreaddumpThreadDumpCollectorProperties.  # noqa: E501


        :return: The granite_threaddump_enable_directories_compression of this ComAdobeGraniteThreaddumpThreadDumpCollectorProperties.  # noqa: E501
        :rtype: ConfigNodePropertyBoolean
        """
        return self._granite_threaddump_enable_directories_compression

    @granite_threaddump_enable_directories_compression.setter
    def granite_threaddump_enable_directories_compression(self, granite_threaddump_enable_directories_compression):
        """Sets the granite_threaddump_enable_directories_compression of this ComAdobeGraniteThreaddumpThreadDumpCollectorProperties.


        :param granite_threaddump_enable_directories_compression: The granite_threaddump_enable_directories_compression of this ComAdobeGraniteThreaddumpThreadDumpCollectorProperties.  # noqa: E501
        :type: ConfigNodePropertyBoolean
        """

        self._granite_threaddump_enable_directories_compression = granite_threaddump_enable_directories_compression

    @property
    def granite_threaddump_enable_j_stack(self):
        """Gets the granite_threaddump_enable_j_stack of this ComAdobeGraniteThreaddumpThreadDumpCollectorProperties.  # noqa: E501


        :return: The granite_threaddump_enable_j_stack of this ComAdobeGraniteThreaddumpThreadDumpCollectorProperties.  # noqa: E501
        :rtype: ConfigNodePropertyBoolean
        """
        return self._granite_threaddump_enable_j_stack

    @granite_threaddump_enable_j_stack.setter
    def granite_threaddump_enable_j_stack(self, granite_threaddump_enable_j_stack):
        """Sets the granite_threaddump_enable_j_stack of this ComAdobeGraniteThreaddumpThreadDumpCollectorProperties.


        :param granite_threaddump_enable_j_stack: The granite_threaddump_enable_j_stack of this ComAdobeGraniteThreaddumpThreadDumpCollectorProperties.  # noqa: E501
        :type: ConfigNodePropertyBoolean
        """

        self._granite_threaddump_enable_j_stack = granite_threaddump_enable_j_stack

    @property
    def granite_threaddump_max_backup_days(self):
        """Gets the granite_threaddump_max_backup_days of this ComAdobeGraniteThreaddumpThreadDumpCollectorProperties.  # noqa: E501


        :return: The granite_threaddump_max_backup_days of this ComAdobeGraniteThreaddumpThreadDumpCollectorProperties.  # noqa: E501
        :rtype: ConfigNodePropertyInteger
        """
        return self._granite_threaddump_max_backup_days

    @granite_threaddump_max_backup_days.setter
    def granite_threaddump_max_backup_days(self, granite_threaddump_max_backup_days):
        """Sets the granite_threaddump_max_backup_days of this ComAdobeGraniteThreaddumpThreadDumpCollectorProperties.


        :param granite_threaddump_max_backup_days: The granite_threaddump_max_backup_days of this ComAdobeGraniteThreaddumpThreadDumpCollectorProperties.  # noqa: E501
        :type: ConfigNodePropertyInteger
        """

        self._granite_threaddump_max_backup_days = granite_threaddump_max_backup_days

    @property
    def granite_threaddump_backup_clean_trigger(self):
        """Gets the granite_threaddump_backup_clean_trigger of this ComAdobeGraniteThreaddumpThreadDumpCollectorProperties.  # noqa: E501


        :return: The granite_threaddump_backup_clean_trigger of this ComAdobeGraniteThreaddumpThreadDumpCollectorProperties.  # noqa: E501
        :rtype: ConfigNodePropertyString
        """
        return self._granite_threaddump_backup_clean_trigger

    @granite_threaddump_backup_clean_trigger.setter
    def granite_threaddump_backup_clean_trigger(self, granite_threaddump_backup_clean_trigger):
        """Sets the granite_threaddump_backup_clean_trigger of this ComAdobeGraniteThreaddumpThreadDumpCollectorProperties.


        :param granite_threaddump_backup_clean_trigger: The granite_threaddump_backup_clean_trigger of this ComAdobeGraniteThreaddumpThreadDumpCollectorProperties.  # noqa: E501
        :type: ConfigNodePropertyString
        """

        self._granite_threaddump_backup_clean_trigger = granite_threaddump_backup_clean_trigger

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
        if not isinstance(other, ComAdobeGraniteThreaddumpThreadDumpCollectorProperties):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
