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
  class OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties
    attr_accessor :users_path

    attr_accessor :groups_path

    attr_accessor :system_relative_path

    attr_accessor :default_depth

    attr_accessor :import_behavior

    attr_accessor :password_hash_algorithm

    attr_accessor :password_hash_iterations

    attr_accessor :password_salt_size

    attr_accessor :omit_admin_pw

    attr_accessor :support_auto_save

    attr_accessor :password_max_age

    attr_accessor :initial_password_change

    attr_accessor :password_history_size

    attr_accessor :password_expiry_for_admin

    attr_accessor :cache_expiration

    attr_accessor :enable_rfc7613_usercase_mapped_profile

    # Attribute mapping from ruby-style variable name to JSON key.
    def self.attribute_map
      {
        :'users_path' => :'usersPath',
        :'groups_path' => :'groupsPath',
        :'system_relative_path' => :'systemRelativePath',
        :'default_depth' => :'defaultDepth',
        :'import_behavior' => :'importBehavior',
        :'password_hash_algorithm' => :'passwordHashAlgorithm',
        :'password_hash_iterations' => :'passwordHashIterations',
        :'password_salt_size' => :'passwordSaltSize',
        :'omit_admin_pw' => :'omitAdminPw',
        :'support_auto_save' => :'supportAutoSave',
        :'password_max_age' => :'passwordMaxAge',
        :'initial_password_change' => :'initialPasswordChange',
        :'password_history_size' => :'passwordHistorySize',
        :'password_expiry_for_admin' => :'passwordExpiryForAdmin',
        :'cache_expiration' => :'cacheExpiration',
        :'enable_rfc7613_usercase_mapped_profile' => :'enableRFC7613UsercaseMappedProfile'
      }
    end

    # Attribute type mapping.
    def self.openapi_types
      {
        :'users_path' => :'ConfigNodePropertyString',
        :'groups_path' => :'ConfigNodePropertyString',
        :'system_relative_path' => :'ConfigNodePropertyString',
        :'default_depth' => :'ConfigNodePropertyInteger',
        :'import_behavior' => :'ConfigNodePropertyDropDown',
        :'password_hash_algorithm' => :'ConfigNodePropertyString',
        :'password_hash_iterations' => :'ConfigNodePropertyInteger',
        :'password_salt_size' => :'ConfigNodePropertyInteger',
        :'omit_admin_pw' => :'ConfigNodePropertyBoolean',
        :'support_auto_save' => :'ConfigNodePropertyBoolean',
        :'password_max_age' => :'ConfigNodePropertyInteger',
        :'initial_password_change' => :'ConfigNodePropertyBoolean',
        :'password_history_size' => :'ConfigNodePropertyInteger',
        :'password_expiry_for_admin' => :'ConfigNodePropertyBoolean',
        :'cache_expiration' => :'ConfigNodePropertyInteger',
        :'enable_rfc7613_usercase_mapped_profile' => :'ConfigNodePropertyBoolean'
      }
    end

    # Initializes the object
    # @param [Hash] attributes Model attributes in the form of hash
    def initialize(attributes = {})
      if (!attributes.is_a?(Hash))
        fail ArgumentError, "The input argument (attributes) must be a hash in `SwaggerAemOsgiClient::OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties` initialize method"
      end

      # check to see if the attribute exists and convert string to symbol for hash key
      attributes = attributes.each_with_object({}) { |(k, v), h|
        if (!self.class.attribute_map.key?(k.to_sym))
          fail ArgumentError, "`#{k}` is not a valid attribute in `SwaggerAemOsgiClient::OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties`. Please check the name to make sure it's valid. List of attributes: " + self.class.attribute_map.keys.inspect
        end
        h[k.to_sym] = v
      }

      if attributes.key?(:'users_path')
        self.users_path = attributes[:'users_path']
      end

      if attributes.key?(:'groups_path')
        self.groups_path = attributes[:'groups_path']
      end

      if attributes.key?(:'system_relative_path')
        self.system_relative_path = attributes[:'system_relative_path']
      end

      if attributes.key?(:'default_depth')
        self.default_depth = attributes[:'default_depth']
      end

      if attributes.key?(:'import_behavior')
        self.import_behavior = attributes[:'import_behavior']
      end

      if attributes.key?(:'password_hash_algorithm')
        self.password_hash_algorithm = attributes[:'password_hash_algorithm']
      end

      if attributes.key?(:'password_hash_iterations')
        self.password_hash_iterations = attributes[:'password_hash_iterations']
      end

      if attributes.key?(:'password_salt_size')
        self.password_salt_size = attributes[:'password_salt_size']
      end

      if attributes.key?(:'omit_admin_pw')
        self.omit_admin_pw = attributes[:'omit_admin_pw']
      end

      if attributes.key?(:'support_auto_save')
        self.support_auto_save = attributes[:'support_auto_save']
      end

      if attributes.key?(:'password_max_age')
        self.password_max_age = attributes[:'password_max_age']
      end

      if attributes.key?(:'initial_password_change')
        self.initial_password_change = attributes[:'initial_password_change']
      end

      if attributes.key?(:'password_history_size')
        self.password_history_size = attributes[:'password_history_size']
      end

      if attributes.key?(:'password_expiry_for_admin')
        self.password_expiry_for_admin = attributes[:'password_expiry_for_admin']
      end

      if attributes.key?(:'cache_expiration')
        self.cache_expiration = attributes[:'cache_expiration']
      end

      if attributes.key?(:'enable_rfc7613_usercase_mapped_profile')
        self.enable_rfc7613_usercase_mapped_profile = attributes[:'enable_rfc7613_usercase_mapped_profile']
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
          users_path == o.users_path &&
          groups_path == o.groups_path &&
          system_relative_path == o.system_relative_path &&
          default_depth == o.default_depth &&
          import_behavior == o.import_behavior &&
          password_hash_algorithm == o.password_hash_algorithm &&
          password_hash_iterations == o.password_hash_iterations &&
          password_salt_size == o.password_salt_size &&
          omit_admin_pw == o.omit_admin_pw &&
          support_auto_save == o.support_auto_save &&
          password_max_age == o.password_max_age &&
          initial_password_change == o.initial_password_change &&
          password_history_size == o.password_history_size &&
          password_expiry_for_admin == o.password_expiry_for_admin &&
          cache_expiration == o.cache_expiration &&
          enable_rfc7613_usercase_mapped_profile == o.enable_rfc7613_usercase_mapped_profile
    end

    # @see the `==` method
    # @param [Object] Object to be compared
    def eql?(o)
      self == o
    end

    # Calculates hash code according to all attributes.
    # @return [Integer] Hash code
    def hash
      [users_path, groups_path, system_relative_path, default_depth, import_behavior, password_hash_algorithm, password_hash_iterations, password_salt_size, omit_admin_pw, support_auto_save, password_max_age, initial_password_change, password_history_size, password_expiry_for_admin, cache_expiration, enable_rfc7613_usercase_mapped_profile].hash
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
