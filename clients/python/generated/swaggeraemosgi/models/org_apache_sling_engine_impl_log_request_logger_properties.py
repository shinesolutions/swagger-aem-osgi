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


class OrgApacheSlingEngineImplLogRequestLoggerProperties(object):
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
        'request_log_output': 'ConfigNodePropertyString',
        'request_log_outputtype': 'ConfigNodePropertyDropDown',
        'request_log_enabled': 'ConfigNodePropertyBoolean',
        'access_log_output': 'ConfigNodePropertyString',
        'access_log_outputtype': 'ConfigNodePropertyDropDown',
        'access_log_enabled': 'ConfigNodePropertyBoolean'
    }

    attribute_map = {
        'request_log_output': 'request.log.output',
        'request_log_outputtype': 'request.log.outputtype',
        'request_log_enabled': 'request.log.enabled',
        'access_log_output': 'access.log.output',
        'access_log_outputtype': 'access.log.outputtype',
        'access_log_enabled': 'access.log.enabled'
    }

    def __init__(self, request_log_output=None, request_log_outputtype=None, request_log_enabled=None, access_log_output=None, access_log_outputtype=None, access_log_enabled=None):  # noqa: E501
        """OrgApacheSlingEngineImplLogRequestLoggerProperties - a model defined in OpenAPI"""  # noqa: E501

        self._request_log_output = None
        self._request_log_outputtype = None
        self._request_log_enabled = None
        self._access_log_output = None
        self._access_log_outputtype = None
        self._access_log_enabled = None
        self.discriminator = None

        if request_log_output is not None:
            self.request_log_output = request_log_output
        if request_log_outputtype is not None:
            self.request_log_outputtype = request_log_outputtype
        if request_log_enabled is not None:
            self.request_log_enabled = request_log_enabled
        if access_log_output is not None:
            self.access_log_output = access_log_output
        if access_log_outputtype is not None:
            self.access_log_outputtype = access_log_outputtype
        if access_log_enabled is not None:
            self.access_log_enabled = access_log_enabled

    @property
    def request_log_output(self):
        """Gets the request_log_output of this OrgApacheSlingEngineImplLogRequestLoggerProperties.  # noqa: E501


        :return: The request_log_output of this OrgApacheSlingEngineImplLogRequestLoggerProperties.  # noqa: E501
        :rtype: ConfigNodePropertyString
        """
        return self._request_log_output

    @request_log_output.setter
    def request_log_output(self, request_log_output):
        """Sets the request_log_output of this OrgApacheSlingEngineImplLogRequestLoggerProperties.


        :param request_log_output: The request_log_output of this OrgApacheSlingEngineImplLogRequestLoggerProperties.  # noqa: E501
        :type: ConfigNodePropertyString
        """

        self._request_log_output = request_log_output

    @property
    def request_log_outputtype(self):
        """Gets the request_log_outputtype of this OrgApacheSlingEngineImplLogRequestLoggerProperties.  # noqa: E501


        :return: The request_log_outputtype of this OrgApacheSlingEngineImplLogRequestLoggerProperties.  # noqa: E501
        :rtype: ConfigNodePropertyDropDown
        """
        return self._request_log_outputtype

    @request_log_outputtype.setter
    def request_log_outputtype(self, request_log_outputtype):
        """Sets the request_log_outputtype of this OrgApacheSlingEngineImplLogRequestLoggerProperties.


        :param request_log_outputtype: The request_log_outputtype of this OrgApacheSlingEngineImplLogRequestLoggerProperties.  # noqa: E501
        :type: ConfigNodePropertyDropDown
        """

        self._request_log_outputtype = request_log_outputtype

    @property
    def request_log_enabled(self):
        """Gets the request_log_enabled of this OrgApacheSlingEngineImplLogRequestLoggerProperties.  # noqa: E501


        :return: The request_log_enabled of this OrgApacheSlingEngineImplLogRequestLoggerProperties.  # noqa: E501
        :rtype: ConfigNodePropertyBoolean
        """
        return self._request_log_enabled

    @request_log_enabled.setter
    def request_log_enabled(self, request_log_enabled):
        """Sets the request_log_enabled of this OrgApacheSlingEngineImplLogRequestLoggerProperties.


        :param request_log_enabled: The request_log_enabled of this OrgApacheSlingEngineImplLogRequestLoggerProperties.  # noqa: E501
        :type: ConfigNodePropertyBoolean
        """

        self._request_log_enabled = request_log_enabled

    @property
    def access_log_output(self):
        """Gets the access_log_output of this OrgApacheSlingEngineImplLogRequestLoggerProperties.  # noqa: E501


        :return: The access_log_output of this OrgApacheSlingEngineImplLogRequestLoggerProperties.  # noqa: E501
        :rtype: ConfigNodePropertyString
        """
        return self._access_log_output

    @access_log_output.setter
    def access_log_output(self, access_log_output):
        """Sets the access_log_output of this OrgApacheSlingEngineImplLogRequestLoggerProperties.


        :param access_log_output: The access_log_output of this OrgApacheSlingEngineImplLogRequestLoggerProperties.  # noqa: E501
        :type: ConfigNodePropertyString
        """

        self._access_log_output = access_log_output

    @property
    def access_log_outputtype(self):
        """Gets the access_log_outputtype of this OrgApacheSlingEngineImplLogRequestLoggerProperties.  # noqa: E501


        :return: The access_log_outputtype of this OrgApacheSlingEngineImplLogRequestLoggerProperties.  # noqa: E501
        :rtype: ConfigNodePropertyDropDown
        """
        return self._access_log_outputtype

    @access_log_outputtype.setter
    def access_log_outputtype(self, access_log_outputtype):
        """Sets the access_log_outputtype of this OrgApacheSlingEngineImplLogRequestLoggerProperties.


        :param access_log_outputtype: The access_log_outputtype of this OrgApacheSlingEngineImplLogRequestLoggerProperties.  # noqa: E501
        :type: ConfigNodePropertyDropDown
        """

        self._access_log_outputtype = access_log_outputtype

    @property
    def access_log_enabled(self):
        """Gets the access_log_enabled of this OrgApacheSlingEngineImplLogRequestLoggerProperties.  # noqa: E501


        :return: The access_log_enabled of this OrgApacheSlingEngineImplLogRequestLoggerProperties.  # noqa: E501
        :rtype: ConfigNodePropertyBoolean
        """
        return self._access_log_enabled

    @access_log_enabled.setter
    def access_log_enabled(self, access_log_enabled):
        """Sets the access_log_enabled of this OrgApacheSlingEngineImplLogRequestLoggerProperties.


        :param access_log_enabled: The access_log_enabled of this OrgApacheSlingEngineImplLogRequestLoggerProperties.  # noqa: E501
        :type: ConfigNodePropertyBoolean
        """

        self._access_log_enabled = access_log_enabled

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
        if not isinstance(other, OrgApacheSlingEngineImplLogRequestLoggerProperties):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
