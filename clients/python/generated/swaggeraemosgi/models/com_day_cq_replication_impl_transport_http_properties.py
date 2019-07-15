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


class ComDayCqReplicationImplTransportHttpProperties(object):
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
        'disabled_cipher_suites': 'ConfigNodePropertyArray',
        'enabled_cipher_suites': 'ConfigNodePropertyArray'
    }

    attribute_map = {
        'disabled_cipher_suites': 'disabled.cipher.suites',
        'enabled_cipher_suites': 'enabled.cipher.suites'
    }

    def __init__(self, disabled_cipher_suites=None, enabled_cipher_suites=None):  # noqa: E501
        """ComDayCqReplicationImplTransportHttpProperties - a model defined in OpenAPI"""  # noqa: E501

        self._disabled_cipher_suites = None
        self._enabled_cipher_suites = None
        self.discriminator = None

        if disabled_cipher_suites is not None:
            self.disabled_cipher_suites = disabled_cipher_suites
        if enabled_cipher_suites is not None:
            self.enabled_cipher_suites = enabled_cipher_suites

    @property
    def disabled_cipher_suites(self):
        """Gets the disabled_cipher_suites of this ComDayCqReplicationImplTransportHttpProperties.  # noqa: E501


        :return: The disabled_cipher_suites of this ComDayCqReplicationImplTransportHttpProperties.  # noqa: E501
        :rtype: ConfigNodePropertyArray
        """
        return self._disabled_cipher_suites

    @disabled_cipher_suites.setter
    def disabled_cipher_suites(self, disabled_cipher_suites):
        """Sets the disabled_cipher_suites of this ComDayCqReplicationImplTransportHttpProperties.


        :param disabled_cipher_suites: The disabled_cipher_suites of this ComDayCqReplicationImplTransportHttpProperties.  # noqa: E501
        :type: ConfigNodePropertyArray
        """

        self._disabled_cipher_suites = disabled_cipher_suites

    @property
    def enabled_cipher_suites(self):
        """Gets the enabled_cipher_suites of this ComDayCqReplicationImplTransportHttpProperties.  # noqa: E501


        :return: The enabled_cipher_suites of this ComDayCqReplicationImplTransportHttpProperties.  # noqa: E501
        :rtype: ConfigNodePropertyArray
        """
        return self._enabled_cipher_suites

    @enabled_cipher_suites.setter
    def enabled_cipher_suites(self, enabled_cipher_suites):
        """Sets the enabled_cipher_suites of this ComDayCqReplicationImplTransportHttpProperties.


        :param enabled_cipher_suites: The enabled_cipher_suites of this ComDayCqReplicationImplTransportHttpProperties.  # noqa: E501
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
        if not isinstance(other, ComDayCqReplicationImplTransportHttpProperties):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
