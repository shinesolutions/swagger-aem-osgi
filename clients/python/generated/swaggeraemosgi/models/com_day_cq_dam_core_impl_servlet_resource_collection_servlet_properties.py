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


class ComDayCqDamCoreImplServletResourceCollectionServletProperties(object):
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
        'sling_servlet_resource_types': 'ConfigNodePropertyArray',
        'sling_servlet_methods': 'ConfigNodePropertyString',
        'sling_servlet_selectors': 'ConfigNodePropertyString',
        'download_config': 'ConfigNodePropertyString',
        'view_selector': 'ConfigNodePropertyString',
        'send_email': 'ConfigNodePropertyBoolean'
    }

    attribute_map = {
        'sling_servlet_resource_types': 'sling.servlet.resourceTypes',
        'sling_servlet_methods': 'sling.servlet.methods',
        'sling_servlet_selectors': 'sling.servlet.selectors',
        'download_config': 'download.config',
        'view_selector': 'view.selector',
        'send_email': 'send_email'
    }

    def __init__(self, sling_servlet_resource_types=None, sling_servlet_methods=None, sling_servlet_selectors=None, download_config=None, view_selector=None, send_email=None):  # noqa: E501
        """ComDayCqDamCoreImplServletResourceCollectionServletProperties - a model defined in OpenAPI"""  # noqa: E501

        self._sling_servlet_resource_types = None
        self._sling_servlet_methods = None
        self._sling_servlet_selectors = None
        self._download_config = None
        self._view_selector = None
        self._send_email = None
        self.discriminator = None

        if sling_servlet_resource_types is not None:
            self.sling_servlet_resource_types = sling_servlet_resource_types
        if sling_servlet_methods is not None:
            self.sling_servlet_methods = sling_servlet_methods
        if sling_servlet_selectors is not None:
            self.sling_servlet_selectors = sling_servlet_selectors
        if download_config is not None:
            self.download_config = download_config
        if view_selector is not None:
            self.view_selector = view_selector
        if send_email is not None:
            self.send_email = send_email

    @property
    def sling_servlet_resource_types(self):
        """Gets the sling_servlet_resource_types of this ComDayCqDamCoreImplServletResourceCollectionServletProperties.  # noqa: E501


        :return: The sling_servlet_resource_types of this ComDayCqDamCoreImplServletResourceCollectionServletProperties.  # noqa: E501
        :rtype: ConfigNodePropertyArray
        """
        return self._sling_servlet_resource_types

    @sling_servlet_resource_types.setter
    def sling_servlet_resource_types(self, sling_servlet_resource_types):
        """Sets the sling_servlet_resource_types of this ComDayCqDamCoreImplServletResourceCollectionServletProperties.


        :param sling_servlet_resource_types: The sling_servlet_resource_types of this ComDayCqDamCoreImplServletResourceCollectionServletProperties.  # noqa: E501
        :type: ConfigNodePropertyArray
        """

        self._sling_servlet_resource_types = sling_servlet_resource_types

    @property
    def sling_servlet_methods(self):
        """Gets the sling_servlet_methods of this ComDayCqDamCoreImplServletResourceCollectionServletProperties.  # noqa: E501


        :return: The sling_servlet_methods of this ComDayCqDamCoreImplServletResourceCollectionServletProperties.  # noqa: E501
        :rtype: ConfigNodePropertyString
        """
        return self._sling_servlet_methods

    @sling_servlet_methods.setter
    def sling_servlet_methods(self, sling_servlet_methods):
        """Sets the sling_servlet_methods of this ComDayCqDamCoreImplServletResourceCollectionServletProperties.


        :param sling_servlet_methods: The sling_servlet_methods of this ComDayCqDamCoreImplServletResourceCollectionServletProperties.  # noqa: E501
        :type: ConfigNodePropertyString
        """

        self._sling_servlet_methods = sling_servlet_methods

    @property
    def sling_servlet_selectors(self):
        """Gets the sling_servlet_selectors of this ComDayCqDamCoreImplServletResourceCollectionServletProperties.  # noqa: E501


        :return: The sling_servlet_selectors of this ComDayCqDamCoreImplServletResourceCollectionServletProperties.  # noqa: E501
        :rtype: ConfigNodePropertyString
        """
        return self._sling_servlet_selectors

    @sling_servlet_selectors.setter
    def sling_servlet_selectors(self, sling_servlet_selectors):
        """Sets the sling_servlet_selectors of this ComDayCqDamCoreImplServletResourceCollectionServletProperties.


        :param sling_servlet_selectors: The sling_servlet_selectors of this ComDayCqDamCoreImplServletResourceCollectionServletProperties.  # noqa: E501
        :type: ConfigNodePropertyString
        """

        self._sling_servlet_selectors = sling_servlet_selectors

    @property
    def download_config(self):
        """Gets the download_config of this ComDayCqDamCoreImplServletResourceCollectionServletProperties.  # noqa: E501


        :return: The download_config of this ComDayCqDamCoreImplServletResourceCollectionServletProperties.  # noqa: E501
        :rtype: ConfigNodePropertyString
        """
        return self._download_config

    @download_config.setter
    def download_config(self, download_config):
        """Sets the download_config of this ComDayCqDamCoreImplServletResourceCollectionServletProperties.


        :param download_config: The download_config of this ComDayCqDamCoreImplServletResourceCollectionServletProperties.  # noqa: E501
        :type: ConfigNodePropertyString
        """

        self._download_config = download_config

    @property
    def view_selector(self):
        """Gets the view_selector of this ComDayCqDamCoreImplServletResourceCollectionServletProperties.  # noqa: E501


        :return: The view_selector of this ComDayCqDamCoreImplServletResourceCollectionServletProperties.  # noqa: E501
        :rtype: ConfigNodePropertyString
        """
        return self._view_selector

    @view_selector.setter
    def view_selector(self, view_selector):
        """Sets the view_selector of this ComDayCqDamCoreImplServletResourceCollectionServletProperties.


        :param view_selector: The view_selector of this ComDayCqDamCoreImplServletResourceCollectionServletProperties.  # noqa: E501
        :type: ConfigNodePropertyString
        """

        self._view_selector = view_selector

    @property
    def send_email(self):
        """Gets the send_email of this ComDayCqDamCoreImplServletResourceCollectionServletProperties.  # noqa: E501


        :return: The send_email of this ComDayCqDamCoreImplServletResourceCollectionServletProperties.  # noqa: E501
        :rtype: ConfigNodePropertyBoolean
        """
        return self._send_email

    @send_email.setter
    def send_email(self, send_email):
        """Sets the send_email of this ComDayCqDamCoreImplServletResourceCollectionServletProperties.


        :param send_email: The send_email of this ComDayCqDamCoreImplServletResourceCollectionServletProperties.  # noqa: E501
        :type: ConfigNodePropertyBoolean
        """

        self._send_email = send_email

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
        if not isinstance(other, ComDayCqDamCoreImplServletResourceCollectionServletProperties):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
