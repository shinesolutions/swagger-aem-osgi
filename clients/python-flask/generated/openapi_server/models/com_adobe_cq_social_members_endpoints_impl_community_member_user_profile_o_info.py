# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model_ import Model
from openapi_server.models.com_adobe_cq_social_members_endpoints_impl_community_member_user_profile_o_properties import ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOProperties  # noqa: F401,E501
from openapi_server import util


class ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOInfo(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, pid: str=None, title: str=None, description: str=None, properties: ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOProperties=None):  # noqa: E501
        """ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOInfo - a model defined in OpenAPI

        :param pid: The pid of this ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOInfo.  # noqa: E501
        :type pid: str
        :param title: The title of this ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOInfo.  # noqa: E501
        :type title: str
        :param description: The description of this ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOInfo.  # noqa: E501
        :type description: str
        :param properties: The properties of this ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOInfo.  # noqa: E501
        :type properties: ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOProperties
        """
        self.openapi_types = {
            'pid': str,
            'title': str,
            'description': str,
            'properties': ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOProperties
        }

        self.attribute_map = {
            'pid': 'pid',
            'title': 'title',
            'description': 'description',
            'properties': 'properties'
        }

        self._pid = pid
        self._title = title
        self._description = description
        self._properties = properties

    @classmethod
    def from_dict(cls, dikt) -> 'ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOInfo':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The comAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOInfo of this ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOInfo.  # noqa: E501
        :rtype: ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOInfo
        """
        return util.deserialize_model(dikt, cls)

    @property
    def pid(self) -> str:
        """Gets the pid of this ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOInfo.


        :return: The pid of this ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOInfo.
        :rtype: str
        """
        return self._pid

    @pid.setter
    def pid(self, pid: str):
        """Sets the pid of this ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOInfo.


        :param pid: The pid of this ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOInfo.
        :type pid: str
        """

        self._pid = pid

    @property
    def title(self) -> str:
        """Gets the title of this ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOInfo.


        :return: The title of this ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOInfo.
        :rtype: str
        """
        return self._title

    @title.setter
    def title(self, title: str):
        """Sets the title of this ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOInfo.


        :param title: The title of this ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOInfo.
        :type title: str
        """

        self._title = title

    @property
    def description(self) -> str:
        """Gets the description of this ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOInfo.


        :return: The description of this ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOInfo.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description: str):
        """Sets the description of this ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOInfo.


        :param description: The description of this ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOInfo.
        :type description: str
        """

        self._description = description

    @property
    def properties(self) -> ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOProperties:
        """Gets the properties of this ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOInfo.


        :return: The properties of this ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOInfo.
        :rtype: ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOProperties
        """
        return self._properties

    @properties.setter
    def properties(self, properties: ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOProperties):
        """Sets the properties of this ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOInfo.


        :param properties: The properties of this ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOInfo.
        :type properties: ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOProperties
        """

        self._properties = properties