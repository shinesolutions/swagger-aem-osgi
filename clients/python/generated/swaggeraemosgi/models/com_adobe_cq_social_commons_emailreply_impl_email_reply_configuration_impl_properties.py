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


class ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImplProperties(object):
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
        'email_name': 'ConfigNodePropertyString',
        'email_create_post_from_reply': 'ConfigNodePropertyBoolean',
        'email_add_comment_id_to': 'ConfigNodePropertyDropDown',
        'email_subject_maximum_length': 'ConfigNodePropertyInteger',
        'email_reply_to_address': 'ConfigNodePropertyString',
        'email_reply_to_delimiter': 'ConfigNodePropertyString',
        'email_tracker_id_prefix_in_subject': 'ConfigNodePropertyString',
        'email_tracker_id_prefix_in_body': 'ConfigNodePropertyString',
        'email_as_html': 'ConfigNodePropertyBoolean',
        'email_default_user_name': 'ConfigNodePropertyString',
        'email_templates_root_path': 'ConfigNodePropertyString'
    }

    attribute_map = {
        'email_name': 'email.name',
        'email_create_post_from_reply': 'email.createPostFromReply',
        'email_add_comment_id_to': 'email.addCommentIdTo',
        'email_subject_maximum_length': 'email.subjectMaximumLength',
        'email_reply_to_address': 'email.replyToAddress',
        'email_reply_to_delimiter': 'email.replyToDelimiter',
        'email_tracker_id_prefix_in_subject': 'email.trackerIdPrefixInSubject',
        'email_tracker_id_prefix_in_body': 'email.trackerIdPrefixInBody',
        'email_as_html': 'email.asHTML',
        'email_default_user_name': 'email.defaultUserName',
        'email_templates_root_path': 'email.templates.rootPath'
    }

    def __init__(self, email_name=None, email_create_post_from_reply=None, email_add_comment_id_to=None, email_subject_maximum_length=None, email_reply_to_address=None, email_reply_to_delimiter=None, email_tracker_id_prefix_in_subject=None, email_tracker_id_prefix_in_body=None, email_as_html=None, email_default_user_name=None, email_templates_root_path=None):  # noqa: E501
        """ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImplProperties - a model defined in OpenAPI"""  # noqa: E501

        self._email_name = None
        self._email_create_post_from_reply = None
        self._email_add_comment_id_to = None
        self._email_subject_maximum_length = None
        self._email_reply_to_address = None
        self._email_reply_to_delimiter = None
        self._email_tracker_id_prefix_in_subject = None
        self._email_tracker_id_prefix_in_body = None
        self._email_as_html = None
        self._email_default_user_name = None
        self._email_templates_root_path = None
        self.discriminator = None

        if email_name is not None:
            self.email_name = email_name
        if email_create_post_from_reply is not None:
            self.email_create_post_from_reply = email_create_post_from_reply
        if email_add_comment_id_to is not None:
            self.email_add_comment_id_to = email_add_comment_id_to
        if email_subject_maximum_length is not None:
            self.email_subject_maximum_length = email_subject_maximum_length
        if email_reply_to_address is not None:
            self.email_reply_to_address = email_reply_to_address
        if email_reply_to_delimiter is not None:
            self.email_reply_to_delimiter = email_reply_to_delimiter
        if email_tracker_id_prefix_in_subject is not None:
            self.email_tracker_id_prefix_in_subject = email_tracker_id_prefix_in_subject
        if email_tracker_id_prefix_in_body is not None:
            self.email_tracker_id_prefix_in_body = email_tracker_id_prefix_in_body
        if email_as_html is not None:
            self.email_as_html = email_as_html
        if email_default_user_name is not None:
            self.email_default_user_name = email_default_user_name
        if email_templates_root_path is not None:
            self.email_templates_root_path = email_templates_root_path

    @property
    def email_name(self):
        """Gets the email_name of this ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImplProperties.  # noqa: E501


        :return: The email_name of this ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImplProperties.  # noqa: E501
        :rtype: ConfigNodePropertyString
        """
        return self._email_name

    @email_name.setter
    def email_name(self, email_name):
        """Sets the email_name of this ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImplProperties.


        :param email_name: The email_name of this ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImplProperties.  # noqa: E501
        :type: ConfigNodePropertyString
        """

        self._email_name = email_name

    @property
    def email_create_post_from_reply(self):
        """Gets the email_create_post_from_reply of this ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImplProperties.  # noqa: E501


        :return: The email_create_post_from_reply of this ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImplProperties.  # noqa: E501
        :rtype: ConfigNodePropertyBoolean
        """
        return self._email_create_post_from_reply

    @email_create_post_from_reply.setter
    def email_create_post_from_reply(self, email_create_post_from_reply):
        """Sets the email_create_post_from_reply of this ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImplProperties.


        :param email_create_post_from_reply: The email_create_post_from_reply of this ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImplProperties.  # noqa: E501
        :type: ConfigNodePropertyBoolean
        """

        self._email_create_post_from_reply = email_create_post_from_reply

    @property
    def email_add_comment_id_to(self):
        """Gets the email_add_comment_id_to of this ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImplProperties.  # noqa: E501


        :return: The email_add_comment_id_to of this ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImplProperties.  # noqa: E501
        :rtype: ConfigNodePropertyDropDown
        """
        return self._email_add_comment_id_to

    @email_add_comment_id_to.setter
    def email_add_comment_id_to(self, email_add_comment_id_to):
        """Sets the email_add_comment_id_to of this ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImplProperties.


        :param email_add_comment_id_to: The email_add_comment_id_to of this ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImplProperties.  # noqa: E501
        :type: ConfigNodePropertyDropDown
        """

        self._email_add_comment_id_to = email_add_comment_id_to

    @property
    def email_subject_maximum_length(self):
        """Gets the email_subject_maximum_length of this ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImplProperties.  # noqa: E501


        :return: The email_subject_maximum_length of this ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImplProperties.  # noqa: E501
        :rtype: ConfigNodePropertyInteger
        """
        return self._email_subject_maximum_length

    @email_subject_maximum_length.setter
    def email_subject_maximum_length(self, email_subject_maximum_length):
        """Sets the email_subject_maximum_length of this ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImplProperties.


        :param email_subject_maximum_length: The email_subject_maximum_length of this ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImplProperties.  # noqa: E501
        :type: ConfigNodePropertyInteger
        """

        self._email_subject_maximum_length = email_subject_maximum_length

    @property
    def email_reply_to_address(self):
        """Gets the email_reply_to_address of this ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImplProperties.  # noqa: E501


        :return: The email_reply_to_address of this ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImplProperties.  # noqa: E501
        :rtype: ConfigNodePropertyString
        """
        return self._email_reply_to_address

    @email_reply_to_address.setter
    def email_reply_to_address(self, email_reply_to_address):
        """Sets the email_reply_to_address of this ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImplProperties.


        :param email_reply_to_address: The email_reply_to_address of this ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImplProperties.  # noqa: E501
        :type: ConfigNodePropertyString
        """

        self._email_reply_to_address = email_reply_to_address

    @property
    def email_reply_to_delimiter(self):
        """Gets the email_reply_to_delimiter of this ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImplProperties.  # noqa: E501


        :return: The email_reply_to_delimiter of this ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImplProperties.  # noqa: E501
        :rtype: ConfigNodePropertyString
        """
        return self._email_reply_to_delimiter

    @email_reply_to_delimiter.setter
    def email_reply_to_delimiter(self, email_reply_to_delimiter):
        """Sets the email_reply_to_delimiter of this ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImplProperties.


        :param email_reply_to_delimiter: The email_reply_to_delimiter of this ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImplProperties.  # noqa: E501
        :type: ConfigNodePropertyString
        """

        self._email_reply_to_delimiter = email_reply_to_delimiter

    @property
    def email_tracker_id_prefix_in_subject(self):
        """Gets the email_tracker_id_prefix_in_subject of this ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImplProperties.  # noqa: E501


        :return: The email_tracker_id_prefix_in_subject of this ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImplProperties.  # noqa: E501
        :rtype: ConfigNodePropertyString
        """
        return self._email_tracker_id_prefix_in_subject

    @email_tracker_id_prefix_in_subject.setter
    def email_tracker_id_prefix_in_subject(self, email_tracker_id_prefix_in_subject):
        """Sets the email_tracker_id_prefix_in_subject of this ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImplProperties.


        :param email_tracker_id_prefix_in_subject: The email_tracker_id_prefix_in_subject of this ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImplProperties.  # noqa: E501
        :type: ConfigNodePropertyString
        """

        self._email_tracker_id_prefix_in_subject = email_tracker_id_prefix_in_subject

    @property
    def email_tracker_id_prefix_in_body(self):
        """Gets the email_tracker_id_prefix_in_body of this ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImplProperties.  # noqa: E501


        :return: The email_tracker_id_prefix_in_body of this ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImplProperties.  # noqa: E501
        :rtype: ConfigNodePropertyString
        """
        return self._email_tracker_id_prefix_in_body

    @email_tracker_id_prefix_in_body.setter
    def email_tracker_id_prefix_in_body(self, email_tracker_id_prefix_in_body):
        """Sets the email_tracker_id_prefix_in_body of this ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImplProperties.


        :param email_tracker_id_prefix_in_body: The email_tracker_id_prefix_in_body of this ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImplProperties.  # noqa: E501
        :type: ConfigNodePropertyString
        """

        self._email_tracker_id_prefix_in_body = email_tracker_id_prefix_in_body

    @property
    def email_as_html(self):
        """Gets the email_as_html of this ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImplProperties.  # noqa: E501


        :return: The email_as_html of this ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImplProperties.  # noqa: E501
        :rtype: ConfigNodePropertyBoolean
        """
        return self._email_as_html

    @email_as_html.setter
    def email_as_html(self, email_as_html):
        """Sets the email_as_html of this ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImplProperties.


        :param email_as_html: The email_as_html of this ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImplProperties.  # noqa: E501
        :type: ConfigNodePropertyBoolean
        """

        self._email_as_html = email_as_html

    @property
    def email_default_user_name(self):
        """Gets the email_default_user_name of this ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImplProperties.  # noqa: E501


        :return: The email_default_user_name of this ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImplProperties.  # noqa: E501
        :rtype: ConfigNodePropertyString
        """
        return self._email_default_user_name

    @email_default_user_name.setter
    def email_default_user_name(self, email_default_user_name):
        """Sets the email_default_user_name of this ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImplProperties.


        :param email_default_user_name: The email_default_user_name of this ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImplProperties.  # noqa: E501
        :type: ConfigNodePropertyString
        """

        self._email_default_user_name = email_default_user_name

    @property
    def email_templates_root_path(self):
        """Gets the email_templates_root_path of this ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImplProperties.  # noqa: E501


        :return: The email_templates_root_path of this ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImplProperties.  # noqa: E501
        :rtype: ConfigNodePropertyString
        """
        return self._email_templates_root_path

    @email_templates_root_path.setter
    def email_templates_root_path(self, email_templates_root_path):
        """Sets the email_templates_root_path of this ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImplProperties.


        :param email_templates_root_path: The email_templates_root_path of this ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImplProperties.  # noqa: E501
        :type: ConfigNodePropertyString
        """

        self._email_templates_root_path = email_templates_root_path

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
        if not isinstance(other, ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImplProperties):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
