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


class ComAdobeGraniteActivitystreamsImplActivityManagerImplProperties(object):
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
        'aggregate_relationships': 'ConfigNodePropertyArray',
        'aggregate_descend_virtual': 'ConfigNodePropertyBoolean'
    }

    attribute_map = {
        'aggregate_relationships': 'aggregate.relationships',
        'aggregate_descend_virtual': 'aggregate.descend.virtual'
    }

    def __init__(self, aggregate_relationships=None, aggregate_descend_virtual=None):  # noqa: E501
        """ComAdobeGraniteActivitystreamsImplActivityManagerImplProperties - a model defined in OpenAPI"""  # noqa: E501

        self._aggregate_relationships = None
        self._aggregate_descend_virtual = None
        self.discriminator = None

        if aggregate_relationships is not None:
            self.aggregate_relationships = aggregate_relationships
        if aggregate_descend_virtual is not None:
            self.aggregate_descend_virtual = aggregate_descend_virtual

    @property
    def aggregate_relationships(self):
        """Gets the aggregate_relationships of this ComAdobeGraniteActivitystreamsImplActivityManagerImplProperties.  # noqa: E501


        :return: The aggregate_relationships of this ComAdobeGraniteActivitystreamsImplActivityManagerImplProperties.  # noqa: E501
        :rtype: ConfigNodePropertyArray
        """
        return self._aggregate_relationships

    @aggregate_relationships.setter
    def aggregate_relationships(self, aggregate_relationships):
        """Sets the aggregate_relationships of this ComAdobeGraniteActivitystreamsImplActivityManagerImplProperties.


        :param aggregate_relationships: The aggregate_relationships of this ComAdobeGraniteActivitystreamsImplActivityManagerImplProperties.  # noqa: E501
        :type: ConfigNodePropertyArray
        """

        self._aggregate_relationships = aggregate_relationships

    @property
    def aggregate_descend_virtual(self):
        """Gets the aggregate_descend_virtual of this ComAdobeGraniteActivitystreamsImplActivityManagerImplProperties.  # noqa: E501


        :return: The aggregate_descend_virtual of this ComAdobeGraniteActivitystreamsImplActivityManagerImplProperties.  # noqa: E501
        :rtype: ConfigNodePropertyBoolean
        """
        return self._aggregate_descend_virtual

    @aggregate_descend_virtual.setter
    def aggregate_descend_virtual(self, aggregate_descend_virtual):
        """Sets the aggregate_descend_virtual of this ComAdobeGraniteActivitystreamsImplActivityManagerImplProperties.


        :param aggregate_descend_virtual: The aggregate_descend_virtual of this ComAdobeGraniteActivitystreamsImplActivityManagerImplProperties.  # noqa: E501
        :type: ConfigNodePropertyBoolean
        """

        self._aggregate_descend_virtual = aggregate_descend_virtual

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
        if not isinstance(other, ComAdobeGraniteActivitystreamsImplActivityManagerImplProperties):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other