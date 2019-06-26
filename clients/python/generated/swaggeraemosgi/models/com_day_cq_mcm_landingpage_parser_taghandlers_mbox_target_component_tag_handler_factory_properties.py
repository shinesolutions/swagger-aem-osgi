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


class ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHandlerFactoryProperties(object):
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
        'service_ranking': 'ConfigNodePropertyInteger',
        'tagpattern': 'ConfigNodePropertyString',
        'component_resource_type': 'ConfigNodePropertyString'
    }

    attribute_map = {
        'service_ranking': 'service.ranking',
        'tagpattern': 'tagpattern',
        'component_resource_type': 'component.resourceType'
    }

    def __init__(self, service_ranking=None, tagpattern=None, component_resource_type=None):  # noqa: E501
        """ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHandlerFactoryProperties - a model defined in OpenAPI"""  # noqa: E501

        self._service_ranking = None
        self._tagpattern = None
        self._component_resource_type = None
        self.discriminator = None

        if service_ranking is not None:
            self.service_ranking = service_ranking
        if tagpattern is not None:
            self.tagpattern = tagpattern
        if component_resource_type is not None:
            self.component_resource_type = component_resource_type

    @property
    def service_ranking(self):
        """Gets the service_ranking of this ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHandlerFactoryProperties.  # noqa: E501


        :return: The service_ranking of this ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHandlerFactoryProperties.  # noqa: E501
        :rtype: ConfigNodePropertyInteger
        """
        return self._service_ranking

    @service_ranking.setter
    def service_ranking(self, service_ranking):
        """Sets the service_ranking of this ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHandlerFactoryProperties.


        :param service_ranking: The service_ranking of this ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHandlerFactoryProperties.  # noqa: E501
        :type: ConfigNodePropertyInteger
        """

        self._service_ranking = service_ranking

    @property
    def tagpattern(self):
        """Gets the tagpattern of this ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHandlerFactoryProperties.  # noqa: E501


        :return: The tagpattern of this ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHandlerFactoryProperties.  # noqa: E501
        :rtype: ConfigNodePropertyString
        """
        return self._tagpattern

    @tagpattern.setter
    def tagpattern(self, tagpattern):
        """Sets the tagpattern of this ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHandlerFactoryProperties.


        :param tagpattern: The tagpattern of this ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHandlerFactoryProperties.  # noqa: E501
        :type: ConfigNodePropertyString
        """

        self._tagpattern = tagpattern

    @property
    def component_resource_type(self):
        """Gets the component_resource_type of this ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHandlerFactoryProperties.  # noqa: E501


        :return: The component_resource_type of this ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHandlerFactoryProperties.  # noqa: E501
        :rtype: ConfigNodePropertyString
        """
        return self._component_resource_type

    @component_resource_type.setter
    def component_resource_type(self, component_resource_type):
        """Sets the component_resource_type of this ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHandlerFactoryProperties.


        :param component_resource_type: The component_resource_type of this ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHandlerFactoryProperties.  # noqa: E501
        :type: ConfigNodePropertyString
        """

        self._component_resource_type = component_resource_type

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
        if not isinstance(other, ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHandlerFactoryProperties):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
