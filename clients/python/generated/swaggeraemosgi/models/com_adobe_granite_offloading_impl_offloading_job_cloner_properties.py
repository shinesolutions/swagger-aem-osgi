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


class ComAdobeGraniteOffloadingImplOffloadingJobClonerProperties(object):
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
        'offloading_jobcloner_enabled': 'ConfigNodePropertyBoolean'
    }

    attribute_map = {
        'offloading_jobcloner_enabled': 'offloading.jobcloner.enabled'
    }

    def __init__(self, offloading_jobcloner_enabled=None):  # noqa: E501
        """ComAdobeGraniteOffloadingImplOffloadingJobClonerProperties - a model defined in OpenAPI"""  # noqa: E501

        self._offloading_jobcloner_enabled = None
        self.discriminator = None

        if offloading_jobcloner_enabled is not None:
            self.offloading_jobcloner_enabled = offloading_jobcloner_enabled

    @property
    def offloading_jobcloner_enabled(self):
        """Gets the offloading_jobcloner_enabled of this ComAdobeGraniteOffloadingImplOffloadingJobClonerProperties.  # noqa: E501


        :return: The offloading_jobcloner_enabled of this ComAdobeGraniteOffloadingImplOffloadingJobClonerProperties.  # noqa: E501
        :rtype: ConfigNodePropertyBoolean
        """
        return self._offloading_jobcloner_enabled

    @offloading_jobcloner_enabled.setter
    def offloading_jobcloner_enabled(self, offloading_jobcloner_enabled):
        """Sets the offloading_jobcloner_enabled of this ComAdobeGraniteOffloadingImplOffloadingJobClonerProperties.


        :param offloading_jobcloner_enabled: The offloading_jobcloner_enabled of this ComAdobeGraniteOffloadingImplOffloadingJobClonerProperties.  # noqa: E501
        :type: ConfigNodePropertyBoolean
        """

        self._offloading_jobcloner_enabled = offloading_jobcloner_enabled

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
        if not isinstance(other, ComAdobeGraniteOffloadingImplOffloadingJobClonerProperties):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other