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


class OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties(object):
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
        'repository_home': 'ConfigNodePropertyString',
        'tarmk_mode': 'ConfigNodePropertyString',
        'tarmk_size': 'ConfigNodePropertyInteger',
        'segment_cache_size': 'ConfigNodePropertyInteger',
        'string_cache_size': 'ConfigNodePropertyInteger',
        'template_cache_size': 'ConfigNodePropertyInteger',
        'string_deduplication_cache_size': 'ConfigNodePropertyInteger',
        'template_deduplication_cache_size': 'ConfigNodePropertyInteger',
        'node_deduplication_cache_size': 'ConfigNodePropertyInteger',
        'pause_compaction': 'ConfigNodePropertyBoolean',
        'compaction_retry_count': 'ConfigNodePropertyInteger',
        'compaction_force_timeout': 'ConfigNodePropertyInteger',
        'compaction_size_delta_estimation': 'ConfigNodePropertyInteger',
        'compaction_disable_estimation': 'ConfigNodePropertyBoolean',
        'compaction_retained_generations': 'ConfigNodePropertyInteger',
        'compaction_memory_threshold': 'ConfigNodePropertyInteger',
        'compaction_progress_log': 'ConfigNodePropertyInteger',
        'standby': 'ConfigNodePropertyBoolean',
        'custom_blob_store': 'ConfigNodePropertyBoolean',
        'custom_segment_store': 'ConfigNodePropertyBoolean',
        'split_persistence': 'ConfigNodePropertyBoolean',
        'repository_backup_dir': 'ConfigNodePropertyString',
        'blob_gc_max_age_in_secs': 'ConfigNodePropertyInteger',
        'blob_track_snapshot_interval_in_secs': 'ConfigNodePropertyInteger',
        'role': 'ConfigNodePropertyString',
        'register_descriptors': 'ConfigNodePropertyBoolean',
        'dispatch_changes': 'ConfigNodePropertyBoolean'
    }

    attribute_map = {
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
        'blob_track_snapshot_interval_in_secs': 'blobTrackSnapshotIntervalInSecs',
        'role': 'role',
        'register_descriptors': 'registerDescriptors',
        'dispatch_changes': 'dispatchChanges'
    }

    def __init__(self, repository_home=None, tarmk_mode=None, tarmk_size=None, segment_cache_size=None, string_cache_size=None, template_cache_size=None, string_deduplication_cache_size=None, template_deduplication_cache_size=None, node_deduplication_cache_size=None, pause_compaction=None, compaction_retry_count=None, compaction_force_timeout=None, compaction_size_delta_estimation=None, compaction_disable_estimation=None, compaction_retained_generations=None, compaction_memory_threshold=None, compaction_progress_log=None, standby=None, custom_blob_store=None, custom_segment_store=None, split_persistence=None, repository_backup_dir=None, blob_gc_max_age_in_secs=None, blob_track_snapshot_interval_in_secs=None, role=None, register_descriptors=None, dispatch_changes=None):  # noqa: E501
        """OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties - a model defined in OpenAPI"""  # noqa: E501

        self._repository_home = None
        self._tarmk_mode = None
        self._tarmk_size = None
        self._segment_cache_size = None
        self._string_cache_size = None
        self._template_cache_size = None
        self._string_deduplication_cache_size = None
        self._template_deduplication_cache_size = None
        self._node_deduplication_cache_size = None
        self._pause_compaction = None
        self._compaction_retry_count = None
        self._compaction_force_timeout = None
        self._compaction_size_delta_estimation = None
        self._compaction_disable_estimation = None
        self._compaction_retained_generations = None
        self._compaction_memory_threshold = None
        self._compaction_progress_log = None
        self._standby = None
        self._custom_blob_store = None
        self._custom_segment_store = None
        self._split_persistence = None
        self._repository_backup_dir = None
        self._blob_gc_max_age_in_secs = None
        self._blob_track_snapshot_interval_in_secs = None
        self._role = None
        self._register_descriptors = None
        self._dispatch_changes = None
        self.discriminator = None

        if repository_home is not None:
            self.repository_home = repository_home
        if tarmk_mode is not None:
            self.tarmk_mode = tarmk_mode
        if tarmk_size is not None:
            self.tarmk_size = tarmk_size
        if segment_cache_size is not None:
            self.segment_cache_size = segment_cache_size
        if string_cache_size is not None:
            self.string_cache_size = string_cache_size
        if template_cache_size is not None:
            self.template_cache_size = template_cache_size
        if string_deduplication_cache_size is not None:
            self.string_deduplication_cache_size = string_deduplication_cache_size
        if template_deduplication_cache_size is not None:
            self.template_deduplication_cache_size = template_deduplication_cache_size
        if node_deduplication_cache_size is not None:
            self.node_deduplication_cache_size = node_deduplication_cache_size
        if pause_compaction is not None:
            self.pause_compaction = pause_compaction
        if compaction_retry_count is not None:
            self.compaction_retry_count = compaction_retry_count
        if compaction_force_timeout is not None:
            self.compaction_force_timeout = compaction_force_timeout
        if compaction_size_delta_estimation is not None:
            self.compaction_size_delta_estimation = compaction_size_delta_estimation
        if compaction_disable_estimation is not None:
            self.compaction_disable_estimation = compaction_disable_estimation
        if compaction_retained_generations is not None:
            self.compaction_retained_generations = compaction_retained_generations
        if compaction_memory_threshold is not None:
            self.compaction_memory_threshold = compaction_memory_threshold
        if compaction_progress_log is not None:
            self.compaction_progress_log = compaction_progress_log
        if standby is not None:
            self.standby = standby
        if custom_blob_store is not None:
            self.custom_blob_store = custom_blob_store
        if custom_segment_store is not None:
            self.custom_segment_store = custom_segment_store
        if split_persistence is not None:
            self.split_persistence = split_persistence
        if repository_backup_dir is not None:
            self.repository_backup_dir = repository_backup_dir
        if blob_gc_max_age_in_secs is not None:
            self.blob_gc_max_age_in_secs = blob_gc_max_age_in_secs
        if blob_track_snapshot_interval_in_secs is not None:
            self.blob_track_snapshot_interval_in_secs = blob_track_snapshot_interval_in_secs
        if role is not None:
            self.role = role
        if register_descriptors is not None:
            self.register_descriptors = register_descriptors
        if dispatch_changes is not None:
            self.dispatch_changes = dispatch_changes

    @property
    def repository_home(self):
        """Gets the repository_home of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.  # noqa: E501


        :return: The repository_home of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.  # noqa: E501
        :rtype: ConfigNodePropertyString
        """
        return self._repository_home

    @repository_home.setter
    def repository_home(self, repository_home):
        """Sets the repository_home of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.


        :param repository_home: The repository_home of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.  # noqa: E501
        :type: ConfigNodePropertyString
        """

        self._repository_home = repository_home

    @property
    def tarmk_mode(self):
        """Gets the tarmk_mode of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.  # noqa: E501


        :return: The tarmk_mode of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.  # noqa: E501
        :rtype: ConfigNodePropertyString
        """
        return self._tarmk_mode

    @tarmk_mode.setter
    def tarmk_mode(self, tarmk_mode):
        """Sets the tarmk_mode of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.


        :param tarmk_mode: The tarmk_mode of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.  # noqa: E501
        :type: ConfigNodePropertyString
        """

        self._tarmk_mode = tarmk_mode

    @property
    def tarmk_size(self):
        """Gets the tarmk_size of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.  # noqa: E501


        :return: The tarmk_size of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.  # noqa: E501
        :rtype: ConfigNodePropertyInteger
        """
        return self._tarmk_size

    @tarmk_size.setter
    def tarmk_size(self, tarmk_size):
        """Sets the tarmk_size of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.


        :param tarmk_size: The tarmk_size of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.  # noqa: E501
        :type: ConfigNodePropertyInteger
        """

        self._tarmk_size = tarmk_size

    @property
    def segment_cache_size(self):
        """Gets the segment_cache_size of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.  # noqa: E501


        :return: The segment_cache_size of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.  # noqa: E501
        :rtype: ConfigNodePropertyInteger
        """
        return self._segment_cache_size

    @segment_cache_size.setter
    def segment_cache_size(self, segment_cache_size):
        """Sets the segment_cache_size of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.


        :param segment_cache_size: The segment_cache_size of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.  # noqa: E501
        :type: ConfigNodePropertyInteger
        """

        self._segment_cache_size = segment_cache_size

    @property
    def string_cache_size(self):
        """Gets the string_cache_size of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.  # noqa: E501


        :return: The string_cache_size of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.  # noqa: E501
        :rtype: ConfigNodePropertyInteger
        """
        return self._string_cache_size

    @string_cache_size.setter
    def string_cache_size(self, string_cache_size):
        """Sets the string_cache_size of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.


        :param string_cache_size: The string_cache_size of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.  # noqa: E501
        :type: ConfigNodePropertyInteger
        """

        self._string_cache_size = string_cache_size

    @property
    def template_cache_size(self):
        """Gets the template_cache_size of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.  # noqa: E501


        :return: The template_cache_size of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.  # noqa: E501
        :rtype: ConfigNodePropertyInteger
        """
        return self._template_cache_size

    @template_cache_size.setter
    def template_cache_size(self, template_cache_size):
        """Sets the template_cache_size of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.


        :param template_cache_size: The template_cache_size of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.  # noqa: E501
        :type: ConfigNodePropertyInteger
        """

        self._template_cache_size = template_cache_size

    @property
    def string_deduplication_cache_size(self):
        """Gets the string_deduplication_cache_size of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.  # noqa: E501


        :return: The string_deduplication_cache_size of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.  # noqa: E501
        :rtype: ConfigNodePropertyInteger
        """
        return self._string_deduplication_cache_size

    @string_deduplication_cache_size.setter
    def string_deduplication_cache_size(self, string_deduplication_cache_size):
        """Sets the string_deduplication_cache_size of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.


        :param string_deduplication_cache_size: The string_deduplication_cache_size of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.  # noqa: E501
        :type: ConfigNodePropertyInteger
        """

        self._string_deduplication_cache_size = string_deduplication_cache_size

    @property
    def template_deduplication_cache_size(self):
        """Gets the template_deduplication_cache_size of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.  # noqa: E501


        :return: The template_deduplication_cache_size of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.  # noqa: E501
        :rtype: ConfigNodePropertyInteger
        """
        return self._template_deduplication_cache_size

    @template_deduplication_cache_size.setter
    def template_deduplication_cache_size(self, template_deduplication_cache_size):
        """Sets the template_deduplication_cache_size of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.


        :param template_deduplication_cache_size: The template_deduplication_cache_size of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.  # noqa: E501
        :type: ConfigNodePropertyInteger
        """

        self._template_deduplication_cache_size = template_deduplication_cache_size

    @property
    def node_deduplication_cache_size(self):
        """Gets the node_deduplication_cache_size of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.  # noqa: E501


        :return: The node_deduplication_cache_size of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.  # noqa: E501
        :rtype: ConfigNodePropertyInteger
        """
        return self._node_deduplication_cache_size

    @node_deduplication_cache_size.setter
    def node_deduplication_cache_size(self, node_deduplication_cache_size):
        """Sets the node_deduplication_cache_size of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.


        :param node_deduplication_cache_size: The node_deduplication_cache_size of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.  # noqa: E501
        :type: ConfigNodePropertyInteger
        """

        self._node_deduplication_cache_size = node_deduplication_cache_size

    @property
    def pause_compaction(self):
        """Gets the pause_compaction of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.  # noqa: E501


        :return: The pause_compaction of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.  # noqa: E501
        :rtype: ConfigNodePropertyBoolean
        """
        return self._pause_compaction

    @pause_compaction.setter
    def pause_compaction(self, pause_compaction):
        """Sets the pause_compaction of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.


        :param pause_compaction: The pause_compaction of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.  # noqa: E501
        :type: ConfigNodePropertyBoolean
        """

        self._pause_compaction = pause_compaction

    @property
    def compaction_retry_count(self):
        """Gets the compaction_retry_count of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.  # noqa: E501


        :return: The compaction_retry_count of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.  # noqa: E501
        :rtype: ConfigNodePropertyInteger
        """
        return self._compaction_retry_count

    @compaction_retry_count.setter
    def compaction_retry_count(self, compaction_retry_count):
        """Sets the compaction_retry_count of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.


        :param compaction_retry_count: The compaction_retry_count of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.  # noqa: E501
        :type: ConfigNodePropertyInteger
        """

        self._compaction_retry_count = compaction_retry_count

    @property
    def compaction_force_timeout(self):
        """Gets the compaction_force_timeout of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.  # noqa: E501


        :return: The compaction_force_timeout of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.  # noqa: E501
        :rtype: ConfigNodePropertyInteger
        """
        return self._compaction_force_timeout

    @compaction_force_timeout.setter
    def compaction_force_timeout(self, compaction_force_timeout):
        """Sets the compaction_force_timeout of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.


        :param compaction_force_timeout: The compaction_force_timeout of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.  # noqa: E501
        :type: ConfigNodePropertyInteger
        """

        self._compaction_force_timeout = compaction_force_timeout

    @property
    def compaction_size_delta_estimation(self):
        """Gets the compaction_size_delta_estimation of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.  # noqa: E501


        :return: The compaction_size_delta_estimation of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.  # noqa: E501
        :rtype: ConfigNodePropertyInteger
        """
        return self._compaction_size_delta_estimation

    @compaction_size_delta_estimation.setter
    def compaction_size_delta_estimation(self, compaction_size_delta_estimation):
        """Sets the compaction_size_delta_estimation of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.


        :param compaction_size_delta_estimation: The compaction_size_delta_estimation of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.  # noqa: E501
        :type: ConfigNodePropertyInteger
        """

        self._compaction_size_delta_estimation = compaction_size_delta_estimation

    @property
    def compaction_disable_estimation(self):
        """Gets the compaction_disable_estimation of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.  # noqa: E501


        :return: The compaction_disable_estimation of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.  # noqa: E501
        :rtype: ConfigNodePropertyBoolean
        """
        return self._compaction_disable_estimation

    @compaction_disable_estimation.setter
    def compaction_disable_estimation(self, compaction_disable_estimation):
        """Sets the compaction_disable_estimation of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.


        :param compaction_disable_estimation: The compaction_disable_estimation of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.  # noqa: E501
        :type: ConfigNodePropertyBoolean
        """

        self._compaction_disable_estimation = compaction_disable_estimation

    @property
    def compaction_retained_generations(self):
        """Gets the compaction_retained_generations of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.  # noqa: E501


        :return: The compaction_retained_generations of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.  # noqa: E501
        :rtype: ConfigNodePropertyInteger
        """
        return self._compaction_retained_generations

    @compaction_retained_generations.setter
    def compaction_retained_generations(self, compaction_retained_generations):
        """Sets the compaction_retained_generations of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.


        :param compaction_retained_generations: The compaction_retained_generations of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.  # noqa: E501
        :type: ConfigNodePropertyInteger
        """

        self._compaction_retained_generations = compaction_retained_generations

    @property
    def compaction_memory_threshold(self):
        """Gets the compaction_memory_threshold of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.  # noqa: E501


        :return: The compaction_memory_threshold of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.  # noqa: E501
        :rtype: ConfigNodePropertyInteger
        """
        return self._compaction_memory_threshold

    @compaction_memory_threshold.setter
    def compaction_memory_threshold(self, compaction_memory_threshold):
        """Sets the compaction_memory_threshold of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.


        :param compaction_memory_threshold: The compaction_memory_threshold of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.  # noqa: E501
        :type: ConfigNodePropertyInteger
        """

        self._compaction_memory_threshold = compaction_memory_threshold

    @property
    def compaction_progress_log(self):
        """Gets the compaction_progress_log of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.  # noqa: E501


        :return: The compaction_progress_log of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.  # noqa: E501
        :rtype: ConfigNodePropertyInteger
        """
        return self._compaction_progress_log

    @compaction_progress_log.setter
    def compaction_progress_log(self, compaction_progress_log):
        """Sets the compaction_progress_log of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.


        :param compaction_progress_log: The compaction_progress_log of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.  # noqa: E501
        :type: ConfigNodePropertyInteger
        """

        self._compaction_progress_log = compaction_progress_log

    @property
    def standby(self):
        """Gets the standby of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.  # noqa: E501


        :return: The standby of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.  # noqa: E501
        :rtype: ConfigNodePropertyBoolean
        """
        return self._standby

    @standby.setter
    def standby(self, standby):
        """Sets the standby of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.


        :param standby: The standby of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.  # noqa: E501
        :type: ConfigNodePropertyBoolean
        """

        self._standby = standby

    @property
    def custom_blob_store(self):
        """Gets the custom_blob_store of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.  # noqa: E501


        :return: The custom_blob_store of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.  # noqa: E501
        :rtype: ConfigNodePropertyBoolean
        """
        return self._custom_blob_store

    @custom_blob_store.setter
    def custom_blob_store(self, custom_blob_store):
        """Sets the custom_blob_store of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.


        :param custom_blob_store: The custom_blob_store of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.  # noqa: E501
        :type: ConfigNodePropertyBoolean
        """

        self._custom_blob_store = custom_blob_store

    @property
    def custom_segment_store(self):
        """Gets the custom_segment_store of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.  # noqa: E501


        :return: The custom_segment_store of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.  # noqa: E501
        :rtype: ConfigNodePropertyBoolean
        """
        return self._custom_segment_store

    @custom_segment_store.setter
    def custom_segment_store(self, custom_segment_store):
        """Sets the custom_segment_store of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.


        :param custom_segment_store: The custom_segment_store of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.  # noqa: E501
        :type: ConfigNodePropertyBoolean
        """

        self._custom_segment_store = custom_segment_store

    @property
    def split_persistence(self):
        """Gets the split_persistence of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.  # noqa: E501


        :return: The split_persistence of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.  # noqa: E501
        :rtype: ConfigNodePropertyBoolean
        """
        return self._split_persistence

    @split_persistence.setter
    def split_persistence(self, split_persistence):
        """Sets the split_persistence of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.


        :param split_persistence: The split_persistence of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.  # noqa: E501
        :type: ConfigNodePropertyBoolean
        """

        self._split_persistence = split_persistence

    @property
    def repository_backup_dir(self):
        """Gets the repository_backup_dir of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.  # noqa: E501


        :return: The repository_backup_dir of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.  # noqa: E501
        :rtype: ConfigNodePropertyString
        """
        return self._repository_backup_dir

    @repository_backup_dir.setter
    def repository_backup_dir(self, repository_backup_dir):
        """Sets the repository_backup_dir of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.


        :param repository_backup_dir: The repository_backup_dir of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.  # noqa: E501
        :type: ConfigNodePropertyString
        """

        self._repository_backup_dir = repository_backup_dir

    @property
    def blob_gc_max_age_in_secs(self):
        """Gets the blob_gc_max_age_in_secs of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.  # noqa: E501


        :return: The blob_gc_max_age_in_secs of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.  # noqa: E501
        :rtype: ConfigNodePropertyInteger
        """
        return self._blob_gc_max_age_in_secs

    @blob_gc_max_age_in_secs.setter
    def blob_gc_max_age_in_secs(self, blob_gc_max_age_in_secs):
        """Sets the blob_gc_max_age_in_secs of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.


        :param blob_gc_max_age_in_secs: The blob_gc_max_age_in_secs of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.  # noqa: E501
        :type: ConfigNodePropertyInteger
        """

        self._blob_gc_max_age_in_secs = blob_gc_max_age_in_secs

    @property
    def blob_track_snapshot_interval_in_secs(self):
        """Gets the blob_track_snapshot_interval_in_secs of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.  # noqa: E501


        :return: The blob_track_snapshot_interval_in_secs of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.  # noqa: E501
        :rtype: ConfigNodePropertyInteger
        """
        return self._blob_track_snapshot_interval_in_secs

    @blob_track_snapshot_interval_in_secs.setter
    def blob_track_snapshot_interval_in_secs(self, blob_track_snapshot_interval_in_secs):
        """Sets the blob_track_snapshot_interval_in_secs of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.


        :param blob_track_snapshot_interval_in_secs: The blob_track_snapshot_interval_in_secs of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.  # noqa: E501
        :type: ConfigNodePropertyInteger
        """

        self._blob_track_snapshot_interval_in_secs = blob_track_snapshot_interval_in_secs

    @property
    def role(self):
        """Gets the role of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.  # noqa: E501


        :return: The role of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.  # noqa: E501
        :rtype: ConfigNodePropertyString
        """
        return self._role

    @role.setter
    def role(self, role):
        """Sets the role of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.


        :param role: The role of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.  # noqa: E501
        :type: ConfigNodePropertyString
        """

        self._role = role

    @property
    def register_descriptors(self):
        """Gets the register_descriptors of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.  # noqa: E501


        :return: The register_descriptors of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.  # noqa: E501
        :rtype: ConfigNodePropertyBoolean
        """
        return self._register_descriptors

    @register_descriptors.setter
    def register_descriptors(self, register_descriptors):
        """Sets the register_descriptors of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.


        :param register_descriptors: The register_descriptors of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.  # noqa: E501
        :type: ConfigNodePropertyBoolean
        """

        self._register_descriptors = register_descriptors

    @property
    def dispatch_changes(self):
        """Gets the dispatch_changes of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.  # noqa: E501


        :return: The dispatch_changes of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.  # noqa: E501
        :rtype: ConfigNodePropertyBoolean
        """
        return self._dispatch_changes

    @dispatch_changes.setter
    def dispatch_changes(self, dispatch_changes):
        """Sets the dispatch_changes of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.


        :param dispatch_changes: The dispatch_changes of this OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties.  # noqa: E501
        :type: ConfigNodePropertyBoolean
        """

        self._dispatch_changes = dispatch_changes

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
        if not isinstance(other, OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
