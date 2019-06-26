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
  class OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoryProperties
    attr_accessor :name

    attr_accessor :title

    attr_accessor :details

    attr_accessor :enabled

    attr_accessor :service_name

    attr_accessor :log_level

    attr_accessor :allowed_roots

    attr_accessor :queue_processing_enabled

    attr_accessor :package_importer_endpoints

    attr_accessor :passive_queues

    attr_accessor :priority_queues

    attr_accessor :retry_strategy

    attr_accessor :retry_attempts

    attr_accessor :request_authorization_strategy_target

    attr_accessor :transport_secret_provider_target

    attr_accessor :package_builder_target

    attr_accessor :triggers_target

    attr_accessor :queue_provider

    attr_accessor :async_delivery

    attr_accessor :http_conn_timeout

    # Attribute mapping from ruby-style variable name to JSON key.
    def self.attribute_map
      {
        :'name' => :'name',
        :'title' => :'title',
        :'details' => :'details',
        :'enabled' => :'enabled',
        :'service_name' => :'serviceName',
        :'log_level' => :'log.level',
        :'allowed_roots' => :'allowed.roots',
        :'queue_processing_enabled' => :'queue.processing.enabled',
        :'package_importer_endpoints' => :'packageImporter.endpoints',
        :'passive_queues' => :'passiveQueues',
        :'priority_queues' => :'priorityQueues',
        :'retry_strategy' => :'retry.strategy',
        :'retry_attempts' => :'retry.attempts',
        :'request_authorization_strategy_target' => :'requestAuthorizationStrategy.target',
        :'transport_secret_provider_target' => :'transportSecretProvider.target',
        :'package_builder_target' => :'packageBuilder.target',
        :'triggers_target' => :'triggers.target',
        :'queue_provider' => :'queue.provider',
        :'async_delivery' => :'async.delivery',
        :'http_conn_timeout' => :'http.conn.timeout'
      }
    end

    # Attribute type mapping.
    def self.openapi_types
      {
        :'name' => :'ConfigNodePropertyString',
        :'title' => :'ConfigNodePropertyString',
        :'details' => :'ConfigNodePropertyString',
        :'enabled' => :'ConfigNodePropertyBoolean',
        :'service_name' => :'ConfigNodePropertyString',
        :'log_level' => :'ConfigNodePropertyDropDown',
        :'allowed_roots' => :'ConfigNodePropertyArray',
        :'queue_processing_enabled' => :'ConfigNodePropertyBoolean',
        :'package_importer_endpoints' => :'ConfigNodePropertyArray',
        :'passive_queues' => :'ConfigNodePropertyArray',
        :'priority_queues' => :'ConfigNodePropertyArray',
        :'retry_strategy' => :'ConfigNodePropertyDropDown',
        :'retry_attempts' => :'ConfigNodePropertyInteger',
        :'request_authorization_strategy_target' => :'ConfigNodePropertyString',
        :'transport_secret_provider_target' => :'ConfigNodePropertyString',
        :'package_builder_target' => :'ConfigNodePropertyString',
        :'triggers_target' => :'ConfigNodePropertyString',
        :'queue_provider' => :'ConfigNodePropertyDropDown',
        :'async_delivery' => :'ConfigNodePropertyBoolean',
        :'http_conn_timeout' => :'ConfigNodePropertyInteger'
      }
    end

    # Initializes the object
    # @param [Hash] attributes Model attributes in the form of hash
    def initialize(attributes = {})
      if (!attributes.is_a?(Hash))
        fail ArgumentError, "The input argument (attributes) must be a hash in `SwaggerAemOsgiClient::OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoryProperties` initialize method"
      end

      # check to see if the attribute exists and convert string to symbol for hash key
      attributes = attributes.each_with_object({}) { |(k, v), h|
        if (!self.class.attribute_map.key?(k.to_sym))
          fail ArgumentError, "`#{k}` is not a valid attribute in `SwaggerAemOsgiClient::OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoryProperties`. Please check the name to make sure it's valid. List of attributes: " + self.class.attribute_map.keys.inspect
        end
        h[k.to_sym] = v
      }

      if attributes.key?(:'name')
        self.name = attributes[:'name']
      end

      if attributes.key?(:'title')
        self.title = attributes[:'title']
      end

      if attributes.key?(:'details')
        self.details = attributes[:'details']
      end

      if attributes.key?(:'enabled')
        self.enabled = attributes[:'enabled']
      end

      if attributes.key?(:'service_name')
        self.service_name = attributes[:'service_name']
      end

      if attributes.key?(:'log_level')
        self.log_level = attributes[:'log_level']
      end

      if attributes.key?(:'allowed_roots')
        self.allowed_roots = attributes[:'allowed_roots']
      end

      if attributes.key?(:'queue_processing_enabled')
        self.queue_processing_enabled = attributes[:'queue_processing_enabled']
      end

      if attributes.key?(:'package_importer_endpoints')
        self.package_importer_endpoints = attributes[:'package_importer_endpoints']
      end

      if attributes.key?(:'passive_queues')
        self.passive_queues = attributes[:'passive_queues']
      end

      if attributes.key?(:'priority_queues')
        self.priority_queues = attributes[:'priority_queues']
      end

      if attributes.key?(:'retry_strategy')
        self.retry_strategy = attributes[:'retry_strategy']
      end

      if attributes.key?(:'retry_attempts')
        self.retry_attempts = attributes[:'retry_attempts']
      end

      if attributes.key?(:'request_authorization_strategy_target')
        self.request_authorization_strategy_target = attributes[:'request_authorization_strategy_target']
      end

      if attributes.key?(:'transport_secret_provider_target')
        self.transport_secret_provider_target = attributes[:'transport_secret_provider_target']
      end

      if attributes.key?(:'package_builder_target')
        self.package_builder_target = attributes[:'package_builder_target']
      end

      if attributes.key?(:'triggers_target')
        self.triggers_target = attributes[:'triggers_target']
      end

      if attributes.key?(:'queue_provider')
        self.queue_provider = attributes[:'queue_provider']
      end

      if attributes.key?(:'async_delivery')
        self.async_delivery = attributes[:'async_delivery']
      end

      if attributes.key?(:'http_conn_timeout')
        self.http_conn_timeout = attributes[:'http_conn_timeout']
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
          title == o.title &&
          details == o.details &&
          enabled == o.enabled &&
          service_name == o.service_name &&
          log_level == o.log_level &&
          allowed_roots == o.allowed_roots &&
          queue_processing_enabled == o.queue_processing_enabled &&
          package_importer_endpoints == o.package_importer_endpoints &&
          passive_queues == o.passive_queues &&
          priority_queues == o.priority_queues &&
          retry_strategy == o.retry_strategy &&
          retry_attempts == o.retry_attempts &&
          request_authorization_strategy_target == o.request_authorization_strategy_target &&
          transport_secret_provider_target == o.transport_secret_provider_target &&
          package_builder_target == o.package_builder_target &&
          triggers_target == o.triggers_target &&
          queue_provider == o.queue_provider &&
          async_delivery == o.async_delivery &&
          http_conn_timeout == o.http_conn_timeout
    end

    # @see the `==` method
    # @param [Object] Object to be compared
    def eql?(o)
      self == o
    end

    # Calculates hash code according to all attributes.
    # @return [Integer] Hash code
    def hash
      [name, title, details, enabled, service_name, log_level, allowed_roots, queue_processing_enabled, package_importer_endpoints, passive_queues, priority_queues, retry_strategy, retry_attempts, request_authorization_strategy_target, transport_secret_provider_target, package_builder_target, triggers_target, queue_provider, async_delivery, http_conn_timeout].hash
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
