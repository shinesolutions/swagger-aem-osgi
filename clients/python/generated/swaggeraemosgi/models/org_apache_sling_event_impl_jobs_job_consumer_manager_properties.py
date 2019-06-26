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


class OrgApacheSlingEventImplJobsJobConsumerManagerProperties(object):
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
        'org_apache_sling_installer_configuration_persist': 'ConfigNodePropertyBoolean',
        'job_consumermanager_whitelist': 'ConfigNodePropertyArray',
        'job_consumermanager_blacklist': 'ConfigNodePropertyArray'
    }

    attribute_map = {
        'org_apache_sling_installer_configuration_persist': 'org.apache.sling.installer.configuration.persist',
        'job_consumermanager_whitelist': 'job.consumermanager.whitelist',
        'job_consumermanager_blacklist': 'job.consumermanager.blacklist'
    }

    def __init__(self, org_apache_sling_installer_configuration_persist=None, job_consumermanager_whitelist=None, job_consumermanager_blacklist=None):  # noqa: E501
        """OrgApacheSlingEventImplJobsJobConsumerManagerProperties - a model defined in OpenAPI"""  # noqa: E501

        self._org_apache_sling_installer_configuration_persist = None
        self._job_consumermanager_whitelist = None
        self._job_consumermanager_blacklist = None
        self.discriminator = None

        if org_apache_sling_installer_configuration_persist is not None:
            self.org_apache_sling_installer_configuration_persist = org_apache_sling_installer_configuration_persist
        if job_consumermanager_whitelist is not None:
            self.job_consumermanager_whitelist = job_consumermanager_whitelist
        if job_consumermanager_blacklist is not None:
            self.job_consumermanager_blacklist = job_consumermanager_blacklist

    @property
    def org_apache_sling_installer_configuration_persist(self):
        """Gets the org_apache_sling_installer_configuration_persist of this OrgApacheSlingEventImplJobsJobConsumerManagerProperties.  # noqa: E501


        :return: The org_apache_sling_installer_configuration_persist of this OrgApacheSlingEventImplJobsJobConsumerManagerProperties.  # noqa: E501
        :rtype: ConfigNodePropertyBoolean
        """
        return self._org_apache_sling_installer_configuration_persist

    @org_apache_sling_installer_configuration_persist.setter
    def org_apache_sling_installer_configuration_persist(self, org_apache_sling_installer_configuration_persist):
        """Sets the org_apache_sling_installer_configuration_persist of this OrgApacheSlingEventImplJobsJobConsumerManagerProperties.


        :param org_apache_sling_installer_configuration_persist: The org_apache_sling_installer_configuration_persist of this OrgApacheSlingEventImplJobsJobConsumerManagerProperties.  # noqa: E501
        :type: ConfigNodePropertyBoolean
        """

        self._org_apache_sling_installer_configuration_persist = org_apache_sling_installer_configuration_persist

    @property
    def job_consumermanager_whitelist(self):
        """Gets the job_consumermanager_whitelist of this OrgApacheSlingEventImplJobsJobConsumerManagerProperties.  # noqa: E501


        :return: The job_consumermanager_whitelist of this OrgApacheSlingEventImplJobsJobConsumerManagerProperties.  # noqa: E501
        :rtype: ConfigNodePropertyArray
        """
        return self._job_consumermanager_whitelist

    @job_consumermanager_whitelist.setter
    def job_consumermanager_whitelist(self, job_consumermanager_whitelist):
        """Sets the job_consumermanager_whitelist of this OrgApacheSlingEventImplJobsJobConsumerManagerProperties.


        :param job_consumermanager_whitelist: The job_consumermanager_whitelist of this OrgApacheSlingEventImplJobsJobConsumerManagerProperties.  # noqa: E501
        :type: ConfigNodePropertyArray
        """

        self._job_consumermanager_whitelist = job_consumermanager_whitelist

    @property
    def job_consumermanager_blacklist(self):
        """Gets the job_consumermanager_blacklist of this OrgApacheSlingEventImplJobsJobConsumerManagerProperties.  # noqa: E501


        :return: The job_consumermanager_blacklist of this OrgApacheSlingEventImplJobsJobConsumerManagerProperties.  # noqa: E501
        :rtype: ConfigNodePropertyArray
        """
        return self._job_consumermanager_blacklist

    @job_consumermanager_blacklist.setter
    def job_consumermanager_blacklist(self, job_consumermanager_blacklist):
        """Sets the job_consumermanager_blacklist of this OrgApacheSlingEventImplJobsJobConsumerManagerProperties.


        :param job_consumermanager_blacklist: The job_consumermanager_blacklist of this OrgApacheSlingEventImplJobsJobConsumerManagerProperties.  # noqa: E501
        :type: ConfigNodePropertyArray
        """

        self._job_consumermanager_blacklist = job_consumermanager_blacklist

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
        if not isinstance(other, OrgApacheSlingEventImplJobsJobConsumerManagerProperties):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other