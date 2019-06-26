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


class ComAdobeCqSocialUserImplTransportHttpToPublisherProperties(object):
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
        'enable': 'ConfigNodePropertyBoolean',
        'agent_configuration': 'ConfigNodePropertyArray',
        'context_path': 'ConfigNodePropertyString',
        'disabled_cipher_suites': 'ConfigNodePropertyArray',
        'enabled_cipher_suites': 'ConfigNodePropertyArray'
    }

    attribute_map = {
        'enable': 'enable',
        'agent_configuration': 'agent.configuration',
        'context_path': 'context.path',
        'disabled_cipher_suites': 'disabled.cipher.suites',
        'enabled_cipher_suites': 'enabled.cipher.suites'
    }

    def __init__(self, enable=None, agent_configuration=None, context_path=None, disabled_cipher_suites=None, enabled_cipher_suites=None):  # noqa: E501
        """ComAdobeCqSocialUserImplTransportHttpToPublisherProperties - a model defined in OpenAPI"""  # noqa: E501

        self._enable = None
        self._agent_configuration = None
        self._context_path = None
        self._disabled_cipher_suites = None
        self._enabled_cipher_suites = None
        self.discriminator = None

        if enable is not None:
            self.enable = enable
        if agent_configuration is not None:
            self.agent_configuration = agent_configuration
        if context_path is not None:
            self.context_path = context_path
        if disabled_cipher_suites is not None:
            self.disabled_cipher_suites = disabled_cipher_suites
        if enabled_cipher_suites is not None:
            self.enabled_cipher_suites = enabled_cipher_suites

    @property
    def enable(self):
        """Gets the enable of this ComAdobeCqSocialUserImplTransportHttpToPublisherProperties.  # noqa: E501


        :return: The enable of this ComAdobeCqSocialUserImplTransportHttpToPublisherProperties.  # noqa: E501
        :rtype: ConfigNodePropertyBoolean
        """
        return self._enable

    @enable.setter
    def enable(self, enable):
        """Sets the enable of this ComAdobeCqSocialUserImplTransportHttpToPublisherProperties.


        :param enable: The enable of this ComAdobeCqSocialUserImplTransportHttpToPublisherProperties.  # noqa: E501
        :type: ConfigNodePropertyBoolean
        """

        self._enable = enable

    @property
    def agent_configuration(self):
        """Gets the agent_configuration of this ComAdobeCqSocialUserImplTransportHttpToPublisherProperties.  # noqa: E501


        :return: The agent_configuration of this ComAdobeCqSocialUserImplTransportHttpToPublisherProperties.  # noqa: E501
        :rtype: ConfigNodePropertyArray
        """
        return self._agent_configuration

    @agent_configuration.setter
    def agent_configuration(self, agent_configuration):
        """Sets the agent_configuration of this ComAdobeCqSocialUserImplTransportHttpToPublisherProperties.


        :param agent_configuration: The agent_configuration of this ComAdobeCqSocialUserImplTransportHttpToPublisherProperties.  # noqa: E501
        :type: ConfigNodePropertyArray
        """

        self._agent_configuration = agent_configuration

    @property
    def context_path(self):
        """Gets the context_path of this ComAdobeCqSocialUserImplTransportHttpToPublisherProperties.  # noqa: E501


        :return: The context_path of this ComAdobeCqSocialUserImplTransportHttpToPublisherProperties.  # noqa: E501
        :rtype: ConfigNodePropertyString
        """
        return self._context_path

    @context_path.setter
    def context_path(self, context_path):
        """Sets the context_path of this ComAdobeCqSocialUserImplTransportHttpToPublisherProperties.


        :param context_path: The context_path of this ComAdobeCqSocialUserImplTransportHttpToPublisherProperties.  # noqa: E501
        :type: ConfigNodePropertyString
        """

        self._context_path = context_path

    @property
    def disabled_cipher_suites(self):
        """Gets the disabled_cipher_suites of this ComAdobeCqSocialUserImplTransportHttpToPublisherProperties.  # noqa: E501


        :return: The disabled_cipher_suites of this ComAdobeCqSocialUserImplTransportHttpToPublisherProperties.  # noqa: E501
        :rtype: ConfigNodePropertyArray
        """
        return self._disabled_cipher_suites

    @disabled_cipher_suites.setter
    def disabled_cipher_suites(self, disabled_cipher_suites):
        """Sets the disabled_cipher_suites of this ComAdobeCqSocialUserImplTransportHttpToPublisherProperties.


        :param disabled_cipher_suites: The disabled_cipher_suites of this ComAdobeCqSocialUserImplTransportHttpToPublisherProperties.  # noqa: E501
        :type: ConfigNodePropertyArray
        """

        self._disabled_cipher_suites = disabled_cipher_suites

    @property
    def enabled_cipher_suites(self):
        """Gets the enabled_cipher_suites of this ComAdobeCqSocialUserImplTransportHttpToPublisherProperties.  # noqa: E501


        :return: The enabled_cipher_suites of this ComAdobeCqSocialUserImplTransportHttpToPublisherProperties.  # noqa: E501
        :rtype: ConfigNodePropertyArray
        """
        return self._enabled_cipher_suites

    @enabled_cipher_suites.setter
    def enabled_cipher_suites(self, enabled_cipher_suites):
        """Sets the enabled_cipher_suites of this ComAdobeCqSocialUserImplTransportHttpToPublisherProperties.


        :param enabled_cipher_suites: The enabled_cipher_suites of this ComAdobeCqSocialUserImplTransportHttpToPublisherProperties.  # noqa: E501
        :type: ConfigNodePropertyArray
        """

        self._enabled_cipher_suites = enabled_cipher_suites

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
        if not isinstance(other, ComAdobeCqSocialUserImplTransportHttpToPublisherProperties):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other