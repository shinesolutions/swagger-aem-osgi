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


class ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckProperties(object):
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
        'number_of_retries_allowed': 'ConfigNodePropertyInteger',
        'hc_tags': 'ConfigNodePropertyArray'
    }

    attribute_map = {
        'number_of_retries_allowed': 'number.of.retries.allowed',
        'hc_tags': 'hc.tags'
    }

    def __init__(self, number_of_retries_allowed=None, hc_tags=None):  # noqa: E501
        """ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckProperties - a model defined in OpenAPI"""  # noqa: E501

        self._number_of_retries_allowed = None
        self._hc_tags = None
        self.discriminator = None

        if number_of_retries_allowed is not None:
            self.number_of_retries_allowed = number_of_retries_allowed
        if hc_tags is not None:
            self.hc_tags = hc_tags

    @property
    def number_of_retries_allowed(self):
        """Gets the number_of_retries_allowed of this ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckProperties.  # noqa: E501


        :return: The number_of_retries_allowed of this ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckProperties.  # noqa: E501
        :rtype: ConfigNodePropertyInteger
        """
        return self._number_of_retries_allowed

    @number_of_retries_allowed.setter
    def number_of_retries_allowed(self, number_of_retries_allowed):
        """Sets the number_of_retries_allowed of this ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckProperties.


        :param number_of_retries_allowed: The number_of_retries_allowed of this ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckProperties.  # noqa: E501
        :type: ConfigNodePropertyInteger
        """

        self._number_of_retries_allowed = number_of_retries_allowed

    @property
    def hc_tags(self):
        """Gets the hc_tags of this ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckProperties.  # noqa: E501


        :return: The hc_tags of this ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckProperties.  # noqa: E501
        :rtype: ConfigNodePropertyArray
        """
        return self._hc_tags

    @hc_tags.setter
    def hc_tags(self, hc_tags):
        """Sets the hc_tags of this ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckProperties.


        :param hc_tags: The hc_tags of this ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckProperties.  # noqa: E501
        :type: ConfigNodePropertyArray
        """

        self._hc_tags = hc_tags

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
        if not isinstance(other, ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckProperties):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
