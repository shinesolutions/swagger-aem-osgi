# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model_ import Model
from openapi_server.models.config_node_property_array import ConfigNodePropertyArray  # noqa: F401,E501
from openapi_server.models.config_node_property_integer import ConfigNodePropertyInteger  # noqa: F401,E501
from openapi_server import util


class ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderProperties(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, reply_email_patterns: ConfigNodePropertyArray=None, priority_order: ConfigNodePropertyInteger=None):  # noqa: E501
        """ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderProperties - a model defined in OpenAPI

        :param reply_email_patterns: The reply_email_patterns of this ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderProperties.  # noqa: E501
        :type reply_email_patterns: ConfigNodePropertyArray
        :param priority_order: The priority_order of this ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderProperties.  # noqa: E501
        :type priority_order: ConfigNodePropertyInteger
        """
        self.openapi_types = {
            'reply_email_patterns': ConfigNodePropertyArray,
            'priority_order': ConfigNodePropertyInteger
        }

        self.attribute_map = {
            'reply_email_patterns': 'replyEmailPatterns',
            'priority_order': 'priorityOrder'
        }

        self._reply_email_patterns = reply_email_patterns
        self._priority_order = priority_order

    @classmethod
    def from_dict(cls, dikt) -> 'ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderProperties':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The comAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderProperties of this ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderProperties.  # noqa: E501
        :rtype: ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderProperties
        """
        return util.deserialize_model(dikt, cls)

    @property
    def reply_email_patterns(self) -> ConfigNodePropertyArray:
        """Gets the reply_email_patterns of this ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderProperties.


        :return: The reply_email_patterns of this ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderProperties.
        :rtype: ConfigNodePropertyArray
        """
        return self._reply_email_patterns

    @reply_email_patterns.setter
    def reply_email_patterns(self, reply_email_patterns: ConfigNodePropertyArray):
        """Sets the reply_email_patterns of this ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderProperties.


        :param reply_email_patterns: The reply_email_patterns of this ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderProperties.
        :type reply_email_patterns: ConfigNodePropertyArray
        """

        self._reply_email_patterns = reply_email_patterns

    @property
    def priority_order(self) -> ConfigNodePropertyInteger:
        """Gets the priority_order of this ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderProperties.


        :return: The priority_order of this ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderProperties.
        :rtype: ConfigNodePropertyInteger
        """
        return self._priority_order

    @priority_order.setter
    def priority_order(self, priority_order: ConfigNodePropertyInteger):
        """Sets the priority_order of this ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderProperties.


        :param priority_order: The priority_order of this ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderProperties.
        :type priority_order: ConfigNodePropertyInteger
        """

        self._priority_order = priority_order