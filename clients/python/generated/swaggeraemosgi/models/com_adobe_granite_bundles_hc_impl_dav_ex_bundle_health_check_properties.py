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


class ComAdobeGraniteBundlesHcImplDavExBundleHealthCheckProperties(object):
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
        'hc_tags': 'ConfigNodePropertyArray'
    }

    attribute_map = {
        'hc_tags': 'hc.tags'
    }

    def __init__(self, hc_tags=None):  # noqa: E501
        """ComAdobeGraniteBundlesHcImplDavExBundleHealthCheckProperties - a model defined in OpenAPI"""  # noqa: E501

        self._hc_tags = None
        self.discriminator = None

        if hc_tags is not None:
            self.hc_tags = hc_tags

    @property
    def hc_tags(self):
        """Gets the hc_tags of this ComAdobeGraniteBundlesHcImplDavExBundleHealthCheckProperties.  # noqa: E501


        :return: The hc_tags of this ComAdobeGraniteBundlesHcImplDavExBundleHealthCheckProperties.  # noqa: E501
        :rtype: ConfigNodePropertyArray
        """
        return self._hc_tags

    @hc_tags.setter
    def hc_tags(self, hc_tags):
        """Sets the hc_tags of this ComAdobeGraniteBundlesHcImplDavExBundleHealthCheckProperties.


        :param hc_tags: The hc_tags of this ComAdobeGraniteBundlesHcImplDavExBundleHealthCheckProperties.  # noqa: E501
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
        if not isinstance(other, ComAdobeGraniteBundlesHcImplDavExBundleHealthCheckProperties):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
