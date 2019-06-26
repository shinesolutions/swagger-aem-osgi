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


class OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactoryProperties(object):
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
        'title': 'ConfigNodePropertyString',
        'details': 'ConfigNodePropertyString',
        'enabled': 'ConfigNodePropertyBoolean',
        'service_name': 'ConfigNodePropertyString',
        'log_level': 'ConfigNodePropertyDropDown',
        'queue_processing_enabled': 'ConfigNodePropertyBoolean',
        'package_exporter_target': 'ConfigNodePropertyString',
        'package_importer_target': 'ConfigNodePropertyString',
        'request_authorization_strategy_target': 'ConfigNodePropertyString',
        'triggers_target': 'ConfigNodePropertyString'
    }

    attribute_map = {
        'name': 'name',
        'title': 'title',
        'details': 'details',
        'enabled': 'enabled',
        'service_name': 'serviceName',
        'log_level': 'log.level',
        'queue_processing_enabled': 'queue.processing.enabled',
        'package_exporter_target': 'packageExporter.target',
        'package_importer_target': 'packageImporter.target',
        'request_authorization_strategy_target': 'requestAuthorizationStrategy.target',
        'triggers_target': 'triggers.target'
    }

    def __init__(self, name=None, title=None, details=None, enabled=None, service_name=None, log_level=None, queue_processing_enabled=None, package_exporter_target=None, package_importer_target=None, request_authorization_strategy_target=None, triggers_target=None):  # noqa: E501
        """OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactoryProperties - a model defined in OpenAPI"""  # noqa: E501

        self._name = None
        self._title = None
        self._details = None
        self._enabled = None
        self._service_name = None
        self._log_level = None
        self._queue_processing_enabled = None
        self._package_exporter_target = None
        self._package_importer_target = None
        self._request_authorization_strategy_target = None
        self._triggers_target = None
        self.discriminator = None

        if name is not None:
            self.name = name
        if title is not None:
            self.title = title
        if details is not None:
            self.details = details
        if enabled is not None:
            self.enabled = enabled
        if service_name is not None:
            self.service_name = service_name
        if log_level is not None:
            self.log_level = log_level
        if queue_processing_enabled is not None:
            self.queue_processing_enabled = queue_processing_enabled
        if package_exporter_target is not None:
            self.package_exporter_target = package_exporter_target
        if package_importer_target is not None:
            self.package_importer_target = package_importer_target
        if request_authorization_strategy_target is not None:
            self.request_authorization_strategy_target = request_authorization_strategy_target
        if triggers_target is not None:
            self.triggers_target = triggers_target

    @property
    def name(self):
        """Gets the name of this OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactoryProperties.  # noqa: E501


        :return: The name of this OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactoryProperties.  # noqa: E501
        :rtype: ConfigNodePropertyString
        """
        return self._name

    @name.setter
    def name(self, name):
        """Sets the name of this OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactoryProperties.


        :param name: The name of this OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactoryProperties.  # noqa: E501
        :type: ConfigNodePropertyString
        """

        self._name = name

    @property
    def title(self):
        """Gets the title of this OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactoryProperties.  # noqa: E501


        :return: The title of this OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactoryProperties.  # noqa: E501
        :rtype: ConfigNodePropertyString
        """
        return self._title

    @title.setter
    def title(self, title):
        """Sets the title of this OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactoryProperties.


        :param title: The title of this OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactoryProperties.  # noqa: E501
        :type: ConfigNodePropertyString
        """

        self._title = title

    @property
    def details(self):
        """Gets the details of this OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactoryProperties.  # noqa: E501


        :return: The details of this OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactoryProperties.  # noqa: E501
        :rtype: ConfigNodePropertyString
        """
        return self._details

    @details.setter
    def details(self, details):
        """Sets the details of this OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactoryProperties.


        :param details: The details of this OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactoryProperties.  # noqa: E501
        :type: ConfigNodePropertyString
        """

        self._details = details

    @property
    def enabled(self):
        """Gets the enabled of this OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactoryProperties.  # noqa: E501


        :return: The enabled of this OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactoryProperties.  # noqa: E501
        :rtype: ConfigNodePropertyBoolean
        """
        return self._enabled

    @enabled.setter
    def enabled(self, enabled):
        """Sets the enabled of this OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactoryProperties.


        :param enabled: The enabled of this OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactoryProperties.  # noqa: E501
        :type: ConfigNodePropertyBoolean
        """

        self._enabled = enabled

    @property
    def service_name(self):
        """Gets the service_name of this OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactoryProperties.  # noqa: E501


        :return: The service_name of this OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactoryProperties.  # noqa: E501
        :rtype: ConfigNodePropertyString
        """
        return self._service_name

    @service_name.setter
    def service_name(self, service_name):
        """Sets the service_name of this OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactoryProperties.


        :param service_name: The service_name of this OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactoryProperties.  # noqa: E501
        :type: ConfigNodePropertyString
        """

        self._service_name = service_name

    @property
    def log_level(self):
        """Gets the log_level of this OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactoryProperties.  # noqa: E501


        :return: The log_level of this OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactoryProperties.  # noqa: E501
        :rtype: ConfigNodePropertyDropDown
        """
        return self._log_level

    @log_level.setter
    def log_level(self, log_level):
        """Sets the log_level of this OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactoryProperties.


        :param log_level: The log_level of this OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactoryProperties.  # noqa: E501
        :type: ConfigNodePropertyDropDown
        """

        self._log_level = log_level

    @property
    def queue_processing_enabled(self):
        """Gets the queue_processing_enabled of this OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactoryProperties.  # noqa: E501


        :return: The queue_processing_enabled of this OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactoryProperties.  # noqa: E501
        :rtype: ConfigNodePropertyBoolean
        """
        return self._queue_processing_enabled

    @queue_processing_enabled.setter
    def queue_processing_enabled(self, queue_processing_enabled):
        """Sets the queue_processing_enabled of this OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactoryProperties.


        :param queue_processing_enabled: The queue_processing_enabled of this OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactoryProperties.  # noqa: E501
        :type: ConfigNodePropertyBoolean
        """

        self._queue_processing_enabled = queue_processing_enabled

    @property
    def package_exporter_target(self):
        """Gets the package_exporter_target of this OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactoryProperties.  # noqa: E501


        :return: The package_exporter_target of this OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactoryProperties.  # noqa: E501
        :rtype: ConfigNodePropertyString
        """
        return self._package_exporter_target

    @package_exporter_target.setter
    def package_exporter_target(self, package_exporter_target):
        """Sets the package_exporter_target of this OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactoryProperties.


        :param package_exporter_target: The package_exporter_target of this OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactoryProperties.  # noqa: E501
        :type: ConfigNodePropertyString
        """

        self._package_exporter_target = package_exporter_target

    @property
    def package_importer_target(self):
        """Gets the package_importer_target of this OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactoryProperties.  # noqa: E501


        :return: The package_importer_target of this OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactoryProperties.  # noqa: E501
        :rtype: ConfigNodePropertyString
        """
        return self._package_importer_target

    @package_importer_target.setter
    def package_importer_target(self, package_importer_target):
        """Sets the package_importer_target of this OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactoryProperties.


        :param package_importer_target: The package_importer_target of this OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactoryProperties.  # noqa: E501
        :type: ConfigNodePropertyString
        """

        self._package_importer_target = package_importer_target

    @property
    def request_authorization_strategy_target(self):
        """Gets the request_authorization_strategy_target of this OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactoryProperties.  # noqa: E501


        :return: The request_authorization_strategy_target of this OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactoryProperties.  # noqa: E501
        :rtype: ConfigNodePropertyString
        """
        return self._request_authorization_strategy_target

    @request_authorization_strategy_target.setter
    def request_authorization_strategy_target(self, request_authorization_strategy_target):
        """Sets the request_authorization_strategy_target of this OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactoryProperties.


        :param request_authorization_strategy_target: The request_authorization_strategy_target of this OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactoryProperties.  # noqa: E501
        :type: ConfigNodePropertyString
        """

        self._request_authorization_strategy_target = request_authorization_strategy_target

    @property
    def triggers_target(self):
        """Gets the triggers_target of this OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactoryProperties.  # noqa: E501


        :return: The triggers_target of this OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactoryProperties.  # noqa: E501
        :rtype: ConfigNodePropertyString
        """
        return self._triggers_target

    @triggers_target.setter
    def triggers_target(self, triggers_target):
        """Sets the triggers_target of this OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactoryProperties.


        :param triggers_target: The triggers_target of this OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactoryProperties.  # noqa: E501
        :type: ConfigNodePropertyString
        """

        self._triggers_target = triggers_target

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
        if not isinstance(other, OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactoryProperties):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other