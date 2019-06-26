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


class OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties(object):
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
        'resource_resolver_searchpath': 'ConfigNodePropertyArray',
        'resource_resolver_manglenamespaces': 'ConfigNodePropertyBoolean',
        'resource_resolver_allow_direct': 'ConfigNodePropertyBoolean',
        'resource_resolver_required_providers': 'ConfigNodePropertyArray',
        'resource_resolver_required_providernames': 'ConfigNodePropertyArray',
        'resource_resolver_virtual': 'ConfigNodePropertyArray',
        'resource_resolver_mapping': 'ConfigNodePropertyArray',
        'resource_resolver_map_location': 'ConfigNodePropertyString',
        'resource_resolver_map_observation': 'ConfigNodePropertyArray',
        'resource_resolver_default_vanity_redirect_status': 'ConfigNodePropertyInteger',
        'resource_resolver_enable_vanitypath': 'ConfigNodePropertyBoolean',
        'resource_resolver_vanitypath_max_entries': 'ConfigNodePropertyInteger',
        'resource_resolver_vanitypath_max_entries_startup': 'ConfigNodePropertyBoolean',
        'resource_resolver_vanitypath_bloomfilter_max_bytes': 'ConfigNodePropertyInteger',
        'resource_resolver_optimize_alias_resolution': 'ConfigNodePropertyBoolean',
        'resource_resolver_vanitypath_whitelist': 'ConfigNodePropertyArray',
        'resource_resolver_vanitypath_blacklist': 'ConfigNodePropertyArray',
        'resource_resolver_vanity_precedence': 'ConfigNodePropertyBoolean',
        'resource_resolver_providerhandling_paranoid': 'ConfigNodePropertyBoolean',
        'resource_resolver_log_closing': 'ConfigNodePropertyBoolean',
        'resource_resolver_log_unclosed': 'ConfigNodePropertyBoolean'
    }

    attribute_map = {
        'resource_resolver_searchpath': 'resource.resolver.searchpath',
        'resource_resolver_manglenamespaces': 'resource.resolver.manglenamespaces',
        'resource_resolver_allow_direct': 'resource.resolver.allowDirect',
        'resource_resolver_required_providers': 'resource.resolver.required.providers',
        'resource_resolver_required_providernames': 'resource.resolver.required.providernames',
        'resource_resolver_virtual': 'resource.resolver.virtual',
        'resource_resolver_mapping': 'resource.resolver.mapping',
        'resource_resolver_map_location': 'resource.resolver.map.location',
        'resource_resolver_map_observation': 'resource.resolver.map.observation',
        'resource_resolver_default_vanity_redirect_status': 'resource.resolver.default.vanity.redirect.status',
        'resource_resolver_enable_vanitypath': 'resource.resolver.enable.vanitypath',
        'resource_resolver_vanitypath_max_entries': 'resource.resolver.vanitypath.maxEntries',
        'resource_resolver_vanitypath_max_entries_startup': 'resource.resolver.vanitypath.maxEntries.startup',
        'resource_resolver_vanitypath_bloomfilter_max_bytes': 'resource.resolver.vanitypath.bloomfilter.maxBytes',
        'resource_resolver_optimize_alias_resolution': 'resource.resolver.optimize.alias.resolution',
        'resource_resolver_vanitypath_whitelist': 'resource.resolver.vanitypath.whitelist',
        'resource_resolver_vanitypath_blacklist': 'resource.resolver.vanitypath.blacklist',
        'resource_resolver_vanity_precedence': 'resource.resolver.vanity.precedence',
        'resource_resolver_providerhandling_paranoid': 'resource.resolver.providerhandling.paranoid',
        'resource_resolver_log_closing': 'resource.resolver.log.closing',
        'resource_resolver_log_unclosed': 'resource.resolver.log.unclosed'
    }

    def __init__(self, resource_resolver_searchpath=None, resource_resolver_manglenamespaces=None, resource_resolver_allow_direct=None, resource_resolver_required_providers=None, resource_resolver_required_providernames=None, resource_resolver_virtual=None, resource_resolver_mapping=None, resource_resolver_map_location=None, resource_resolver_map_observation=None, resource_resolver_default_vanity_redirect_status=None, resource_resolver_enable_vanitypath=None, resource_resolver_vanitypath_max_entries=None, resource_resolver_vanitypath_max_entries_startup=None, resource_resolver_vanitypath_bloomfilter_max_bytes=None, resource_resolver_optimize_alias_resolution=None, resource_resolver_vanitypath_whitelist=None, resource_resolver_vanitypath_blacklist=None, resource_resolver_vanity_precedence=None, resource_resolver_providerhandling_paranoid=None, resource_resolver_log_closing=None, resource_resolver_log_unclosed=None):  # noqa: E501
        """OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties - a model defined in OpenAPI"""  # noqa: E501

        self._resource_resolver_searchpath = None
        self._resource_resolver_manglenamespaces = None
        self._resource_resolver_allow_direct = None
        self._resource_resolver_required_providers = None
        self._resource_resolver_required_providernames = None
        self._resource_resolver_virtual = None
        self._resource_resolver_mapping = None
        self._resource_resolver_map_location = None
        self._resource_resolver_map_observation = None
        self._resource_resolver_default_vanity_redirect_status = None
        self._resource_resolver_enable_vanitypath = None
        self._resource_resolver_vanitypath_max_entries = None
        self._resource_resolver_vanitypath_max_entries_startup = None
        self._resource_resolver_vanitypath_bloomfilter_max_bytes = None
        self._resource_resolver_optimize_alias_resolution = None
        self._resource_resolver_vanitypath_whitelist = None
        self._resource_resolver_vanitypath_blacklist = None
        self._resource_resolver_vanity_precedence = None
        self._resource_resolver_providerhandling_paranoid = None
        self._resource_resolver_log_closing = None
        self._resource_resolver_log_unclosed = None
        self.discriminator = None

        if resource_resolver_searchpath is not None:
            self.resource_resolver_searchpath = resource_resolver_searchpath
        if resource_resolver_manglenamespaces is not None:
            self.resource_resolver_manglenamespaces = resource_resolver_manglenamespaces
        if resource_resolver_allow_direct is not None:
            self.resource_resolver_allow_direct = resource_resolver_allow_direct
        if resource_resolver_required_providers is not None:
            self.resource_resolver_required_providers = resource_resolver_required_providers
        if resource_resolver_required_providernames is not None:
            self.resource_resolver_required_providernames = resource_resolver_required_providernames
        if resource_resolver_virtual is not None:
            self.resource_resolver_virtual = resource_resolver_virtual
        if resource_resolver_mapping is not None:
            self.resource_resolver_mapping = resource_resolver_mapping
        if resource_resolver_map_location is not None:
            self.resource_resolver_map_location = resource_resolver_map_location
        if resource_resolver_map_observation is not None:
            self.resource_resolver_map_observation = resource_resolver_map_observation
        if resource_resolver_default_vanity_redirect_status is not None:
            self.resource_resolver_default_vanity_redirect_status = resource_resolver_default_vanity_redirect_status
        if resource_resolver_enable_vanitypath is not None:
            self.resource_resolver_enable_vanitypath = resource_resolver_enable_vanitypath
        if resource_resolver_vanitypath_max_entries is not None:
            self.resource_resolver_vanitypath_max_entries = resource_resolver_vanitypath_max_entries
        if resource_resolver_vanitypath_max_entries_startup is not None:
            self.resource_resolver_vanitypath_max_entries_startup = resource_resolver_vanitypath_max_entries_startup
        if resource_resolver_vanitypath_bloomfilter_max_bytes is not None:
            self.resource_resolver_vanitypath_bloomfilter_max_bytes = resource_resolver_vanitypath_bloomfilter_max_bytes
        if resource_resolver_optimize_alias_resolution is not None:
            self.resource_resolver_optimize_alias_resolution = resource_resolver_optimize_alias_resolution
        if resource_resolver_vanitypath_whitelist is not None:
            self.resource_resolver_vanitypath_whitelist = resource_resolver_vanitypath_whitelist
        if resource_resolver_vanitypath_blacklist is not None:
            self.resource_resolver_vanitypath_blacklist = resource_resolver_vanitypath_blacklist
        if resource_resolver_vanity_precedence is not None:
            self.resource_resolver_vanity_precedence = resource_resolver_vanity_precedence
        if resource_resolver_providerhandling_paranoid is not None:
            self.resource_resolver_providerhandling_paranoid = resource_resolver_providerhandling_paranoid
        if resource_resolver_log_closing is not None:
            self.resource_resolver_log_closing = resource_resolver_log_closing
        if resource_resolver_log_unclosed is not None:
            self.resource_resolver_log_unclosed = resource_resolver_log_unclosed

    @property
    def resource_resolver_searchpath(self):
        """Gets the resource_resolver_searchpath of this OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties.  # noqa: E501


        :return: The resource_resolver_searchpath of this OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties.  # noqa: E501
        :rtype: ConfigNodePropertyArray
        """
        return self._resource_resolver_searchpath

    @resource_resolver_searchpath.setter
    def resource_resolver_searchpath(self, resource_resolver_searchpath):
        """Sets the resource_resolver_searchpath of this OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties.


        :param resource_resolver_searchpath: The resource_resolver_searchpath of this OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties.  # noqa: E501
        :type: ConfigNodePropertyArray
        """

        self._resource_resolver_searchpath = resource_resolver_searchpath

    @property
    def resource_resolver_manglenamespaces(self):
        """Gets the resource_resolver_manglenamespaces of this OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties.  # noqa: E501


        :return: The resource_resolver_manglenamespaces of this OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties.  # noqa: E501
        :rtype: ConfigNodePropertyBoolean
        """
        return self._resource_resolver_manglenamespaces

    @resource_resolver_manglenamespaces.setter
    def resource_resolver_manglenamespaces(self, resource_resolver_manglenamespaces):
        """Sets the resource_resolver_manglenamespaces of this OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties.


        :param resource_resolver_manglenamespaces: The resource_resolver_manglenamespaces of this OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties.  # noqa: E501
        :type: ConfigNodePropertyBoolean
        """

        self._resource_resolver_manglenamespaces = resource_resolver_manglenamespaces

    @property
    def resource_resolver_allow_direct(self):
        """Gets the resource_resolver_allow_direct of this OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties.  # noqa: E501


        :return: The resource_resolver_allow_direct of this OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties.  # noqa: E501
        :rtype: ConfigNodePropertyBoolean
        """
        return self._resource_resolver_allow_direct

    @resource_resolver_allow_direct.setter
    def resource_resolver_allow_direct(self, resource_resolver_allow_direct):
        """Sets the resource_resolver_allow_direct of this OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties.


        :param resource_resolver_allow_direct: The resource_resolver_allow_direct of this OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties.  # noqa: E501
        :type: ConfigNodePropertyBoolean
        """

        self._resource_resolver_allow_direct = resource_resolver_allow_direct

    @property
    def resource_resolver_required_providers(self):
        """Gets the resource_resolver_required_providers of this OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties.  # noqa: E501


        :return: The resource_resolver_required_providers of this OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties.  # noqa: E501
        :rtype: ConfigNodePropertyArray
        """
        return self._resource_resolver_required_providers

    @resource_resolver_required_providers.setter
    def resource_resolver_required_providers(self, resource_resolver_required_providers):
        """Sets the resource_resolver_required_providers of this OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties.


        :param resource_resolver_required_providers: The resource_resolver_required_providers of this OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties.  # noqa: E501
        :type: ConfigNodePropertyArray
        """

        self._resource_resolver_required_providers = resource_resolver_required_providers

    @property
    def resource_resolver_required_providernames(self):
        """Gets the resource_resolver_required_providernames of this OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties.  # noqa: E501


        :return: The resource_resolver_required_providernames of this OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties.  # noqa: E501
        :rtype: ConfigNodePropertyArray
        """
        return self._resource_resolver_required_providernames

    @resource_resolver_required_providernames.setter
    def resource_resolver_required_providernames(self, resource_resolver_required_providernames):
        """Sets the resource_resolver_required_providernames of this OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties.


        :param resource_resolver_required_providernames: The resource_resolver_required_providernames of this OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties.  # noqa: E501
        :type: ConfigNodePropertyArray
        """

        self._resource_resolver_required_providernames = resource_resolver_required_providernames

    @property
    def resource_resolver_virtual(self):
        """Gets the resource_resolver_virtual of this OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties.  # noqa: E501


        :return: The resource_resolver_virtual of this OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties.  # noqa: E501
        :rtype: ConfigNodePropertyArray
        """
        return self._resource_resolver_virtual

    @resource_resolver_virtual.setter
    def resource_resolver_virtual(self, resource_resolver_virtual):
        """Sets the resource_resolver_virtual of this OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties.


        :param resource_resolver_virtual: The resource_resolver_virtual of this OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties.  # noqa: E501
        :type: ConfigNodePropertyArray
        """

        self._resource_resolver_virtual = resource_resolver_virtual

    @property
    def resource_resolver_mapping(self):
        """Gets the resource_resolver_mapping of this OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties.  # noqa: E501


        :return: The resource_resolver_mapping of this OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties.  # noqa: E501
        :rtype: ConfigNodePropertyArray
        """
        return self._resource_resolver_mapping

    @resource_resolver_mapping.setter
    def resource_resolver_mapping(self, resource_resolver_mapping):
        """Sets the resource_resolver_mapping of this OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties.


        :param resource_resolver_mapping: The resource_resolver_mapping of this OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties.  # noqa: E501
        :type: ConfigNodePropertyArray
        """

        self._resource_resolver_mapping = resource_resolver_mapping

    @property
    def resource_resolver_map_location(self):
        """Gets the resource_resolver_map_location of this OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties.  # noqa: E501


        :return: The resource_resolver_map_location of this OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties.  # noqa: E501
        :rtype: ConfigNodePropertyString
        """
        return self._resource_resolver_map_location

    @resource_resolver_map_location.setter
    def resource_resolver_map_location(self, resource_resolver_map_location):
        """Sets the resource_resolver_map_location of this OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties.


        :param resource_resolver_map_location: The resource_resolver_map_location of this OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties.  # noqa: E501
        :type: ConfigNodePropertyString
        """

        self._resource_resolver_map_location = resource_resolver_map_location

    @property
    def resource_resolver_map_observation(self):
        """Gets the resource_resolver_map_observation of this OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties.  # noqa: E501


        :return: The resource_resolver_map_observation of this OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties.  # noqa: E501
        :rtype: ConfigNodePropertyArray
        """
        return self._resource_resolver_map_observation

    @resource_resolver_map_observation.setter
    def resource_resolver_map_observation(self, resource_resolver_map_observation):
        """Sets the resource_resolver_map_observation of this OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties.


        :param resource_resolver_map_observation: The resource_resolver_map_observation of this OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties.  # noqa: E501
        :type: ConfigNodePropertyArray
        """

        self._resource_resolver_map_observation = resource_resolver_map_observation

    @property
    def resource_resolver_default_vanity_redirect_status(self):
        """Gets the resource_resolver_default_vanity_redirect_status of this OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties.  # noqa: E501


        :return: The resource_resolver_default_vanity_redirect_status of this OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties.  # noqa: E501
        :rtype: ConfigNodePropertyInteger
        """
        return self._resource_resolver_default_vanity_redirect_status

    @resource_resolver_default_vanity_redirect_status.setter
    def resource_resolver_default_vanity_redirect_status(self, resource_resolver_default_vanity_redirect_status):
        """Sets the resource_resolver_default_vanity_redirect_status of this OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties.


        :param resource_resolver_default_vanity_redirect_status: The resource_resolver_default_vanity_redirect_status of this OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties.  # noqa: E501
        :type: ConfigNodePropertyInteger
        """

        self._resource_resolver_default_vanity_redirect_status = resource_resolver_default_vanity_redirect_status

    @property
    def resource_resolver_enable_vanitypath(self):
        """Gets the resource_resolver_enable_vanitypath of this OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties.  # noqa: E501


        :return: The resource_resolver_enable_vanitypath of this OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties.  # noqa: E501
        :rtype: ConfigNodePropertyBoolean
        """
        return self._resource_resolver_enable_vanitypath

    @resource_resolver_enable_vanitypath.setter
    def resource_resolver_enable_vanitypath(self, resource_resolver_enable_vanitypath):
        """Sets the resource_resolver_enable_vanitypath of this OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties.


        :param resource_resolver_enable_vanitypath: The resource_resolver_enable_vanitypath of this OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties.  # noqa: E501
        :type: ConfigNodePropertyBoolean
        """

        self._resource_resolver_enable_vanitypath = resource_resolver_enable_vanitypath

    @property
    def resource_resolver_vanitypath_max_entries(self):
        """Gets the resource_resolver_vanitypath_max_entries of this OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties.  # noqa: E501


        :return: The resource_resolver_vanitypath_max_entries of this OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties.  # noqa: E501
        :rtype: ConfigNodePropertyInteger
        """
        return self._resource_resolver_vanitypath_max_entries

    @resource_resolver_vanitypath_max_entries.setter
    def resource_resolver_vanitypath_max_entries(self, resource_resolver_vanitypath_max_entries):
        """Sets the resource_resolver_vanitypath_max_entries of this OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties.


        :param resource_resolver_vanitypath_max_entries: The resource_resolver_vanitypath_max_entries of this OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties.  # noqa: E501
        :type: ConfigNodePropertyInteger
        """

        self._resource_resolver_vanitypath_max_entries = resource_resolver_vanitypath_max_entries

    @property
    def resource_resolver_vanitypath_max_entries_startup(self):
        """Gets the resource_resolver_vanitypath_max_entries_startup of this OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties.  # noqa: E501


        :return: The resource_resolver_vanitypath_max_entries_startup of this OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties.  # noqa: E501
        :rtype: ConfigNodePropertyBoolean
        """
        return self._resource_resolver_vanitypath_max_entries_startup

    @resource_resolver_vanitypath_max_entries_startup.setter
    def resource_resolver_vanitypath_max_entries_startup(self, resource_resolver_vanitypath_max_entries_startup):
        """Sets the resource_resolver_vanitypath_max_entries_startup of this OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties.


        :param resource_resolver_vanitypath_max_entries_startup: The resource_resolver_vanitypath_max_entries_startup of this OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties.  # noqa: E501
        :type: ConfigNodePropertyBoolean
        """

        self._resource_resolver_vanitypath_max_entries_startup = resource_resolver_vanitypath_max_entries_startup

    @property
    def resource_resolver_vanitypath_bloomfilter_max_bytes(self):
        """Gets the resource_resolver_vanitypath_bloomfilter_max_bytes of this OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties.  # noqa: E501


        :return: The resource_resolver_vanitypath_bloomfilter_max_bytes of this OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties.  # noqa: E501
        :rtype: ConfigNodePropertyInteger
        """
        return self._resource_resolver_vanitypath_bloomfilter_max_bytes

    @resource_resolver_vanitypath_bloomfilter_max_bytes.setter
    def resource_resolver_vanitypath_bloomfilter_max_bytes(self, resource_resolver_vanitypath_bloomfilter_max_bytes):
        """Sets the resource_resolver_vanitypath_bloomfilter_max_bytes of this OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties.


        :param resource_resolver_vanitypath_bloomfilter_max_bytes: The resource_resolver_vanitypath_bloomfilter_max_bytes of this OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties.  # noqa: E501
        :type: ConfigNodePropertyInteger
        """

        self._resource_resolver_vanitypath_bloomfilter_max_bytes = resource_resolver_vanitypath_bloomfilter_max_bytes

    @property
    def resource_resolver_optimize_alias_resolution(self):
        """Gets the resource_resolver_optimize_alias_resolution of this OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties.  # noqa: E501


        :return: The resource_resolver_optimize_alias_resolution of this OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties.  # noqa: E501
        :rtype: ConfigNodePropertyBoolean
        """
        return self._resource_resolver_optimize_alias_resolution

    @resource_resolver_optimize_alias_resolution.setter
    def resource_resolver_optimize_alias_resolution(self, resource_resolver_optimize_alias_resolution):
        """Sets the resource_resolver_optimize_alias_resolution of this OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties.


        :param resource_resolver_optimize_alias_resolution: The resource_resolver_optimize_alias_resolution of this OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties.  # noqa: E501
        :type: ConfigNodePropertyBoolean
        """

        self._resource_resolver_optimize_alias_resolution = resource_resolver_optimize_alias_resolution

    @property
    def resource_resolver_vanitypath_whitelist(self):
        """Gets the resource_resolver_vanitypath_whitelist of this OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties.  # noqa: E501


        :return: The resource_resolver_vanitypath_whitelist of this OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties.  # noqa: E501
        :rtype: ConfigNodePropertyArray
        """
        return self._resource_resolver_vanitypath_whitelist

    @resource_resolver_vanitypath_whitelist.setter
    def resource_resolver_vanitypath_whitelist(self, resource_resolver_vanitypath_whitelist):
        """Sets the resource_resolver_vanitypath_whitelist of this OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties.


        :param resource_resolver_vanitypath_whitelist: The resource_resolver_vanitypath_whitelist of this OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties.  # noqa: E501
        :type: ConfigNodePropertyArray
        """

        self._resource_resolver_vanitypath_whitelist = resource_resolver_vanitypath_whitelist

    @property
    def resource_resolver_vanitypath_blacklist(self):
        """Gets the resource_resolver_vanitypath_blacklist of this OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties.  # noqa: E501


        :return: The resource_resolver_vanitypath_blacklist of this OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties.  # noqa: E501
        :rtype: ConfigNodePropertyArray
        """
        return self._resource_resolver_vanitypath_blacklist

    @resource_resolver_vanitypath_blacklist.setter
    def resource_resolver_vanitypath_blacklist(self, resource_resolver_vanitypath_blacklist):
        """Sets the resource_resolver_vanitypath_blacklist of this OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties.


        :param resource_resolver_vanitypath_blacklist: The resource_resolver_vanitypath_blacklist of this OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties.  # noqa: E501
        :type: ConfigNodePropertyArray
        """

        self._resource_resolver_vanitypath_blacklist = resource_resolver_vanitypath_blacklist

    @property
    def resource_resolver_vanity_precedence(self):
        """Gets the resource_resolver_vanity_precedence of this OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties.  # noqa: E501


        :return: The resource_resolver_vanity_precedence of this OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties.  # noqa: E501
        :rtype: ConfigNodePropertyBoolean
        """
        return self._resource_resolver_vanity_precedence

    @resource_resolver_vanity_precedence.setter
    def resource_resolver_vanity_precedence(self, resource_resolver_vanity_precedence):
        """Sets the resource_resolver_vanity_precedence of this OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties.


        :param resource_resolver_vanity_precedence: The resource_resolver_vanity_precedence of this OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties.  # noqa: E501
        :type: ConfigNodePropertyBoolean
        """

        self._resource_resolver_vanity_precedence = resource_resolver_vanity_precedence

    @property
    def resource_resolver_providerhandling_paranoid(self):
        """Gets the resource_resolver_providerhandling_paranoid of this OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties.  # noqa: E501


        :return: The resource_resolver_providerhandling_paranoid of this OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties.  # noqa: E501
        :rtype: ConfigNodePropertyBoolean
        """
        return self._resource_resolver_providerhandling_paranoid

    @resource_resolver_providerhandling_paranoid.setter
    def resource_resolver_providerhandling_paranoid(self, resource_resolver_providerhandling_paranoid):
        """Sets the resource_resolver_providerhandling_paranoid of this OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties.


        :param resource_resolver_providerhandling_paranoid: The resource_resolver_providerhandling_paranoid of this OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties.  # noqa: E501
        :type: ConfigNodePropertyBoolean
        """

        self._resource_resolver_providerhandling_paranoid = resource_resolver_providerhandling_paranoid

    @property
    def resource_resolver_log_closing(self):
        """Gets the resource_resolver_log_closing of this OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties.  # noqa: E501


        :return: The resource_resolver_log_closing of this OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties.  # noqa: E501
        :rtype: ConfigNodePropertyBoolean
        """
        return self._resource_resolver_log_closing

    @resource_resolver_log_closing.setter
    def resource_resolver_log_closing(self, resource_resolver_log_closing):
        """Sets the resource_resolver_log_closing of this OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties.


        :param resource_resolver_log_closing: The resource_resolver_log_closing of this OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties.  # noqa: E501
        :type: ConfigNodePropertyBoolean
        """

        self._resource_resolver_log_closing = resource_resolver_log_closing

    @property
    def resource_resolver_log_unclosed(self):
        """Gets the resource_resolver_log_unclosed of this OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties.  # noqa: E501


        :return: The resource_resolver_log_unclosed of this OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties.  # noqa: E501
        :rtype: ConfigNodePropertyBoolean
        """
        return self._resource_resolver_log_unclosed

    @resource_resolver_log_unclosed.setter
    def resource_resolver_log_unclosed(self, resource_resolver_log_unclosed):
        """Sets the resource_resolver_log_unclosed of this OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties.


        :param resource_resolver_log_unclosed: The resource_resolver_log_unclosed of this OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties.  # noqa: E501
        :type: ConfigNodePropertyBoolean
        """

        self._resource_resolver_log_unclosed = resource_resolver_log_unclosed

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
        if not isinstance(other, OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other