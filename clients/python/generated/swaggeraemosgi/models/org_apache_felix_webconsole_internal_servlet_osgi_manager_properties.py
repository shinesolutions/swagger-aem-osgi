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


class OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties(object):
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
        'manager_root': 'ConfigNodePropertyString',
        'http_service_filter': 'ConfigNodePropertyString',
        'default_render': 'ConfigNodePropertyString',
        'realm': 'ConfigNodePropertyString',
        'username': 'ConfigNodePropertyString',
        'password': 'ConfigNodePropertyString',
        'category': 'ConfigNodePropertyString',
        'locale': 'ConfigNodePropertyString',
        'loglevel': 'ConfigNodePropertyDropDown',
        'plugins': 'ConfigNodePropertyDropDown'
    }

    attribute_map = {
        'manager_root': 'manager.root',
        'http_service_filter': 'http.service.filter',
        'default_render': 'default.render',
        'realm': 'realm',
        'username': 'username',
        'password': 'password',
        'category': 'category',
        'locale': 'locale',
        'loglevel': 'loglevel',
        'plugins': 'plugins'
    }

    def __init__(self, manager_root=None, http_service_filter=None, default_render=None, realm=None, username=None, password=None, category=None, locale=None, loglevel=None, plugins=None):  # noqa: E501
        """OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties - a model defined in OpenAPI"""  # noqa: E501

        self._manager_root = None
        self._http_service_filter = None
        self._default_render = None
        self._realm = None
        self._username = None
        self._password = None
        self._category = None
        self._locale = None
        self._loglevel = None
        self._plugins = None
        self.discriminator = None

        if manager_root is not None:
            self.manager_root = manager_root
        if http_service_filter is not None:
            self.http_service_filter = http_service_filter
        if default_render is not None:
            self.default_render = default_render
        if realm is not None:
            self.realm = realm
        if username is not None:
            self.username = username
        if password is not None:
            self.password = password
        if category is not None:
            self.category = category
        if locale is not None:
            self.locale = locale
        if loglevel is not None:
            self.loglevel = loglevel
        if plugins is not None:
            self.plugins = plugins

    @property
    def manager_root(self):
        """Gets the manager_root of this OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties.  # noqa: E501


        :return: The manager_root of this OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties.  # noqa: E501
        :rtype: ConfigNodePropertyString
        """
        return self._manager_root

    @manager_root.setter
    def manager_root(self, manager_root):
        """Sets the manager_root of this OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties.


        :param manager_root: The manager_root of this OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties.  # noqa: E501
        :type: ConfigNodePropertyString
        """

        self._manager_root = manager_root

    @property
    def http_service_filter(self):
        """Gets the http_service_filter of this OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties.  # noqa: E501


        :return: The http_service_filter of this OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties.  # noqa: E501
        :rtype: ConfigNodePropertyString
        """
        return self._http_service_filter

    @http_service_filter.setter
    def http_service_filter(self, http_service_filter):
        """Sets the http_service_filter of this OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties.


        :param http_service_filter: The http_service_filter of this OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties.  # noqa: E501
        :type: ConfigNodePropertyString
        """

        self._http_service_filter = http_service_filter

    @property
    def default_render(self):
        """Gets the default_render of this OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties.  # noqa: E501


        :return: The default_render of this OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties.  # noqa: E501
        :rtype: ConfigNodePropertyString
        """
        return self._default_render

    @default_render.setter
    def default_render(self, default_render):
        """Sets the default_render of this OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties.


        :param default_render: The default_render of this OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties.  # noqa: E501
        :type: ConfigNodePropertyString
        """

        self._default_render = default_render

    @property
    def realm(self):
        """Gets the realm of this OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties.  # noqa: E501


        :return: The realm of this OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties.  # noqa: E501
        :rtype: ConfigNodePropertyString
        """
        return self._realm

    @realm.setter
    def realm(self, realm):
        """Sets the realm of this OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties.


        :param realm: The realm of this OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties.  # noqa: E501
        :type: ConfigNodePropertyString
        """

        self._realm = realm

    @property
    def username(self):
        """Gets the username of this OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties.  # noqa: E501


        :return: The username of this OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties.  # noqa: E501
        :rtype: ConfigNodePropertyString
        """
        return self._username

    @username.setter
    def username(self, username):
        """Sets the username of this OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties.


        :param username: The username of this OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties.  # noqa: E501
        :type: ConfigNodePropertyString
        """

        self._username = username

    @property
    def password(self):
        """Gets the password of this OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties.  # noqa: E501


        :return: The password of this OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties.  # noqa: E501
        :rtype: ConfigNodePropertyString
        """
        return self._password

    @password.setter
    def password(self, password):
        """Sets the password of this OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties.


        :param password: The password of this OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties.  # noqa: E501
        :type: ConfigNodePropertyString
        """

        self._password = password

    @property
    def category(self):
        """Gets the category of this OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties.  # noqa: E501


        :return: The category of this OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties.  # noqa: E501
        :rtype: ConfigNodePropertyString
        """
        return self._category

    @category.setter
    def category(self, category):
        """Sets the category of this OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties.


        :param category: The category of this OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties.  # noqa: E501
        :type: ConfigNodePropertyString
        """

        self._category = category

    @property
    def locale(self):
        """Gets the locale of this OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties.  # noqa: E501


        :return: The locale of this OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties.  # noqa: E501
        :rtype: ConfigNodePropertyString
        """
        return self._locale

    @locale.setter
    def locale(self, locale):
        """Sets the locale of this OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties.


        :param locale: The locale of this OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties.  # noqa: E501
        :type: ConfigNodePropertyString
        """

        self._locale = locale

    @property
    def loglevel(self):
        """Gets the loglevel of this OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties.  # noqa: E501


        :return: The loglevel of this OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties.  # noqa: E501
        :rtype: ConfigNodePropertyDropDown
        """
        return self._loglevel

    @loglevel.setter
    def loglevel(self, loglevel):
        """Sets the loglevel of this OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties.


        :param loglevel: The loglevel of this OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties.  # noqa: E501
        :type: ConfigNodePropertyDropDown
        """

        self._loglevel = loglevel

    @property
    def plugins(self):
        """Gets the plugins of this OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties.  # noqa: E501


        :return: The plugins of this OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties.  # noqa: E501
        :rtype: ConfigNodePropertyDropDown
        """
        return self._plugins

    @plugins.setter
    def plugins(self, plugins):
        """Sets the plugins of this OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties.


        :param plugins: The plugins of this OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties.  # noqa: E501
        :type: ConfigNodePropertyDropDown
        """

        self._plugins = plugins

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
        if not isinstance(other, OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other