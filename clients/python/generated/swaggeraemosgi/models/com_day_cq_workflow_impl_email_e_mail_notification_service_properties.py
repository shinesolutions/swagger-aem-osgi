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


class ComDayCqWorkflowImplEmailEMailNotificationServiceProperties(object):
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
        'from_address': 'ConfigNodePropertyString',
        'host_prefix': 'ConfigNodePropertyString',
        'notify_onabort': 'ConfigNodePropertyBoolean',
        'notify_oncomplete': 'ConfigNodePropertyBoolean',
        'notify_oncontainercomplete': 'ConfigNodePropertyBoolean',
        'notify_useronly': 'ConfigNodePropertyBoolean'
    }

    attribute_map = {
        'from_address': 'from.address',
        'host_prefix': 'host.prefix',
        'notify_onabort': 'notify.onabort',
        'notify_oncomplete': 'notify.oncomplete',
        'notify_oncontainercomplete': 'notify.oncontainercomplete',
        'notify_useronly': 'notify.useronly'
    }

    def __init__(self, from_address=None, host_prefix=None, notify_onabort=None, notify_oncomplete=None, notify_oncontainercomplete=None, notify_useronly=None):  # noqa: E501
        """ComDayCqWorkflowImplEmailEMailNotificationServiceProperties - a model defined in OpenAPI"""  # noqa: E501

        self._from_address = None
        self._host_prefix = None
        self._notify_onabort = None
        self._notify_oncomplete = None
        self._notify_oncontainercomplete = None
        self._notify_useronly = None
        self.discriminator = None

        if from_address is not None:
            self.from_address = from_address
        if host_prefix is not None:
            self.host_prefix = host_prefix
        if notify_onabort is not None:
            self.notify_onabort = notify_onabort
        if notify_oncomplete is not None:
            self.notify_oncomplete = notify_oncomplete
        if notify_oncontainercomplete is not None:
            self.notify_oncontainercomplete = notify_oncontainercomplete
        if notify_useronly is not None:
            self.notify_useronly = notify_useronly

    @property
    def from_address(self):
        """Gets the from_address of this ComDayCqWorkflowImplEmailEMailNotificationServiceProperties.  # noqa: E501


        :return: The from_address of this ComDayCqWorkflowImplEmailEMailNotificationServiceProperties.  # noqa: E501
        :rtype: ConfigNodePropertyString
        """
        return self._from_address

    @from_address.setter
    def from_address(self, from_address):
        """Sets the from_address of this ComDayCqWorkflowImplEmailEMailNotificationServiceProperties.


        :param from_address: The from_address of this ComDayCqWorkflowImplEmailEMailNotificationServiceProperties.  # noqa: E501
        :type: ConfigNodePropertyString
        """

        self._from_address = from_address

    @property
    def host_prefix(self):
        """Gets the host_prefix of this ComDayCqWorkflowImplEmailEMailNotificationServiceProperties.  # noqa: E501


        :return: The host_prefix of this ComDayCqWorkflowImplEmailEMailNotificationServiceProperties.  # noqa: E501
        :rtype: ConfigNodePropertyString
        """
        return self._host_prefix

    @host_prefix.setter
    def host_prefix(self, host_prefix):
        """Sets the host_prefix of this ComDayCqWorkflowImplEmailEMailNotificationServiceProperties.


        :param host_prefix: The host_prefix of this ComDayCqWorkflowImplEmailEMailNotificationServiceProperties.  # noqa: E501
        :type: ConfigNodePropertyString
        """

        self._host_prefix = host_prefix

    @property
    def notify_onabort(self):
        """Gets the notify_onabort of this ComDayCqWorkflowImplEmailEMailNotificationServiceProperties.  # noqa: E501


        :return: The notify_onabort of this ComDayCqWorkflowImplEmailEMailNotificationServiceProperties.  # noqa: E501
        :rtype: ConfigNodePropertyBoolean
        """
        return self._notify_onabort

    @notify_onabort.setter
    def notify_onabort(self, notify_onabort):
        """Sets the notify_onabort of this ComDayCqWorkflowImplEmailEMailNotificationServiceProperties.


        :param notify_onabort: The notify_onabort of this ComDayCqWorkflowImplEmailEMailNotificationServiceProperties.  # noqa: E501
        :type: ConfigNodePropertyBoolean
        """

        self._notify_onabort = notify_onabort

    @property
    def notify_oncomplete(self):
        """Gets the notify_oncomplete of this ComDayCqWorkflowImplEmailEMailNotificationServiceProperties.  # noqa: E501


        :return: The notify_oncomplete of this ComDayCqWorkflowImplEmailEMailNotificationServiceProperties.  # noqa: E501
        :rtype: ConfigNodePropertyBoolean
        """
        return self._notify_oncomplete

    @notify_oncomplete.setter
    def notify_oncomplete(self, notify_oncomplete):
        """Sets the notify_oncomplete of this ComDayCqWorkflowImplEmailEMailNotificationServiceProperties.


        :param notify_oncomplete: The notify_oncomplete of this ComDayCqWorkflowImplEmailEMailNotificationServiceProperties.  # noqa: E501
        :type: ConfigNodePropertyBoolean
        """

        self._notify_oncomplete = notify_oncomplete

    @property
    def notify_oncontainercomplete(self):
        """Gets the notify_oncontainercomplete of this ComDayCqWorkflowImplEmailEMailNotificationServiceProperties.  # noqa: E501


        :return: The notify_oncontainercomplete of this ComDayCqWorkflowImplEmailEMailNotificationServiceProperties.  # noqa: E501
        :rtype: ConfigNodePropertyBoolean
        """
        return self._notify_oncontainercomplete

    @notify_oncontainercomplete.setter
    def notify_oncontainercomplete(self, notify_oncontainercomplete):
        """Sets the notify_oncontainercomplete of this ComDayCqWorkflowImplEmailEMailNotificationServiceProperties.


        :param notify_oncontainercomplete: The notify_oncontainercomplete of this ComDayCqWorkflowImplEmailEMailNotificationServiceProperties.  # noqa: E501
        :type: ConfigNodePropertyBoolean
        """

        self._notify_oncontainercomplete = notify_oncontainercomplete

    @property
    def notify_useronly(self):
        """Gets the notify_useronly of this ComDayCqWorkflowImplEmailEMailNotificationServiceProperties.  # noqa: E501


        :return: The notify_useronly of this ComDayCqWorkflowImplEmailEMailNotificationServiceProperties.  # noqa: E501
        :rtype: ConfigNodePropertyBoolean
        """
        return self._notify_useronly

    @notify_useronly.setter
    def notify_useronly(self, notify_useronly):
        """Sets the notify_useronly of this ComDayCqWorkflowImplEmailEMailNotificationServiceProperties.


        :param notify_useronly: The notify_useronly of this ComDayCqWorkflowImplEmailEMailNotificationServiceProperties.  # noqa: E501
        :type: ConfigNodePropertyBoolean
        """

        self._notify_useronly = notify_useronly

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
        if not isinstance(other, ComDayCqWorkflowImplEmailEMailNotificationServiceProperties):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
