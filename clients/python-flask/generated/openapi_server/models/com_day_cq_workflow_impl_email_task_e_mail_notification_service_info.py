# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model_ import Model
from openapi_server.models.com_day_cq_workflow_impl_email_task_e_mail_notification_service_properties import ComDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties  # noqa: F401,E501
from openapi_server import util


class ComDayCqWorkflowImplEmailTaskEMailNotificationServiceInfo(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, pid: str=None, title: str=None, description: str=None, properties: ComDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties=None):  # noqa: E501
        """ComDayCqWorkflowImplEmailTaskEMailNotificationServiceInfo - a model defined in OpenAPI

        :param pid: The pid of this ComDayCqWorkflowImplEmailTaskEMailNotificationServiceInfo.  # noqa: E501
        :type pid: str
        :param title: The title of this ComDayCqWorkflowImplEmailTaskEMailNotificationServiceInfo.  # noqa: E501
        :type title: str
        :param description: The description of this ComDayCqWorkflowImplEmailTaskEMailNotificationServiceInfo.  # noqa: E501
        :type description: str
        :param properties: The properties of this ComDayCqWorkflowImplEmailTaskEMailNotificationServiceInfo.  # noqa: E501
        :type properties: ComDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties
        """
        self.openapi_types = {
            'pid': str,
            'title': str,
            'description': str,
            'properties': ComDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties
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
    def from_dict(cls, dikt) -> 'ComDayCqWorkflowImplEmailTaskEMailNotificationServiceInfo':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The comDayCqWorkflowImplEmailTaskEMailNotificationServiceInfo of this ComDayCqWorkflowImplEmailTaskEMailNotificationServiceInfo.  # noqa: E501
        :rtype: ComDayCqWorkflowImplEmailTaskEMailNotificationServiceInfo
        """
        return util.deserialize_model(dikt, cls)

    @property
    def pid(self) -> str:
        """Gets the pid of this ComDayCqWorkflowImplEmailTaskEMailNotificationServiceInfo.


        :return: The pid of this ComDayCqWorkflowImplEmailTaskEMailNotificationServiceInfo.
        :rtype: str
        """
        return self._pid

    @pid.setter
    def pid(self, pid: str):
        """Sets the pid of this ComDayCqWorkflowImplEmailTaskEMailNotificationServiceInfo.


        :param pid: The pid of this ComDayCqWorkflowImplEmailTaskEMailNotificationServiceInfo.
        :type pid: str
        """

        self._pid = pid

    @property
    def title(self) -> str:
        """Gets the title of this ComDayCqWorkflowImplEmailTaskEMailNotificationServiceInfo.


        :return: The title of this ComDayCqWorkflowImplEmailTaskEMailNotificationServiceInfo.
        :rtype: str
        """
        return self._title

    @title.setter
    def title(self, title: str):
        """Sets the title of this ComDayCqWorkflowImplEmailTaskEMailNotificationServiceInfo.


        :param title: The title of this ComDayCqWorkflowImplEmailTaskEMailNotificationServiceInfo.
        :type title: str
        """

        self._title = title

    @property
    def description(self) -> str:
        """Gets the description of this ComDayCqWorkflowImplEmailTaskEMailNotificationServiceInfo.


        :return: The description of this ComDayCqWorkflowImplEmailTaskEMailNotificationServiceInfo.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description: str):
        """Sets the description of this ComDayCqWorkflowImplEmailTaskEMailNotificationServiceInfo.


        :param description: The description of this ComDayCqWorkflowImplEmailTaskEMailNotificationServiceInfo.
        :type description: str
        """

        self._description = description

    @property
    def properties(self) -> ComDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties:
        """Gets the properties of this ComDayCqWorkflowImplEmailTaskEMailNotificationServiceInfo.


        :return: The properties of this ComDayCqWorkflowImplEmailTaskEMailNotificationServiceInfo.
        :rtype: ComDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties
        """
        return self._properties

    @properties.setter
    def properties(self, properties: ComDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties):
        """Sets the properties of this ComDayCqWorkflowImplEmailTaskEMailNotificationServiceInfo.


        :param properties: The properties of this ComDayCqWorkflowImplEmailTaskEMailNotificationServiceInfo.
        :type properties: ComDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties
        """

        self._properties = properties