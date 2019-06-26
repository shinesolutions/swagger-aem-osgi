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


class ComDayCqWcmMsmImplServletsAuditLogServletProperties(object):
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
        'auditlogservlet_default_events_count': 'ConfigNodePropertyInteger',
        'auditlogservlet_default_path': 'ConfigNodePropertyString'
    }

    attribute_map = {
        'auditlogservlet_default_events_count': 'auditlogservlet.default.events.count',
        'auditlogservlet_default_path': 'auditlogservlet.default.path'
    }

    def __init__(self, auditlogservlet_default_events_count=None, auditlogservlet_default_path=None):  # noqa: E501
        """ComDayCqWcmMsmImplServletsAuditLogServletProperties - a model defined in OpenAPI"""  # noqa: E501

        self._auditlogservlet_default_events_count = None
        self._auditlogservlet_default_path = None
        self.discriminator = None

        if auditlogservlet_default_events_count is not None:
            self.auditlogservlet_default_events_count = auditlogservlet_default_events_count
        if auditlogservlet_default_path is not None:
            self.auditlogservlet_default_path = auditlogservlet_default_path

    @property
    def auditlogservlet_default_events_count(self):
        """Gets the auditlogservlet_default_events_count of this ComDayCqWcmMsmImplServletsAuditLogServletProperties.  # noqa: E501


        :return: The auditlogservlet_default_events_count of this ComDayCqWcmMsmImplServletsAuditLogServletProperties.  # noqa: E501
        :rtype: ConfigNodePropertyInteger
        """
        return self._auditlogservlet_default_events_count

    @auditlogservlet_default_events_count.setter
    def auditlogservlet_default_events_count(self, auditlogservlet_default_events_count):
        """Sets the auditlogservlet_default_events_count of this ComDayCqWcmMsmImplServletsAuditLogServletProperties.


        :param auditlogservlet_default_events_count: The auditlogservlet_default_events_count of this ComDayCqWcmMsmImplServletsAuditLogServletProperties.  # noqa: E501
        :type: ConfigNodePropertyInteger
        """

        self._auditlogservlet_default_events_count = auditlogservlet_default_events_count

    @property
    def auditlogservlet_default_path(self):
        """Gets the auditlogservlet_default_path of this ComDayCqWcmMsmImplServletsAuditLogServletProperties.  # noqa: E501


        :return: The auditlogservlet_default_path of this ComDayCqWcmMsmImplServletsAuditLogServletProperties.  # noqa: E501
        :rtype: ConfigNodePropertyString
        """
        return self._auditlogservlet_default_path

    @auditlogservlet_default_path.setter
    def auditlogservlet_default_path(self, auditlogservlet_default_path):
        """Sets the auditlogservlet_default_path of this ComDayCqWcmMsmImplServletsAuditLogServletProperties.


        :param auditlogservlet_default_path: The auditlogservlet_default_path of this ComDayCqWcmMsmImplServletsAuditLogServletProperties.  # noqa: E501
        :type: ConfigNodePropertyString
        """

        self._auditlogservlet_default_path = auditlogservlet_default_path

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
        if not isinstance(other, ComDayCqWcmMsmImplServletsAuditLogServletProperties):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other