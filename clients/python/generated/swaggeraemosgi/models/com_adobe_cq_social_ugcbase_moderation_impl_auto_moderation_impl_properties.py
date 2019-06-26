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


class ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties(object):
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
        'automoderation_sequence': 'ConfigNodePropertyArray',
        'automoderation_onfailurestop': 'ConfigNodePropertyBoolean'
    }

    attribute_map = {
        'automoderation_sequence': 'automoderation.sequence',
        'automoderation_onfailurestop': 'automoderation.onfailurestop'
    }

    def __init__(self, automoderation_sequence=None, automoderation_onfailurestop=None):  # noqa: E501
        """ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties - a model defined in OpenAPI"""  # noqa: E501

        self._automoderation_sequence = None
        self._automoderation_onfailurestop = None
        self.discriminator = None

        if automoderation_sequence is not None:
            self.automoderation_sequence = automoderation_sequence
        if automoderation_onfailurestop is not None:
            self.automoderation_onfailurestop = automoderation_onfailurestop

    @property
    def automoderation_sequence(self):
        """Gets the automoderation_sequence of this ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties.  # noqa: E501


        :return: The automoderation_sequence of this ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties.  # noqa: E501
        :rtype: ConfigNodePropertyArray
        """
        return self._automoderation_sequence

    @automoderation_sequence.setter
    def automoderation_sequence(self, automoderation_sequence):
        """Sets the automoderation_sequence of this ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties.


        :param automoderation_sequence: The automoderation_sequence of this ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties.  # noqa: E501
        :type: ConfigNodePropertyArray
        """

        self._automoderation_sequence = automoderation_sequence

    @property
    def automoderation_onfailurestop(self):
        """Gets the automoderation_onfailurestop of this ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties.  # noqa: E501


        :return: The automoderation_onfailurestop of this ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties.  # noqa: E501
        :rtype: ConfigNodePropertyBoolean
        """
        return self._automoderation_onfailurestop

    @automoderation_onfailurestop.setter
    def automoderation_onfailurestop(self, automoderation_onfailurestop):
        """Sets the automoderation_onfailurestop of this ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties.


        :param automoderation_onfailurestop: The automoderation_onfailurestop of this ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties.  # noqa: E501
        :type: ConfigNodePropertyBoolean
        """

        self._automoderation_onfailurestop = automoderation_onfailurestop

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
        if not isinstance(other, ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
