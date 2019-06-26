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


class ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties(object):
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
        'service_max_links_per_host': 'ConfigNodePropertyInteger',
        'service_save_external_link_references': 'ConfigNodePropertyBoolean'
    }

    attribute_map = {
        'service_max_links_per_host': 'service.max_links_per_host',
        'service_save_external_link_references': 'service.save_external_link_references'
    }

    def __init__(self, service_max_links_per_host=None, service_save_external_link_references=None):  # noqa: E501
        """ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties - a model defined in OpenAPI"""  # noqa: E501

        self._service_max_links_per_host = None
        self._service_save_external_link_references = None
        self.discriminator = None

        if service_max_links_per_host is not None:
            self.service_max_links_per_host = service_max_links_per_host
        if service_save_external_link_references is not None:
            self.service_save_external_link_references = service_save_external_link_references

    @property
    def service_max_links_per_host(self):
        """Gets the service_max_links_per_host of this ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties.  # noqa: E501


        :return: The service_max_links_per_host of this ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties.  # noqa: E501
        :rtype: ConfigNodePropertyInteger
        """
        return self._service_max_links_per_host

    @service_max_links_per_host.setter
    def service_max_links_per_host(self, service_max_links_per_host):
        """Sets the service_max_links_per_host of this ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties.


        :param service_max_links_per_host: The service_max_links_per_host of this ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties.  # noqa: E501
        :type: ConfigNodePropertyInteger
        """

        self._service_max_links_per_host = service_max_links_per_host

    @property
    def service_save_external_link_references(self):
        """Gets the service_save_external_link_references of this ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties.  # noqa: E501


        :return: The service_save_external_link_references of this ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties.  # noqa: E501
        :rtype: ConfigNodePropertyBoolean
        """
        return self._service_save_external_link_references

    @service_save_external_link_references.setter
    def service_save_external_link_references(self, service_save_external_link_references):
        """Sets the service_save_external_link_references of this ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties.


        :param service_save_external_link_references: The service_save_external_link_references of this ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties.  # noqa: E501
        :type: ConfigNodePropertyBoolean
        """

        self._service_save_external_link_references = service_save_external_link_references

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
        if not isinstance(other, ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other