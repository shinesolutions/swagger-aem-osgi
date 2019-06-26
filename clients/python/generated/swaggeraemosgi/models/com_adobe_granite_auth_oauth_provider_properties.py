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


class ComAdobeGraniteAuthOauthProviderProperties(object):
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
        'oauth_config_id': 'ConfigNodePropertyString',
        'oauth_client_id': 'ConfigNodePropertyString',
        'oauth_client_secret': 'ConfigNodePropertyString',
        'oauth_scope': 'ConfigNodePropertyArray',
        'oauth_config_provider_id': 'ConfigNodePropertyString',
        'oauth_create_users': 'ConfigNodePropertyBoolean',
        'oauth_userid_property': 'ConfigNodePropertyString',
        'force_strict_username_matching': 'ConfigNodePropertyBoolean',
        'oauth_encode_userids': 'ConfigNodePropertyBoolean',
        'oauth_hash_userids': 'ConfigNodePropertyBoolean',
        'oauth_call_back_url': 'ConfigNodePropertyString',
        'oauth_access_token_persist': 'ConfigNodePropertyBoolean',
        'oauth_access_token_persist_cookie': 'ConfigNodePropertyBoolean',
        'oauth_csrf_state_protection': 'ConfigNodePropertyBoolean',
        'oauth_redirect_request_params': 'ConfigNodePropertyBoolean',
        'oauth_config_siblings_allow': 'ConfigNodePropertyBoolean'
    }

    attribute_map = {
        'oauth_config_id': 'oauth.config.id',
        'oauth_client_id': 'oauth.client.id',
        'oauth_client_secret': 'oauth.client.secret',
        'oauth_scope': 'oauth.scope',
        'oauth_config_provider_id': 'oauth.config.provider.id',
        'oauth_create_users': 'oauth.create.users',
        'oauth_userid_property': 'oauth.userid.property',
        'force_strict_username_matching': 'force.strict.username.matching',
        'oauth_encode_userids': 'oauth.encode.userids',
        'oauth_hash_userids': 'oauth.hash.userids',
        'oauth_call_back_url': 'oauth.callBackUrl',
        'oauth_access_token_persist': 'oauth.access.token.persist',
        'oauth_access_token_persist_cookie': 'oauth.access.token.persist.cookie',
        'oauth_csrf_state_protection': 'oauth.csrf.state.protection',
        'oauth_redirect_request_params': 'oauth.redirect.request.params',
        'oauth_config_siblings_allow': 'oauth.config.siblings.allow'
    }

    def __init__(self, oauth_config_id=None, oauth_client_id=None, oauth_client_secret=None, oauth_scope=None, oauth_config_provider_id=None, oauth_create_users=None, oauth_userid_property=None, force_strict_username_matching=None, oauth_encode_userids=None, oauth_hash_userids=None, oauth_call_back_url=None, oauth_access_token_persist=None, oauth_access_token_persist_cookie=None, oauth_csrf_state_protection=None, oauth_redirect_request_params=None, oauth_config_siblings_allow=None):  # noqa: E501
        """ComAdobeGraniteAuthOauthProviderProperties - a model defined in OpenAPI"""  # noqa: E501

        self._oauth_config_id = None
        self._oauth_client_id = None
        self._oauth_client_secret = None
        self._oauth_scope = None
        self._oauth_config_provider_id = None
        self._oauth_create_users = None
        self._oauth_userid_property = None
        self._force_strict_username_matching = None
        self._oauth_encode_userids = None
        self._oauth_hash_userids = None
        self._oauth_call_back_url = None
        self._oauth_access_token_persist = None
        self._oauth_access_token_persist_cookie = None
        self._oauth_csrf_state_protection = None
        self._oauth_redirect_request_params = None
        self._oauth_config_siblings_allow = None
        self.discriminator = None

        if oauth_config_id is not None:
            self.oauth_config_id = oauth_config_id
        if oauth_client_id is not None:
            self.oauth_client_id = oauth_client_id
        if oauth_client_secret is not None:
            self.oauth_client_secret = oauth_client_secret
        if oauth_scope is not None:
            self.oauth_scope = oauth_scope
        if oauth_config_provider_id is not None:
            self.oauth_config_provider_id = oauth_config_provider_id
        if oauth_create_users is not None:
            self.oauth_create_users = oauth_create_users
        if oauth_userid_property is not None:
            self.oauth_userid_property = oauth_userid_property
        if force_strict_username_matching is not None:
            self.force_strict_username_matching = force_strict_username_matching
        if oauth_encode_userids is not None:
            self.oauth_encode_userids = oauth_encode_userids
        if oauth_hash_userids is not None:
            self.oauth_hash_userids = oauth_hash_userids
        if oauth_call_back_url is not None:
            self.oauth_call_back_url = oauth_call_back_url
        if oauth_access_token_persist is not None:
            self.oauth_access_token_persist = oauth_access_token_persist
        if oauth_access_token_persist_cookie is not None:
            self.oauth_access_token_persist_cookie = oauth_access_token_persist_cookie
        if oauth_csrf_state_protection is not None:
            self.oauth_csrf_state_protection = oauth_csrf_state_protection
        if oauth_redirect_request_params is not None:
            self.oauth_redirect_request_params = oauth_redirect_request_params
        if oauth_config_siblings_allow is not None:
            self.oauth_config_siblings_allow = oauth_config_siblings_allow

    @property
    def oauth_config_id(self):
        """Gets the oauth_config_id of this ComAdobeGraniteAuthOauthProviderProperties.  # noqa: E501


        :return: The oauth_config_id of this ComAdobeGraniteAuthOauthProviderProperties.  # noqa: E501
        :rtype: ConfigNodePropertyString
        """
        return self._oauth_config_id

    @oauth_config_id.setter
    def oauth_config_id(self, oauth_config_id):
        """Sets the oauth_config_id of this ComAdobeGraniteAuthOauthProviderProperties.


        :param oauth_config_id: The oauth_config_id of this ComAdobeGraniteAuthOauthProviderProperties.  # noqa: E501
        :type: ConfigNodePropertyString
        """

        self._oauth_config_id = oauth_config_id

    @property
    def oauth_client_id(self):
        """Gets the oauth_client_id of this ComAdobeGraniteAuthOauthProviderProperties.  # noqa: E501


        :return: The oauth_client_id of this ComAdobeGraniteAuthOauthProviderProperties.  # noqa: E501
        :rtype: ConfigNodePropertyString
        """
        return self._oauth_client_id

    @oauth_client_id.setter
    def oauth_client_id(self, oauth_client_id):
        """Sets the oauth_client_id of this ComAdobeGraniteAuthOauthProviderProperties.


        :param oauth_client_id: The oauth_client_id of this ComAdobeGraniteAuthOauthProviderProperties.  # noqa: E501
        :type: ConfigNodePropertyString
        """

        self._oauth_client_id = oauth_client_id

    @property
    def oauth_client_secret(self):
        """Gets the oauth_client_secret of this ComAdobeGraniteAuthOauthProviderProperties.  # noqa: E501


        :return: The oauth_client_secret of this ComAdobeGraniteAuthOauthProviderProperties.  # noqa: E501
        :rtype: ConfigNodePropertyString
        """
        return self._oauth_client_secret

    @oauth_client_secret.setter
    def oauth_client_secret(self, oauth_client_secret):
        """Sets the oauth_client_secret of this ComAdobeGraniteAuthOauthProviderProperties.


        :param oauth_client_secret: The oauth_client_secret of this ComAdobeGraniteAuthOauthProviderProperties.  # noqa: E501
        :type: ConfigNodePropertyString
        """

        self._oauth_client_secret = oauth_client_secret

    @property
    def oauth_scope(self):
        """Gets the oauth_scope of this ComAdobeGraniteAuthOauthProviderProperties.  # noqa: E501


        :return: The oauth_scope of this ComAdobeGraniteAuthOauthProviderProperties.  # noqa: E501
        :rtype: ConfigNodePropertyArray
        """
        return self._oauth_scope

    @oauth_scope.setter
    def oauth_scope(self, oauth_scope):
        """Sets the oauth_scope of this ComAdobeGraniteAuthOauthProviderProperties.


        :param oauth_scope: The oauth_scope of this ComAdobeGraniteAuthOauthProviderProperties.  # noqa: E501
        :type: ConfigNodePropertyArray
        """

        self._oauth_scope = oauth_scope

    @property
    def oauth_config_provider_id(self):
        """Gets the oauth_config_provider_id of this ComAdobeGraniteAuthOauthProviderProperties.  # noqa: E501


        :return: The oauth_config_provider_id of this ComAdobeGraniteAuthOauthProviderProperties.  # noqa: E501
        :rtype: ConfigNodePropertyString
        """
        return self._oauth_config_provider_id

    @oauth_config_provider_id.setter
    def oauth_config_provider_id(self, oauth_config_provider_id):
        """Sets the oauth_config_provider_id of this ComAdobeGraniteAuthOauthProviderProperties.


        :param oauth_config_provider_id: The oauth_config_provider_id of this ComAdobeGraniteAuthOauthProviderProperties.  # noqa: E501
        :type: ConfigNodePropertyString
        """

        self._oauth_config_provider_id = oauth_config_provider_id

    @property
    def oauth_create_users(self):
        """Gets the oauth_create_users of this ComAdobeGraniteAuthOauthProviderProperties.  # noqa: E501


        :return: The oauth_create_users of this ComAdobeGraniteAuthOauthProviderProperties.  # noqa: E501
        :rtype: ConfigNodePropertyBoolean
        """
        return self._oauth_create_users

    @oauth_create_users.setter
    def oauth_create_users(self, oauth_create_users):
        """Sets the oauth_create_users of this ComAdobeGraniteAuthOauthProviderProperties.


        :param oauth_create_users: The oauth_create_users of this ComAdobeGraniteAuthOauthProviderProperties.  # noqa: E501
        :type: ConfigNodePropertyBoolean
        """

        self._oauth_create_users = oauth_create_users

    @property
    def oauth_userid_property(self):
        """Gets the oauth_userid_property of this ComAdobeGraniteAuthOauthProviderProperties.  # noqa: E501


        :return: The oauth_userid_property of this ComAdobeGraniteAuthOauthProviderProperties.  # noqa: E501
        :rtype: ConfigNodePropertyString
        """
        return self._oauth_userid_property

    @oauth_userid_property.setter
    def oauth_userid_property(self, oauth_userid_property):
        """Sets the oauth_userid_property of this ComAdobeGraniteAuthOauthProviderProperties.


        :param oauth_userid_property: The oauth_userid_property of this ComAdobeGraniteAuthOauthProviderProperties.  # noqa: E501
        :type: ConfigNodePropertyString
        """

        self._oauth_userid_property = oauth_userid_property

    @property
    def force_strict_username_matching(self):
        """Gets the force_strict_username_matching of this ComAdobeGraniteAuthOauthProviderProperties.  # noqa: E501


        :return: The force_strict_username_matching of this ComAdobeGraniteAuthOauthProviderProperties.  # noqa: E501
        :rtype: ConfigNodePropertyBoolean
        """
        return self._force_strict_username_matching

    @force_strict_username_matching.setter
    def force_strict_username_matching(self, force_strict_username_matching):
        """Sets the force_strict_username_matching of this ComAdobeGraniteAuthOauthProviderProperties.


        :param force_strict_username_matching: The force_strict_username_matching of this ComAdobeGraniteAuthOauthProviderProperties.  # noqa: E501
        :type: ConfigNodePropertyBoolean
        """

        self._force_strict_username_matching = force_strict_username_matching

    @property
    def oauth_encode_userids(self):
        """Gets the oauth_encode_userids of this ComAdobeGraniteAuthOauthProviderProperties.  # noqa: E501


        :return: The oauth_encode_userids of this ComAdobeGraniteAuthOauthProviderProperties.  # noqa: E501
        :rtype: ConfigNodePropertyBoolean
        """
        return self._oauth_encode_userids

    @oauth_encode_userids.setter
    def oauth_encode_userids(self, oauth_encode_userids):
        """Sets the oauth_encode_userids of this ComAdobeGraniteAuthOauthProviderProperties.


        :param oauth_encode_userids: The oauth_encode_userids of this ComAdobeGraniteAuthOauthProviderProperties.  # noqa: E501
        :type: ConfigNodePropertyBoolean
        """

        self._oauth_encode_userids = oauth_encode_userids

    @property
    def oauth_hash_userids(self):
        """Gets the oauth_hash_userids of this ComAdobeGraniteAuthOauthProviderProperties.  # noqa: E501


        :return: The oauth_hash_userids of this ComAdobeGraniteAuthOauthProviderProperties.  # noqa: E501
        :rtype: ConfigNodePropertyBoolean
        """
        return self._oauth_hash_userids

    @oauth_hash_userids.setter
    def oauth_hash_userids(self, oauth_hash_userids):
        """Sets the oauth_hash_userids of this ComAdobeGraniteAuthOauthProviderProperties.


        :param oauth_hash_userids: The oauth_hash_userids of this ComAdobeGraniteAuthOauthProviderProperties.  # noqa: E501
        :type: ConfigNodePropertyBoolean
        """

        self._oauth_hash_userids = oauth_hash_userids

    @property
    def oauth_call_back_url(self):
        """Gets the oauth_call_back_url of this ComAdobeGraniteAuthOauthProviderProperties.  # noqa: E501


        :return: The oauth_call_back_url of this ComAdobeGraniteAuthOauthProviderProperties.  # noqa: E501
        :rtype: ConfigNodePropertyString
        """
        return self._oauth_call_back_url

    @oauth_call_back_url.setter
    def oauth_call_back_url(self, oauth_call_back_url):
        """Sets the oauth_call_back_url of this ComAdobeGraniteAuthOauthProviderProperties.


        :param oauth_call_back_url: The oauth_call_back_url of this ComAdobeGraniteAuthOauthProviderProperties.  # noqa: E501
        :type: ConfigNodePropertyString
        """

        self._oauth_call_back_url = oauth_call_back_url

    @property
    def oauth_access_token_persist(self):
        """Gets the oauth_access_token_persist of this ComAdobeGraniteAuthOauthProviderProperties.  # noqa: E501


        :return: The oauth_access_token_persist of this ComAdobeGraniteAuthOauthProviderProperties.  # noqa: E501
        :rtype: ConfigNodePropertyBoolean
        """
        return self._oauth_access_token_persist

    @oauth_access_token_persist.setter
    def oauth_access_token_persist(self, oauth_access_token_persist):
        """Sets the oauth_access_token_persist of this ComAdobeGraniteAuthOauthProviderProperties.


        :param oauth_access_token_persist: The oauth_access_token_persist of this ComAdobeGraniteAuthOauthProviderProperties.  # noqa: E501
        :type: ConfigNodePropertyBoolean
        """

        self._oauth_access_token_persist = oauth_access_token_persist

    @property
    def oauth_access_token_persist_cookie(self):
        """Gets the oauth_access_token_persist_cookie of this ComAdobeGraniteAuthOauthProviderProperties.  # noqa: E501


        :return: The oauth_access_token_persist_cookie of this ComAdobeGraniteAuthOauthProviderProperties.  # noqa: E501
        :rtype: ConfigNodePropertyBoolean
        """
        return self._oauth_access_token_persist_cookie

    @oauth_access_token_persist_cookie.setter
    def oauth_access_token_persist_cookie(self, oauth_access_token_persist_cookie):
        """Sets the oauth_access_token_persist_cookie of this ComAdobeGraniteAuthOauthProviderProperties.


        :param oauth_access_token_persist_cookie: The oauth_access_token_persist_cookie of this ComAdobeGraniteAuthOauthProviderProperties.  # noqa: E501
        :type: ConfigNodePropertyBoolean
        """

        self._oauth_access_token_persist_cookie = oauth_access_token_persist_cookie

    @property
    def oauth_csrf_state_protection(self):
        """Gets the oauth_csrf_state_protection of this ComAdobeGraniteAuthOauthProviderProperties.  # noqa: E501


        :return: The oauth_csrf_state_protection of this ComAdobeGraniteAuthOauthProviderProperties.  # noqa: E501
        :rtype: ConfigNodePropertyBoolean
        """
        return self._oauth_csrf_state_protection

    @oauth_csrf_state_protection.setter
    def oauth_csrf_state_protection(self, oauth_csrf_state_protection):
        """Sets the oauth_csrf_state_protection of this ComAdobeGraniteAuthOauthProviderProperties.


        :param oauth_csrf_state_protection: The oauth_csrf_state_protection of this ComAdobeGraniteAuthOauthProviderProperties.  # noqa: E501
        :type: ConfigNodePropertyBoolean
        """

        self._oauth_csrf_state_protection = oauth_csrf_state_protection

    @property
    def oauth_redirect_request_params(self):
        """Gets the oauth_redirect_request_params of this ComAdobeGraniteAuthOauthProviderProperties.  # noqa: E501


        :return: The oauth_redirect_request_params of this ComAdobeGraniteAuthOauthProviderProperties.  # noqa: E501
        :rtype: ConfigNodePropertyBoolean
        """
        return self._oauth_redirect_request_params

    @oauth_redirect_request_params.setter
    def oauth_redirect_request_params(self, oauth_redirect_request_params):
        """Sets the oauth_redirect_request_params of this ComAdobeGraniteAuthOauthProviderProperties.


        :param oauth_redirect_request_params: The oauth_redirect_request_params of this ComAdobeGraniteAuthOauthProviderProperties.  # noqa: E501
        :type: ConfigNodePropertyBoolean
        """

        self._oauth_redirect_request_params = oauth_redirect_request_params

    @property
    def oauth_config_siblings_allow(self):
        """Gets the oauth_config_siblings_allow of this ComAdobeGraniteAuthOauthProviderProperties.  # noqa: E501


        :return: The oauth_config_siblings_allow of this ComAdobeGraniteAuthOauthProviderProperties.  # noqa: E501
        :rtype: ConfigNodePropertyBoolean
        """
        return self._oauth_config_siblings_allow

    @oauth_config_siblings_allow.setter
    def oauth_config_siblings_allow(self, oauth_config_siblings_allow):
        """Sets the oauth_config_siblings_allow of this ComAdobeGraniteAuthOauthProviderProperties.


        :param oauth_config_siblings_allow: The oauth_config_siblings_allow of this ComAdobeGraniteAuthOauthProviderProperties.  # noqa: E501
        :type: ConfigNodePropertyBoolean
        """

        self._oauth_config_siblings_allow = oauth_config_siblings_allow

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
        if not isinstance(other, ComAdobeGraniteAuthOauthProviderProperties):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other