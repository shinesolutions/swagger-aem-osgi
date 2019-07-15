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


class ComAdobeCqDamCfmImplComponentComponentConfigImplProperties(object):
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
        'dam_cfm_component_resource_type': 'ConfigNodePropertyString',
        'dam_cfm_component_file_reference_prop': 'ConfigNodePropertyString',
        'dam_cfm_component_elements_prop': 'ConfigNodePropertyString',
        'dam_cfm_component_variation_prop': 'ConfigNodePropertyString'
    }

    attribute_map = {
        'dam_cfm_component_resource_type': 'dam.cfm.component.resourceType',
        'dam_cfm_component_file_reference_prop': 'dam.cfm.component.fileReferenceProp',
        'dam_cfm_component_elements_prop': 'dam.cfm.component.elementsProp',
        'dam_cfm_component_variation_prop': 'dam.cfm.component.variationProp'
    }

    def __init__(self, dam_cfm_component_resource_type=None, dam_cfm_component_file_reference_prop=None, dam_cfm_component_elements_prop=None, dam_cfm_component_variation_prop=None):  # noqa: E501
        """ComAdobeCqDamCfmImplComponentComponentConfigImplProperties - a model defined in OpenAPI"""  # noqa: E501

        self._dam_cfm_component_resource_type = None
        self._dam_cfm_component_file_reference_prop = None
        self._dam_cfm_component_elements_prop = None
        self._dam_cfm_component_variation_prop = None
        self.discriminator = None

        if dam_cfm_component_resource_type is not None:
            self.dam_cfm_component_resource_type = dam_cfm_component_resource_type
        if dam_cfm_component_file_reference_prop is not None:
            self.dam_cfm_component_file_reference_prop = dam_cfm_component_file_reference_prop
        if dam_cfm_component_elements_prop is not None:
            self.dam_cfm_component_elements_prop = dam_cfm_component_elements_prop
        if dam_cfm_component_variation_prop is not None:
            self.dam_cfm_component_variation_prop = dam_cfm_component_variation_prop

    @property
    def dam_cfm_component_resource_type(self):
        """Gets the dam_cfm_component_resource_type of this ComAdobeCqDamCfmImplComponentComponentConfigImplProperties.  # noqa: E501


        :return: The dam_cfm_component_resource_type of this ComAdobeCqDamCfmImplComponentComponentConfigImplProperties.  # noqa: E501
        :rtype: ConfigNodePropertyString
        """
        return self._dam_cfm_component_resource_type

    @dam_cfm_component_resource_type.setter
    def dam_cfm_component_resource_type(self, dam_cfm_component_resource_type):
        """Sets the dam_cfm_component_resource_type of this ComAdobeCqDamCfmImplComponentComponentConfigImplProperties.


        :param dam_cfm_component_resource_type: The dam_cfm_component_resource_type of this ComAdobeCqDamCfmImplComponentComponentConfigImplProperties.  # noqa: E501
        :type: ConfigNodePropertyString
        """

        self._dam_cfm_component_resource_type = dam_cfm_component_resource_type

    @property
    def dam_cfm_component_file_reference_prop(self):
        """Gets the dam_cfm_component_file_reference_prop of this ComAdobeCqDamCfmImplComponentComponentConfigImplProperties.  # noqa: E501


        :return: The dam_cfm_component_file_reference_prop of this ComAdobeCqDamCfmImplComponentComponentConfigImplProperties.  # noqa: E501
        :rtype: ConfigNodePropertyString
        """
        return self._dam_cfm_component_file_reference_prop

    @dam_cfm_component_file_reference_prop.setter
    def dam_cfm_component_file_reference_prop(self, dam_cfm_component_file_reference_prop):
        """Sets the dam_cfm_component_file_reference_prop of this ComAdobeCqDamCfmImplComponentComponentConfigImplProperties.


        :param dam_cfm_component_file_reference_prop: The dam_cfm_component_file_reference_prop of this ComAdobeCqDamCfmImplComponentComponentConfigImplProperties.  # noqa: E501
        :type: ConfigNodePropertyString
        """

        self._dam_cfm_component_file_reference_prop = dam_cfm_component_file_reference_prop

    @property
    def dam_cfm_component_elements_prop(self):
        """Gets the dam_cfm_component_elements_prop of this ComAdobeCqDamCfmImplComponentComponentConfigImplProperties.  # noqa: E501


        :return: The dam_cfm_component_elements_prop of this ComAdobeCqDamCfmImplComponentComponentConfigImplProperties.  # noqa: E501
        :rtype: ConfigNodePropertyString
        """
        return self._dam_cfm_component_elements_prop

    @dam_cfm_component_elements_prop.setter
    def dam_cfm_component_elements_prop(self, dam_cfm_component_elements_prop):
        """Sets the dam_cfm_component_elements_prop of this ComAdobeCqDamCfmImplComponentComponentConfigImplProperties.


        :param dam_cfm_component_elements_prop: The dam_cfm_component_elements_prop of this ComAdobeCqDamCfmImplComponentComponentConfigImplProperties.  # noqa: E501
        :type: ConfigNodePropertyString
        """

        self._dam_cfm_component_elements_prop = dam_cfm_component_elements_prop

    @property
    def dam_cfm_component_variation_prop(self):
        """Gets the dam_cfm_component_variation_prop of this ComAdobeCqDamCfmImplComponentComponentConfigImplProperties.  # noqa: E501


        :return: The dam_cfm_component_variation_prop of this ComAdobeCqDamCfmImplComponentComponentConfigImplProperties.  # noqa: E501
        :rtype: ConfigNodePropertyString
        """
        return self._dam_cfm_component_variation_prop

    @dam_cfm_component_variation_prop.setter
    def dam_cfm_component_variation_prop(self, dam_cfm_component_variation_prop):
        """Sets the dam_cfm_component_variation_prop of this ComAdobeCqDamCfmImplComponentComponentConfigImplProperties.


        :param dam_cfm_component_variation_prop: The dam_cfm_component_variation_prop of this ComAdobeCqDamCfmImplComponentComponentConfigImplProperties.  # noqa: E501
        :type: ConfigNodePropertyString
        """

        self._dam_cfm_component_variation_prop = dam_cfm_component_variation_prop

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
        if not isinstance(other, ComAdobeCqDamCfmImplComponentComponentConfigImplProperties):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
