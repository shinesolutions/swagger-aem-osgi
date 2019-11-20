# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model_ import Model
from openapi_server.models.config_node_property_boolean import ConfigNodePropertyBoolean  # noqa: F401,E501
from openapi_server.models.config_node_property_integer import ConfigNodePropertyInteger  # noqa: F401,E501
from openapi_server.models.config_node_property_string import ConfigNodePropertyString  # noqa: F401,E501
from openapi_server import util


class OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, repository_home: ConfigNodePropertyString=None, tarmk_mode: ConfigNodePropertyString=None, tarmk_size: ConfigNodePropertyInteger=None, segment_cache_size: ConfigNodePropertyInteger=None, string_cache_size: ConfigNodePropertyInteger=None, template_cache_size: ConfigNodePropertyInteger=None, string_deduplication_cache_size: ConfigNodePropertyInteger=None, template_deduplication_cache_size: ConfigNodePropertyInteger=None, node_deduplication_cache_size: ConfigNodePropertyInteger=None, pause_compaction: ConfigNodePropertyBoolean=None, compaction_retry_count: ConfigNodePropertyInteger=None, compaction_force_timeout: ConfigNodePropertyInteger=None, compaction_size_delta_estimation: ConfigNodePropertyInteger=None, compaction_disable_estimation: ConfigNodePropertyBoolean=None, compaction_retained_generations: ConfigNodePropertyInteger=None, compaction_memory_threshold: ConfigNodePropertyInteger=None, compaction_progress_log: ConfigNodePropertyInteger=None, standby: ConfigNodePropertyBoolean=None, custom_blob_store: ConfigNodePropertyBoolean=None, custom_segment_store: ConfigNodePropertyBoolean=None, split_persistence: ConfigNodePropertyBoolean=None, repository_backup_dir: ConfigNodePropertyString=None, blob_gc_max_age_in_secs: ConfigNodePropertyInteger=None, blob_track_snapshot_interval_in_secs: ConfigNodePropertyInteger=None):  # noqa: E501
        """OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties - a model defined in OpenAPI

        :param repository_home: The repository_home of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.  # noqa: E501
        :type repository_home: ConfigNodePropertyString
        :param tarmk_mode: The tarmk_mode of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.  # noqa: E501
        :type tarmk_mode: ConfigNodePropertyString
        :param tarmk_size: The tarmk_size of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.  # noqa: E501
        :type tarmk_size: ConfigNodePropertyInteger
        :param segment_cache_size: The segment_cache_size of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.  # noqa: E501
        :type segment_cache_size: ConfigNodePropertyInteger
        :param string_cache_size: The string_cache_size of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.  # noqa: E501
        :type string_cache_size: ConfigNodePropertyInteger
        :param template_cache_size: The template_cache_size of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.  # noqa: E501
        :type template_cache_size: ConfigNodePropertyInteger
        :param string_deduplication_cache_size: The string_deduplication_cache_size of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.  # noqa: E501
        :type string_deduplication_cache_size: ConfigNodePropertyInteger
        :param template_deduplication_cache_size: The template_deduplication_cache_size of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.  # noqa: E501
        :type template_deduplication_cache_size: ConfigNodePropertyInteger
        :param node_deduplication_cache_size: The node_deduplication_cache_size of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.  # noqa: E501
        :type node_deduplication_cache_size: ConfigNodePropertyInteger
        :param pause_compaction: The pause_compaction of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.  # noqa: E501
        :type pause_compaction: ConfigNodePropertyBoolean
        :param compaction_retry_count: The compaction_retry_count of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.  # noqa: E501
        :type compaction_retry_count: ConfigNodePropertyInteger
        :param compaction_force_timeout: The compaction_force_timeout of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.  # noqa: E501
        :type compaction_force_timeout: ConfigNodePropertyInteger
        :param compaction_size_delta_estimation: The compaction_size_delta_estimation of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.  # noqa: E501
        :type compaction_size_delta_estimation: ConfigNodePropertyInteger
        :param compaction_disable_estimation: The compaction_disable_estimation of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.  # noqa: E501
        :type compaction_disable_estimation: ConfigNodePropertyBoolean
        :param compaction_retained_generations: The compaction_retained_generations of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.  # noqa: E501
        :type compaction_retained_generations: ConfigNodePropertyInteger
        :param compaction_memory_threshold: The compaction_memory_threshold of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.  # noqa: E501
        :type compaction_memory_threshold: ConfigNodePropertyInteger
        :param compaction_progress_log: The compaction_progress_log of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.  # noqa: E501
        :type compaction_progress_log: ConfigNodePropertyInteger
        :param standby: The standby of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.  # noqa: E501
        :type standby: ConfigNodePropertyBoolean
        :param custom_blob_store: The custom_blob_store of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.  # noqa: E501
        :type custom_blob_store: ConfigNodePropertyBoolean
        :param custom_segment_store: The custom_segment_store of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.  # noqa: E501
        :type custom_segment_store: ConfigNodePropertyBoolean
        :param split_persistence: The split_persistence of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.  # noqa: E501
        :type split_persistence: ConfigNodePropertyBoolean
        :param repository_backup_dir: The repository_backup_dir of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.  # noqa: E501
        :type repository_backup_dir: ConfigNodePropertyString
        :param blob_gc_max_age_in_secs: The blob_gc_max_age_in_secs of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.  # noqa: E501
        :type blob_gc_max_age_in_secs: ConfigNodePropertyInteger
        :param blob_track_snapshot_interval_in_secs: The blob_track_snapshot_interval_in_secs of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.  # noqa: E501
        :type blob_track_snapshot_interval_in_secs: ConfigNodePropertyInteger
        """
        self.openapi_types = {
            'repository_home': ConfigNodePropertyString,
            'tarmk_mode': ConfigNodePropertyString,
            'tarmk_size': ConfigNodePropertyInteger,
            'segment_cache_size': ConfigNodePropertyInteger,
            'string_cache_size': ConfigNodePropertyInteger,
            'template_cache_size': ConfigNodePropertyInteger,
            'string_deduplication_cache_size': ConfigNodePropertyInteger,
            'template_deduplication_cache_size': ConfigNodePropertyInteger,
            'node_deduplication_cache_size': ConfigNodePropertyInteger,
            'pause_compaction': ConfigNodePropertyBoolean,
            'compaction_retry_count': ConfigNodePropertyInteger,
            'compaction_force_timeout': ConfigNodePropertyInteger,
            'compaction_size_delta_estimation': ConfigNodePropertyInteger,
            'compaction_disable_estimation': ConfigNodePropertyBoolean,
            'compaction_retained_generations': ConfigNodePropertyInteger,
            'compaction_memory_threshold': ConfigNodePropertyInteger,
            'compaction_progress_log': ConfigNodePropertyInteger,
            'standby': ConfigNodePropertyBoolean,
            'custom_blob_store': ConfigNodePropertyBoolean,
            'custom_segment_store': ConfigNodePropertyBoolean,
            'split_persistence': ConfigNodePropertyBoolean,
            'repository_backup_dir': ConfigNodePropertyString,
            'blob_gc_max_age_in_secs': ConfigNodePropertyInteger,
            'blob_track_snapshot_interval_in_secs': ConfigNodePropertyInteger
        }

        self.attribute_map = {
            'repository_home': 'repository.home',
            'tarmk_mode': 'tarmk.mode',
            'tarmk_size': 'tarmk.size',
            'segment_cache_size': 'segmentCache.size',
            'string_cache_size': 'stringCache.size',
            'template_cache_size': 'templateCache.size',
            'string_deduplication_cache_size': 'stringDeduplicationCache.size',
            'template_deduplication_cache_size': 'templateDeduplicationCache.size',
            'node_deduplication_cache_size': 'nodeDeduplicationCache.size',
            'pause_compaction': 'pauseCompaction',
            'compaction_retry_count': 'compaction.retryCount',
            'compaction_force_timeout': 'compaction.force.timeout',
            'compaction_size_delta_estimation': 'compaction.sizeDeltaEstimation',
            'compaction_disable_estimation': 'compaction.disableEstimation',
            'compaction_retained_generations': 'compaction.retainedGenerations',
            'compaction_memory_threshold': 'compaction.memoryThreshold',
            'compaction_progress_log': 'compaction.progressLog',
            'standby': 'standby',
            'custom_blob_store': 'customBlobStore',
            'custom_segment_store': 'customSegmentStore',
            'split_persistence': 'splitPersistence',
            'repository_backup_dir': 'repository.backup.dir',
            'blob_gc_max_age_in_secs': 'blobGcMaxAgeInSecs',
            'blob_track_snapshot_interval_in_secs': 'blobTrackSnapshotIntervalInSecs'
        }

        self._repository_home = repository_home
        self._tarmk_mode = tarmk_mode
        self._tarmk_size = tarmk_size
        self._segment_cache_size = segment_cache_size
        self._string_cache_size = string_cache_size
        self._template_cache_size = template_cache_size
        self._string_deduplication_cache_size = string_deduplication_cache_size
        self._template_deduplication_cache_size = template_deduplication_cache_size
        self._node_deduplication_cache_size = node_deduplication_cache_size
        self._pause_compaction = pause_compaction
        self._compaction_retry_count = compaction_retry_count
        self._compaction_force_timeout = compaction_force_timeout
        self._compaction_size_delta_estimation = compaction_size_delta_estimation
        self._compaction_disable_estimation = compaction_disable_estimation
        self._compaction_retained_generations = compaction_retained_generations
        self._compaction_memory_threshold = compaction_memory_threshold
        self._compaction_progress_log = compaction_progress_log
        self._standby = standby
        self._custom_blob_store = custom_blob_store
        self._custom_segment_store = custom_segment_store
        self._split_persistence = split_persistence
        self._repository_backup_dir = repository_backup_dir
        self._blob_gc_max_age_in_secs = blob_gc_max_age_in_secs
        self._blob_track_snapshot_interval_in_secs = blob_track_snapshot_interval_in_secs

    @classmethod
    def from_dict(cls, dikt) -> 'OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The orgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.  # noqa: E501
        :rtype: OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties
        """
        return util.deserialize_model(dikt, cls)

    @property
    def repository_home(self) -> ConfigNodePropertyString:
        """Gets the repository_home of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.


        :return: The repository_home of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.
        :rtype: ConfigNodePropertyString
        """
        return self._repository_home

    @repository_home.setter
    def repository_home(self, repository_home: ConfigNodePropertyString):
        """Sets the repository_home of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.


        :param repository_home: The repository_home of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.
        :type repository_home: ConfigNodePropertyString
        """

        self._repository_home = repository_home

    @property
    def tarmk_mode(self) -> ConfigNodePropertyString:
        """Gets the tarmk_mode of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.


        :return: The tarmk_mode of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.
        :rtype: ConfigNodePropertyString
        """
        return self._tarmk_mode

    @tarmk_mode.setter
    def tarmk_mode(self, tarmk_mode: ConfigNodePropertyString):
        """Sets the tarmk_mode of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.


        :param tarmk_mode: The tarmk_mode of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.
        :type tarmk_mode: ConfigNodePropertyString
        """

        self._tarmk_mode = tarmk_mode

    @property
    def tarmk_size(self) -> ConfigNodePropertyInteger:
        """Gets the tarmk_size of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.


        :return: The tarmk_size of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.
        :rtype: ConfigNodePropertyInteger
        """
        return self._tarmk_size

    @tarmk_size.setter
    def tarmk_size(self, tarmk_size: ConfigNodePropertyInteger):
        """Sets the tarmk_size of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.


        :param tarmk_size: The tarmk_size of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.
        :type tarmk_size: ConfigNodePropertyInteger
        """

        self._tarmk_size = tarmk_size

    @property
    def segment_cache_size(self) -> ConfigNodePropertyInteger:
        """Gets the segment_cache_size of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.


        :return: The segment_cache_size of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.
        :rtype: ConfigNodePropertyInteger
        """
        return self._segment_cache_size

    @segment_cache_size.setter
    def segment_cache_size(self, segment_cache_size: ConfigNodePropertyInteger):
        """Sets the segment_cache_size of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.


        :param segment_cache_size: The segment_cache_size of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.
        :type segment_cache_size: ConfigNodePropertyInteger
        """

        self._segment_cache_size = segment_cache_size

    @property
    def string_cache_size(self) -> ConfigNodePropertyInteger:
        """Gets the string_cache_size of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.


        :return: The string_cache_size of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.
        :rtype: ConfigNodePropertyInteger
        """
        return self._string_cache_size

    @string_cache_size.setter
    def string_cache_size(self, string_cache_size: ConfigNodePropertyInteger):
        """Sets the string_cache_size of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.


        :param string_cache_size: The string_cache_size of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.
        :type string_cache_size: ConfigNodePropertyInteger
        """

        self._string_cache_size = string_cache_size

    @property
    def template_cache_size(self) -> ConfigNodePropertyInteger:
        """Gets the template_cache_size of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.


        :return: The template_cache_size of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.
        :rtype: ConfigNodePropertyInteger
        """
        return self._template_cache_size

    @template_cache_size.setter
    def template_cache_size(self, template_cache_size: ConfigNodePropertyInteger):
        """Sets the template_cache_size of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.


        :param template_cache_size: The template_cache_size of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.
        :type template_cache_size: ConfigNodePropertyInteger
        """

        self._template_cache_size = template_cache_size

    @property
    def string_deduplication_cache_size(self) -> ConfigNodePropertyInteger:
        """Gets the string_deduplication_cache_size of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.


        :return: The string_deduplication_cache_size of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.
        :rtype: ConfigNodePropertyInteger
        """
        return self._string_deduplication_cache_size

    @string_deduplication_cache_size.setter
    def string_deduplication_cache_size(self, string_deduplication_cache_size: ConfigNodePropertyInteger):
        """Sets the string_deduplication_cache_size of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.


        :param string_deduplication_cache_size: The string_deduplication_cache_size of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.
        :type string_deduplication_cache_size: ConfigNodePropertyInteger
        """

        self._string_deduplication_cache_size = string_deduplication_cache_size

    @property
    def template_deduplication_cache_size(self) -> ConfigNodePropertyInteger:
        """Gets the template_deduplication_cache_size of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.


        :return: The template_deduplication_cache_size of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.
        :rtype: ConfigNodePropertyInteger
        """
        return self._template_deduplication_cache_size

    @template_deduplication_cache_size.setter
    def template_deduplication_cache_size(self, template_deduplication_cache_size: ConfigNodePropertyInteger):
        """Sets the template_deduplication_cache_size of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.


        :param template_deduplication_cache_size: The template_deduplication_cache_size of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.
        :type template_deduplication_cache_size: ConfigNodePropertyInteger
        """

        self._template_deduplication_cache_size = template_deduplication_cache_size

    @property
    def node_deduplication_cache_size(self) -> ConfigNodePropertyInteger:
        """Gets the node_deduplication_cache_size of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.


        :return: The node_deduplication_cache_size of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.
        :rtype: ConfigNodePropertyInteger
        """
        return self._node_deduplication_cache_size

    @node_deduplication_cache_size.setter
    def node_deduplication_cache_size(self, node_deduplication_cache_size: ConfigNodePropertyInteger):
        """Sets the node_deduplication_cache_size of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.


        :param node_deduplication_cache_size: The node_deduplication_cache_size of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.
        :type node_deduplication_cache_size: ConfigNodePropertyInteger
        """

        self._node_deduplication_cache_size = node_deduplication_cache_size

    @property
    def pause_compaction(self) -> ConfigNodePropertyBoolean:
        """Gets the pause_compaction of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.


        :return: The pause_compaction of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.
        :rtype: ConfigNodePropertyBoolean
        """
        return self._pause_compaction

    @pause_compaction.setter
    def pause_compaction(self, pause_compaction: ConfigNodePropertyBoolean):
        """Sets the pause_compaction of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.


        :param pause_compaction: The pause_compaction of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.
        :type pause_compaction: ConfigNodePropertyBoolean
        """

        self._pause_compaction = pause_compaction

    @property
    def compaction_retry_count(self) -> ConfigNodePropertyInteger:
        """Gets the compaction_retry_count of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.


        :return: The compaction_retry_count of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.
        :rtype: ConfigNodePropertyInteger
        """
        return self._compaction_retry_count

    @compaction_retry_count.setter
    def compaction_retry_count(self, compaction_retry_count: ConfigNodePropertyInteger):
        """Sets the compaction_retry_count of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.


        :param compaction_retry_count: The compaction_retry_count of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.
        :type compaction_retry_count: ConfigNodePropertyInteger
        """

        self._compaction_retry_count = compaction_retry_count

    @property
    def compaction_force_timeout(self) -> ConfigNodePropertyInteger:
        """Gets the compaction_force_timeout of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.


        :return: The compaction_force_timeout of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.
        :rtype: ConfigNodePropertyInteger
        """
        return self._compaction_force_timeout

    @compaction_force_timeout.setter
    def compaction_force_timeout(self, compaction_force_timeout: ConfigNodePropertyInteger):
        """Sets the compaction_force_timeout of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.


        :param compaction_force_timeout: The compaction_force_timeout of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.
        :type compaction_force_timeout: ConfigNodePropertyInteger
        """

        self._compaction_force_timeout = compaction_force_timeout

    @property
    def compaction_size_delta_estimation(self) -> ConfigNodePropertyInteger:
        """Gets the compaction_size_delta_estimation of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.


        :return: The compaction_size_delta_estimation of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.
        :rtype: ConfigNodePropertyInteger
        """
        return self._compaction_size_delta_estimation

    @compaction_size_delta_estimation.setter
    def compaction_size_delta_estimation(self, compaction_size_delta_estimation: ConfigNodePropertyInteger):
        """Sets the compaction_size_delta_estimation of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.


        :param compaction_size_delta_estimation: The compaction_size_delta_estimation of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.
        :type compaction_size_delta_estimation: ConfigNodePropertyInteger
        """

        self._compaction_size_delta_estimation = compaction_size_delta_estimation

    @property
    def compaction_disable_estimation(self) -> ConfigNodePropertyBoolean:
        """Gets the compaction_disable_estimation of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.


        :return: The compaction_disable_estimation of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.
        :rtype: ConfigNodePropertyBoolean
        """
        return self._compaction_disable_estimation

    @compaction_disable_estimation.setter
    def compaction_disable_estimation(self, compaction_disable_estimation: ConfigNodePropertyBoolean):
        """Sets the compaction_disable_estimation of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.


        :param compaction_disable_estimation: The compaction_disable_estimation of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.
        :type compaction_disable_estimation: ConfigNodePropertyBoolean
        """

        self._compaction_disable_estimation = compaction_disable_estimation

    @property
    def compaction_retained_generations(self) -> ConfigNodePropertyInteger:
        """Gets the compaction_retained_generations of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.


        :return: The compaction_retained_generations of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.
        :rtype: ConfigNodePropertyInteger
        """
        return self._compaction_retained_generations

    @compaction_retained_generations.setter
    def compaction_retained_generations(self, compaction_retained_generations: ConfigNodePropertyInteger):
        """Sets the compaction_retained_generations of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.


        :param compaction_retained_generations: The compaction_retained_generations of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.
        :type compaction_retained_generations: ConfigNodePropertyInteger
        """

        self._compaction_retained_generations = compaction_retained_generations

    @property
    def compaction_memory_threshold(self) -> ConfigNodePropertyInteger:
        """Gets the compaction_memory_threshold of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.


        :return: The compaction_memory_threshold of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.
        :rtype: ConfigNodePropertyInteger
        """
        return self._compaction_memory_threshold

    @compaction_memory_threshold.setter
    def compaction_memory_threshold(self, compaction_memory_threshold: ConfigNodePropertyInteger):
        """Sets the compaction_memory_threshold of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.


        :param compaction_memory_threshold: The compaction_memory_threshold of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.
        :type compaction_memory_threshold: ConfigNodePropertyInteger
        """

        self._compaction_memory_threshold = compaction_memory_threshold

    @property
    def compaction_progress_log(self) -> ConfigNodePropertyInteger:
        """Gets the compaction_progress_log of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.


        :return: The compaction_progress_log of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.
        :rtype: ConfigNodePropertyInteger
        """
        return self._compaction_progress_log

    @compaction_progress_log.setter
    def compaction_progress_log(self, compaction_progress_log: ConfigNodePropertyInteger):
        """Sets the compaction_progress_log of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.


        :param compaction_progress_log: The compaction_progress_log of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.
        :type compaction_progress_log: ConfigNodePropertyInteger
        """

        self._compaction_progress_log = compaction_progress_log

    @property
    def standby(self) -> ConfigNodePropertyBoolean:
        """Gets the standby of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.


        :return: The standby of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.
        :rtype: ConfigNodePropertyBoolean
        """
        return self._standby

    @standby.setter
    def standby(self, standby: ConfigNodePropertyBoolean):
        """Sets the standby of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.


        :param standby: The standby of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.
        :type standby: ConfigNodePropertyBoolean
        """

        self._standby = standby

    @property
    def custom_blob_store(self) -> ConfigNodePropertyBoolean:
        """Gets the custom_blob_store of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.


        :return: The custom_blob_store of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.
        :rtype: ConfigNodePropertyBoolean
        """
        return self._custom_blob_store

    @custom_blob_store.setter
    def custom_blob_store(self, custom_blob_store: ConfigNodePropertyBoolean):
        """Sets the custom_blob_store of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.


        :param custom_blob_store: The custom_blob_store of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.
        :type custom_blob_store: ConfigNodePropertyBoolean
        """

        self._custom_blob_store = custom_blob_store

    @property
    def custom_segment_store(self) -> ConfigNodePropertyBoolean:
        """Gets the custom_segment_store of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.


        :return: The custom_segment_store of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.
        :rtype: ConfigNodePropertyBoolean
        """
        return self._custom_segment_store

    @custom_segment_store.setter
    def custom_segment_store(self, custom_segment_store: ConfigNodePropertyBoolean):
        """Sets the custom_segment_store of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.


        :param custom_segment_store: The custom_segment_store of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.
        :type custom_segment_store: ConfigNodePropertyBoolean
        """

        self._custom_segment_store = custom_segment_store

    @property
    def split_persistence(self) -> ConfigNodePropertyBoolean:
        """Gets the split_persistence of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.


        :return: The split_persistence of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.
        :rtype: ConfigNodePropertyBoolean
        """
        return self._split_persistence

    @split_persistence.setter
    def split_persistence(self, split_persistence: ConfigNodePropertyBoolean):
        """Sets the split_persistence of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.


        :param split_persistence: The split_persistence of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.
        :type split_persistence: ConfigNodePropertyBoolean
        """

        self._split_persistence = split_persistence

    @property
    def repository_backup_dir(self) -> ConfigNodePropertyString:
        """Gets the repository_backup_dir of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.


        :return: The repository_backup_dir of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.
        :rtype: ConfigNodePropertyString
        """
        return self._repository_backup_dir

    @repository_backup_dir.setter
    def repository_backup_dir(self, repository_backup_dir: ConfigNodePropertyString):
        """Sets the repository_backup_dir of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.


        :param repository_backup_dir: The repository_backup_dir of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.
        :type repository_backup_dir: ConfigNodePropertyString
        """

        self._repository_backup_dir = repository_backup_dir

    @property
    def blob_gc_max_age_in_secs(self) -> ConfigNodePropertyInteger:
        """Gets the blob_gc_max_age_in_secs of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.


        :return: The blob_gc_max_age_in_secs of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.
        :rtype: ConfigNodePropertyInteger
        """
        return self._blob_gc_max_age_in_secs

    @blob_gc_max_age_in_secs.setter
    def blob_gc_max_age_in_secs(self, blob_gc_max_age_in_secs: ConfigNodePropertyInteger):
        """Sets the blob_gc_max_age_in_secs of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.


        :param blob_gc_max_age_in_secs: The blob_gc_max_age_in_secs of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.
        :type blob_gc_max_age_in_secs: ConfigNodePropertyInteger
        """

        self._blob_gc_max_age_in_secs = blob_gc_max_age_in_secs

    @property
    def blob_track_snapshot_interval_in_secs(self) -> ConfigNodePropertyInteger:
        """Gets the blob_track_snapshot_interval_in_secs of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.


        :return: The blob_track_snapshot_interval_in_secs of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.
        :rtype: ConfigNodePropertyInteger
        """
        return self._blob_track_snapshot_interval_in_secs

    @blob_track_snapshot_interval_in_secs.setter
    def blob_track_snapshot_interval_in_secs(self, blob_track_snapshot_interval_in_secs: ConfigNodePropertyInteger):
        """Sets the blob_track_snapshot_interval_in_secs of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.


        :param blob_track_snapshot_interval_in_secs: The blob_track_snapshot_interval_in_secs of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties.
        :type blob_track_snapshot_interval_in_secs: ConfigNodePropertyInteger
        """

        self._blob_track_snapshot_interval_in_secs = blob_track_snapshot_interval_in_secs