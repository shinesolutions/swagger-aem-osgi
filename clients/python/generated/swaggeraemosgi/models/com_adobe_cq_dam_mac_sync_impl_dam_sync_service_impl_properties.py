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


class ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties(object):
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
        'com_adobe_cq_dam_mac_sync_damsyncservice_registered_paths': 'ConfigNodePropertyArray',
        'com_adobe_cq_dam_mac_sync_damsyncservice_sync_renditions': 'ConfigNodePropertyBoolean',
        'com_adobe_cq_dam_mac_sync_damsyncservice_replicate_thread_wait_ms': 'ConfigNodePropertyInteger',
        'com_adobe_cq_dam_mac_sync_damsyncservice_platform': 'ConfigNodePropertyDropDown'
    }

    attribute_map = {
        'com_adobe_cq_dam_mac_sync_damsyncservice_registered_paths': 'com.adobe.cq.dam.mac.sync.damsyncservice.registered_paths',
        'com_adobe_cq_dam_mac_sync_damsyncservice_sync_renditions': 'com.adobe.cq.dam.mac.sync.damsyncservice.sync.renditions',
        'com_adobe_cq_dam_mac_sync_damsyncservice_replicate_thread_wait_ms': 'com.adobe.cq.dam.mac.sync.damsyncservice.replicate.thread.wait.ms',
        'com_adobe_cq_dam_mac_sync_damsyncservice_platform': 'com.adobe.cq.dam.mac.sync.damsyncservice.platform'
    }

    def __init__(self, com_adobe_cq_dam_mac_sync_damsyncservice_registered_paths=None, com_adobe_cq_dam_mac_sync_damsyncservice_sync_renditions=None, com_adobe_cq_dam_mac_sync_damsyncservice_replicate_thread_wait_ms=None, com_adobe_cq_dam_mac_sync_damsyncservice_platform=None):  # noqa: E501
        """ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties - a model defined in OpenAPI"""  # noqa: E501

        self._com_adobe_cq_dam_mac_sync_damsyncservice_registered_paths = None
        self._com_adobe_cq_dam_mac_sync_damsyncservice_sync_renditions = None
        self._com_adobe_cq_dam_mac_sync_damsyncservice_replicate_thread_wait_ms = None
        self._com_adobe_cq_dam_mac_sync_damsyncservice_platform = None
        self.discriminator = None

        if com_adobe_cq_dam_mac_sync_damsyncservice_registered_paths is not None:
            self.com_adobe_cq_dam_mac_sync_damsyncservice_registered_paths = com_adobe_cq_dam_mac_sync_damsyncservice_registered_paths
        if com_adobe_cq_dam_mac_sync_damsyncservice_sync_renditions is not None:
            self.com_adobe_cq_dam_mac_sync_damsyncservice_sync_renditions = com_adobe_cq_dam_mac_sync_damsyncservice_sync_renditions
        if com_adobe_cq_dam_mac_sync_damsyncservice_replicate_thread_wait_ms is not None:
            self.com_adobe_cq_dam_mac_sync_damsyncservice_replicate_thread_wait_ms = com_adobe_cq_dam_mac_sync_damsyncservice_replicate_thread_wait_ms
        if com_adobe_cq_dam_mac_sync_damsyncservice_platform is not None:
            self.com_adobe_cq_dam_mac_sync_damsyncservice_platform = com_adobe_cq_dam_mac_sync_damsyncservice_platform

    @property
    def com_adobe_cq_dam_mac_sync_damsyncservice_registered_paths(self):
        """Gets the com_adobe_cq_dam_mac_sync_damsyncservice_registered_paths of this ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties.  # noqa: E501


        :return: The com_adobe_cq_dam_mac_sync_damsyncservice_registered_paths of this ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties.  # noqa: E501
        :rtype: ConfigNodePropertyArray
        """
        return self._com_adobe_cq_dam_mac_sync_damsyncservice_registered_paths

    @com_adobe_cq_dam_mac_sync_damsyncservice_registered_paths.setter
    def com_adobe_cq_dam_mac_sync_damsyncservice_registered_paths(self, com_adobe_cq_dam_mac_sync_damsyncservice_registered_paths):
        """Sets the com_adobe_cq_dam_mac_sync_damsyncservice_registered_paths of this ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties.


        :param com_adobe_cq_dam_mac_sync_damsyncservice_registered_paths: The com_adobe_cq_dam_mac_sync_damsyncservice_registered_paths of this ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties.  # noqa: E501
        :type: ConfigNodePropertyArray
        """

        self._com_adobe_cq_dam_mac_sync_damsyncservice_registered_paths = com_adobe_cq_dam_mac_sync_damsyncservice_registered_paths

    @property
    def com_adobe_cq_dam_mac_sync_damsyncservice_sync_renditions(self):
        """Gets the com_adobe_cq_dam_mac_sync_damsyncservice_sync_renditions of this ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties.  # noqa: E501


        :return: The com_adobe_cq_dam_mac_sync_damsyncservice_sync_renditions of this ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties.  # noqa: E501
        :rtype: ConfigNodePropertyBoolean
        """
        return self._com_adobe_cq_dam_mac_sync_damsyncservice_sync_renditions

    @com_adobe_cq_dam_mac_sync_damsyncservice_sync_renditions.setter
    def com_adobe_cq_dam_mac_sync_damsyncservice_sync_renditions(self, com_adobe_cq_dam_mac_sync_damsyncservice_sync_renditions):
        """Sets the com_adobe_cq_dam_mac_sync_damsyncservice_sync_renditions of this ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties.


        :param com_adobe_cq_dam_mac_sync_damsyncservice_sync_renditions: The com_adobe_cq_dam_mac_sync_damsyncservice_sync_renditions of this ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties.  # noqa: E501
        :type: ConfigNodePropertyBoolean
        """

        self._com_adobe_cq_dam_mac_sync_damsyncservice_sync_renditions = com_adobe_cq_dam_mac_sync_damsyncservice_sync_renditions

    @property
    def com_adobe_cq_dam_mac_sync_damsyncservice_replicate_thread_wait_ms(self):
        """Gets the com_adobe_cq_dam_mac_sync_damsyncservice_replicate_thread_wait_ms of this ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties.  # noqa: E501


        :return: The com_adobe_cq_dam_mac_sync_damsyncservice_replicate_thread_wait_ms of this ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties.  # noqa: E501
        :rtype: ConfigNodePropertyInteger
        """
        return self._com_adobe_cq_dam_mac_sync_damsyncservice_replicate_thread_wait_ms

    @com_adobe_cq_dam_mac_sync_damsyncservice_replicate_thread_wait_ms.setter
    def com_adobe_cq_dam_mac_sync_damsyncservice_replicate_thread_wait_ms(self, com_adobe_cq_dam_mac_sync_damsyncservice_replicate_thread_wait_ms):
        """Sets the com_adobe_cq_dam_mac_sync_damsyncservice_replicate_thread_wait_ms of this ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties.


        :param com_adobe_cq_dam_mac_sync_damsyncservice_replicate_thread_wait_ms: The com_adobe_cq_dam_mac_sync_damsyncservice_replicate_thread_wait_ms of this ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties.  # noqa: E501
        :type: ConfigNodePropertyInteger
        """

        self._com_adobe_cq_dam_mac_sync_damsyncservice_replicate_thread_wait_ms = com_adobe_cq_dam_mac_sync_damsyncservice_replicate_thread_wait_ms

    @property
    def com_adobe_cq_dam_mac_sync_damsyncservice_platform(self):
        """Gets the com_adobe_cq_dam_mac_sync_damsyncservice_platform of this ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties.  # noqa: E501


        :return: The com_adobe_cq_dam_mac_sync_damsyncservice_platform of this ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties.  # noqa: E501
        :rtype: ConfigNodePropertyDropDown
        """
        return self._com_adobe_cq_dam_mac_sync_damsyncservice_platform

    @com_adobe_cq_dam_mac_sync_damsyncservice_platform.setter
    def com_adobe_cq_dam_mac_sync_damsyncservice_platform(self, com_adobe_cq_dam_mac_sync_damsyncservice_platform):
        """Sets the com_adobe_cq_dam_mac_sync_damsyncservice_platform of this ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties.


        :param com_adobe_cq_dam_mac_sync_damsyncservice_platform: The com_adobe_cq_dam_mac_sync_damsyncservice_platform of this ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties.  # noqa: E501
        :type: ConfigNodePropertyDropDown
        """

        self._com_adobe_cq_dam_mac_sync_damsyncservice_platform = com_adobe_cq_dam_mac_sync_damsyncservice_platform

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
        if not isinstance(other, ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other