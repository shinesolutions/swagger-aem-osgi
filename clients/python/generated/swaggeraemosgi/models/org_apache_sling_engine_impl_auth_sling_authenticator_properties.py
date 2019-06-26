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


class OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties(object):
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
        'osgi_http_whiteboard_context_select': 'ConfigNodePropertyString',
        'osgi_http_whiteboard_listener': 'ConfigNodePropertyString',
        'auth_sudo_cookie': 'ConfigNodePropertyString',
        'auth_sudo_parameter': 'ConfigNodePropertyString',
        'auth_annonymous': 'ConfigNodePropertyBoolean',
        'sling_auth_requirements': 'ConfigNodePropertyArray',
        'sling_auth_anonymous_user': 'ConfigNodePropertyString',
        'sling_auth_anonymous_password': 'ConfigNodePropertyString',
        'auth_http': 'ConfigNodePropertyDropDown',
        'auth_http_realm': 'ConfigNodePropertyString',
        'auth_uri_suffix': 'ConfigNodePropertyArray'
    }

    attribute_map = {
        'osgi_http_whiteboard_context_select': 'osgi.http.whiteboard.context.select',
        'osgi_http_whiteboard_listener': 'osgi.http.whiteboard.listener',
        'auth_sudo_cookie': 'auth.sudo.cookie',
        'auth_sudo_parameter': 'auth.sudo.parameter',
        'auth_annonymous': 'auth.annonymous',
        'sling_auth_requirements': 'sling.auth.requirements',
        'sling_auth_anonymous_user': 'sling.auth.anonymous.user',
        'sling_auth_anonymous_password': 'sling.auth.anonymous.password',
        'auth_http': 'auth.http',
        'auth_http_realm': 'auth.http.realm',
        'auth_uri_suffix': 'auth.uri.suffix'
    }

    def __init__(self, osgi_http_whiteboard_context_select=None, osgi_http_whiteboard_listener=None, auth_sudo_cookie=None, auth_sudo_parameter=None, auth_annonymous=None, sling_auth_requirements=None, sling_auth_anonymous_user=None, sling_auth_anonymous_password=None, auth_http=None, auth_http_realm=None, auth_uri_suffix=None):  # noqa: E501
        """OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties - a model defined in OpenAPI"""  # noqa: E501

        self._osgi_http_whiteboard_context_select = None
        self._osgi_http_whiteboard_listener = None
        self._auth_sudo_cookie = None
        self._auth_sudo_parameter = None
        self._auth_annonymous = None
        self._sling_auth_requirements = None
        self._sling_auth_anonymous_user = None
        self._sling_auth_anonymous_password = None
        self._auth_http = None
        self._auth_http_realm = None
        self._auth_uri_suffix = None
        self.discriminator = None

        if osgi_http_whiteboard_context_select is not None:
            self.osgi_http_whiteboard_context_select = osgi_http_whiteboard_context_select
        if osgi_http_whiteboard_listener is not None:
            self.osgi_http_whiteboard_listener = osgi_http_whiteboard_listener
        if auth_sudo_cookie is not None:
            self.auth_sudo_cookie = auth_sudo_cookie
        if auth_sudo_parameter is not None:
            self.auth_sudo_parameter = auth_sudo_parameter
        if auth_annonymous is not None:
            self.auth_annonymous = auth_annonymous
        if sling_auth_requirements is not None:
            self.sling_auth_requirements = sling_auth_requirements
        if sling_auth_anonymous_user is not None:
            self.sling_auth_anonymous_user = sling_auth_anonymous_user
        if sling_auth_anonymous_password is not None:
            self.sling_auth_anonymous_password = sling_auth_anonymous_password
        if auth_http is not None:
            self.auth_http = auth_http
        if auth_http_realm is not None:
            self.auth_http_realm = auth_http_realm
        if auth_uri_suffix is not None:
            self.auth_uri_suffix = auth_uri_suffix

    @property
    def osgi_http_whiteboard_context_select(self):
        """Gets the osgi_http_whiteboard_context_select of this OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties.  # noqa: E501


        :return: The osgi_http_whiteboard_context_select of this OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties.  # noqa: E501
        :rtype: ConfigNodePropertyString
        """
        return self._osgi_http_whiteboard_context_select

    @osgi_http_whiteboard_context_select.setter
    def osgi_http_whiteboard_context_select(self, osgi_http_whiteboard_context_select):
        """Sets the osgi_http_whiteboard_context_select of this OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties.


        :param osgi_http_whiteboard_context_select: The osgi_http_whiteboard_context_select of this OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties.  # noqa: E501
        :type: ConfigNodePropertyString
        """

        self._osgi_http_whiteboard_context_select = osgi_http_whiteboard_context_select

    @property
    def osgi_http_whiteboard_listener(self):
        """Gets the osgi_http_whiteboard_listener of this OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties.  # noqa: E501


        :return: The osgi_http_whiteboard_listener of this OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties.  # noqa: E501
        :rtype: ConfigNodePropertyString
        """
        return self._osgi_http_whiteboard_listener

    @osgi_http_whiteboard_listener.setter
    def osgi_http_whiteboard_listener(self, osgi_http_whiteboard_listener):
        """Sets the osgi_http_whiteboard_listener of this OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties.


        :param osgi_http_whiteboard_listener: The osgi_http_whiteboard_listener of this OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties.  # noqa: E501
        :type: ConfigNodePropertyString
        """

        self._osgi_http_whiteboard_listener = osgi_http_whiteboard_listener

    @property
    def auth_sudo_cookie(self):
        """Gets the auth_sudo_cookie of this OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties.  # noqa: E501


        :return: The auth_sudo_cookie of this OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties.  # noqa: E501
        :rtype: ConfigNodePropertyString
        """
        return self._auth_sudo_cookie

    @auth_sudo_cookie.setter
    def auth_sudo_cookie(self, auth_sudo_cookie):
        """Sets the auth_sudo_cookie of this OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties.


        :param auth_sudo_cookie: The auth_sudo_cookie of this OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties.  # noqa: E501
        :type: ConfigNodePropertyString
        """

        self._auth_sudo_cookie = auth_sudo_cookie

    @property
    def auth_sudo_parameter(self):
        """Gets the auth_sudo_parameter of this OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties.  # noqa: E501


        :return: The auth_sudo_parameter of this OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties.  # noqa: E501
        :rtype: ConfigNodePropertyString
        """
        return self._auth_sudo_parameter

    @auth_sudo_parameter.setter
    def auth_sudo_parameter(self, auth_sudo_parameter):
        """Sets the auth_sudo_parameter of this OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties.


        :param auth_sudo_parameter: The auth_sudo_parameter of this OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties.  # noqa: E501
        :type: ConfigNodePropertyString
        """

        self._auth_sudo_parameter = auth_sudo_parameter

    @property
    def auth_annonymous(self):
        """Gets the auth_annonymous of this OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties.  # noqa: E501


        :return: The auth_annonymous of this OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties.  # noqa: E501
        :rtype: ConfigNodePropertyBoolean
        """
        return self._auth_annonymous

    @auth_annonymous.setter
    def auth_annonymous(self, auth_annonymous):
        """Sets the auth_annonymous of this OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties.


        :param auth_annonymous: The auth_annonymous of this OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties.  # noqa: E501
        :type: ConfigNodePropertyBoolean
        """

        self._auth_annonymous = auth_annonymous

    @property
    def sling_auth_requirements(self):
        """Gets the sling_auth_requirements of this OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties.  # noqa: E501


        :return: The sling_auth_requirements of this OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties.  # noqa: E501
        :rtype: ConfigNodePropertyArray
        """
        return self._sling_auth_requirements

    @sling_auth_requirements.setter
    def sling_auth_requirements(self, sling_auth_requirements):
        """Sets the sling_auth_requirements of this OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties.


        :param sling_auth_requirements: The sling_auth_requirements of this OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties.  # noqa: E501
        :type: ConfigNodePropertyArray
        """

        self._sling_auth_requirements = sling_auth_requirements

    @property
    def sling_auth_anonymous_user(self):
        """Gets the sling_auth_anonymous_user of this OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties.  # noqa: E501


        :return: The sling_auth_anonymous_user of this OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties.  # noqa: E501
        :rtype: ConfigNodePropertyString
        """
        return self._sling_auth_anonymous_user

    @sling_auth_anonymous_user.setter
    def sling_auth_anonymous_user(self, sling_auth_anonymous_user):
        """Sets the sling_auth_anonymous_user of this OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties.


        :param sling_auth_anonymous_user: The sling_auth_anonymous_user of this OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties.  # noqa: E501
        :type: ConfigNodePropertyString
        """

        self._sling_auth_anonymous_user = sling_auth_anonymous_user

    @property
    def sling_auth_anonymous_password(self):
        """Gets the sling_auth_anonymous_password of this OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties.  # noqa: E501


        :return: The sling_auth_anonymous_password of this OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties.  # noqa: E501
        :rtype: ConfigNodePropertyString
        """
        return self._sling_auth_anonymous_password

    @sling_auth_anonymous_password.setter
    def sling_auth_anonymous_password(self, sling_auth_anonymous_password):
        """Sets the sling_auth_anonymous_password of this OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties.


        :param sling_auth_anonymous_password: The sling_auth_anonymous_password of this OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties.  # noqa: E501
        :type: ConfigNodePropertyString
        """

        self._sling_auth_anonymous_password = sling_auth_anonymous_password

    @property
    def auth_http(self):
        """Gets the auth_http of this OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties.  # noqa: E501


        :return: The auth_http of this OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties.  # noqa: E501
        :rtype: ConfigNodePropertyDropDown
        """
        return self._auth_http

    @auth_http.setter
    def auth_http(self, auth_http):
        """Sets the auth_http of this OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties.


        :param auth_http: The auth_http of this OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties.  # noqa: E501
        :type: ConfigNodePropertyDropDown
        """

        self._auth_http = auth_http

    @property
    def auth_http_realm(self):
        """Gets the auth_http_realm of this OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties.  # noqa: E501


        :return: The auth_http_realm of this OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties.  # noqa: E501
        :rtype: ConfigNodePropertyString
        """
        return self._auth_http_realm

    @auth_http_realm.setter
    def auth_http_realm(self, auth_http_realm):
        """Sets the auth_http_realm of this OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties.


        :param auth_http_realm: The auth_http_realm of this OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties.  # noqa: E501
        :type: ConfigNodePropertyString
        """

        self._auth_http_realm = auth_http_realm

    @property
    def auth_uri_suffix(self):
        """Gets the auth_uri_suffix of this OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties.  # noqa: E501


        :return: The auth_uri_suffix of this OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties.  # noqa: E501
        :rtype: ConfigNodePropertyArray
        """
        return self._auth_uri_suffix

    @auth_uri_suffix.setter
    def auth_uri_suffix(self, auth_uri_suffix):
        """Sets the auth_uri_suffix of this OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties.


        :param auth_uri_suffix: The auth_uri_suffix of this OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties.  # noqa: E501
        :type: ConfigNodePropertyArray
        """

        self._auth_uri_suffix = auth_uri_suffix

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
        if not isinstance(other, OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other