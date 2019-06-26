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


class ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties(object):
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
        'dim_default_mode': 'ConfigNodePropertyDropDown',
        'dim_appcache_enabled': 'ConfigNodePropertyBoolean'
    }

    attribute_map = {
        'dim_default_mode': 'dim.default.mode',
        'dim_appcache_enabled': 'dim.appcache.enabled'
    }

    def __init__(self, dim_default_mode=None, dim_appcache_enabled=None):  # noqa: E501
        """ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties - a model defined in OpenAPI"""  # noqa: E501

        self._dim_default_mode = None
        self._dim_appcache_enabled = None
        self.discriminator = None

        if dim_default_mode is not None:
            self.dim_default_mode = dim_default_mode
        if dim_appcache_enabled is not None:
            self.dim_appcache_enabled = dim_appcache_enabled

    @property
    def dim_default_mode(self):
        """Gets the dim_default_mode of this ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties.  # noqa: E501


        :return: The dim_default_mode of this ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties.  # noqa: E501
        :rtype: ConfigNodePropertyDropDown
        """
        return self._dim_default_mode

    @dim_default_mode.setter
    def dim_default_mode(self, dim_default_mode):
        """Sets the dim_default_mode of this ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties.


        :param dim_default_mode: The dim_default_mode of this ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties.  # noqa: E501
        :type: ConfigNodePropertyDropDown
        """

        self._dim_default_mode = dim_default_mode

    @property
    def dim_appcache_enabled(self):
        """Gets the dim_appcache_enabled of this ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties.  # noqa: E501


        :return: The dim_appcache_enabled of this ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties.  # noqa: E501
        :rtype: ConfigNodePropertyBoolean
        """
        return self._dim_appcache_enabled

    @dim_appcache_enabled.setter
    def dim_appcache_enabled(self, dim_appcache_enabled):
        """Sets the dim_appcache_enabled of this ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties.


        :param dim_appcache_enabled: The dim_appcache_enabled of this ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties.  # noqa: E501
        :type: ConfigNodePropertyBoolean
        """

        self._dim_appcache_enabled = dim_appcache_enabled

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
        if not isinstance(other, ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
