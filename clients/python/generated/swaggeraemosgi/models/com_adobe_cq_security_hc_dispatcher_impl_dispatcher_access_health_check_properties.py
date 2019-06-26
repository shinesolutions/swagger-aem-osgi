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


class ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties(object):
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
        'hc_tags': 'ConfigNodePropertyArray',
        'dispatcher_address': 'ConfigNodePropertyString',
        'dispatcher_filter_allowed': 'ConfigNodePropertyArray',
        'dispatcher_filter_blocked': 'ConfigNodePropertyArray'
    }

    attribute_map = {
        'hc_tags': 'hc.tags',
        'dispatcher_address': 'dispatcher.address',
        'dispatcher_filter_allowed': 'dispatcher.filter.allowed',
        'dispatcher_filter_blocked': 'dispatcher.filter.blocked'
    }

    def __init__(self, hc_tags=None, dispatcher_address=None, dispatcher_filter_allowed=None, dispatcher_filter_blocked=None):  # noqa: E501
        """ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties - a model defined in OpenAPI"""  # noqa: E501

        self._hc_tags = None
        self._dispatcher_address = None
        self._dispatcher_filter_allowed = None
        self._dispatcher_filter_blocked = None
        self.discriminator = None

        if hc_tags is not None:
            self.hc_tags = hc_tags
        if dispatcher_address is not None:
            self.dispatcher_address = dispatcher_address
        if dispatcher_filter_allowed is not None:
            self.dispatcher_filter_allowed = dispatcher_filter_allowed
        if dispatcher_filter_blocked is not None:
            self.dispatcher_filter_blocked = dispatcher_filter_blocked

    @property
    def hc_tags(self):
        """Gets the hc_tags of this ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties.  # noqa: E501


        :return: The hc_tags of this ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties.  # noqa: E501
        :rtype: ConfigNodePropertyArray
        """
        return self._hc_tags

    @hc_tags.setter
    def hc_tags(self, hc_tags):
        """Sets the hc_tags of this ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties.


        :param hc_tags: The hc_tags of this ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties.  # noqa: E501
        :type: ConfigNodePropertyArray
        """

        self._hc_tags = hc_tags

    @property
    def dispatcher_address(self):
        """Gets the dispatcher_address of this ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties.  # noqa: E501


        :return: The dispatcher_address of this ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties.  # noqa: E501
        :rtype: ConfigNodePropertyString
        """
        return self._dispatcher_address

    @dispatcher_address.setter
    def dispatcher_address(self, dispatcher_address):
        """Sets the dispatcher_address of this ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties.


        :param dispatcher_address: The dispatcher_address of this ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties.  # noqa: E501
        :type: ConfigNodePropertyString
        """

        self._dispatcher_address = dispatcher_address

    @property
    def dispatcher_filter_allowed(self):
        """Gets the dispatcher_filter_allowed of this ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties.  # noqa: E501


        :return: The dispatcher_filter_allowed of this ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties.  # noqa: E501
        :rtype: ConfigNodePropertyArray
        """
        return self._dispatcher_filter_allowed

    @dispatcher_filter_allowed.setter
    def dispatcher_filter_allowed(self, dispatcher_filter_allowed):
        """Sets the dispatcher_filter_allowed of this ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties.


        :param dispatcher_filter_allowed: The dispatcher_filter_allowed of this ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties.  # noqa: E501
        :type: ConfigNodePropertyArray
        """

        self._dispatcher_filter_allowed = dispatcher_filter_allowed

    @property
    def dispatcher_filter_blocked(self):
        """Gets the dispatcher_filter_blocked of this ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties.  # noqa: E501


        :return: The dispatcher_filter_blocked of this ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties.  # noqa: E501
        :rtype: ConfigNodePropertyArray
        """
        return self._dispatcher_filter_blocked

    @dispatcher_filter_blocked.setter
    def dispatcher_filter_blocked(self, dispatcher_filter_blocked):
        """Sets the dispatcher_filter_blocked of this ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties.


        :param dispatcher_filter_blocked: The dispatcher_filter_blocked of this ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties.  # noqa: E501
        :type: ConfigNodePropertyArray
        """

        self._dispatcher_filter_blocked = dispatcher_filter_blocked

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
        if not isinstance(other, ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other