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


class ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties(object):
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
        'linkcheckertransformer_disable_rewriting': 'ConfigNodePropertyBoolean',
        'linkcheckertransformer_disable_checking': 'ConfigNodePropertyBoolean',
        'linkcheckertransformer_map_cache_size': 'ConfigNodePropertyInteger',
        'linkcheckertransformer_strict_extension_check': 'ConfigNodePropertyBoolean',
        'linkcheckertransformer_strip_htmlt_extension': 'ConfigNodePropertyBoolean',
        'linkcheckertransformer_rewrite_elements': 'ConfigNodePropertyArray',
        'linkcheckertransformer_strip_extension_path_blacklist': 'ConfigNodePropertyArray'
    }

    attribute_map = {
        'linkcheckertransformer_disable_rewriting': 'linkcheckertransformer.disableRewriting',
        'linkcheckertransformer_disable_checking': 'linkcheckertransformer.disableChecking',
        'linkcheckertransformer_map_cache_size': 'linkcheckertransformer.mapCacheSize',
        'linkcheckertransformer_strict_extension_check': 'linkcheckertransformer.strictExtensionCheck',
        'linkcheckertransformer_strip_htmlt_extension': 'linkcheckertransformer.stripHtmltExtension',
        'linkcheckertransformer_rewrite_elements': 'linkcheckertransformer.rewriteElements',
        'linkcheckertransformer_strip_extension_path_blacklist': 'linkcheckertransformer.stripExtensionPathBlacklist'
    }

    def __init__(self, linkcheckertransformer_disable_rewriting=None, linkcheckertransformer_disable_checking=None, linkcheckertransformer_map_cache_size=None, linkcheckertransformer_strict_extension_check=None, linkcheckertransformer_strip_htmlt_extension=None, linkcheckertransformer_rewrite_elements=None, linkcheckertransformer_strip_extension_path_blacklist=None):  # noqa: E501
        """ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties - a model defined in OpenAPI"""  # noqa: E501

        self._linkcheckertransformer_disable_rewriting = None
        self._linkcheckertransformer_disable_checking = None
        self._linkcheckertransformer_map_cache_size = None
        self._linkcheckertransformer_strict_extension_check = None
        self._linkcheckertransformer_strip_htmlt_extension = None
        self._linkcheckertransformer_rewrite_elements = None
        self._linkcheckertransformer_strip_extension_path_blacklist = None
        self.discriminator = None

        if linkcheckertransformer_disable_rewriting is not None:
            self.linkcheckertransformer_disable_rewriting = linkcheckertransformer_disable_rewriting
        if linkcheckertransformer_disable_checking is not None:
            self.linkcheckertransformer_disable_checking = linkcheckertransformer_disable_checking
        if linkcheckertransformer_map_cache_size is not None:
            self.linkcheckertransformer_map_cache_size = linkcheckertransformer_map_cache_size
        if linkcheckertransformer_strict_extension_check is not None:
            self.linkcheckertransformer_strict_extension_check = linkcheckertransformer_strict_extension_check
        if linkcheckertransformer_strip_htmlt_extension is not None:
            self.linkcheckertransformer_strip_htmlt_extension = linkcheckertransformer_strip_htmlt_extension
        if linkcheckertransformer_rewrite_elements is not None:
            self.linkcheckertransformer_rewrite_elements = linkcheckertransformer_rewrite_elements
        if linkcheckertransformer_strip_extension_path_blacklist is not None:
            self.linkcheckertransformer_strip_extension_path_blacklist = linkcheckertransformer_strip_extension_path_blacklist

    @property
    def linkcheckertransformer_disable_rewriting(self):
        """Gets the linkcheckertransformer_disable_rewriting of this ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties.  # noqa: E501


        :return: The linkcheckertransformer_disable_rewriting of this ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties.  # noqa: E501
        :rtype: ConfigNodePropertyBoolean
        """
        return self._linkcheckertransformer_disable_rewriting

    @linkcheckertransformer_disable_rewriting.setter
    def linkcheckertransformer_disable_rewriting(self, linkcheckertransformer_disable_rewriting):
        """Sets the linkcheckertransformer_disable_rewriting of this ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties.


        :param linkcheckertransformer_disable_rewriting: The linkcheckertransformer_disable_rewriting of this ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties.  # noqa: E501
        :type: ConfigNodePropertyBoolean
        """

        self._linkcheckertransformer_disable_rewriting = linkcheckertransformer_disable_rewriting

    @property
    def linkcheckertransformer_disable_checking(self):
        """Gets the linkcheckertransformer_disable_checking of this ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties.  # noqa: E501


        :return: The linkcheckertransformer_disable_checking of this ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties.  # noqa: E501
        :rtype: ConfigNodePropertyBoolean
        """
        return self._linkcheckertransformer_disable_checking

    @linkcheckertransformer_disable_checking.setter
    def linkcheckertransformer_disable_checking(self, linkcheckertransformer_disable_checking):
        """Sets the linkcheckertransformer_disable_checking of this ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties.


        :param linkcheckertransformer_disable_checking: The linkcheckertransformer_disable_checking of this ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties.  # noqa: E501
        :type: ConfigNodePropertyBoolean
        """

        self._linkcheckertransformer_disable_checking = linkcheckertransformer_disable_checking

    @property
    def linkcheckertransformer_map_cache_size(self):
        """Gets the linkcheckertransformer_map_cache_size of this ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties.  # noqa: E501


        :return: The linkcheckertransformer_map_cache_size of this ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties.  # noqa: E501
        :rtype: ConfigNodePropertyInteger
        """
        return self._linkcheckertransformer_map_cache_size

    @linkcheckertransformer_map_cache_size.setter
    def linkcheckertransformer_map_cache_size(self, linkcheckertransformer_map_cache_size):
        """Sets the linkcheckertransformer_map_cache_size of this ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties.


        :param linkcheckertransformer_map_cache_size: The linkcheckertransformer_map_cache_size of this ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties.  # noqa: E501
        :type: ConfigNodePropertyInteger
        """

        self._linkcheckertransformer_map_cache_size = linkcheckertransformer_map_cache_size

    @property
    def linkcheckertransformer_strict_extension_check(self):
        """Gets the linkcheckertransformer_strict_extension_check of this ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties.  # noqa: E501


        :return: The linkcheckertransformer_strict_extension_check of this ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties.  # noqa: E501
        :rtype: ConfigNodePropertyBoolean
        """
        return self._linkcheckertransformer_strict_extension_check

    @linkcheckertransformer_strict_extension_check.setter
    def linkcheckertransformer_strict_extension_check(self, linkcheckertransformer_strict_extension_check):
        """Sets the linkcheckertransformer_strict_extension_check of this ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties.


        :param linkcheckertransformer_strict_extension_check: The linkcheckertransformer_strict_extension_check of this ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties.  # noqa: E501
        :type: ConfigNodePropertyBoolean
        """

        self._linkcheckertransformer_strict_extension_check = linkcheckertransformer_strict_extension_check

    @property
    def linkcheckertransformer_strip_htmlt_extension(self):
        """Gets the linkcheckertransformer_strip_htmlt_extension of this ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties.  # noqa: E501


        :return: The linkcheckertransformer_strip_htmlt_extension of this ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties.  # noqa: E501
        :rtype: ConfigNodePropertyBoolean
        """
        return self._linkcheckertransformer_strip_htmlt_extension

    @linkcheckertransformer_strip_htmlt_extension.setter
    def linkcheckertransformer_strip_htmlt_extension(self, linkcheckertransformer_strip_htmlt_extension):
        """Sets the linkcheckertransformer_strip_htmlt_extension of this ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties.


        :param linkcheckertransformer_strip_htmlt_extension: The linkcheckertransformer_strip_htmlt_extension of this ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties.  # noqa: E501
        :type: ConfigNodePropertyBoolean
        """

        self._linkcheckertransformer_strip_htmlt_extension = linkcheckertransformer_strip_htmlt_extension

    @property
    def linkcheckertransformer_rewrite_elements(self):
        """Gets the linkcheckertransformer_rewrite_elements of this ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties.  # noqa: E501


        :return: The linkcheckertransformer_rewrite_elements of this ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties.  # noqa: E501
        :rtype: ConfigNodePropertyArray
        """
        return self._linkcheckertransformer_rewrite_elements

    @linkcheckertransformer_rewrite_elements.setter
    def linkcheckertransformer_rewrite_elements(self, linkcheckertransformer_rewrite_elements):
        """Sets the linkcheckertransformer_rewrite_elements of this ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties.


        :param linkcheckertransformer_rewrite_elements: The linkcheckertransformer_rewrite_elements of this ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties.  # noqa: E501
        :type: ConfigNodePropertyArray
        """

        self._linkcheckertransformer_rewrite_elements = linkcheckertransformer_rewrite_elements

    @property
    def linkcheckertransformer_strip_extension_path_blacklist(self):
        """Gets the linkcheckertransformer_strip_extension_path_blacklist of this ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties.  # noqa: E501


        :return: The linkcheckertransformer_strip_extension_path_blacklist of this ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties.  # noqa: E501
        :rtype: ConfigNodePropertyArray
        """
        return self._linkcheckertransformer_strip_extension_path_blacklist

    @linkcheckertransformer_strip_extension_path_blacklist.setter
    def linkcheckertransformer_strip_extension_path_blacklist(self, linkcheckertransformer_strip_extension_path_blacklist):
        """Sets the linkcheckertransformer_strip_extension_path_blacklist of this ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties.


        :param linkcheckertransformer_strip_extension_path_blacklist: The linkcheckertransformer_strip_extension_path_blacklist of this ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties.  # noqa: E501
        :type: ConfigNodePropertyArray
        """

        self._linkcheckertransformer_strip_extension_path_blacklist = linkcheckertransformer_strip_extension_path_blacklist

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
        if not isinstance(other, ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
