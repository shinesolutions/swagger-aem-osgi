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


class ComAdobeGraniteAuthOauthAccesstokenProviderProperties(object):
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
        'name': 'ConfigNodePropertyString',
        'auth_token_provider_title': 'ConfigNodePropertyString',
        'auth_token_provider_default_claims': 'ConfigNodePropertyArray',
        'auth_token_provider_endpoint': 'ConfigNodePropertyString',
        'auth_access_token_request': 'ConfigNodePropertyString',
        'auth_token_provider_keypair_alias': 'ConfigNodePropertyString',
        'auth_token_provider_conn_timeout': 'ConfigNodePropertyInteger',
        'auth_token_provider_so_timeout': 'ConfigNodePropertyInteger',
        'auth_token_provider_client_id': 'ConfigNodePropertyString',
        'auth_token_provider_scope': 'ConfigNodePropertyString',
        'auth_token_provider_reuse_access_token': 'ConfigNodePropertyBoolean',
        'auth_token_provider_relaxed_ssl': 'ConfigNodePropertyBoolean',
        'token_request_customizer_type': 'ConfigNodePropertyString',
        'auth_token_validator_type': 'ConfigNodePropertyString'
    }

    attribute_map = {
        'name': 'name',
        'auth_token_provider_title': 'auth.token.provider.title',
        'auth_token_provider_default_claims': 'auth.token.provider.default.claims',
        'auth_token_provider_endpoint': 'auth.token.provider.endpoint',
        'auth_access_token_request': 'auth.access.token.request',
        'auth_token_provider_keypair_alias': 'auth.token.provider.keypair.alias',
        'auth_token_provider_conn_timeout': 'auth.token.provider.conn.timeout',
        'auth_token_provider_so_timeout': 'auth.token.provider.so.timeout',
        'auth_token_provider_client_id': 'auth.token.provider.client.id',
        'auth_token_provider_scope': 'auth.token.provider.scope',
        'auth_token_provider_reuse_access_token': 'auth.token.provider.reuse.access.token',
        'auth_token_provider_relaxed_ssl': 'auth.token.provider.relaxed.ssl',
        'token_request_customizer_type': 'token.request.customizer.type',
        'auth_token_validator_type': 'auth.token.validator.type'
    }

    def __init__(self, name=None, auth_token_provider_title=None, auth_token_provider_default_claims=None, auth_token_provider_endpoint=None, auth_access_token_request=None, auth_token_provider_keypair_alias=None, auth_token_provider_conn_timeout=None, auth_token_provider_so_timeout=None, auth_token_provider_client_id=None, auth_token_provider_scope=None, auth_token_provider_reuse_access_token=None, auth_token_provider_relaxed_ssl=None, token_request_customizer_type=None, auth_token_validator_type=None):  # noqa: E501
        """ComAdobeGraniteAuthOauthAccesstokenProviderProperties - a model defined in OpenAPI"""  # noqa: E501

        self._name = None
        self._auth_token_provider_title = None
        self._auth_token_provider_default_claims = None
        self._auth_token_provider_endpoint = None
        self._auth_access_token_request = None
        self._auth_token_provider_keypair_alias = None
        self._auth_token_provider_conn_timeout = None
        self._auth_token_provider_so_timeout = None
        self._auth_token_provider_client_id = None
        self._auth_token_provider_scope = None
        self._auth_token_provider_reuse_access_token = None
        self._auth_token_provider_relaxed_ssl = None
        self._token_request_customizer_type = None
        self._auth_token_validator_type = None
        self.discriminator = None

        if name is not None:
            self.name = name
        if auth_token_provider_title is not None:
            self.auth_token_provider_title = auth_token_provider_title
        if auth_token_provider_default_claims is not None:
            self.auth_token_provider_default_claims = auth_token_provider_default_claims
        if auth_token_provider_endpoint is not None:
            self.auth_token_provider_endpoint = auth_token_provider_endpoint
        if auth_access_token_request is not None:
            self.auth_access_token_request = auth_access_token_request
        if auth_token_provider_keypair_alias is not None:
            self.auth_token_provider_keypair_alias = auth_token_provider_keypair_alias
        if auth_token_provider_conn_timeout is not None:
            self.auth_token_provider_conn_timeout = auth_token_provider_conn_timeout
        if auth_token_provider_so_timeout is not None:
            self.auth_token_provider_so_timeout = auth_token_provider_so_timeout
        if auth_token_provider_client_id is not None:
            self.auth_token_provider_client_id = auth_token_provider_client_id
        if auth_token_provider_scope is not None:
            self.auth_token_provider_scope = auth_token_provider_scope
        if auth_token_provider_reuse_access_token is not None:
            self.auth_token_provider_reuse_access_token = auth_token_provider_reuse_access_token
        if auth_token_provider_relaxed_ssl is not None:
            self.auth_token_provider_relaxed_ssl = auth_token_provider_relaxed_ssl
        if token_request_customizer_type is not None:
            self.token_request_customizer_type = token_request_customizer_type
        if auth_token_validator_type is not None:
            self.auth_token_validator_type = auth_token_validator_type

    @property
    def name(self):
        """Gets the name of this ComAdobeGraniteAuthOauthAccesstokenProviderProperties.  # noqa: E501


        :return: The name of this ComAdobeGraniteAuthOauthAccesstokenProviderProperties.  # noqa: E501
        :rtype: ConfigNodePropertyString
        """
        return self._name

    @name.setter
    def name(self, name):
        """Sets the name of this ComAdobeGraniteAuthOauthAccesstokenProviderProperties.


        :param name: The name of this ComAdobeGraniteAuthOauthAccesstokenProviderProperties.  # noqa: E501
        :type: ConfigNodePropertyString
        """

        self._name = name

    @property
    def auth_token_provider_title(self):
        """Gets the auth_token_provider_title of this ComAdobeGraniteAuthOauthAccesstokenProviderProperties.  # noqa: E501


        :return: The auth_token_provider_title of this ComAdobeGraniteAuthOauthAccesstokenProviderProperties.  # noqa: E501
        :rtype: ConfigNodePropertyString
        """
        return self._auth_token_provider_title

    @auth_token_provider_title.setter
    def auth_token_provider_title(self, auth_token_provider_title):
        """Sets the auth_token_provider_title of this ComAdobeGraniteAuthOauthAccesstokenProviderProperties.


        :param auth_token_provider_title: The auth_token_provider_title of this ComAdobeGraniteAuthOauthAccesstokenProviderProperties.  # noqa: E501
        :type: ConfigNodePropertyString
        """

        self._auth_token_provider_title = auth_token_provider_title

    @property
    def auth_token_provider_default_claims(self):
        """Gets the auth_token_provider_default_claims of this ComAdobeGraniteAuthOauthAccesstokenProviderProperties.  # noqa: E501


        :return: The auth_token_provider_default_claims of this ComAdobeGraniteAuthOauthAccesstokenProviderProperties.  # noqa: E501
        :rtype: ConfigNodePropertyArray
        """
        return self._auth_token_provider_default_claims

    @auth_token_provider_default_claims.setter
    def auth_token_provider_default_claims(self, auth_token_provider_default_claims):
        """Sets the auth_token_provider_default_claims of this ComAdobeGraniteAuthOauthAccesstokenProviderProperties.


        :param auth_token_provider_default_claims: The auth_token_provider_default_claims of this ComAdobeGraniteAuthOauthAccesstokenProviderProperties.  # noqa: E501
        :type: ConfigNodePropertyArray
        """

        self._auth_token_provider_default_claims = auth_token_provider_default_claims

    @property
    def auth_token_provider_endpoint(self):
        """Gets the auth_token_provider_endpoint of this ComAdobeGraniteAuthOauthAccesstokenProviderProperties.  # noqa: E501


        :return: The auth_token_provider_endpoint of this ComAdobeGraniteAuthOauthAccesstokenProviderProperties.  # noqa: E501
        :rtype: ConfigNodePropertyString
        """
        return self._auth_token_provider_endpoint

    @auth_token_provider_endpoint.setter
    def auth_token_provider_endpoint(self, auth_token_provider_endpoint):
        """Sets the auth_token_provider_endpoint of this ComAdobeGraniteAuthOauthAccesstokenProviderProperties.


        :param auth_token_provider_endpoint: The auth_token_provider_endpoint of this ComAdobeGraniteAuthOauthAccesstokenProviderProperties.  # noqa: E501
        :type: ConfigNodePropertyString
        """

        self._auth_token_provider_endpoint = auth_token_provider_endpoint

    @property
    def auth_access_token_request(self):
        """Gets the auth_access_token_request of this ComAdobeGraniteAuthOauthAccesstokenProviderProperties.  # noqa: E501


        :return: The auth_access_token_request of this ComAdobeGraniteAuthOauthAccesstokenProviderProperties.  # noqa: E501
        :rtype: ConfigNodePropertyString
        """
        return self._auth_access_token_request

    @auth_access_token_request.setter
    def auth_access_token_request(self, auth_access_token_request):
        """Sets the auth_access_token_request of this ComAdobeGraniteAuthOauthAccesstokenProviderProperties.


        :param auth_access_token_request: The auth_access_token_request of this ComAdobeGraniteAuthOauthAccesstokenProviderProperties.  # noqa: E501
        :type: ConfigNodePropertyString
        """

        self._auth_access_token_request = auth_access_token_request

    @property
    def auth_token_provider_keypair_alias(self):
        """Gets the auth_token_provider_keypair_alias of this ComAdobeGraniteAuthOauthAccesstokenProviderProperties.  # noqa: E501


        :return: The auth_token_provider_keypair_alias of this ComAdobeGraniteAuthOauthAccesstokenProviderProperties.  # noqa: E501
        :rtype: ConfigNodePropertyString
        """
        return self._auth_token_provider_keypair_alias

    @auth_token_provider_keypair_alias.setter
    def auth_token_provider_keypair_alias(self, auth_token_provider_keypair_alias):
        """Sets the auth_token_provider_keypair_alias of this ComAdobeGraniteAuthOauthAccesstokenProviderProperties.


        :param auth_token_provider_keypair_alias: The auth_token_provider_keypair_alias of this ComAdobeGraniteAuthOauthAccesstokenProviderProperties.  # noqa: E501
        :type: ConfigNodePropertyString
        """

        self._auth_token_provider_keypair_alias = auth_token_provider_keypair_alias

    @property
    def auth_token_provider_conn_timeout(self):
        """Gets the auth_token_provider_conn_timeout of this ComAdobeGraniteAuthOauthAccesstokenProviderProperties.  # noqa: E501


        :return: The auth_token_provider_conn_timeout of this ComAdobeGraniteAuthOauthAccesstokenProviderProperties.  # noqa: E501
        :rtype: ConfigNodePropertyInteger
        """
        return self._auth_token_provider_conn_timeout

    @auth_token_provider_conn_timeout.setter
    def auth_token_provider_conn_timeout(self, auth_token_provider_conn_timeout):
        """Sets the auth_token_provider_conn_timeout of this ComAdobeGraniteAuthOauthAccesstokenProviderProperties.


        :param auth_token_provider_conn_timeout: The auth_token_provider_conn_timeout of this ComAdobeGraniteAuthOauthAccesstokenProviderProperties.  # noqa: E501
        :type: ConfigNodePropertyInteger
        """

        self._auth_token_provider_conn_timeout = auth_token_provider_conn_timeout

    @property
    def auth_token_provider_so_timeout(self):
        """Gets the auth_token_provider_so_timeout of this ComAdobeGraniteAuthOauthAccesstokenProviderProperties.  # noqa: E501


        :return: The auth_token_provider_so_timeout of this ComAdobeGraniteAuthOauthAccesstokenProviderProperties.  # noqa: E501
        :rtype: ConfigNodePropertyInteger
        """
        return self._auth_token_provider_so_timeout

    @auth_token_provider_so_timeout.setter
    def auth_token_provider_so_timeout(self, auth_token_provider_so_timeout):
        """Sets the auth_token_provider_so_timeout of this ComAdobeGraniteAuthOauthAccesstokenProviderProperties.


        :param auth_token_provider_so_timeout: The auth_token_provider_so_timeout of this ComAdobeGraniteAuthOauthAccesstokenProviderProperties.  # noqa: E501
        :type: ConfigNodePropertyInteger
        """

        self._auth_token_provider_so_timeout = auth_token_provider_so_timeout

    @property
    def auth_token_provider_client_id(self):
        """Gets the auth_token_provider_client_id of this ComAdobeGraniteAuthOauthAccesstokenProviderProperties.  # noqa: E501


        :return: The auth_token_provider_client_id of this ComAdobeGraniteAuthOauthAccesstokenProviderProperties.  # noqa: E501
        :rtype: ConfigNodePropertyString
        """
        return self._auth_token_provider_client_id

    @auth_token_provider_client_id.setter
    def auth_token_provider_client_id(self, auth_token_provider_client_id):
        """Sets the auth_token_provider_client_id of this ComAdobeGraniteAuthOauthAccesstokenProviderProperties.


        :param auth_token_provider_client_id: The auth_token_provider_client_id of this ComAdobeGraniteAuthOauthAccesstokenProviderProperties.  # noqa: E501
        :type: ConfigNodePropertyString
        """

        self._auth_token_provider_client_id = auth_token_provider_client_id

    @property
    def auth_token_provider_scope(self):
        """Gets the auth_token_provider_scope of this ComAdobeGraniteAuthOauthAccesstokenProviderProperties.  # noqa: E501


        :return: The auth_token_provider_scope of this ComAdobeGraniteAuthOauthAccesstokenProviderProperties.  # noqa: E501
        :rtype: ConfigNodePropertyString
        """
        return self._auth_token_provider_scope

    @auth_token_provider_scope.setter
    def auth_token_provider_scope(self, auth_token_provider_scope):
        """Sets the auth_token_provider_scope of this ComAdobeGraniteAuthOauthAccesstokenProviderProperties.


        :param auth_token_provider_scope: The auth_token_provider_scope of this ComAdobeGraniteAuthOauthAccesstokenProviderProperties.  # noqa: E501
        :type: ConfigNodePropertyString
        """

        self._auth_token_provider_scope = auth_token_provider_scope

    @property
    def auth_token_provider_reuse_access_token(self):
        """Gets the auth_token_provider_reuse_access_token of this ComAdobeGraniteAuthOauthAccesstokenProviderProperties.  # noqa: E501


        :return: The auth_token_provider_reuse_access_token of this ComAdobeGraniteAuthOauthAccesstokenProviderProperties.  # noqa: E501
        :rtype: ConfigNodePropertyBoolean
        """
        return self._auth_token_provider_reuse_access_token

    @auth_token_provider_reuse_access_token.setter
    def auth_token_provider_reuse_access_token(self, auth_token_provider_reuse_access_token):
        """Sets the auth_token_provider_reuse_access_token of this ComAdobeGraniteAuthOauthAccesstokenProviderProperties.


        :param auth_token_provider_reuse_access_token: The auth_token_provider_reuse_access_token of this ComAdobeGraniteAuthOauthAccesstokenProviderProperties.  # noqa: E501
        :type: ConfigNodePropertyBoolean
        """

        self._auth_token_provider_reuse_access_token = auth_token_provider_reuse_access_token

    @property
    def auth_token_provider_relaxed_ssl(self):
        """Gets the auth_token_provider_relaxed_ssl of this ComAdobeGraniteAuthOauthAccesstokenProviderProperties.  # noqa: E501


        :return: The auth_token_provider_relaxed_ssl of this ComAdobeGraniteAuthOauthAccesstokenProviderProperties.  # noqa: E501
        :rtype: ConfigNodePropertyBoolean
        """
        return self._auth_token_provider_relaxed_ssl

    @auth_token_provider_relaxed_ssl.setter
    def auth_token_provider_relaxed_ssl(self, auth_token_provider_relaxed_ssl):
        """Sets the auth_token_provider_relaxed_ssl of this ComAdobeGraniteAuthOauthAccesstokenProviderProperties.


        :param auth_token_provider_relaxed_ssl: The auth_token_provider_relaxed_ssl of this ComAdobeGraniteAuthOauthAccesstokenProviderProperties.  # noqa: E501
        :type: ConfigNodePropertyBoolean
        """

        self._auth_token_provider_relaxed_ssl = auth_token_provider_relaxed_ssl

    @property
    def token_request_customizer_type(self):
        """Gets the token_request_customizer_type of this ComAdobeGraniteAuthOauthAccesstokenProviderProperties.  # noqa: E501


        :return: The token_request_customizer_type of this ComAdobeGraniteAuthOauthAccesstokenProviderProperties.  # noqa: E501
        :rtype: ConfigNodePropertyString
        """
        return self._token_request_customizer_type

    @token_request_customizer_type.setter
    def token_request_customizer_type(self, token_request_customizer_type):
        """Sets the token_request_customizer_type of this ComAdobeGraniteAuthOauthAccesstokenProviderProperties.


        :param token_request_customizer_type: The token_request_customizer_type of this ComAdobeGraniteAuthOauthAccesstokenProviderProperties.  # noqa: E501
        :type: ConfigNodePropertyString
        """

        self._token_request_customizer_type = token_request_customizer_type

    @property
    def auth_token_validator_type(self):
        """Gets the auth_token_validator_type of this ComAdobeGraniteAuthOauthAccesstokenProviderProperties.  # noqa: E501


        :return: The auth_token_validator_type of this ComAdobeGraniteAuthOauthAccesstokenProviderProperties.  # noqa: E501
        :rtype: ConfigNodePropertyString
        """
        return self._auth_token_validator_type

    @auth_token_validator_type.setter
    def auth_token_validator_type(self, auth_token_validator_type):
        """Sets the auth_token_validator_type of this ComAdobeGraniteAuthOauthAccesstokenProviderProperties.


        :param auth_token_validator_type: The auth_token_validator_type of this ComAdobeGraniteAuthOauthAccesstokenProviderProperties.  # noqa: E501
        :type: ConfigNodePropertyString
        """

        self._auth_token_validator_type = auth_token_validator_type

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
        if not isinstance(other, ComAdobeGraniteAuthOauthAccesstokenProviderProperties):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
