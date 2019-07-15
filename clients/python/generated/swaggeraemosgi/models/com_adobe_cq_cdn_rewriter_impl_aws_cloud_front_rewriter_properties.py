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


class ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties(object):
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
        'keypair_id': 'ConfigNodePropertyString',
        'keypair_alias': 'ConfigNodePropertyString',
        'cdnrewriter_attributes': 'ConfigNodePropertyArray',
        'cdn_rewriter_distribution_domain': 'ConfigNodePropertyString'
    }

    attribute_map = {
        'service_ranking': 'service.ranking',
        'keypair_id': 'keypair.id',
        'keypair_alias': 'keypair.alias',
        'cdnrewriter_attributes': 'cdnrewriter.attributes',
        'cdn_rewriter_distribution_domain': 'cdn.rewriter.distribution.domain'
    }

    def __init__(self, service_ranking=None, keypair_id=None, keypair_alias=None, cdnrewriter_attributes=None, cdn_rewriter_distribution_domain=None):  # noqa: E501
        """ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties - a model defined in OpenAPI"""  # noqa: E501

        self._service_ranking = None
        self._keypair_id = None
        self._keypair_alias = None
        self._cdnrewriter_attributes = None
        self._cdn_rewriter_distribution_domain = None
        self.discriminator = None

        if service_ranking is not None:
            self.service_ranking = service_ranking
        if keypair_id is not None:
            self.keypair_id = keypair_id
        if keypair_alias is not None:
            self.keypair_alias = keypair_alias
        if cdnrewriter_attributes is not None:
            self.cdnrewriter_attributes = cdnrewriter_attributes
        if cdn_rewriter_distribution_domain is not None:
            self.cdn_rewriter_distribution_domain = cdn_rewriter_distribution_domain

    @property
    def service_ranking(self):
        """Gets the service_ranking of this ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties.  # noqa: E501


        :return: The service_ranking of this ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties.  # noqa: E501
        :rtype: ConfigNodePropertyInteger
        """
        return self._service_ranking

    @service_ranking.setter
    def service_ranking(self, service_ranking):
        """Sets the service_ranking of this ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties.


        :param service_ranking: The service_ranking of this ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties.  # noqa: E501
        :type: ConfigNodePropertyInteger
        """

        self._service_ranking = service_ranking

    @property
    def keypair_id(self):
        """Gets the keypair_id of this ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties.  # noqa: E501


        :return: The keypair_id of this ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties.  # noqa: E501
        :rtype: ConfigNodePropertyString
        """
        return self._keypair_id

    @keypair_id.setter
    def keypair_id(self, keypair_id):
        """Sets the keypair_id of this ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties.


        :param keypair_id: The keypair_id of this ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties.  # noqa: E501
        :type: ConfigNodePropertyString
        """

        self._keypair_id = keypair_id

    @property
    def keypair_alias(self):
        """Gets the keypair_alias of this ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties.  # noqa: E501


        :return: The keypair_alias of this ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties.  # noqa: E501
        :rtype: ConfigNodePropertyString
        """
        return self._keypair_alias

    @keypair_alias.setter
    def keypair_alias(self, keypair_alias):
        """Sets the keypair_alias of this ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties.


        :param keypair_alias: The keypair_alias of this ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties.  # noqa: E501
        :type: ConfigNodePropertyString
        """

        self._keypair_alias = keypair_alias

    @property
    def cdnrewriter_attributes(self):
        """Gets the cdnrewriter_attributes of this ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties.  # noqa: E501


        :return: The cdnrewriter_attributes of this ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties.  # noqa: E501
        :rtype: ConfigNodePropertyArray
        """
        return self._cdnrewriter_attributes

    @cdnrewriter_attributes.setter
    def cdnrewriter_attributes(self, cdnrewriter_attributes):
        """Sets the cdnrewriter_attributes of this ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties.


        :param cdnrewriter_attributes: The cdnrewriter_attributes of this ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties.  # noqa: E501
        :type: ConfigNodePropertyArray
        """

        self._cdnrewriter_attributes = cdnrewriter_attributes

    @property
    def cdn_rewriter_distribution_domain(self):
        """Gets the cdn_rewriter_distribution_domain of this ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties.  # noqa: E501


        :return: The cdn_rewriter_distribution_domain of this ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties.  # noqa: E501
        :rtype: ConfigNodePropertyString
        """
        return self._cdn_rewriter_distribution_domain

    @cdn_rewriter_distribution_domain.setter
    def cdn_rewriter_distribution_domain(self, cdn_rewriter_distribution_domain):
        """Sets the cdn_rewriter_distribution_domain of this ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties.


        :param cdn_rewriter_distribution_domain: The cdn_rewriter_distribution_domain of this ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties.  # noqa: E501
        :type: ConfigNodePropertyString
        """

        self._cdn_rewriter_distribution_domain = cdn_rewriter_distribution_domain

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
        if not isinstance(other, ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
