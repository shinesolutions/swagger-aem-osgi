=begin
#Adobe Experience Manager OSGI config (AEM) API

#Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API

The version of the OpenAPI document: 1.0.0
Contact: opensource@shinesolutions.com
Generated by: https://openapi-generator.tech
OpenAPI Generator version: 4.0.1-SNAPSHOT

=end

require 'date'

module SwaggerAemOsgiClient
  class OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties
    attr_accessor :mongouri

    attr_accessor :db

    attr_accessor :socket_keep_alive

    attr_accessor :cache

    attr_accessor :node_cache_percentage

    attr_accessor :prev_doc_cache_percentage

    attr_accessor :children_cache_percentage

    attr_accessor :diff_cache_percentage

    attr_accessor :cache_segment_count

    attr_accessor :cache_stack_move_distance

    attr_accessor :blob_cache_size

    attr_accessor :persistent_cache

    attr_accessor :journal_cache

    attr_accessor :custom_blob_store

    attr_accessor :journal_gc_interval

    attr_accessor :journal_gc_max_age

    attr_accessor :prefetch_external_changes

    attr_accessor :role

    attr_accessor :version_gc_max_age_in_secs

    attr_accessor :version_gc_expression

    attr_accessor :version_gc_time_limit_in_secs

    attr_accessor :blob_gc_max_age_in_secs

    attr_accessor :blob_track_snapshot_interval_in_secs

    attr_accessor :repository_home

    attr_accessor :max_replication_lag_in_secs

    attr_accessor :document_store_type

    attr_accessor :bundling_disabled

    attr_accessor :update_limit

    attr_accessor :persistent_cache_includes

    attr_accessor :lease_check_mode

    # Attribute mapping from ruby-style variable name to JSON key.
    def self.attribute_map
      {
        :'mongouri' => :'mongouri',
        :'db' => :'db',
        :'socket_keep_alive' => :'socketKeepAlive',
        :'cache' => :'cache',
        :'node_cache_percentage' => :'nodeCachePercentage',
        :'prev_doc_cache_percentage' => :'prevDocCachePercentage',
        :'children_cache_percentage' => :'childrenCachePercentage',
        :'diff_cache_percentage' => :'diffCachePercentage',
        :'cache_segment_count' => :'cacheSegmentCount',
        :'cache_stack_move_distance' => :'cacheStackMoveDistance',
        :'blob_cache_size' => :'blobCacheSize',
        :'persistent_cache' => :'persistentCache',
        :'journal_cache' => :'journalCache',
        :'custom_blob_store' => :'customBlobStore',
        :'journal_gc_interval' => :'journalGCInterval',
        :'journal_gc_max_age' => :'journalGCMaxAge',
        :'prefetch_external_changes' => :'prefetchExternalChanges',
        :'role' => :'role',
        :'version_gc_max_age_in_secs' => :'versionGcMaxAgeInSecs',
        :'version_gc_expression' => :'versionGCExpression',
        :'version_gc_time_limit_in_secs' => :'versionGCTimeLimitInSecs',
        :'blob_gc_max_age_in_secs' => :'blobGcMaxAgeInSecs',
        :'blob_track_snapshot_interval_in_secs' => :'blobTrackSnapshotIntervalInSecs',
        :'repository_home' => :'repository.home',
        :'max_replication_lag_in_secs' => :'maxReplicationLagInSecs',
        :'document_store_type' => :'documentStoreType',
        :'bundling_disabled' => :'bundlingDisabled',
        :'update_limit' => :'updateLimit',
        :'persistent_cache_includes' => :'persistentCacheIncludes',
        :'lease_check_mode' => :'leaseCheckMode'
      }
    end

    # Attribute type mapping.
    def self.openapi_types
      {
        :'mongouri' => :'ConfigNodePropertyString',
        :'db' => :'ConfigNodePropertyString',
        :'socket_keep_alive' => :'ConfigNodePropertyBoolean',
        :'cache' => :'ConfigNodePropertyInteger',
        :'node_cache_percentage' => :'ConfigNodePropertyInteger',
        :'prev_doc_cache_percentage' => :'ConfigNodePropertyInteger',
        :'children_cache_percentage' => :'ConfigNodePropertyInteger',
        :'diff_cache_percentage' => :'ConfigNodePropertyInteger',
        :'cache_segment_count' => :'ConfigNodePropertyInteger',
        :'cache_stack_move_distance' => :'ConfigNodePropertyInteger',
        :'blob_cache_size' => :'ConfigNodePropertyInteger',
        :'persistent_cache' => :'ConfigNodePropertyString',
        :'journal_cache' => :'ConfigNodePropertyString',
        :'custom_blob_store' => :'ConfigNodePropertyBoolean',
        :'journal_gc_interval' => :'ConfigNodePropertyInteger',
        :'journal_gc_max_age' => :'ConfigNodePropertyInteger',
        :'prefetch_external_changes' => :'ConfigNodePropertyBoolean',
        :'role' => :'ConfigNodePropertyString',
        :'version_gc_max_age_in_secs' => :'ConfigNodePropertyInteger',
        :'version_gc_expression' => :'ConfigNodePropertyString',
        :'version_gc_time_limit_in_secs' => :'ConfigNodePropertyInteger',
        :'blob_gc_max_age_in_secs' => :'ConfigNodePropertyInteger',
        :'blob_track_snapshot_interval_in_secs' => :'ConfigNodePropertyInteger',
        :'repository_home' => :'ConfigNodePropertyString',
        :'max_replication_lag_in_secs' => :'ConfigNodePropertyInteger',
        :'document_store_type' => :'ConfigNodePropertyDropDown',
        :'bundling_disabled' => :'ConfigNodePropertyBoolean',
        :'update_limit' => :'ConfigNodePropertyInteger',
        :'persistent_cache_includes' => :'ConfigNodePropertyArray',
        :'lease_check_mode' => :'ConfigNodePropertyDropDown'
      }
    end

    # Initializes the object
    # @param [Hash] attributes Model attributes in the form of hash
    def initialize(attributes = {})
      if (!attributes.is_a?(Hash))
        fail ArgumentError, "The input argument (attributes) must be a hash in `SwaggerAemOsgiClient::OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties` initialize method"
      end

      # check to see if the attribute exists and convert string to symbol for hash key
      attributes = attributes.each_with_object({}) { |(k, v), h|
        if (!self.class.attribute_map.key?(k.to_sym))
          fail ArgumentError, "`#{k}` is not a valid attribute in `SwaggerAemOsgiClient::OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties`. Please check the name to make sure it's valid. List of attributes: " + self.class.attribute_map.keys.inspect
        end
        h[k.to_sym] = v
      }

      if attributes.key?(:'mongouri')
        self.mongouri = attributes[:'mongouri']
      end

      if attributes.key?(:'db')
        self.db = attributes[:'db']
      end

      if attributes.key?(:'socket_keep_alive')
        self.socket_keep_alive = attributes[:'socket_keep_alive']
      end

      if attributes.key?(:'cache')
        self.cache = attributes[:'cache']
      end

      if attributes.key?(:'node_cache_percentage')
        self.node_cache_percentage = attributes[:'node_cache_percentage']
      end

      if attributes.key?(:'prev_doc_cache_percentage')
        self.prev_doc_cache_percentage = attributes[:'prev_doc_cache_percentage']
      end

      if attributes.key?(:'children_cache_percentage')
        self.children_cache_percentage = attributes[:'children_cache_percentage']
      end

      if attributes.key?(:'diff_cache_percentage')
        self.diff_cache_percentage = attributes[:'diff_cache_percentage']
      end

      if attributes.key?(:'cache_segment_count')
        self.cache_segment_count = attributes[:'cache_segment_count']
      end

      if attributes.key?(:'cache_stack_move_distance')
        self.cache_stack_move_distance = attributes[:'cache_stack_move_distance']
      end

      if attributes.key?(:'blob_cache_size')
        self.blob_cache_size = attributes[:'blob_cache_size']
      end

      if attributes.key?(:'persistent_cache')
        self.persistent_cache = attributes[:'persistent_cache']
      end

      if attributes.key?(:'journal_cache')
        self.journal_cache = attributes[:'journal_cache']
      end

      if attributes.key?(:'custom_blob_store')
        self.custom_blob_store = attributes[:'custom_blob_store']
      end

      if attributes.key?(:'journal_gc_interval')
        self.journal_gc_interval = attributes[:'journal_gc_interval']
      end

      if attributes.key?(:'journal_gc_max_age')
        self.journal_gc_max_age = attributes[:'journal_gc_max_age']
      end

      if attributes.key?(:'prefetch_external_changes')
        self.prefetch_external_changes = attributes[:'prefetch_external_changes']
      end

      if attributes.key?(:'role')
        self.role = attributes[:'role']
      end

      if attributes.key?(:'version_gc_max_age_in_secs')
        self.version_gc_max_age_in_secs = attributes[:'version_gc_max_age_in_secs']
      end

      if attributes.key?(:'version_gc_expression')
        self.version_gc_expression = attributes[:'version_gc_expression']
      end

      if attributes.key?(:'version_gc_time_limit_in_secs')
        self.version_gc_time_limit_in_secs = attributes[:'version_gc_time_limit_in_secs']
      end

      if attributes.key?(:'blob_gc_max_age_in_secs')
        self.blob_gc_max_age_in_secs = attributes[:'blob_gc_max_age_in_secs']
      end

      if attributes.key?(:'blob_track_snapshot_interval_in_secs')
        self.blob_track_snapshot_interval_in_secs = attributes[:'blob_track_snapshot_interval_in_secs']
      end

      if attributes.key?(:'repository_home')
        self.repository_home = attributes[:'repository_home']
      end

      if attributes.key?(:'max_replication_lag_in_secs')
        self.max_replication_lag_in_secs = attributes[:'max_replication_lag_in_secs']
      end

      if attributes.key?(:'document_store_type')
        self.document_store_type = attributes[:'document_store_type']
      end

      if attributes.key?(:'bundling_disabled')
        self.bundling_disabled = attributes[:'bundling_disabled']
      end

      if attributes.key?(:'update_limit')
        self.update_limit = attributes[:'update_limit']
      end

      if attributes.key?(:'persistent_cache_includes')
        self.persistent_cache_includes = attributes[:'persistent_cache_includes']
      end

      if attributes.key?(:'lease_check_mode')
        self.lease_check_mode = attributes[:'lease_check_mode']
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
          mongouri == o.mongouri &&
          db == o.db &&
          socket_keep_alive == o.socket_keep_alive &&
          cache == o.cache &&
          node_cache_percentage == o.node_cache_percentage &&
          prev_doc_cache_percentage == o.prev_doc_cache_percentage &&
          children_cache_percentage == o.children_cache_percentage &&
          diff_cache_percentage == o.diff_cache_percentage &&
          cache_segment_count == o.cache_segment_count &&
          cache_stack_move_distance == o.cache_stack_move_distance &&
          blob_cache_size == o.blob_cache_size &&
          persistent_cache == o.persistent_cache &&
          journal_cache == o.journal_cache &&
          custom_blob_store == o.custom_blob_store &&
          journal_gc_interval == o.journal_gc_interval &&
          journal_gc_max_age == o.journal_gc_max_age &&
          prefetch_external_changes == o.prefetch_external_changes &&
          role == o.role &&
          version_gc_max_age_in_secs == o.version_gc_max_age_in_secs &&
          version_gc_expression == o.version_gc_expression &&
          version_gc_time_limit_in_secs == o.version_gc_time_limit_in_secs &&
          blob_gc_max_age_in_secs == o.blob_gc_max_age_in_secs &&
          blob_track_snapshot_interval_in_secs == o.blob_track_snapshot_interval_in_secs &&
          repository_home == o.repository_home &&
          max_replication_lag_in_secs == o.max_replication_lag_in_secs &&
          document_store_type == o.document_store_type &&
          bundling_disabled == o.bundling_disabled &&
          update_limit == o.update_limit &&
          persistent_cache_includes == o.persistent_cache_includes &&
          lease_check_mode == o.lease_check_mode
    end

    # @see the `==` method
    # @param [Object] Object to be compared
    def eql?(o)
      self == o
    end

    # Calculates hash code according to all attributes.
    # @return [Integer] Hash code
    def hash
      [mongouri, db, socket_keep_alive, cache, node_cache_percentage, prev_doc_cache_percentage, children_cache_percentage, diff_cache_percentage, cache_segment_count, cache_stack_move_distance, blob_cache_size, persistent_cache, journal_cache, custom_blob_store, journal_gc_interval, journal_gc_max_age, prefetch_external_changes, role, version_gc_max_age_in_secs, version_gc_expression, version_gc_time_limit_in_secs, blob_gc_max_age_in_secs, blob_track_snapshot_interval_in_secs, repository_home, max_replication_lag_in_secs, document_store_type, bundling_disabled, update_limit, persistent_cache_includes, lease_check_mode].hash
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