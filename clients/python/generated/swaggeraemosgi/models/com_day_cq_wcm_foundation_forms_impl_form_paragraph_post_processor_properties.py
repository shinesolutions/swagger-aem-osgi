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


class ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties(object):
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
        'forms_formparagraphpostprocessor_enabled': 'ConfigNodePropertyBoolean',
        'forms_formparagraphpostprocessor_formresourcetypes': 'ConfigNodePropertyArray'
    }

    attribute_map = {
        'forms_formparagraphpostprocessor_enabled': 'forms.formparagraphpostprocessor.enabled',
        'forms_formparagraphpostprocessor_formresourcetypes': 'forms.formparagraphpostprocessor.formresourcetypes'
    }

    def __init__(self, forms_formparagraphpostprocessor_enabled=None, forms_formparagraphpostprocessor_formresourcetypes=None):  # noqa: E501
        """ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties - a model defined in OpenAPI"""  # noqa: E501

        self._forms_formparagraphpostprocessor_enabled = None
        self._forms_formparagraphpostprocessor_formresourcetypes = None
        self.discriminator = None

        if forms_formparagraphpostprocessor_enabled is not None:
            self.forms_formparagraphpostprocessor_enabled = forms_formparagraphpostprocessor_enabled
        if forms_formparagraphpostprocessor_formresourcetypes is not None:
            self.forms_formparagraphpostprocessor_formresourcetypes = forms_formparagraphpostprocessor_formresourcetypes

    @property
    def forms_formparagraphpostprocessor_enabled(self):
        """Gets the forms_formparagraphpostprocessor_enabled of this ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties.  # noqa: E501


        :return: The forms_formparagraphpostprocessor_enabled of this ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties.  # noqa: E501
        :rtype: ConfigNodePropertyBoolean
        """
        return self._forms_formparagraphpostprocessor_enabled

    @forms_formparagraphpostprocessor_enabled.setter
    def forms_formparagraphpostprocessor_enabled(self, forms_formparagraphpostprocessor_enabled):
        """Sets the forms_formparagraphpostprocessor_enabled of this ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties.


        :param forms_formparagraphpostprocessor_enabled: The forms_formparagraphpostprocessor_enabled of this ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties.  # noqa: E501
        :type: ConfigNodePropertyBoolean
        """

        self._forms_formparagraphpostprocessor_enabled = forms_formparagraphpostprocessor_enabled

    @property
    def forms_formparagraphpostprocessor_formresourcetypes(self):
        """Gets the forms_formparagraphpostprocessor_formresourcetypes of this ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties.  # noqa: E501


        :return: The forms_formparagraphpostprocessor_formresourcetypes of this ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties.  # noqa: E501
        :rtype: ConfigNodePropertyArray
        """
        return self._forms_formparagraphpostprocessor_formresourcetypes

    @forms_formparagraphpostprocessor_formresourcetypes.setter
    def forms_formparagraphpostprocessor_formresourcetypes(self, forms_formparagraphpostprocessor_formresourcetypes):
        """Sets the forms_formparagraphpostprocessor_formresourcetypes of this ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties.


        :param forms_formparagraphpostprocessor_formresourcetypes: The forms_formparagraphpostprocessor_formresourcetypes of this ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties.  # noqa: E501
        :type: ConfigNodePropertyArray
        """

        self._forms_formparagraphpostprocessor_formresourcetypes = forms_formparagraphpostprocessor_formresourcetypes

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
        if not isinstance(other, ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
