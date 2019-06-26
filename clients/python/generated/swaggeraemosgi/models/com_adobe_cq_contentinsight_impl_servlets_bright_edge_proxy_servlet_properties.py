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


class ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletProperties(object):
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
        'brightedge_url': 'ConfigNodePropertyString'
    }

    attribute_map = {
        'brightedge_url': 'brightedge.url'
    }

    def __init__(self, brightedge_url=None):  # noqa: E501
        """ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletProperties - a model defined in OpenAPI"""  # noqa: E501

        self._brightedge_url = None
        self.discriminator = None

        if brightedge_url is not None:
            self.brightedge_url = brightedge_url

    @property
    def brightedge_url(self):
        """Gets the brightedge_url of this ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletProperties.  # noqa: E501


        :return: The brightedge_url of this ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletProperties.  # noqa: E501
        :rtype: ConfigNodePropertyString
        """
        return self._brightedge_url

    @brightedge_url.setter
    def brightedge_url(self, brightedge_url):
        """Sets the brightedge_url of this ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletProperties.


        :param brightedge_url: The brightedge_url of this ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletProperties.  # noqa: E501
        :type: ConfigNodePropertyString
        """

        self._brightedge_url = brightedge_url

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
        if not isinstance(other, ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletProperties):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
