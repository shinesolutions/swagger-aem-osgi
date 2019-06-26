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


class ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties(object):
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
        'enabled': 'ConfigNodePropertyBoolean',
        'agent_name': 'ConfigNodePropertyString',
        'diff_path': 'ConfigNodePropertyString',
        'observed_path': 'ConfigNodePropertyString',
        'service_name': 'ConfigNodePropertyString',
        'property_names': 'ConfigNodePropertyString',
        'distribution_delay': 'ConfigNodePropertyInteger',
        'service_user_target': 'ConfigNodePropertyString'
    }

    attribute_map = {
        'enabled': 'enabled',
        'agent_name': 'agentName',
        'diff_path': 'diffPath',
        'observed_path': 'observedPath',
        'service_name': 'serviceName',
        'property_names': 'propertyNames',
        'distribution_delay': 'distributionDelay',
        'service_user_target': 'serviceUser.target'
    }

    def __init__(self, enabled=None, agent_name=None, diff_path=None, observed_path=None, service_name=None, property_names=None, distribution_delay=None, service_user_target=None):  # noqa: E501
        """ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties - a model defined in OpenAPI"""  # noqa: E501

        self._enabled = None
        self._agent_name = None
        self._diff_path = None
        self._observed_path = None
        self._service_name = None
        self._property_names = None
        self._distribution_delay = None
        self._service_user_target = None
        self.discriminator = None

        if enabled is not None:
            self.enabled = enabled
        if agent_name is not None:
            self.agent_name = agent_name
        if diff_path is not None:
            self.diff_path = diff_path
        if observed_path is not None:
            self.observed_path = observed_path
        if service_name is not None:
            self.service_name = service_name
        if property_names is not None:
            self.property_names = property_names
        if distribution_delay is not None:
            self.distribution_delay = distribution_delay
        if service_user_target is not None:
            self.service_user_target = service_user_target

    @property
    def enabled(self):
        """Gets the enabled of this ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties.  # noqa: E501


        :return: The enabled of this ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties.  # noqa: E501
        :rtype: ConfigNodePropertyBoolean
        """
        return self._enabled

    @enabled.setter
    def enabled(self, enabled):
        """Sets the enabled of this ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties.


        :param enabled: The enabled of this ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties.  # noqa: E501
        :type: ConfigNodePropertyBoolean
        """

        self._enabled = enabled

    @property
    def agent_name(self):
        """Gets the agent_name of this ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties.  # noqa: E501


        :return: The agent_name of this ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties.  # noqa: E501
        :rtype: ConfigNodePropertyString
        """
        return self._agent_name

    @agent_name.setter
    def agent_name(self, agent_name):
        """Sets the agent_name of this ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties.


        :param agent_name: The agent_name of this ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties.  # noqa: E501
        :type: ConfigNodePropertyString
        """

        self._agent_name = agent_name

    @property
    def diff_path(self):
        """Gets the diff_path of this ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties.  # noqa: E501


        :return: The diff_path of this ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties.  # noqa: E501
        :rtype: ConfigNodePropertyString
        """
        return self._diff_path

    @diff_path.setter
    def diff_path(self, diff_path):
        """Sets the diff_path of this ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties.


        :param diff_path: The diff_path of this ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties.  # noqa: E501
        :type: ConfigNodePropertyString
        """

        self._diff_path = diff_path

    @property
    def observed_path(self):
        """Gets the observed_path of this ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties.  # noqa: E501


        :return: The observed_path of this ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties.  # noqa: E501
        :rtype: ConfigNodePropertyString
        """
        return self._observed_path

    @observed_path.setter
    def observed_path(self, observed_path):
        """Sets the observed_path of this ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties.


        :param observed_path: The observed_path of this ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties.  # noqa: E501
        :type: ConfigNodePropertyString
        """

        self._observed_path = observed_path

    @property
    def service_name(self):
        """Gets the service_name of this ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties.  # noqa: E501


        :return: The service_name of this ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties.  # noqa: E501
        :rtype: ConfigNodePropertyString
        """
        return self._service_name

    @service_name.setter
    def service_name(self, service_name):
        """Sets the service_name of this ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties.


        :param service_name: The service_name of this ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties.  # noqa: E501
        :type: ConfigNodePropertyString
        """

        self._service_name = service_name

    @property
    def property_names(self):
        """Gets the property_names of this ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties.  # noqa: E501


        :return: The property_names of this ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties.  # noqa: E501
        :rtype: ConfigNodePropertyString
        """
        return self._property_names

    @property_names.setter
    def property_names(self, property_names):
        """Sets the property_names of this ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties.


        :param property_names: The property_names of this ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties.  # noqa: E501
        :type: ConfigNodePropertyString
        """

        self._property_names = property_names

    @property
    def distribution_delay(self):
        """Gets the distribution_delay of this ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties.  # noqa: E501


        :return: The distribution_delay of this ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties.  # noqa: E501
        :rtype: ConfigNodePropertyInteger
        """
        return self._distribution_delay

    @distribution_delay.setter
    def distribution_delay(self, distribution_delay):
        """Sets the distribution_delay of this ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties.


        :param distribution_delay: The distribution_delay of this ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties.  # noqa: E501
        :type: ConfigNodePropertyInteger
        """

        self._distribution_delay = distribution_delay

    @property
    def service_user_target(self):
        """Gets the service_user_target of this ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties.  # noqa: E501


        :return: The service_user_target of this ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties.  # noqa: E501
        :rtype: ConfigNodePropertyString
        """
        return self._service_user_target

    @service_user_target.setter
    def service_user_target(self, service_user_target):
        """Sets the service_user_target of this ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties.


        :param service_user_target: The service_user_target of this ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties.  # noqa: E501
        :type: ConfigNodePropertyString
        """

        self._service_user_target = service_user_target

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
        if not isinstance(other, ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
