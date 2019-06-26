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


class ComAdobeGraniteCompatrouterImplSwitchMappingConfigProperties(object):
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
        'group': 'ConfigNodePropertyString',
        'ids': 'ConfigNodePropertyArray'
    }

    attribute_map = {
        'group': 'group',
        'ids': 'ids'
    }

    def __init__(self, group=None, ids=None):  # noqa: E501
        """ComAdobeGraniteCompatrouterImplSwitchMappingConfigProperties - a model defined in OpenAPI"""  # noqa: E501

        self._group = None
        self._ids = None
        self.discriminator = None

        if group is not None:
            self.group = group
        if ids is not None:
            self.ids = ids

    @property
    def group(self):
        """Gets the group of this ComAdobeGraniteCompatrouterImplSwitchMappingConfigProperties.  # noqa: E501


        :return: The group of this ComAdobeGraniteCompatrouterImplSwitchMappingConfigProperties.  # noqa: E501
        :rtype: ConfigNodePropertyString
        """
        return self._group

    @group.setter
    def group(self, group):
        """Sets the group of this ComAdobeGraniteCompatrouterImplSwitchMappingConfigProperties.


        :param group: The group of this ComAdobeGraniteCompatrouterImplSwitchMappingConfigProperties.  # noqa: E501
        :type: ConfigNodePropertyString
        """

        self._group = group

    @property
    def ids(self):
        """Gets the ids of this ComAdobeGraniteCompatrouterImplSwitchMappingConfigProperties.  # noqa: E501


        :return: The ids of this ComAdobeGraniteCompatrouterImplSwitchMappingConfigProperties.  # noqa: E501
        :rtype: ConfigNodePropertyArray
        """
        return self._ids

    @ids.setter
    def ids(self, ids):
        """Sets the ids of this ComAdobeGraniteCompatrouterImplSwitchMappingConfigProperties.


        :param ids: The ids of this ComAdobeGraniteCompatrouterImplSwitchMappingConfigProperties.  # noqa: E501
        :type: ConfigNodePropertyArray
        """

        self._ids = ids

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
        if not isinstance(other, ComAdobeGraniteCompatrouterImplSwitchMappingConfigProperties):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other