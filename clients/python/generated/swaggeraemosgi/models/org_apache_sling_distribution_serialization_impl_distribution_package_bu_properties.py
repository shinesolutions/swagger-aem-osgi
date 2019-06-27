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


class OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties(object):
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
        'name': 'ConfigNodePropertyString',
        'type': 'ConfigNodePropertyDropDown',
        'format_target': 'ConfigNodePropertyString',
        'temp_fs_folder': 'ConfigNodePropertyString',
        'file_threshold': 'ConfigNodePropertyInteger',
        'memory_unit': 'ConfigNodePropertyDropDown',
        'use_off_heap_memory': 'ConfigNodePropertyBoolean',
        'digest_algorithm': 'ConfigNodePropertyDropDown',
        'monitoring_queue_size': 'ConfigNodePropertyInteger',
        'cleanup_delay': 'ConfigNodePropertyInteger',
        'package_filters': 'ConfigNodePropertyArray',
        'property_filters': 'ConfigNodePropertyArray'
    }

    attribute_map = {
        'name': 'name',
        'type': 'type',
        'format_target': 'format.target',
        'temp_fs_folder': 'tempFsFolder',
        'file_threshold': 'fileThreshold',
        'memory_unit': 'memoryUnit',
        'use_off_heap_memory': 'useOffHeapMemory',
        'digest_algorithm': 'digestAlgorithm',
        'monitoring_queue_size': 'monitoringQueueSize',
        'cleanup_delay': 'cleanupDelay',
        'package_filters': 'package.filters',
        'property_filters': 'property.filters'
    }

    def __init__(self, name=None, type=None, format_target=None, temp_fs_folder=None, file_threshold=None, memory_unit=None, use_off_heap_memory=None, digest_algorithm=None, monitoring_queue_size=None, cleanup_delay=None, package_filters=None, property_filters=None):  # noqa: E501
        """OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties - a model defined in OpenAPI"""  # noqa: E501

        self._name = None
        self._type = None
        self._format_target = None
        self._temp_fs_folder = None
        self._file_threshold = None
        self._memory_unit = None
        self._use_off_heap_memory = None
        self._digest_algorithm = None
        self._monitoring_queue_size = None
        self._cleanup_delay = None
        self._package_filters = None
        self._property_filters = None
        self.discriminator = None

        if name is not None:
            self.name = name
        if type is not None:
            self.type = type
        if format_target is not None:
            self.format_target = format_target
        if temp_fs_folder is not None:
            self.temp_fs_folder = temp_fs_folder
        if file_threshold is not None:
            self.file_threshold = file_threshold
        if memory_unit is not None:
            self.memory_unit = memory_unit
        if use_off_heap_memory is not None:
            self.use_off_heap_memory = use_off_heap_memory
        if digest_algorithm is not None:
            self.digest_algorithm = digest_algorithm
        if monitoring_queue_size is not None:
            self.monitoring_queue_size = monitoring_queue_size
        if cleanup_delay is not None:
            self.cleanup_delay = cleanup_delay
        if package_filters is not None:
            self.package_filters = package_filters
        if property_filters is not None:
            self.property_filters = property_filters

    @property
    def name(self):
        """Gets the name of this OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties.  # noqa: E501


        :return: The name of this OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties.  # noqa: E501
        :rtype: ConfigNodePropertyString
        """
        return self._name

    @name.setter
    def name(self, name):
        """Sets the name of this OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties.


        :param name: The name of this OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties.  # noqa: E501
        :type: ConfigNodePropertyString
        """

        self._name = name

    @property
    def type(self):
        """Gets the type of this OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties.  # noqa: E501


        :return: The type of this OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties.  # noqa: E501
        :rtype: ConfigNodePropertyDropDown
        """
        return self._type

    @type.setter
    def type(self, type):
        """Sets the type of this OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties.


        :param type: The type of this OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties.  # noqa: E501
        :type: ConfigNodePropertyDropDown
        """

        self._type = type

    @property
    def format_target(self):
        """Gets the format_target of this OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties.  # noqa: E501


        :return: The format_target of this OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties.  # noqa: E501
        :rtype: ConfigNodePropertyString
        """
        return self._format_target

    @format_target.setter
    def format_target(self, format_target):
        """Sets the format_target of this OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties.


        :param format_target: The format_target of this OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties.  # noqa: E501
        :type: ConfigNodePropertyString
        """

        self._format_target = format_target

    @property
    def temp_fs_folder(self):
        """Gets the temp_fs_folder of this OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties.  # noqa: E501


        :return: The temp_fs_folder of this OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties.  # noqa: E501
        :rtype: ConfigNodePropertyString
        """
        return self._temp_fs_folder

    @temp_fs_folder.setter
    def temp_fs_folder(self, temp_fs_folder):
        """Sets the temp_fs_folder of this OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties.


        :param temp_fs_folder: The temp_fs_folder of this OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties.  # noqa: E501
        :type: ConfigNodePropertyString
        """

        self._temp_fs_folder = temp_fs_folder

    @property
    def file_threshold(self):
        """Gets the file_threshold of this OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties.  # noqa: E501


        :return: The file_threshold of this OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties.  # noqa: E501
        :rtype: ConfigNodePropertyInteger
        """
        return self._file_threshold

    @file_threshold.setter
    def file_threshold(self, file_threshold):
        """Sets the file_threshold of this OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties.


        :param file_threshold: The file_threshold of this OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties.  # noqa: E501
        :type: ConfigNodePropertyInteger
        """

        self._file_threshold = file_threshold

    @property
    def memory_unit(self):
        """Gets the memory_unit of this OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties.  # noqa: E501


        :return: The memory_unit of this OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties.  # noqa: E501
        :rtype: ConfigNodePropertyDropDown
        """
        return self._memory_unit

    @memory_unit.setter
    def memory_unit(self, memory_unit):
        """Sets the memory_unit of this OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties.


        :param memory_unit: The memory_unit of this OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties.  # noqa: E501
        :type: ConfigNodePropertyDropDown
        """

        self._memory_unit = memory_unit

    @property
    def use_off_heap_memory(self):
        """Gets the use_off_heap_memory of this OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties.  # noqa: E501


        :return: The use_off_heap_memory of this OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties.  # noqa: E501
        :rtype: ConfigNodePropertyBoolean
        """
        return self._use_off_heap_memory

    @use_off_heap_memory.setter
    def use_off_heap_memory(self, use_off_heap_memory):
        """Sets the use_off_heap_memory of this OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties.


        :param use_off_heap_memory: The use_off_heap_memory of this OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties.  # noqa: E501
        :type: ConfigNodePropertyBoolean
        """

        self._use_off_heap_memory = use_off_heap_memory

    @property
    def digest_algorithm(self):
        """Gets the digest_algorithm of this OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties.  # noqa: E501


        :return: The digest_algorithm of this OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties.  # noqa: E501
        :rtype: ConfigNodePropertyDropDown
        """
        return self._digest_algorithm

    @digest_algorithm.setter
    def digest_algorithm(self, digest_algorithm):
        """Sets the digest_algorithm of this OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties.


        :param digest_algorithm: The digest_algorithm of this OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties.  # noqa: E501
        :type: ConfigNodePropertyDropDown
        """

        self._digest_algorithm = digest_algorithm

    @property
    def monitoring_queue_size(self):
        """Gets the monitoring_queue_size of this OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties.  # noqa: E501


        :return: The monitoring_queue_size of this OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties.  # noqa: E501
        :rtype: ConfigNodePropertyInteger
        """
        return self._monitoring_queue_size

    @monitoring_queue_size.setter
    def monitoring_queue_size(self, monitoring_queue_size):
        """Sets the monitoring_queue_size of this OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties.


        :param monitoring_queue_size: The monitoring_queue_size of this OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties.  # noqa: E501
        :type: ConfigNodePropertyInteger
        """

        self._monitoring_queue_size = monitoring_queue_size

    @property
    def cleanup_delay(self):
        """Gets the cleanup_delay of this OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties.  # noqa: E501


        :return: The cleanup_delay of this OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties.  # noqa: E501
        :rtype: ConfigNodePropertyInteger
        """
        return self._cleanup_delay

    @cleanup_delay.setter
    def cleanup_delay(self, cleanup_delay):
        """Sets the cleanup_delay of this OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties.


        :param cleanup_delay: The cleanup_delay of this OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties.  # noqa: E501
        :type: ConfigNodePropertyInteger
        """

        self._cleanup_delay = cleanup_delay

    @property
    def package_filters(self):
        """Gets the package_filters of this OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties.  # noqa: E501


        :return: The package_filters of this OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties.  # noqa: E501
        :rtype: ConfigNodePropertyArray
        """
        return self._package_filters

    @package_filters.setter
    def package_filters(self, package_filters):
        """Sets the package_filters of this OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties.


        :param package_filters: The package_filters of this OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties.  # noqa: E501
        :type: ConfigNodePropertyArray
        """

        self._package_filters = package_filters

    @property
    def property_filters(self):
        """Gets the property_filters of this OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties.  # noqa: E501


        :return: The property_filters of this OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties.  # noqa: E501
        :rtype: ConfigNodePropertyArray
        """
        return self._property_filters

    @property_filters.setter
    def property_filters(self, property_filters):
        """Sets the property_filters of this OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties.


        :param property_filters: The property_filters of this OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties.  # noqa: E501
        :type: ConfigNodePropertyArray
        """

        self._property_filters = property_filters

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
        if not isinstance(other, OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other