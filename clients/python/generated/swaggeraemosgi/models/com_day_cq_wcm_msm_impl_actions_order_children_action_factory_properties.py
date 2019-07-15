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


class ComDayCqWcmMsmImplActionsOrderChildrenActionFactoryProperties(object):
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
        'cq_wcm_msm_action_excludednodetypes': 'ConfigNodePropertyArray',
        'cq_wcm_msm_action_excludedparagraphitems': 'ConfigNodePropertyArray',
        'cq_wcm_msm_action_excludedprops': 'ConfigNodePropertyArray'
    }

    attribute_map = {
        'cq_wcm_msm_action_excludednodetypes': 'cq.wcm.msm.action.excludednodetypes',
        'cq_wcm_msm_action_excludedparagraphitems': 'cq.wcm.msm.action.excludedparagraphitems',
        'cq_wcm_msm_action_excludedprops': 'cq.wcm.msm.action.excludedprops'
    }

    def __init__(self, cq_wcm_msm_action_excludednodetypes=None, cq_wcm_msm_action_excludedparagraphitems=None, cq_wcm_msm_action_excludedprops=None):  # noqa: E501
        """ComDayCqWcmMsmImplActionsOrderChildrenActionFactoryProperties - a model defined in OpenAPI"""  # noqa: E501

        self._cq_wcm_msm_action_excludednodetypes = None
        self._cq_wcm_msm_action_excludedparagraphitems = None
        self._cq_wcm_msm_action_excludedprops = None
        self.discriminator = None

        if cq_wcm_msm_action_excludednodetypes is not None:
            self.cq_wcm_msm_action_excludednodetypes = cq_wcm_msm_action_excludednodetypes
        if cq_wcm_msm_action_excludedparagraphitems is not None:
            self.cq_wcm_msm_action_excludedparagraphitems = cq_wcm_msm_action_excludedparagraphitems
        if cq_wcm_msm_action_excludedprops is not None:
            self.cq_wcm_msm_action_excludedprops = cq_wcm_msm_action_excludedprops

    @property
    def cq_wcm_msm_action_excludednodetypes(self):
        """Gets the cq_wcm_msm_action_excludednodetypes of this ComDayCqWcmMsmImplActionsOrderChildrenActionFactoryProperties.  # noqa: E501


        :return: The cq_wcm_msm_action_excludednodetypes of this ComDayCqWcmMsmImplActionsOrderChildrenActionFactoryProperties.  # noqa: E501
        :rtype: ConfigNodePropertyArray
        """
        return self._cq_wcm_msm_action_excludednodetypes

    @cq_wcm_msm_action_excludednodetypes.setter
    def cq_wcm_msm_action_excludednodetypes(self, cq_wcm_msm_action_excludednodetypes):
        """Sets the cq_wcm_msm_action_excludednodetypes of this ComDayCqWcmMsmImplActionsOrderChildrenActionFactoryProperties.


        :param cq_wcm_msm_action_excludednodetypes: The cq_wcm_msm_action_excludednodetypes of this ComDayCqWcmMsmImplActionsOrderChildrenActionFactoryProperties.  # noqa: E501
        :type: ConfigNodePropertyArray
        """

        self._cq_wcm_msm_action_excludednodetypes = cq_wcm_msm_action_excludednodetypes

    @property
    def cq_wcm_msm_action_excludedparagraphitems(self):
        """Gets the cq_wcm_msm_action_excludedparagraphitems of this ComDayCqWcmMsmImplActionsOrderChildrenActionFactoryProperties.  # noqa: E501


        :return: The cq_wcm_msm_action_excludedparagraphitems of this ComDayCqWcmMsmImplActionsOrderChildrenActionFactoryProperties.  # noqa: E501
        :rtype: ConfigNodePropertyArray
        """
        return self._cq_wcm_msm_action_excludedparagraphitems

    @cq_wcm_msm_action_excludedparagraphitems.setter
    def cq_wcm_msm_action_excludedparagraphitems(self, cq_wcm_msm_action_excludedparagraphitems):
        """Sets the cq_wcm_msm_action_excludedparagraphitems of this ComDayCqWcmMsmImplActionsOrderChildrenActionFactoryProperties.


        :param cq_wcm_msm_action_excludedparagraphitems: The cq_wcm_msm_action_excludedparagraphitems of this ComDayCqWcmMsmImplActionsOrderChildrenActionFactoryProperties.  # noqa: E501
        :type: ConfigNodePropertyArray
        """

        self._cq_wcm_msm_action_excludedparagraphitems = cq_wcm_msm_action_excludedparagraphitems

    @property
    def cq_wcm_msm_action_excludedprops(self):
        """Gets the cq_wcm_msm_action_excludedprops of this ComDayCqWcmMsmImplActionsOrderChildrenActionFactoryProperties.  # noqa: E501


        :return: The cq_wcm_msm_action_excludedprops of this ComDayCqWcmMsmImplActionsOrderChildrenActionFactoryProperties.  # noqa: E501
        :rtype: ConfigNodePropertyArray
        """
        return self._cq_wcm_msm_action_excludedprops

    @cq_wcm_msm_action_excludedprops.setter
    def cq_wcm_msm_action_excludedprops(self, cq_wcm_msm_action_excludedprops):
        """Sets the cq_wcm_msm_action_excludedprops of this ComDayCqWcmMsmImplActionsOrderChildrenActionFactoryProperties.


        :param cq_wcm_msm_action_excludedprops: The cq_wcm_msm_action_excludedprops of this ComDayCqWcmMsmImplActionsOrderChildrenActionFactoryProperties.  # noqa: E501
        :type: ConfigNodePropertyArray
        """

        self._cq_wcm_msm_action_excludedprops = cq_wcm_msm_action_excludedprops

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
        if not isinstance(other, ComDayCqWcmMsmImplActionsOrderChildrenActionFactoryProperties):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
