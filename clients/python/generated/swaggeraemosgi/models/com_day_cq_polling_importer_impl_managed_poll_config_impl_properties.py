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


class ComDayCqPollingImporterImplManagedPollConfigImplProperties(object):
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
        'id': 'ConfigNodePropertyString',
        'enabled': 'ConfigNodePropertyBoolean',
        'reference': 'ConfigNodePropertyBoolean',
        'interval': 'ConfigNodePropertyInteger',
        'expression': 'ConfigNodePropertyString',
        'source': 'ConfigNodePropertyString',
        'target': 'ConfigNodePropertyString',
        'login': 'ConfigNodePropertyString',
        'password': 'ConfigNodePropertyString'
    }

    attribute_map = {
        'id': 'id',
        'enabled': 'enabled',
        'reference': 'reference',
        'interval': 'interval',
        'expression': 'expression',
        'source': 'source',
        'target': 'target',
        'login': 'login',
        'password': 'password'
    }

    def __init__(self, id=None, enabled=None, reference=None, interval=None, expression=None, source=None, target=None, login=None, password=None):  # noqa: E501
        """ComDayCqPollingImporterImplManagedPollConfigImplProperties - a model defined in OpenAPI"""  # noqa: E501

        self._id = None
        self._enabled = None
        self._reference = None
        self._interval = None
        self._expression = None
        self._source = None
        self._target = None
        self._login = None
        self._password = None
        self.discriminator = None

        if id is not None:
            self.id = id
        if enabled is not None:
            self.enabled = enabled
        if reference is not None:
            self.reference = reference
        if interval is not None:
            self.interval = interval
        if expression is not None:
            self.expression = expression
        if source is not None:
            self.source = source
        if target is not None:
            self.target = target
        if login is not None:
            self.login = login
        if password is not None:
            self.password = password

    @property
    def id(self):
        """Gets the id of this ComDayCqPollingImporterImplManagedPollConfigImplProperties.  # noqa: E501


        :return: The id of this ComDayCqPollingImporterImplManagedPollConfigImplProperties.  # noqa: E501
        :rtype: ConfigNodePropertyString
        """
        return self._id

    @id.setter
    def id(self, id):
        """Sets the id of this ComDayCqPollingImporterImplManagedPollConfigImplProperties.


        :param id: The id of this ComDayCqPollingImporterImplManagedPollConfigImplProperties.  # noqa: E501
        :type: ConfigNodePropertyString
        """

        self._id = id

    @property
    def enabled(self):
        """Gets the enabled of this ComDayCqPollingImporterImplManagedPollConfigImplProperties.  # noqa: E501


        :return: The enabled of this ComDayCqPollingImporterImplManagedPollConfigImplProperties.  # noqa: E501
        :rtype: ConfigNodePropertyBoolean
        """
        return self._enabled

    @enabled.setter
    def enabled(self, enabled):
        """Sets the enabled of this ComDayCqPollingImporterImplManagedPollConfigImplProperties.


        :param enabled: The enabled of this ComDayCqPollingImporterImplManagedPollConfigImplProperties.  # noqa: E501
        :type: ConfigNodePropertyBoolean
        """

        self._enabled = enabled

    @property
    def reference(self):
        """Gets the reference of this ComDayCqPollingImporterImplManagedPollConfigImplProperties.  # noqa: E501


        :return: The reference of this ComDayCqPollingImporterImplManagedPollConfigImplProperties.  # noqa: E501
        :rtype: ConfigNodePropertyBoolean
        """
        return self._reference

    @reference.setter
    def reference(self, reference):
        """Sets the reference of this ComDayCqPollingImporterImplManagedPollConfigImplProperties.


        :param reference: The reference of this ComDayCqPollingImporterImplManagedPollConfigImplProperties.  # noqa: E501
        :type: ConfigNodePropertyBoolean
        """

        self._reference = reference

    @property
    def interval(self):
        """Gets the interval of this ComDayCqPollingImporterImplManagedPollConfigImplProperties.  # noqa: E501


        :return: The interval of this ComDayCqPollingImporterImplManagedPollConfigImplProperties.  # noqa: E501
        :rtype: ConfigNodePropertyInteger
        """
        return self._interval

    @interval.setter
    def interval(self, interval):
        """Sets the interval of this ComDayCqPollingImporterImplManagedPollConfigImplProperties.


        :param interval: The interval of this ComDayCqPollingImporterImplManagedPollConfigImplProperties.  # noqa: E501
        :type: ConfigNodePropertyInteger
        """

        self._interval = interval

    @property
    def expression(self):
        """Gets the expression of this ComDayCqPollingImporterImplManagedPollConfigImplProperties.  # noqa: E501


        :return: The expression of this ComDayCqPollingImporterImplManagedPollConfigImplProperties.  # noqa: E501
        :rtype: ConfigNodePropertyString
        """
        return self._expression

    @expression.setter
    def expression(self, expression):
        """Sets the expression of this ComDayCqPollingImporterImplManagedPollConfigImplProperties.


        :param expression: The expression of this ComDayCqPollingImporterImplManagedPollConfigImplProperties.  # noqa: E501
        :type: ConfigNodePropertyString
        """

        self._expression = expression

    @property
    def source(self):
        """Gets the source of this ComDayCqPollingImporterImplManagedPollConfigImplProperties.  # noqa: E501


        :return: The source of this ComDayCqPollingImporterImplManagedPollConfigImplProperties.  # noqa: E501
        :rtype: ConfigNodePropertyString
        """
        return self._source

    @source.setter
    def source(self, source):
        """Sets the source of this ComDayCqPollingImporterImplManagedPollConfigImplProperties.


        :param source: The source of this ComDayCqPollingImporterImplManagedPollConfigImplProperties.  # noqa: E501
        :type: ConfigNodePropertyString
        """

        self._source = source

    @property
    def target(self):
        """Gets the target of this ComDayCqPollingImporterImplManagedPollConfigImplProperties.  # noqa: E501


        :return: The target of this ComDayCqPollingImporterImplManagedPollConfigImplProperties.  # noqa: E501
        :rtype: ConfigNodePropertyString
        """
        return self._target

    @target.setter
    def target(self, target):
        """Sets the target of this ComDayCqPollingImporterImplManagedPollConfigImplProperties.


        :param target: The target of this ComDayCqPollingImporterImplManagedPollConfigImplProperties.  # noqa: E501
        :type: ConfigNodePropertyString
        """

        self._target = target

    @property
    def login(self):
        """Gets the login of this ComDayCqPollingImporterImplManagedPollConfigImplProperties.  # noqa: E501


        :return: The login of this ComDayCqPollingImporterImplManagedPollConfigImplProperties.  # noqa: E501
        :rtype: ConfigNodePropertyString
        """
        return self._login

    @login.setter
    def login(self, login):
        """Sets the login of this ComDayCqPollingImporterImplManagedPollConfigImplProperties.


        :param login: The login of this ComDayCqPollingImporterImplManagedPollConfigImplProperties.  # noqa: E501
        :type: ConfigNodePropertyString
        """

        self._login = login

    @property
    def password(self):
        """Gets the password of this ComDayCqPollingImporterImplManagedPollConfigImplProperties.  # noqa: E501


        :return: The password of this ComDayCqPollingImporterImplManagedPollConfigImplProperties.  # noqa: E501
        :rtype: ConfigNodePropertyString
        """
        return self._password

    @password.setter
    def password(self, password):
        """Sets the password of this ComDayCqPollingImporterImplManagedPollConfigImplProperties.


        :param password: The password of this ComDayCqPollingImporterImplManagedPollConfigImplProperties.  # noqa: E501
        :type: ConfigNodePropertyString
        """

        self._password = password

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
        if not isinstance(other, ComDayCqPollingImporterImplManagedPollConfigImplProperties):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
