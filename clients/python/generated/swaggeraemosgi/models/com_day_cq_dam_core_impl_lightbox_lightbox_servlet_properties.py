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


class ComDayCqDamCoreImplLightboxLightboxServletProperties(object):
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
        'sling_servlet_paths': 'ConfigNodePropertyString',
        'sling_servlet_methods': 'ConfigNodePropertyArray',
        'cq_dam_enable_anonymous': 'ConfigNodePropertyBoolean'
    }

    attribute_map = {
        'sling_servlet_paths': 'sling.servlet.paths',
        'sling_servlet_methods': 'sling.servlet.methods',
        'cq_dam_enable_anonymous': 'cq.dam.enable.anonymous'
    }

    def __init__(self, sling_servlet_paths=None, sling_servlet_methods=None, cq_dam_enable_anonymous=None):  # noqa: E501
        """ComDayCqDamCoreImplLightboxLightboxServletProperties - a model defined in OpenAPI"""  # noqa: E501

        self._sling_servlet_paths = None
        self._sling_servlet_methods = None
        self._cq_dam_enable_anonymous = None
        self.discriminator = None

        if sling_servlet_paths is not None:
            self.sling_servlet_paths = sling_servlet_paths
        if sling_servlet_methods is not None:
            self.sling_servlet_methods = sling_servlet_methods
        if cq_dam_enable_anonymous is not None:
            self.cq_dam_enable_anonymous = cq_dam_enable_anonymous

    @property
    def sling_servlet_paths(self):
        """Gets the sling_servlet_paths of this ComDayCqDamCoreImplLightboxLightboxServletProperties.  # noqa: E501


        :return: The sling_servlet_paths of this ComDayCqDamCoreImplLightboxLightboxServletProperties.  # noqa: E501
        :rtype: ConfigNodePropertyString
        """
        return self._sling_servlet_paths

    @sling_servlet_paths.setter
    def sling_servlet_paths(self, sling_servlet_paths):
        """Sets the sling_servlet_paths of this ComDayCqDamCoreImplLightboxLightboxServletProperties.


        :param sling_servlet_paths: The sling_servlet_paths of this ComDayCqDamCoreImplLightboxLightboxServletProperties.  # noqa: E501
        :type: ConfigNodePropertyString
        """

        self._sling_servlet_paths = sling_servlet_paths

    @property
    def sling_servlet_methods(self):
        """Gets the sling_servlet_methods of this ComDayCqDamCoreImplLightboxLightboxServletProperties.  # noqa: E501


        :return: The sling_servlet_methods of this ComDayCqDamCoreImplLightboxLightboxServletProperties.  # noqa: E501
        :rtype: ConfigNodePropertyArray
        """
        return self._sling_servlet_methods

    @sling_servlet_methods.setter
    def sling_servlet_methods(self, sling_servlet_methods):
        """Sets the sling_servlet_methods of this ComDayCqDamCoreImplLightboxLightboxServletProperties.


        :param sling_servlet_methods: The sling_servlet_methods of this ComDayCqDamCoreImplLightboxLightboxServletProperties.  # noqa: E501
        :type: ConfigNodePropertyArray
        """

        self._sling_servlet_methods = sling_servlet_methods

    @property
    def cq_dam_enable_anonymous(self):
        """Gets the cq_dam_enable_anonymous of this ComDayCqDamCoreImplLightboxLightboxServletProperties.  # noqa: E501


        :return: The cq_dam_enable_anonymous of this ComDayCqDamCoreImplLightboxLightboxServletProperties.  # noqa: E501
        :rtype: ConfigNodePropertyBoolean
        """
        return self._cq_dam_enable_anonymous

    @cq_dam_enable_anonymous.setter
    def cq_dam_enable_anonymous(self, cq_dam_enable_anonymous):
        """Sets the cq_dam_enable_anonymous of this ComDayCqDamCoreImplLightboxLightboxServletProperties.


        :param cq_dam_enable_anonymous: The cq_dam_enable_anonymous of this ComDayCqDamCoreImplLightboxLightboxServletProperties.  # noqa: E501
        :type: ConfigNodePropertyBoolean
        """

        self._cq_dam_enable_anonymous = cq_dam_enable_anonymous

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
        if not isinstance(other, ComDayCqDamCoreImplLightboxLightboxServletProperties):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
