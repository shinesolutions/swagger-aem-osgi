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


class ComAdobeGraniteContexthubImplContextHubImplProperties(object):
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
        'com_adobe_granite_contexthub_silent_mode': 'ConfigNodePropertyBoolean',
        'com_adobe_granite_contexthub_show_ui': 'ConfigNodePropertyBoolean'
    }

    attribute_map = {
        'com_adobe_granite_contexthub_silent_mode': 'com.adobe.granite.contexthub.silent_mode',
        'com_adobe_granite_contexthub_show_ui': 'com.adobe.granite.contexthub.show_ui'
    }

    def __init__(self, com_adobe_granite_contexthub_silent_mode=None, com_adobe_granite_contexthub_show_ui=None):  # noqa: E501
        """ComAdobeGraniteContexthubImplContextHubImplProperties - a model defined in OpenAPI"""  # noqa: E501

        self._com_adobe_granite_contexthub_silent_mode = None
        self._com_adobe_granite_contexthub_show_ui = None
        self.discriminator = None

        if com_adobe_granite_contexthub_silent_mode is not None:
            self.com_adobe_granite_contexthub_silent_mode = com_adobe_granite_contexthub_silent_mode
        if com_adobe_granite_contexthub_show_ui is not None:
            self.com_adobe_granite_contexthub_show_ui = com_adobe_granite_contexthub_show_ui

    @property
    def com_adobe_granite_contexthub_silent_mode(self):
        """Gets the com_adobe_granite_contexthub_silent_mode of this ComAdobeGraniteContexthubImplContextHubImplProperties.  # noqa: E501


        :return: The com_adobe_granite_contexthub_silent_mode of this ComAdobeGraniteContexthubImplContextHubImplProperties.  # noqa: E501
        :rtype: ConfigNodePropertyBoolean
        """
        return self._com_adobe_granite_contexthub_silent_mode

    @com_adobe_granite_contexthub_silent_mode.setter
    def com_adobe_granite_contexthub_silent_mode(self, com_adobe_granite_contexthub_silent_mode):
        """Sets the com_adobe_granite_contexthub_silent_mode of this ComAdobeGraniteContexthubImplContextHubImplProperties.


        :param com_adobe_granite_contexthub_silent_mode: The com_adobe_granite_contexthub_silent_mode of this ComAdobeGraniteContexthubImplContextHubImplProperties.  # noqa: E501
        :type: ConfigNodePropertyBoolean
        """

        self._com_adobe_granite_contexthub_silent_mode = com_adobe_granite_contexthub_silent_mode

    @property
    def com_adobe_granite_contexthub_show_ui(self):
        """Gets the com_adobe_granite_contexthub_show_ui of this ComAdobeGraniteContexthubImplContextHubImplProperties.  # noqa: E501


        :return: The com_adobe_granite_contexthub_show_ui of this ComAdobeGraniteContexthubImplContextHubImplProperties.  # noqa: E501
        :rtype: ConfigNodePropertyBoolean
        """
        return self._com_adobe_granite_contexthub_show_ui

    @com_adobe_granite_contexthub_show_ui.setter
    def com_adobe_granite_contexthub_show_ui(self, com_adobe_granite_contexthub_show_ui):
        """Sets the com_adobe_granite_contexthub_show_ui of this ComAdobeGraniteContexthubImplContextHubImplProperties.


        :param com_adobe_granite_contexthub_show_ui: The com_adobe_granite_contexthub_show_ui of this ComAdobeGraniteContexthubImplContextHubImplProperties.  # noqa: E501
        :type: ConfigNodePropertyBoolean
        """

        self._com_adobe_granite_contexthub_show_ui = com_adobe_granite_contexthub_show_ui

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
        if not isinstance(other, ComAdobeGraniteContexthubImplContextHubImplProperties):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
