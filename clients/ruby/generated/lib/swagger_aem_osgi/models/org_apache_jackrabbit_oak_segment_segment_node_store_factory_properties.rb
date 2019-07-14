=begin
#Adobe Experience Manager OSGI config (AEM) API

#Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API

The version of the OpenAPI document: 1.0.0-pre.0
Contact: opensource@shinesolutions.com
Generated by: https://openapi-generator.tech
OpenAPI Generator version: 4.0.1-SNAPSHOT

=end

require 'date'

module SwaggerAemOsgiClient
  class OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties
    attr_accessor :repository_home

    attr_accessor :tarmk_mode

    attr_accessor :tarmk_size

    attr_accessor :segment_cache_size

    attr_accessor :string_cache_size

    attr_accessor :template_cache_size

    attr_accessor :string_deduplication_cache_size

    attr_accessor :template_deduplication_cache_size

    attr_accessor :node_deduplication_cache_size

    attr_accessor :pause_compaction

    attr_accessor :compaction_retry_count

    attr_accessor :compaction_force_timeout

    attr_accessor :compaction_size_delta_estimation

    attr_accessor :compaction_disable_estimation

    attr_accessor :compaction_retained_generations

    attr_accessor :compaction_memory_threshold

    attr_accessor :compaction_progress_log

    attr_accessor :standby

    attr_accessor :custom_blob_store

    attr_accessor :custom_segment_store

    attr_accessor :split_persistence

    attr_accessor :repository_backup_dir

    attr_accessor :blob_gc_max_age_in_secs

    attr_accessor :blob_track_snapshot_interval_in_secs

    attr_accessor :role

    attr_accessor :register_descriptors

    attr_accessor :dispatch_changes

    # Attribute mapping from ruby-style variable name to JSON key.
    def self.attribute_map
      {
        :'repository_home' => :'repository.home',
        :'tarmk_mode' => :'tarmk.mode',
        :'tarmk_size' => :'tarmk.size',
        :'segment_cache_size' => :'segmentCache.size',
        :'string_cache_size' => :'stringCache.size',
        :'template_cache_size' => :'templateCache.size',
        :'string_deduplication_cache_size' => :'stringDeduplicationCache.size',
        :'template_deduplication_cache_size' => :'templateDeduplicationCache.size',
        :'node_deduplication_cache_size' => :'nodeDeduplicationCache.size',
        :'pause_compaction' => :'pauseCompaction',
        :'compaction_retry_count' => :'compaction.retryCount',
        :'compaction_force_timeout' => :'compaction.force.timeout',
        :'compaction_size_delta_estimation' => :'compaction.sizeDeltaEstimation',
        :'compaction_disable_estimation' => :'compaction.disableEstimation',
        :'compaction_retained_generations' => :'compaction.retainedGenerations',
        :'compaction_memory_threshold' => :'compaction.memoryThreshold',
        :'compaction_progress_log' => :'compaction.progressLog',
        :'standby' => :'standby',
        :'custom_blob_store' => :'customBlobStore',
        :'custom_segment_store' => :'customSegmentStore',
        :'split_persistence' => :'splitPersistence',
        :'repository_backup_dir' => :'repository.backup.dir',
        :'blob_gc_max_age_in_secs' => :'blobGcMaxAgeInSecs',
        :'blob_track_snapshot_interval_in_secs' => :'blobTrackSnapshotIntervalInSecs',
        :'role' => :'role',
        :'register_descriptors' => :'registerDescriptors',
        :'dispatch_changes' => :'dispatchChanges'
      }
    end

    # Attribute type mapping.
    def self.openapi_types
      {
        :'repository_home' => :'ConfigNodePropertyString',
        :'tarmk_mode' => :'ConfigNodePropertyString',
        :'tarmk_size' => :'ConfigNodePropertyInteger',
        :'segment_cache_size' => :'ConfigNodePropertyInteger',
        :'string_cache_size' => :'ConfigNodePropertyInteger',
        :'template_cache_size' => :'ConfigNodePropertyInteger',
        :'string_deduplication_cache_size' => :'ConfigNodePropertyInteger',
        :'template_deduplication_cache_size' => :'ConfigNodePropertyInteger',
        :'node_deduplication_cache_size' => :'ConfigNodePropertyInteger',
        :'pause_compaction' => :'ConfigNodePropertyBoolean',
        :'compaction_retry_count' => :'ConfigNodePropertyInteger',
        :'compaction_force_timeout' => :'ConfigNodePropertyInteger',
        :'compaction_size_delta_estimation' => :'ConfigNodePropertyInteger',
        :'compaction_disable_estimation' => :'ConfigNodePropertyBoolean',
        :'compaction_retained_generations' => :'ConfigNodePropertyInteger',
        :'compaction_memory_threshold' => :'ConfigNodePropertyInteger',
        :'compaction_progress_log' => :'ConfigNodePropertyInteger',
        :'standby' => :'ConfigNodePropertyBoolean',
        :'custom_blob_store' => :'ConfigNodePropertyBoolean',
        :'custom_segment_store' => :'ConfigNodePropertyBoolean',
        :'split_persistence' => :'ConfigNodePropertyBoolean',
        :'repository_backup_dir' => :'ConfigNodePropertyString',
        :'blob_gc_max_age_in_secs' => :'ConfigNodePropertyInteger',
        :'blob_track_snapshot_interval_in_secs' => :'ConfigNodePropertyInteger',
        :'role' => :'ConfigNodePropertyString',
        :'register_descriptors' => :'ConfigNodePropertyBoolean',
        :'dispatch_changes' => :'ConfigNodePropertyBoolean'
      }
    end

    # Initializes the object
    # @param [Hash] attributes Model attributes in the form of hash
    def initialize(attributes = {})
      if (!attributes.is_a?(Hash))
        fail ArgumentError, "The input argument (attributes) must be a hash in `SwaggerAemOsgiClient::OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties` initialize method"
      end

      # check to see if the attribute exists and convert string to symbol for hash key
      attributes = attributes.each_with_object({}) { |(k, v), h|
        if (!self.class.attribute_map.key?(k.to_sym))
          fail ArgumentError, "`#{k}` is not a valid attribute in `SwaggerAemOsgiClient::OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties`. Please check the name to make sure it's valid. List of attributes: " + self.class.attribute_map.keys.inspect
        end
        h[k.to_sym] = v
      }

      if attributes.key?(:'repository_home')
        self.repository_home = attributes[:'repository_home']
      end

      if attributes.key?(:'tarmk_mode')
        self.tarmk_mode = attributes[:'tarmk_mode']
      end

      if attributes.key?(:'tarmk_size')
        self.tarmk_size = attributes[:'tarmk_size']
      end

      if attributes.key?(:'segment_cache_size')
        self.segment_cache_size = attributes[:'segment_cache_size']
      end

      if attributes.key?(:'string_cache_size')
        self.string_cache_size = attributes[:'string_cache_size']
      end

      if attributes.key?(:'template_cache_size')
        self.template_cache_size = attributes[:'template_cache_size']
      end

      if attributes.key?(:'string_deduplication_cache_size')
        self.string_deduplication_cache_size = attributes[:'string_deduplication_cache_size']
      end

      if attributes.key?(:'template_deduplication_cache_size')
        self.template_deduplication_cache_size = attributes[:'template_deduplication_cache_size']
      end

      if attributes.key?(:'node_deduplication_cache_size')
        self.node_deduplication_cache_size = attributes[:'node_deduplication_cache_size']
      end

      if attributes.key?(:'pause_compaction')
        self.pause_compaction = attributes[:'pause_compaction']
      end

      if attributes.key?(:'compaction_retry_count')
        self.compaction_retry_count = attributes[:'compaction_retry_count']
      end

      if attributes.key?(:'compaction_force_timeout')
        self.compaction_force_timeout = attributes[:'compaction_force_timeout']
      end

      if attributes.key?(:'compaction_size_delta_estimation')
        self.compaction_size_delta_estimation = attributes[:'compaction_size_delta_estimation']
      end

      if attributes.key?(:'compaction_disable_estimation')
        self.compaction_disable_estimation = attributes[:'compaction_disable_estimation']
      end

      if attributes.key?(:'compaction_retained_generations')
        self.compaction_retained_generations = attributes[:'compaction_retained_generations']
      end

      if attributes.key?(:'compaction_memory_threshold')
        self.compaction_memory_threshold = attributes[:'compaction_memory_threshold']
      end

      if attributes.key?(:'compaction_progress_log')
        self.compaction_progress_log = attributes[:'compaction_progress_log']
      end

      if attributes.key?(:'standby')
        self.standby = attributes[:'standby']
      end

      if attributes.key?(:'custom_blob_store')
        self.custom_blob_store = attributes[:'custom_blob_store']
      end

      if attributes.key?(:'custom_segment_store')
        self.custom_segment_store = attributes[:'custom_segment_store']
      end

      if attributes.key?(:'split_persistence')
        self.split_persistence = attributes[:'split_persistence']
      end

      if attributes.key?(:'repository_backup_dir')
        self.repository_backup_dir = attributes[:'repository_backup_dir']
      end

      if attributes.key?(:'blob_gc_max_age_in_secs')
        self.blob_gc_max_age_in_secs = attributes[:'blob_gc_max_age_in_secs']
      end

      if attributes.key?(:'blob_track_snapshot_interval_in_secs')
        self.blob_track_snapshot_interval_in_secs = attributes[:'blob_track_snapshot_interval_in_secs']
      end

      if attributes.key?(:'role')
        self.role = attributes[:'role']
      end

      if attributes.key?(:'register_descriptors')
        self.register_descriptors = attributes[:'register_descriptors']
      end

      if attributes.key?(:'dispatch_changes')
        self.dispatch_changes = attributes[:'dispatch_changes']
      end
    end

    # Show invalid properties with the reasons. Usually used together with valid?
    # @return Array for valid properties with the reasons
    def list_invalid_properties
      invalid_properties = Array.new
      invalid_properties
    end

    # Check to see if the all the properties in the model are valid
    # @return true if the model is valid
    def valid?
      true
    end

    # Checks equality by comparing each attribute.
    # @param [Object] Object to be compared
    def ==(o)
      return true if self.equal?(o)
      self.class == o.class &&
          repository_home == o.repository_home &&
          tarmk_mode == o.tarmk_mode &&
          tarmk_size == o.tarmk_size &&
          segment_cache_size == o.segment_cache_size &&
          string_cache_size == o.string_cache_size &&
          template_cache_size == o.template_cache_size &&
          string_deduplication_cache_size == o.string_deduplication_cache_size &&
          template_deduplication_cache_size == o.template_deduplication_cache_size &&
          node_deduplication_cache_size == o.node_deduplication_cache_size &&
          pause_compaction == o.pause_compaction &&
          compaction_retry_count == o.compaction_retry_count &&
          compaction_force_timeout == o.compaction_force_timeout &&
          compaction_size_delta_estimation == o.compaction_size_delta_estimation &&
          compaction_disable_estimation == o.compaction_disable_estimation &&
          compaction_retained_generations == o.compaction_retained_generations &&
          compaction_memory_threshold == o.compaction_memory_threshold &&
          compaction_progress_log == o.compaction_progress_log &&
          standby == o.standby &&
          custom_blob_store == o.custom_blob_store &&
          custom_segment_store == o.custom_segment_store &&
          split_persistence == o.split_persistence &&
          repository_backup_dir == o.repository_backup_dir &&
          blob_gc_max_age_in_secs == o.blob_gc_max_age_in_secs &&
          blob_track_snapshot_interval_in_secs == o.blob_track_snapshot_interval_in_secs &&
          role == o.role &&
          register_descriptors == o.register_descriptors &&
          dispatch_changes == o.dispatch_changes
    end

    # @see the `==` method
    # @param [Object] Object to be compared
    def eql?(o)
      self == o
    end

    # Calculates hash code according to all attributes.
    # @return [Integer] Hash code
    def hash
      [repository_home, tarmk_mode, tarmk_size, segment_cache_size, string_cache_size, template_cache_size, string_deduplication_cache_size, template_deduplication_cache_size, node_deduplication_cache_size, pause_compaction, compaction_retry_count, compaction_force_timeout, compaction_size_delta_estimation, compaction_disable_estimation, compaction_retained_generations, compaction_memory_threshold, compaction_progress_log, standby, custom_blob_store, custom_segment_store, split_persistence, repository_backup_dir, blob_gc_max_age_in_secs, blob_track_snapshot_interval_in_secs, role, register_descriptors, dispatch_changes].hash
    end

    # Builds the object from hash
    # @param [Hash] attributes Model attributes in the form of hash
    # @return [Object] Returns the model itself
    def self.build_from_hash(attributes)
      new.build_from_hash(attributes)
    end

    # Builds the object from hash
    # @param [Hash] attributes Model attributes in the form of hash
    # @return [Object] Returns the model itself
    def build_from_hash(attributes)
      return nil unless attributes.is_a?(Hash)
      self.class.openapi_types.each_pair do |key, type|
        if type =~ /\AArray<(.*)>/i
          # check to ensure the input is an array given that the attribute
          # is documented as an array but the input is not
          if attributes[self.class.attribute_map[key]].is_a?(Array)
            self.send("#{key}=", attributes[self.class.attribute_map[key]].map { |v| _deserialize($1, v) })
          end
        elsif !attributes[self.class.attribute_map[key]].nil?
          self.send("#{key}=", _deserialize(type, attributes[self.class.attribute_map[key]]))
        end # or else data not found in attributes(hash), not an issue as the data can be optional
      end

      self
    end

    # Deserializes the data based on type
    # @param string type Data type
    # @param string value Value to be deserialized
    # @return [Object] Deserialized data
    def _deserialize(type, value)
      case type.to_sym
      when :DateTime
        DateTime.parse(value)
      when :Date
        Date.parse(value)
      when :String
        value.to_s
      when :Integer
        value.to_i
      when :Float
        value.to_f
      when :Boolean
        if value.to_s =~ /\A(true|t|yes|y|1)\z/i
          true
        else
          false
        end
      when :Object
        # generic object (usually a Hash), return directly
        value
      when /\AArray<(?<inner_type>.+)>\z/
        inner_type = Regexp.last_match[:inner_type]
        value.map { |v| _deserialize(inner_type, v) }
      when /\AHash<(?<k_type>.+?), (?<v_type>.+)>\z/
        k_type = Regexp.last_match[:k_type]
        v_type = Regexp.last_match[:v_type]
        {}.tap do |hash|
          value.each do |k, v|
            hash[_deserialize(k_type, k)] = _deserialize(v_type, v)
          end
        end
      else # model
        SwaggerAemOsgiClient.const_get(type).build_from_hash(value)
      end
    end

    # Returns the string representation of the object
    # @return [String] String presentation of the object
    def to_s
      to_hash.to_s
    end

    # to_body is an alias to to_hash (backward compatibility)
    # @return [Hash] Returns the object in the form of hash
    def to_body
      to_hash
    end

    # Returns the object in the form of hash
    # @return [Hash] Returns the object in the form of hash
    def to_hash
      hash = {}
      self.class.attribute_map.each_pair do |attr, param|
        value = self.send(attr)
        next if value.nil?
        hash[param] = _to_hash(value)
      end
      hash
    end

    # Outputs non-array value in the form of hash
    # For object, use to_hash. Otherwise, just return the value
    # @param [Object] value Any valid value
    # @return [Hash] Returns the value in the form of hash
    def _to_hash(value)
      if value.is_a?(Array)
        value.compact.map { |v| _to_hash(v) }
      elsif value.is_a?(Hash)
        {}.tap do |hash|
          value.each { |k, v| hash[k] = _to_hash(v) }
        end
      elsif value.respond_to? :to_hash
        value.to_hash
      else
        value
      end
    end
  end
end
