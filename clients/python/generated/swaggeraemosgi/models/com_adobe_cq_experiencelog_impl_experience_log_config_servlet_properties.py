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


class ComAdobeCqExperiencelogImplExperienceLogConfigServletProperties(object):
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
        'disabled_for_groups': 'ConfigNodePropertyArray'
    }

    attribute_map = {
        'enabled': 'enabled',
        'disabled_for_groups': 'disabledForGroups'
    }

    def __init__(self, enabled=None, disabled_for_groups=None):  # noqa: E501
        """ComAdobeCqExperiencelogImplExperienceLogConfigServletProperties - a model defined in OpenAPI"""  # noqa: E501

        self._enabled = None
        self._disabled_for_groups = None
        self.discriminator = None

        if enabled is not None:
            self.enabled = enabled
        if disabled_for_groups is not None:
            self.disabled_for_groups = disabled_for_groups

    @property
    def enabled(self):
        """Gets the enabled of this ComAdobeCqExperiencelogImplExperienceLogConfigServletProperties.  # noqa: E501


        :return: The enabled of this ComAdobeCqExperiencelogImplExperienceLogConfigServletProperties.  # noqa: E501
        :rtype: ConfigNodePropertyBoolean
        """
        return self._enabled

    @enabled.setter
    def enabled(self, enabled):
        """Sets the enabled of this ComAdobeCqExperiencelogImplExperienceLogConfigServletProperties.


        :param enabled: The enabled of this ComAdobeCqExperiencelogImplExperienceLogConfigServletProperties.  # noqa: E501
        :type: ConfigNodePropertyBoolean
        """

        self._enabled = enabled

    @property
    def disabled_for_groups(self):
        """Gets the disabled_for_groups of this ComAdobeCqExperiencelogImplExperienceLogConfigServletProperties.  # noqa: E501


        :return: The disabled_for_groups of this ComAdobeCqExperiencelogImplExperienceLogConfigServletProperties.  # noqa: E501
        :rtype: ConfigNodePropertyArray
        """
        return self._disabled_for_groups

    @disabled_for_groups.setter
    def disabled_for_groups(self, disabled_for_groups):
        """Sets the disabled_for_groups of this ComAdobeCqExperiencelogImplExperienceLogConfigServletProperties.


        :param disabled_for_groups: The disabled_for_groups of this ComAdobeCqExperiencelogImplExperienceLogConfigServletProperties.  # noqa: E501
        :type: ConfigNodePropertyArray
        """

        self._disabled_for_groups = disabled_for_groups

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
        if not isinstance(other, ComAdobeCqExperiencelogImplExperienceLogConfigServletProperties):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
