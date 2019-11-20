# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model_ import Model
from openapi_server.models.config_node_property_integer import ConfigNodePropertyInteger  # noqa: F401,E501
from openapi_server import util


class ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventProperties(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, ranking: ConfigNodePropertyInteger=None):  # noqa: E501
        """ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventProperties - a model defined in OpenAPI

        :param ranking: The ranking of this ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventProperties.  # noqa: E501
        :type ranking: ConfigNodePropertyInteger
        """
        self.openapi_types = {
            'ranking': ConfigNodePropertyInteger
        }

        self.attribute_map = {
            'ranking': 'ranking'
        }

        self._ranking = ranking

    @classmethod
    def from_dict(cls, dikt) -> 'ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventProperties':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The comAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventProperties of this ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventProperties.  # noqa: E501
        :rtype: ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventProperties
        """
        return util.deserialize_model(dikt, cls)

    @property
    def ranking(self) -> ConfigNodePropertyInteger:
        """Gets the ranking of this ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventProperties.


        :return: The ranking of this ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventProperties.
        :rtype: ConfigNodePropertyInteger
        """
        return self._ranking

    @ranking.setter
    def ranking(self, ranking: ConfigNodePropertyInteger):
        """Sets the ranking of this ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventProperties.


        :param ranking: The ranking of this ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventProperties.
        :type ranking: ConfigNodePropertyInteger
        """

        self._ranking = ranking