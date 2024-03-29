# coding: utf-8

"""
    Adobe Experience Manager OSGI config (AEM) API

    Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API  # noqa: E501

    OpenAPI spec version: 1.0.0-pre.0
    Contact: opensource@shinesolutions.com
    Generated by: https://openapi-generator.tech
"""


import pprint
import re  # noqa: F401

import six


class OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties(object):
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
        'total_width': 'ConfigNodePropertyInteger',
        'col_width_name': 'ConfigNodePropertyInteger',
        'col_width_result': 'ConfigNodePropertyInteger',
        'col_width_timing': 'ConfigNodePropertyInteger'
    }

    attribute_map = {
        'total_width': 'totalWidth',
        'col_width_name': 'colWidthName',
        'col_width_result': 'colWidthResult',
        'col_width_timing': 'colWidthTiming'
    }

    def __init__(self, total_width=None, col_width_name=None, col_width_result=None, col_width_timing=None):  # noqa: E501
        """OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties - a model defined in OpenAPI"""  # noqa: E501

        self._total_width = None
        self._col_width_name = None
        self._col_width_result = None
        self._col_width_timing = None
        self.discriminator = None

        if total_width is not None:
            self.total_width = total_width
        if col_width_name is not None:
            self.col_width_name = col_width_name
        if col_width_result is not None:
            self.col_width_result = col_width_result
        if col_width_timing is not None:
            self.col_width_timing = col_width_timing

    @property
    def total_width(self):
        """Gets the total_width of this OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties.  # noqa: E501


        :return: The total_width of this OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties.  # noqa: E501
        :rtype: ConfigNodePropertyInteger
        """
        return self._total_width

    @total_width.setter
    def total_width(self, total_width):
        """Sets the total_width of this OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties.


        :param total_width: The total_width of this OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties.  # noqa: E501
        :type: ConfigNodePropertyInteger
        """

        self._total_width = total_width

    @property
    def col_width_name(self):
        """Gets the col_width_name of this OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties.  # noqa: E501


        :return: The col_width_name of this OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties.  # noqa: E501
        :rtype: ConfigNodePropertyInteger
        """
        return self._col_width_name

    @col_width_name.setter
    def col_width_name(self, col_width_name):
        """Sets the col_width_name of this OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties.


        :param col_width_name: The col_width_name of this OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties.  # noqa: E501
        :type: ConfigNodePropertyInteger
        """

        self._col_width_name = col_width_name

    @property
    def col_width_result(self):
        """Gets the col_width_result of this OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties.  # noqa: E501


        :return: The col_width_result of this OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties.  # noqa: E501
        :rtype: ConfigNodePropertyInteger
        """
        return self._col_width_result

    @col_width_result.setter
    def col_width_result(self, col_width_result):
        """Sets the col_width_result of this OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties.


        :param col_width_result: The col_width_result of this OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties.  # noqa: E501
        :type: ConfigNodePropertyInteger
        """

        self._col_width_result = col_width_result

    @property
    def col_width_timing(self):
        """Gets the col_width_timing of this OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties.  # noqa: E501


        :return: The col_width_timing of this OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties.  # noqa: E501
        :rtype: ConfigNodePropertyInteger
        """
        return self._col_width_timing

    @col_width_timing.setter
    def col_width_timing(self, col_width_timing):
        """Sets the col_width_timing of this OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties.


        :param col_width_timing: The col_width_timing of this OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties.  # noqa: E501
        :type: ConfigNodePropertyInteger
        """

        self._col_width_timing = col_width_timing

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
        if not isinstance(other, OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
