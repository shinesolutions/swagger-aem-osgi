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


class ComDayCqDamCoreImplServletHealthCheckServletProperties(object):
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
        'cq_dam_sync_workflow_id': 'ConfigNodePropertyString',
        'cq_dam_sync_folder_types': 'ConfigNodePropertyArray'
    }

    attribute_map = {
        'cq_dam_sync_workflow_id': 'cq.dam.sync.workflow.id',
        'cq_dam_sync_folder_types': 'cq.dam.sync.folder.types'
    }

    def __init__(self, cq_dam_sync_workflow_id=None, cq_dam_sync_folder_types=None):  # noqa: E501
        """ComDayCqDamCoreImplServletHealthCheckServletProperties - a model defined in OpenAPI"""  # noqa: E501

        self._cq_dam_sync_workflow_id = None
        self._cq_dam_sync_folder_types = None
        self.discriminator = None

        if cq_dam_sync_workflow_id is not None:
            self.cq_dam_sync_workflow_id = cq_dam_sync_workflow_id
        if cq_dam_sync_folder_types is not None:
            self.cq_dam_sync_folder_types = cq_dam_sync_folder_types

    @property
    def cq_dam_sync_workflow_id(self):
        """Gets the cq_dam_sync_workflow_id of this ComDayCqDamCoreImplServletHealthCheckServletProperties.  # noqa: E501


        :return: The cq_dam_sync_workflow_id of this ComDayCqDamCoreImplServletHealthCheckServletProperties.  # noqa: E501
        :rtype: ConfigNodePropertyString
        """
        return self._cq_dam_sync_workflow_id

    @cq_dam_sync_workflow_id.setter
    def cq_dam_sync_workflow_id(self, cq_dam_sync_workflow_id):
        """Sets the cq_dam_sync_workflow_id of this ComDayCqDamCoreImplServletHealthCheckServletProperties.


        :param cq_dam_sync_workflow_id: The cq_dam_sync_workflow_id of this ComDayCqDamCoreImplServletHealthCheckServletProperties.  # noqa: E501
        :type: ConfigNodePropertyString
        """

        self._cq_dam_sync_workflow_id = cq_dam_sync_workflow_id

    @property
    def cq_dam_sync_folder_types(self):
        """Gets the cq_dam_sync_folder_types of this ComDayCqDamCoreImplServletHealthCheckServletProperties.  # noqa: E501


        :return: The cq_dam_sync_folder_types of this ComDayCqDamCoreImplServletHealthCheckServletProperties.  # noqa: E501
        :rtype: ConfigNodePropertyArray
        """
        return self._cq_dam_sync_folder_types

    @cq_dam_sync_folder_types.setter
    def cq_dam_sync_folder_types(self, cq_dam_sync_folder_types):
        """Sets the cq_dam_sync_folder_types of this ComDayCqDamCoreImplServletHealthCheckServletProperties.


        :param cq_dam_sync_folder_types: The cq_dam_sync_folder_types of this ComDayCqDamCoreImplServletHealthCheckServletProperties.  # noqa: E501
        :type: ConfigNodePropertyArray
        """

        self._cq_dam_sync_folder_types = cq_dam_sync_folder_types

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
        if not isinstance(other, ComDayCqDamCoreImplServletHealthCheckServletProperties):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
