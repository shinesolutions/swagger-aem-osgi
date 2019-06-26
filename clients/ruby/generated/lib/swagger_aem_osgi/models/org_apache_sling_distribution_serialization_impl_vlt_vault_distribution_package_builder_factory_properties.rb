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
  class OrgApacheSlingDistributionSerializationImplVltVaultDistributionPackageBuilderFactoryProperties
    attr_accessor :name

    attr_accessor :type

    attr_accessor :import_mode

    attr_accessor :acl_handling

    attr_accessor :package_roots

    attr_accessor :package_filters

    attr_accessor :property_filters

    attr_accessor :temp_fs_folder

    attr_accessor :use_binary_references

    attr_accessor :auto_save_threshold

    attr_accessor :cleanup_delay

    attr_accessor :file_threshold

    attr_accessor :mega_bytes

    attr_accessor :use_off_heap_memory

    attr_accessor :digest_algorithm

    attr_accessor :monitoring_queue_size

    attr_accessor :paths_mapping

    attr_accessor :strict_import

    # Attribute mapping from ruby-style variable name to JSON key.
    def self.attribute_map
      {
        :'name' => :'name',
        :'type' => :'type',
        :'import_mode' => :'importMode',
        :'acl_handling' => :'aclHandling',
        :'package_roots' => :'package.roots',
        :'package_filters' => :'package.filters',
        :'property_filters' => :'property.filters',
        :'temp_fs_folder' => :'tempFsFolder',
        :'use_binary_references' => :'useBinaryReferences',
        :'auto_save_threshold' => :'autoSaveThreshold',
        :'cleanup_delay' => :'cleanupDelay',
        :'file_threshold' => :'fileThreshold',
        :'mega_bytes' => :'MEGA_BYTES',
        :'use_off_heap_memory' => :'useOffHeapMemory',
        :'digest_algorithm' => :'digestAlgorithm',
        :'monitoring_queue_size' => :'monitoringQueueSize',
        :'paths_mapping' => :'pathsMapping',
        :'strict_import' => :'strictImport'
      }
    end

    # Attribute type mapping.
    def self.openapi_types
      {
        :'name' => :'ConfigNodePropertyString',
        :'type' => :'ConfigNodePropertyDropDown',
        :'import_mode' => :'ConfigNodePropertyString',
        :'acl_handling' => :'ConfigNodePropertyString',
        :'package_roots' => :'ConfigNodePropertyString',
        :'package_filters' => :'ConfigNodePropertyArray',
        :'property_filters' => :'ConfigNodePropertyArray',
        :'temp_fs_folder' => :'ConfigNodePropertyString',
        :'use_binary_references' => :'ConfigNodePropertyBoolean',
        :'auto_save_threshold' => :'ConfigNodePropertyInteger',
        :'cleanup_delay' => :'ConfigNodePropertyInteger',
        :'file_threshold' => :'ConfigNodePropertyInteger',
        :'mega_bytes' => :'ConfigNodePropertyDropDown',
        :'use_off_heap_memory' => :'ConfigNodePropertyBoolean',
        :'digest_algorithm' => :'ConfigNodePropertyDropDown',
        :'monitoring_queue_size' => :'ConfigNodePropertyInteger',
        :'paths_mapping' => :'ConfigNodePropertyArray',
        :'strict_import' => :'ConfigNodePropertyBoolean'
      }
    end

    # Initializes the object
    # @param [Hash] attributes Model attributes in the form of hash
    def initialize(attributes = {})
      if (!attributes.is_a?(Hash))
        fail ArgumentError, "The input argument (attributes) must be a hash in `SwaggerAemOsgiClient::OrgApacheSlingDistributionSerializationImplVltVaultDistributionPackageBuilderFactoryProperties` initialize method"
      end

      # check to see if the attribute exists and convert string to symbol for hash key
      attributes = attributes.each_with_object({}) { |(k, v), h|
        if (!self.class.attribute_map.key?(k.to_sym))
          fail ArgumentError, "`#{k}` is not a valid attribute in `SwaggerAemOsgiClient::OrgApacheSlingDistributionSerializationImplVltVaultDistributionPackageBuilderFactoryProperties`. Please check the name to make sure it's valid. List of attributes: " + self.class.attribute_map.keys.inspect
        end
        h[k.to_sym] = v
      }

      if attributes.key?(:'name')
        self.name = attributes[:'name']
      end

      if attributes.key?(:'type')
        self.type = attributes[:'type']
      end

      if attributes.key?(:'import_mode')
        self.import_mode = attributes[:'import_mode']
      end

      if attributes.key?(:'acl_handling')
        self.acl_handling = attributes[:'acl_handling']
      end

      if attributes.key?(:'package_roots')
        self.package_roots = attributes[:'package_roots']
      end

      if attributes.key?(:'package_filters')
        self.package_filters = attributes[:'package_filters']
      end

      if attributes.key?(:'property_filters')
        self.property_filters = attributes[:'property_filters']
      end

      if attributes.key?(:'temp_fs_folder')
        self.temp_fs_folder = attributes[:'temp_fs_folder']
      end

      if attributes.key?(:'use_binary_references')
        self.use_binary_references = attributes[:'use_binary_references']
      end

      if attributes.key?(:'auto_save_threshold')
        self.auto_save_threshold = attributes[:'auto_save_threshold']
      end

      if attributes.key?(:'cleanup_delay')
        self.cleanup_delay = attributes[:'cleanup_delay']
      end

      if attributes.key?(:'file_threshold')
        self.file_threshold = attributes[:'file_threshold']
      end

      if attributes.key?(:'mega_bytes')
        self.mega_bytes = attributes[:'mega_bytes']
      end

      if attributes.key?(:'use_off_heap_memory')
        self.use_off_heap_memory = attributes[:'use_off_heap_memory']
      end

      if attributes.key?(:'digest_algorithm')
        self.digest_algorithm = attributes[:'digest_algorithm']
      end

      if attributes.key?(:'monitoring_queue_size')
        self.monitoring_queue_size = attributes[:'monitoring_queue_size']
      end

      if attributes.key?(:'paths_mapping')
        self.paths_mapping = attributes[:'paths_mapping']
      end

      if attributes.key?(:'strict_import')
        self.strict_import = attributes[:'strict_import']
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
          name == o.name &&
          type == o.type &&
          import_mode == o.import_mode &&
          acl_handling == o.acl_handling &&
          package_roots == o.package_roots &&
          package_filters == o.package_filters &&
          property_filters == o.property_filters &&
          temp_fs_folder == o.temp_fs_folder &&
          use_binary_references == o.use_binary_references &&
          auto_save_threshold == o.auto_save_threshold &&
          cleanup_delay == o.cleanup_delay &&
          file_threshold == o.file_threshold &&
          mega_bytes == o.mega_bytes &&
          use_off_heap_memory == o.use_off_heap_memory &&
          digest_algorithm == o.digest_algorithm &&
          monitoring_queue_size == o.monitoring_queue_size &&
          paths_mapping == o.paths_mapping &&
          strict_import == o.strict_import
    end

    # @see the `==` method
    # @param [Object] Object to be compared
    def eql?(o)
      self == o
    end

    # Calculates hash code according to all attributes.
    # @return [Integer] Hash code
    def hash
      [name, type, import_mode, acl_handling, package_roots, package_filters, property_filters, temp_fs_folder, use_binary_references, auto_save_threshold, cleanup_delay, file_threshold, mega_bytes, use_off_heap_memory, digest_algorithm, monitoring_queue_size, paths_mapping, strict_import].hash
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