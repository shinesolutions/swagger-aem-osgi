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


class ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties(object):
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
        'name': 'ConfigNodePropertyString',
        'service_name': 'ConfigNodePropertyString',
        'user_id': 'ConfigNodePropertyString',
        'access_token_provider_target': 'ConfigNodePropertyString'
    }

    attribute_map = {
        'name': 'name',
        'service_name': 'serviceName',
        'user_id': 'userId',
        'access_token_provider_target': 'accessTokenProvider.target'
    }

    def __init__(self, name=None, service_name=None, user_id=None, access_token_provider_target=None):  # noqa: E501
        """ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties - a model defined in OpenAPI"""  # noqa: E501

        self._name = None
        self._service_name = None
        self._user_id = None
        self._access_token_provider_target = None
        self.discriminator = None

        if name is not None:
            self.name = name
        if service_name is not None:
            self.service_name = service_name
        if user_id is not None:
            self.user_id = user_id
        if access_token_provider_target is not None:
            self.access_token_provider_target = access_token_provider_target

    @property
    def name(self):
        """Gets the name of this ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties.  # noqa: E501


        :return: The name of this ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties.  # noqa: E501
        :rtype: ConfigNodePropertyString
        """
        return self._name

    @name.setter
    def name(self, name):
        """Sets the name of this ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties.


        :param name: The name of this ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties.  # noqa: E501
        :type: ConfigNodePropertyString
        """

        self._name = name

    @property
    def service_name(self):
        """Gets the service_name of this ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties.  # noqa: E501


        :return: The service_name of this ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties.  # noqa: E501
        :rtype: ConfigNodePropertyString
        """
        return self._service_name

    @service_name.setter
    def service_name(self, service_name):
        """Sets the service_name of this ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties.


        :param service_name: The service_name of this ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties.  # noqa: E501
        :type: ConfigNodePropertyString
        """

        self._service_name = service_name

    @property
    def user_id(self):
        """Gets the user_id of this ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties.  # noqa: E501


        :return: The user_id of this ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties.  # noqa: E501
        :rtype: ConfigNodePropertyString
        """
        return self._user_id

    @user_id.setter
    def user_id(self, user_id):
        """Sets the user_id of this ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties.


        :param user_id: The user_id of this ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties.  # noqa: E501
        :type: ConfigNodePropertyString
        """

        self._user_id = user_id

    @property
    def access_token_provider_target(self):
        """Gets the access_token_provider_target of this ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties.  # noqa: E501


        :return: The access_token_provider_target of this ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties.  # noqa: E501
        :rtype: ConfigNodePropertyString
        """
        return self._access_token_provider_target

    @access_token_provider_target.setter
    def access_token_provider_target(self, access_token_provider_target):
        """Sets the access_token_provider_target of this ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties.


        :param access_token_provider_target: The access_token_provider_target of this ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties.  # noqa: E501
        :type: ConfigNodePropertyString
        """

        self._access_token_provider_target = access_token_provider_target

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
        if not isinstance(other, ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
