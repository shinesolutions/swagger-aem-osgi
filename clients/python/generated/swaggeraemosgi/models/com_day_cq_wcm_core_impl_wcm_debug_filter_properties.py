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


class ComDayCqWcmCoreImplWCMDebugFilterProperties(object):
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
        'wcmdbgfilter_enabled': 'ConfigNodePropertyBoolean',
        'wcmdbgfilter_jsp_debug': 'ConfigNodePropertyBoolean'
    }

    attribute_map = {
        'wcmdbgfilter_enabled': 'wcmdbgfilter.enabled',
        'wcmdbgfilter_jsp_debug': 'wcmdbgfilter.jspDebug'
    }

    def __init__(self, wcmdbgfilter_enabled=None, wcmdbgfilter_jsp_debug=None):  # noqa: E501
        """ComDayCqWcmCoreImplWCMDebugFilterProperties - a model defined in OpenAPI"""  # noqa: E501

        self._wcmdbgfilter_enabled = None
        self._wcmdbgfilter_jsp_debug = None
        self.discriminator = None

        if wcmdbgfilter_enabled is not None:
            self.wcmdbgfilter_enabled = wcmdbgfilter_enabled
        if wcmdbgfilter_jsp_debug is not None:
            self.wcmdbgfilter_jsp_debug = wcmdbgfilter_jsp_debug

    @property
    def wcmdbgfilter_enabled(self):
        """Gets the wcmdbgfilter_enabled of this ComDayCqWcmCoreImplWCMDebugFilterProperties.  # noqa: E501


        :return: The wcmdbgfilter_enabled of this ComDayCqWcmCoreImplWCMDebugFilterProperties.  # noqa: E501
        :rtype: ConfigNodePropertyBoolean
        """
        return self._wcmdbgfilter_enabled

    @wcmdbgfilter_enabled.setter
    def wcmdbgfilter_enabled(self, wcmdbgfilter_enabled):
        """Sets the wcmdbgfilter_enabled of this ComDayCqWcmCoreImplWCMDebugFilterProperties.


        :param wcmdbgfilter_enabled: The wcmdbgfilter_enabled of this ComDayCqWcmCoreImplWCMDebugFilterProperties.  # noqa: E501
        :type: ConfigNodePropertyBoolean
        """

        self._wcmdbgfilter_enabled = wcmdbgfilter_enabled

    @property
    def wcmdbgfilter_jsp_debug(self):
        """Gets the wcmdbgfilter_jsp_debug of this ComDayCqWcmCoreImplWCMDebugFilterProperties.  # noqa: E501


        :return: The wcmdbgfilter_jsp_debug of this ComDayCqWcmCoreImplWCMDebugFilterProperties.  # noqa: E501
        :rtype: ConfigNodePropertyBoolean
        """
        return self._wcmdbgfilter_jsp_debug

    @wcmdbgfilter_jsp_debug.setter
    def wcmdbgfilter_jsp_debug(self, wcmdbgfilter_jsp_debug):
        """Sets the wcmdbgfilter_jsp_debug of this ComDayCqWcmCoreImplWCMDebugFilterProperties.


        :param wcmdbgfilter_jsp_debug: The wcmdbgfilter_jsp_debug of this ComDayCqWcmCoreImplWCMDebugFilterProperties.  # noqa: E501
        :type: ConfigNodePropertyBoolean
        """

        self._wcmdbgfilter_jsp_debug = wcmdbgfilter_jsp_debug

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
        if not isinstance(other, ComDayCqWcmCoreImplWCMDebugFilterProperties):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
