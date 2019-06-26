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
  class ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties
    attr_accessor :parameter_whitelist

    attr_accessor :parameter_whitelist_prefixes

    attr_accessor :binary_parameter_whitelist

    attr_accessor :modifier_whitelist

    attr_accessor :operation_whitelist

    attr_accessor :operation_whitelist_prefixes

    attr_accessor :typehint_whitelist

    attr_accessor :resourcetype_whitelist

    # Attribute mapping from ruby-style variable name to JSON key.
    def self.attribute_map
      {
        :'parameter_whitelist' => :'parameter.whitelist',
        :'parameter_whitelist_prefixes' => :'parameter.whitelist.prefixes',
        :'binary_parameter_whitelist' => :'binary.parameter.whitelist',
        :'modifier_whitelist' => :'modifier.whitelist',
        :'operation_whitelist' => :'operation.whitelist',
        :'operation_whitelist_prefixes' => :'operation.whitelist.prefixes',
        :'typehint_whitelist' => :'typehint.whitelist',
        :'resourcetype_whitelist' => :'resourcetype.whitelist'
      }
    end

    # Attribute type mapping.
    def self.openapi_types
      {
        :'parameter_whitelist' => :'ConfigNodePropertyArray',
        :'parameter_whitelist_prefixes' => :'ConfigNodePropertyArray',
        :'binary_parameter_whitelist' => :'ConfigNodePropertyArray',
        :'modifier_whitelist' => :'ConfigNodePropertyArray',
        :'operation_whitelist' => :'ConfigNodePropertyArray',
        :'operation_whitelist_prefixes' => :'ConfigNodePropertyArray',
        :'typehint_whitelist' => :'ConfigNodePropertyArray',
        :'resourcetype_whitelist' => :'ConfigNodePropertyArray'
      }
    end

    # Initializes the object
    # @param [Hash] attributes Model attributes in the form of hash
    def initialize(attributes = {})
      if (!attributes.is_a?(Hash))
        fail ArgumentError, "The input argument (attributes) must be a hash in `SwaggerAemOsgiClient::ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties` initialize method"
      end

      # check to see if the attribute exists and convert string to symbol for hash key
      attributes = attributes.each_with_object({}) { |(k, v), h|
        if (!self.class.attribute_map.key?(k.to_sym))
          fail ArgumentError, "`#{k}` is not a valid attribute in `SwaggerAemOsgiClient::ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties`. Please check the name to make sure it's valid. List of attributes: " + self.class.attribute_map.keys.inspect
        end
        h[k.to_sym] = v
      }

      if attributes.key?(:'parameter_whitelist')
        self.parameter_whitelist = attributes[:'parameter_whitelist']
      end

      if attributes.key?(:'parameter_whitelist_prefixes')
        self.parameter_whitelist_prefixes = attributes[:'parameter_whitelist_prefixes']
      end

      if attributes.key?(:'binary_parameter_whitelist')
        self.binary_parameter_whitelist = attributes[:'binary_parameter_whitelist']
      end

      if attributes.key?(:'modifier_whitelist')
        self.modifier_whitelist = attributes[:'modifier_whitelist']
      end

      if attributes.key?(:'operation_whitelist')
        self.operation_whitelist = attributes[:'operation_whitelist']
      end

      if attributes.key?(:'operation_whitelist_prefixes')
        self.operation_whitelist_prefixes = attributes[:'operation_whitelist_prefixes']
      end

      if attributes.key?(:'typehint_whitelist')
        self.typehint_whitelist = attributes[:'typehint_whitelist']
      end

      if attributes.key?(:'resourcetype_whitelist')
        self.resourcetype_whitelist = attributes[:'resourcetype_whitelist']
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
          parameter_whitelist == o.parameter_whitelist &&
          parameter_whitelist_prefixes == o.parameter_whitelist_prefixes &&
          binary_parameter_whitelist == o.binary_parameter_whitelist &&
          modifier_whitelist == o.modifier_whitelist &&
          operation_whitelist == o.operation_whitelist &&
          operation_whitelist_prefixes == o.operation_whitelist_prefixes &&
          typehint_whitelist == o.typehint_whitelist &&
          resourcetype_whitelist == o.resourcetype_whitelist
    end

    # @see the `==` method
    # @param [Object] Object to be compared
    def eql?(o)
      self == o
    end

    # Calculates hash code according to all attributes.
    # @return [Integer] Hash code
    def hash
      [parameter_whitelist, parameter_whitelist_prefixes, binary_parameter_whitelist, modifier_whitelist, operation_whitelist, operation_whitelist_prefixes, typehint_whitelist, resourcetype_whitelist].hash
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
