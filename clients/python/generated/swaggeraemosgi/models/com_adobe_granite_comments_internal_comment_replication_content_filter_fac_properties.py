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


class ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties(object):
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
        'replicate_comment_resource_types': 'ConfigNodePropertyArray'
    }

    attribute_map = {
        'replicate_comment_resource_types': 'replicate.comment.resourceTypes'
    }

    def __init__(self, replicate_comment_resource_types=None):  # noqa: E501
        """ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties - a model defined in OpenAPI"""  # noqa: E501

        self._replicate_comment_resource_types = None
        self.discriminator = None

        if replicate_comment_resource_types is not None:
            self.replicate_comment_resource_types = replicate_comment_resource_types

    @property
    def replicate_comment_resource_types(self):
        """Gets the replicate_comment_resource_types of this ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties.  # noqa: E501


        :return: The replicate_comment_resource_types of this ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties.  # noqa: E501
        :rtype: ConfigNodePropertyArray
        """
        return self._replicate_comment_resource_types

    @replicate_comment_resource_types.setter
    def replicate_comment_resource_types(self, replicate_comment_resource_types):
        """Sets the replicate_comment_resource_types of this ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties.


        :param replicate_comment_resource_types: The replicate_comment_resource_types of this ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties.  # noqa: E501
        :type: ConfigNodePropertyArray
        """

        self._replicate_comment_resource_types = replicate_comment_resource_types

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
        if not isinstance(other, ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
