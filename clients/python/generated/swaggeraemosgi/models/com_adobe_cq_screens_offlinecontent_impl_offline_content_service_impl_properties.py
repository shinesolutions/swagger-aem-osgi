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


class ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplProperties(object):
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
        'disable_smart_sync': 'ConfigNodePropertyBoolean'
    }

    attribute_map = {
        'disable_smart_sync': 'disableSmartSync'
    }

    def __init__(self, disable_smart_sync=None):  # noqa: E501
        """ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplProperties - a model defined in OpenAPI"""  # noqa: E501

        self._disable_smart_sync = None
        self.discriminator = None

        if disable_smart_sync is not None:
            self.disable_smart_sync = disable_smart_sync

    @property
    def disable_smart_sync(self):
        """Gets the disable_smart_sync of this ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplProperties.  # noqa: E501


        :return: The disable_smart_sync of this ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplProperties.  # noqa: E501
        :rtype: ConfigNodePropertyBoolean
        """
        return self._disable_smart_sync

    @disable_smart_sync.setter
    def disable_smart_sync(self, disable_smart_sync):
        """Sets the disable_smart_sync of this ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplProperties.


        :param disable_smart_sync: The disable_smart_sync of this ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplProperties.  # noqa: E501
        :type: ConfigNodePropertyBoolean
        """

        self._disable_smart_sync = disable_smart_sync

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
        if not isinstance(other, ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplProperties):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
