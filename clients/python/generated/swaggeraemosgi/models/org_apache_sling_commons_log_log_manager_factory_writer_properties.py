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


class OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties(object):
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
        'org_apache_sling_commons_log_file': 'ConfigNodePropertyString',
        'org_apache_sling_commons_log_file_number': 'ConfigNodePropertyInteger',
        'org_apache_sling_commons_log_file_size': 'ConfigNodePropertyString',
        'org_apache_sling_commons_log_file_buffered': 'ConfigNodePropertyBoolean'
    }

    attribute_map = {
        'org_apache_sling_commons_log_file': 'org.apache.sling.commons.log.file',
        'org_apache_sling_commons_log_file_number': 'org.apache.sling.commons.log.file.number',
        'org_apache_sling_commons_log_file_size': 'org.apache.sling.commons.log.file.size',
        'org_apache_sling_commons_log_file_buffered': 'org.apache.sling.commons.log.file.buffered'
    }

    def __init__(self, org_apache_sling_commons_log_file=None, org_apache_sling_commons_log_file_number=None, org_apache_sling_commons_log_file_size=None, org_apache_sling_commons_log_file_buffered=None):  # noqa: E501
        """OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties - a model defined in OpenAPI"""  # noqa: E501

        self._org_apache_sling_commons_log_file = None
        self._org_apache_sling_commons_log_file_number = None
        self._org_apache_sling_commons_log_file_size = None
        self._org_apache_sling_commons_log_file_buffered = None
        self.discriminator = None

        if org_apache_sling_commons_log_file is not None:
            self.org_apache_sling_commons_log_file = org_apache_sling_commons_log_file
        if org_apache_sling_commons_log_file_number is not None:
            self.org_apache_sling_commons_log_file_number = org_apache_sling_commons_log_file_number
        if org_apache_sling_commons_log_file_size is not None:
            self.org_apache_sling_commons_log_file_size = org_apache_sling_commons_log_file_size
        if org_apache_sling_commons_log_file_buffered is not None:
            self.org_apache_sling_commons_log_file_buffered = org_apache_sling_commons_log_file_buffered

    @property
    def org_apache_sling_commons_log_file(self):
        """Gets the org_apache_sling_commons_log_file of this OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties.  # noqa: E501


        :return: The org_apache_sling_commons_log_file of this OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties.  # noqa: E501
        :rtype: ConfigNodePropertyString
        """
        return self._org_apache_sling_commons_log_file

    @org_apache_sling_commons_log_file.setter
    def org_apache_sling_commons_log_file(self, org_apache_sling_commons_log_file):
        """Sets the org_apache_sling_commons_log_file of this OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties.


        :param org_apache_sling_commons_log_file: The org_apache_sling_commons_log_file of this OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties.  # noqa: E501
        :type: ConfigNodePropertyString
        """

        self._org_apache_sling_commons_log_file = org_apache_sling_commons_log_file

    @property
    def org_apache_sling_commons_log_file_number(self):
        """Gets the org_apache_sling_commons_log_file_number of this OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties.  # noqa: E501


        :return: The org_apache_sling_commons_log_file_number of this OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties.  # noqa: E501
        :rtype: ConfigNodePropertyInteger
        """
        return self._org_apache_sling_commons_log_file_number

    @org_apache_sling_commons_log_file_number.setter
    def org_apache_sling_commons_log_file_number(self, org_apache_sling_commons_log_file_number):
        """Sets the org_apache_sling_commons_log_file_number of this OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties.


        :param org_apache_sling_commons_log_file_number: The org_apache_sling_commons_log_file_number of this OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties.  # noqa: E501
        :type: ConfigNodePropertyInteger
        """

        self._org_apache_sling_commons_log_file_number = org_apache_sling_commons_log_file_number

    @property
    def org_apache_sling_commons_log_file_size(self):
        """Gets the org_apache_sling_commons_log_file_size of this OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties.  # noqa: E501


        :return: The org_apache_sling_commons_log_file_size of this OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties.  # noqa: E501
        :rtype: ConfigNodePropertyString
        """
        return self._org_apache_sling_commons_log_file_size

    @org_apache_sling_commons_log_file_size.setter
    def org_apache_sling_commons_log_file_size(self, org_apache_sling_commons_log_file_size):
        """Sets the org_apache_sling_commons_log_file_size of this OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties.


        :param org_apache_sling_commons_log_file_size: The org_apache_sling_commons_log_file_size of this OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties.  # noqa: E501
        :type: ConfigNodePropertyString
        """

        self._org_apache_sling_commons_log_file_size = org_apache_sling_commons_log_file_size

    @property
    def org_apache_sling_commons_log_file_buffered(self):
        """Gets the org_apache_sling_commons_log_file_buffered of this OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties.  # noqa: E501


        :return: The org_apache_sling_commons_log_file_buffered of this OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties.  # noqa: E501
        :rtype: ConfigNodePropertyBoolean
        """
        return self._org_apache_sling_commons_log_file_buffered

    @org_apache_sling_commons_log_file_buffered.setter
    def org_apache_sling_commons_log_file_buffered(self, org_apache_sling_commons_log_file_buffered):
        """Sets the org_apache_sling_commons_log_file_buffered of this OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties.


        :param org_apache_sling_commons_log_file_buffered: The org_apache_sling_commons_log_file_buffered of this OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties.  # noqa: E501
        :type: ConfigNodePropertyBoolean
        """

        self._org_apache_sling_commons_log_file_buffered = org_apache_sling_commons_log_file_buffered

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
        if not isinstance(other, OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
