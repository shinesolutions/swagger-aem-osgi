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


class ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationsServiceImplProperties(object):
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
        'message_properties': 'ConfigNodePropertyArray',
        'message_box_size_limit': 'ConfigNodePropertyInteger',
        'message_count_limit': 'ConfigNodePropertyInteger',
        'notify_failure': 'ConfigNodePropertyBoolean',
        'failure_message_from': 'ConfigNodePropertyString',
        'failure_template_path': 'ConfigNodePropertyString',
        'max_retries': 'ConfigNodePropertyInteger',
        'min_wait_between_retries': 'ConfigNodePropertyInteger',
        'count_update_pool_size': 'ConfigNodePropertyInteger',
        'inbox_path': 'ConfigNodePropertyString',
        'sentitems_path': 'ConfigNodePropertyString',
        'support_attachments': 'ConfigNodePropertyBoolean',
        'support_group_messaging': 'ConfigNodePropertyBoolean',
        'max_total_recipients': 'ConfigNodePropertyInteger',
        'batch_size': 'ConfigNodePropertyInteger',
        'max_total_attachment_size': 'ConfigNodePropertyInteger',
        'attachment_type_blacklist': 'ConfigNodePropertyArray',
        'allowed_attachment_types': 'ConfigNodePropertyArray',
        'service_selector': 'ConfigNodePropertyString',
        'field_whitelist': 'ConfigNodePropertyArray'
    }

    attribute_map = {
        'message_properties': 'message.properties',
        'message_box_size_limit': 'messageBoxSizeLimit',
        'message_count_limit': 'messageCountLimit',
        'notify_failure': 'notifyFailure',
        'failure_message_from': 'failureMessageFrom',
        'failure_template_path': 'failureTemplatePath',
        'max_retries': 'maxRetries',
        'min_wait_between_retries': 'minWaitBetweenRetries',
        'count_update_pool_size': 'countUpdatePoolSize',
        'inbox_path': 'inbox.path',
        'sentitems_path': 'sentitems.path',
        'support_attachments': 'supportAttachments',
        'support_group_messaging': 'supportGroupMessaging',
        'max_total_recipients': 'maxTotalRecipients',
        'batch_size': 'batchSize',
        'max_total_attachment_size': 'maxTotalAttachmentSize',
        'attachment_type_blacklist': 'attachmentTypeBlacklist',
        'allowed_attachment_types': 'allowedAttachmentTypes',
        'service_selector': 'serviceSelector',
        'field_whitelist': 'fieldWhitelist'
    }

    def __init__(self, message_properties=None, message_box_size_limit=None, message_count_limit=None, notify_failure=None, failure_message_from=None, failure_template_path=None, max_retries=None, min_wait_between_retries=None, count_update_pool_size=None, inbox_path=None, sentitems_path=None, support_attachments=None, support_group_messaging=None, max_total_recipients=None, batch_size=None, max_total_attachment_size=None, attachment_type_blacklist=None, allowed_attachment_types=None, service_selector=None, field_whitelist=None):  # noqa: E501
        """ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationsServiceImplProperties - a model defined in OpenAPI"""  # noqa: E501

        self._message_properties = None
        self._message_box_size_limit = None
        self._message_count_limit = None
        self._notify_failure = None
        self._failure_message_from = None
        self._failure_template_path = None
        self._max_retries = None
        self._min_wait_between_retries = None
        self._count_update_pool_size = None
        self._inbox_path = None
        self._sentitems_path = None
        self._support_attachments = None
        self._support_group_messaging = None
        self._max_total_recipients = None
        self._batch_size = None
        self._max_total_attachment_size = None
        self._attachment_type_blacklist = None
        self._allowed_attachment_types = None
        self._service_selector = None
        self._field_whitelist = None
        self.discriminator = None

        if message_properties is not None:
            self.message_properties = message_properties
        if message_box_size_limit is not None:
            self.message_box_size_limit = message_box_size_limit
        if message_count_limit is not None:
            self.message_count_limit = message_count_limit
        if notify_failure is not None:
            self.notify_failure = notify_failure
        if failure_message_from is not None:
            self.failure_message_from = failure_message_from
        if failure_template_path is not None:
            self.failure_template_path = failure_template_path
        if max_retries is not None:
            self.max_retries = max_retries
        if min_wait_between_retries is not None:
            self.min_wait_between_retries = min_wait_between_retries
        if count_update_pool_size is not None:
            self.count_update_pool_size = count_update_pool_size
        if inbox_path is not None:
            self.inbox_path = inbox_path
        if sentitems_path is not None:
            self.sentitems_path = sentitems_path
        if support_attachments is not None:
            self.support_attachments = support_attachments
        if support_group_messaging is not None:
            self.support_group_messaging = support_group_messaging
        if max_total_recipients is not None:
            self.max_total_recipients = max_total_recipients
        if batch_size is not None:
            self.batch_size = batch_size
        if max_total_attachment_size is not None:
            self.max_total_attachment_size = max_total_attachment_size
        if attachment_type_blacklist is not None:
            self.attachment_type_blacklist = attachment_type_blacklist
        if allowed_attachment_types is not None:
            self.allowed_attachment_types = allowed_attachment_types
        if service_selector is not None:
            self.service_selector = service_selector
        if field_whitelist is not None:
            self.field_whitelist = field_whitelist

    @property
    def message_properties(self):
        """Gets the message_properties of this ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationsServiceImplProperties.  # noqa: E501


        :return: The message_properties of this ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationsServiceImplProperties.  # noqa: E501
        :rtype: ConfigNodePropertyArray
        """
        return self._message_properties

    @message_properties.setter
    def message_properties(self, message_properties):
        """Sets the message_properties of this ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationsServiceImplProperties.


        :param message_properties: The message_properties of this ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationsServiceImplProperties.  # noqa: E501
        :type: ConfigNodePropertyArray
        """

        self._message_properties = message_properties

    @property
    def message_box_size_limit(self):
        """Gets the message_box_size_limit of this ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationsServiceImplProperties.  # noqa: E501


        :return: The message_box_size_limit of this ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationsServiceImplProperties.  # noqa: E501
        :rtype: ConfigNodePropertyInteger
        """
        return self._message_box_size_limit

    @message_box_size_limit.setter
    def message_box_size_limit(self, message_box_size_limit):
        """Sets the message_box_size_limit of this ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationsServiceImplProperties.


        :param message_box_size_limit: The message_box_size_limit of this ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationsServiceImplProperties.  # noqa: E501
        :type: ConfigNodePropertyInteger
        """

        self._message_box_size_limit = message_box_size_limit

    @property
    def message_count_limit(self):
        """Gets the message_count_limit of this ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationsServiceImplProperties.  # noqa: E501


        :return: The message_count_limit of this ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationsServiceImplProperties.  # noqa: E501
        :rtype: ConfigNodePropertyInteger
        """
        return self._message_count_limit

    @message_count_limit.setter
    def message_count_limit(self, message_count_limit):
        """Sets the message_count_limit of this ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationsServiceImplProperties.


        :param message_count_limit: The message_count_limit of this ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationsServiceImplProperties.  # noqa: E501
        :type: ConfigNodePropertyInteger
        """

        self._message_count_limit = message_count_limit

    @property
    def notify_failure(self):
        """Gets the notify_failure of this ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationsServiceImplProperties.  # noqa: E501


        :return: The notify_failure of this ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationsServiceImplProperties.  # noqa: E501
        :rtype: ConfigNodePropertyBoolean
        """
        return self._notify_failure

    @notify_failure.setter
    def notify_failure(self, notify_failure):
        """Sets the notify_failure of this ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationsServiceImplProperties.


        :param notify_failure: The notify_failure of this ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationsServiceImplProperties.  # noqa: E501
        :type: ConfigNodePropertyBoolean
        """

        self._notify_failure = notify_failure

    @property
    def failure_message_from(self):
        """Gets the failure_message_from of this ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationsServiceImplProperties.  # noqa: E501


        :return: The failure_message_from of this ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationsServiceImplProperties.  # noqa: E501
        :rtype: ConfigNodePropertyString
        """
        return self._failure_message_from

    @failure_message_from.setter
    def failure_message_from(self, failure_message_from):
        """Sets the failure_message_from of this ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationsServiceImplProperties.


        :param failure_message_from: The failure_message_from of this ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationsServiceImplProperties.  # noqa: E501
        :type: ConfigNodePropertyString
        """

        self._failure_message_from = failure_message_from

    @property
    def failure_template_path(self):
        """Gets the failure_template_path of this ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationsServiceImplProperties.  # noqa: E501


        :return: The failure_template_path of this ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationsServiceImplProperties.  # noqa: E501
        :rtype: ConfigNodePropertyString
        """
        return self._failure_template_path

    @failure_template_path.setter
    def failure_template_path(self, failure_template_path):
        """Sets the failure_template_path of this ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationsServiceImplProperties.


        :param failure_template_path: The failure_template_path of this ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationsServiceImplProperties.  # noqa: E501
        :type: ConfigNodePropertyString
        """

        self._failure_template_path = failure_template_path

    @property
    def max_retries(self):
        """Gets the max_retries of this ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationsServiceImplProperties.  # noqa: E501


        :return: The max_retries of this ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationsServiceImplProperties.  # noqa: E501
        :rtype: ConfigNodePropertyInteger
        """
        return self._max_retries

    @max_retries.setter
    def max_retries(self, max_retries):
        """Sets the max_retries of this ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationsServiceImplProperties.


        :param max_retries: The max_retries of this ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationsServiceImplProperties.  # noqa: E501
        :type: ConfigNodePropertyInteger
        """

        self._max_retries = max_retries

    @property
    def min_wait_between_retries(self):
        """Gets the min_wait_between_retries of this ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationsServiceImplProperties.  # noqa: E501


        :return: The min_wait_between_retries of this ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationsServiceImplProperties.  # noqa: E501
        :rtype: ConfigNodePropertyInteger
        """
        return self._min_wait_between_retries

    @min_wait_between_retries.setter
    def min_wait_between_retries(self, min_wait_between_retries):
        """Sets the min_wait_between_retries of this ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationsServiceImplProperties.


        :param min_wait_between_retries: The min_wait_between_retries of this ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationsServiceImplProperties.  # noqa: E501
        :type: ConfigNodePropertyInteger
        """

        self._min_wait_between_retries = min_wait_between_retries

    @property
    def count_update_pool_size(self):
        """Gets the count_update_pool_size of this ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationsServiceImplProperties.  # noqa: E501


        :return: The count_update_pool_size of this ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationsServiceImplProperties.  # noqa: E501
        :rtype: ConfigNodePropertyInteger
        """
        return self._count_update_pool_size

    @count_update_pool_size.setter
    def count_update_pool_size(self, count_update_pool_size):
        """Sets the count_update_pool_size of this ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationsServiceImplProperties.


        :param count_update_pool_size: The count_update_pool_size of this ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationsServiceImplProperties.  # noqa: E501
        :type: ConfigNodePropertyInteger
        """

        self._count_update_pool_size = count_update_pool_size

    @property
    def inbox_path(self):
        """Gets the inbox_path of this ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationsServiceImplProperties.  # noqa: E501


        :return: The inbox_path of this ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationsServiceImplProperties.  # noqa: E501
        :rtype: ConfigNodePropertyString
        """
        return self._inbox_path

    @inbox_path.setter
    def inbox_path(self, inbox_path):
        """Sets the inbox_path of this ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationsServiceImplProperties.


        :param inbox_path: The inbox_path of this ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationsServiceImplProperties.  # noqa: E501
        :type: ConfigNodePropertyString
        """

        self._inbox_path = inbox_path

    @property
    def sentitems_path(self):
        """Gets the sentitems_path of this ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationsServiceImplProperties.  # noqa: E501


        :return: The sentitems_path of this ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationsServiceImplProperties.  # noqa: E501
        :rtype: ConfigNodePropertyString
        """
        return self._sentitems_path

    @sentitems_path.setter
    def sentitems_path(self, sentitems_path):
        """Sets the sentitems_path of this ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationsServiceImplProperties.


        :param sentitems_path: The sentitems_path of this ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationsServiceImplProperties.  # noqa: E501
        :type: ConfigNodePropertyString
        """

        self._sentitems_path = sentitems_path

    @property
    def support_attachments(self):
        """Gets the support_attachments of this ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationsServiceImplProperties.  # noqa: E501


        :return: The support_attachments of this ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationsServiceImplProperties.  # noqa: E501
        :rtype: ConfigNodePropertyBoolean
        """
        return self._support_attachments

    @support_attachments.setter
    def support_attachments(self, support_attachments):
        """Sets the support_attachments of this ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationsServiceImplProperties.


        :param support_attachments: The support_attachments of this ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationsServiceImplProperties.  # noqa: E501
        :type: ConfigNodePropertyBoolean
        """

        self._support_attachments = support_attachments

    @property
    def support_group_messaging(self):
        """Gets the support_group_messaging of this ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationsServiceImplProperties.  # noqa: E501


        :return: The support_group_messaging of this ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationsServiceImplProperties.  # noqa: E501
        :rtype: ConfigNodePropertyBoolean
        """
        return self._support_group_messaging

    @support_group_messaging.setter
    def support_group_messaging(self, support_group_messaging):
        """Sets the support_group_messaging of this ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationsServiceImplProperties.


        :param support_group_messaging: The support_group_messaging of this ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationsServiceImplProperties.  # noqa: E501
        :type: ConfigNodePropertyBoolean
        """

        self._support_group_messaging = support_group_messaging

    @property
    def max_total_recipients(self):
        """Gets the max_total_recipients of this ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationsServiceImplProperties.  # noqa: E501


        :return: The max_total_recipients of this ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationsServiceImplProperties.  # noqa: E501
        :rtype: ConfigNodePropertyInteger
        """
        return self._max_total_recipients

    @max_total_recipients.setter
    def max_total_recipients(self, max_total_recipients):
        """Sets the max_total_recipients of this ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationsServiceImplProperties.


        :param max_total_recipients: The max_total_recipients of this ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationsServiceImplProperties.  # noqa: E501
        :type: ConfigNodePropertyInteger
        """

        self._max_total_recipients = max_total_recipients

    @property
    def batch_size(self):
        """Gets the batch_size of this ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationsServiceImplProperties.  # noqa: E501


        :return: The batch_size of this ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationsServiceImplProperties.  # noqa: E501
        :rtype: ConfigNodePropertyInteger
        """
        return self._batch_size

    @batch_size.setter
    def batch_size(self, batch_size):
        """Sets the batch_size of this ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationsServiceImplProperties.


        :param batch_size: The batch_size of this ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationsServiceImplProperties.  # noqa: E501
        :type: ConfigNodePropertyInteger
        """

        self._batch_size = batch_size

    @property
    def max_total_attachment_size(self):
        """Gets the max_total_attachment_size of this ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationsServiceImplProperties.  # noqa: E501


        :return: The max_total_attachment_size of this ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationsServiceImplProperties.  # noqa: E501
        :rtype: ConfigNodePropertyInteger
        """
        return self._max_total_attachment_size

    @max_total_attachment_size.setter
    def max_total_attachment_size(self, max_total_attachment_size):
        """Sets the max_total_attachment_size of this ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationsServiceImplProperties.


        :param max_total_attachment_size: The max_total_attachment_size of this ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationsServiceImplProperties.  # noqa: E501
        :type: ConfigNodePropertyInteger
        """

        self._max_total_attachment_size = max_total_attachment_size

    @property
    def attachment_type_blacklist(self):
        """Gets the attachment_type_blacklist of this ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationsServiceImplProperties.  # noqa: E501


        :return: The attachment_type_blacklist of this ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationsServiceImplProperties.  # noqa: E501
        :rtype: ConfigNodePropertyArray
        """
        return self._attachment_type_blacklist

    @attachment_type_blacklist.setter
    def attachment_type_blacklist(self, attachment_type_blacklist):
        """Sets the attachment_type_blacklist of this ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationsServiceImplProperties.


        :param attachment_type_blacklist: The attachment_type_blacklist of this ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationsServiceImplProperties.  # noqa: E501
        :type: ConfigNodePropertyArray
        """

        self._attachment_type_blacklist = attachment_type_blacklist

    @property
    def allowed_attachment_types(self):
        """Gets the allowed_attachment_types of this ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationsServiceImplProperties.  # noqa: E501


        :return: The allowed_attachment_types of this ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationsServiceImplProperties.  # noqa: E501
        :rtype: ConfigNodePropertyArray
        """
        return self._allowed_attachment_types

    @allowed_attachment_types.setter
    def allowed_attachment_types(self, allowed_attachment_types):
        """Sets the allowed_attachment_types of this ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationsServiceImplProperties.


        :param allowed_attachment_types: The allowed_attachment_types of this ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationsServiceImplProperties.  # noqa: E501
        :type: ConfigNodePropertyArray
        """

        self._allowed_attachment_types = allowed_attachment_types

    @property
    def service_selector(self):
        """Gets the service_selector of this ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationsServiceImplProperties.  # noqa: E501


        :return: The service_selector of this ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationsServiceImplProperties.  # noqa: E501
        :rtype: ConfigNodePropertyString
        """
        return self._service_selector

    @service_selector.setter
    def service_selector(self, service_selector):
        """Sets the service_selector of this ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationsServiceImplProperties.


        :param service_selector: The service_selector of this ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationsServiceImplProperties.  # noqa: E501
        :type: ConfigNodePropertyString
        """

        self._service_selector = service_selector

    @property
    def field_whitelist(self):
        """Gets the field_whitelist of this ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationsServiceImplProperties.  # noqa: E501


        :return: The field_whitelist of this ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationsServiceImplProperties.  # noqa: E501
        :rtype: ConfigNodePropertyArray
        """
        return self._field_whitelist

    @field_whitelist.setter
    def field_whitelist(self, field_whitelist):
        """Sets the field_whitelist of this ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationsServiceImplProperties.


        :param field_whitelist: The field_whitelist of this ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationsServiceImplProperties.  # noqa: E501
        :type: ConfigNodePropertyArray
        """

        self._field_whitelist = field_whitelist

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
        if not isinstance(other, ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationsServiceImplProperties):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
