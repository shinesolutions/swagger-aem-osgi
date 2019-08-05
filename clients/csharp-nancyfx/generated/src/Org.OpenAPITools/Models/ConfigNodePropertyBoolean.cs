using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ConfigNodePropertyBoolean
    /// </summary>
    public sealed class ConfigNodePropertyBoolean:  IEquatable<ConfigNodePropertyBoolean>
    { 
        /// <summary>
        /// property name
        /// </summary>
        public string Name { get; private set; }

        /// <summary>
        /// True if optional
        /// </summary>
        public bool? Optional { get; private set; }

        /// <summary>
        /// True if property is set
        /// </summary>
        public bool? IsSet { get; private set; }

        /// <summary>
        /// Property type, 1&#x3D;String, 2&#x3D;Long, 3&#x3D;Integer, 7&#x3D;Float, 11&#x3D;Boolean, 12&#x3D;Secrets(String)
        /// </summary>
        public int? Type { get; private set; }

        /// <summary>
        /// Property value
        /// </summary>
        public bool? Value { get; private set; }

        /// <summary>
        /// Property description
        /// </summary>
        public string Description { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ConfigNodePropertyBoolean.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ConfigNodePropertyBoolean()
        {
        }

        private ConfigNodePropertyBoolean(string Name, bool? Optional, bool? IsSet, int? Type, bool? Value, string Description)
        {
            
            this.Name = Name;
            
            this.Optional = Optional;
            
            this.IsSet = IsSet;
            
            this.Type = Type;
            
            this.Value = Value;
            
            this.Description = Description;
            
        }

        /// <summary>
        /// Returns builder of ConfigNodePropertyBoolean.
        /// </summary>
        /// <returns>ConfigNodePropertyBooleanBuilder</returns>
        public static ConfigNodePropertyBooleanBuilder Builder()
        {
            return new ConfigNodePropertyBooleanBuilder();
        }

        /// <summary>
        /// Returns ConfigNodePropertyBooleanBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ConfigNodePropertyBooleanBuilder</returns>
        public ConfigNodePropertyBooleanBuilder With()
        {
            return Builder()
                .Name(Name)
                .Optional(Optional)
                .IsSet(IsSet)
                .Type(Type)
                .Value(Value)
                .Description(Description);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ConfigNodePropertyBoolean other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ConfigNodePropertyBoolean.
        /// </summary>
        /// <param name="left">Compared (ConfigNodePropertyBoolean</param>
        /// <param name="right">Compared (ConfigNodePropertyBoolean</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ConfigNodePropertyBoolean left, ConfigNodePropertyBoolean right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ConfigNodePropertyBoolean.
        /// </summary>
        /// <param name="left">Compared (ConfigNodePropertyBoolean</param>
        /// <param name="right">Compared (ConfigNodePropertyBoolean</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ConfigNodePropertyBoolean left, ConfigNodePropertyBoolean right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ConfigNodePropertyBoolean.
        /// </summary>
        public sealed class ConfigNodePropertyBooleanBuilder
        {
            private string _Name;
            private bool? _Optional;
            private bool? _IsSet;
            private int? _Type;
            private bool? _Value;
            private string _Description;

            internal ConfigNodePropertyBooleanBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ConfigNodePropertyBoolean.Name property.
            /// </summary>
            /// <param name="value">property name</param>
            public ConfigNodePropertyBooleanBuilder Name(string value)
            {
                _Name = value;
                return this;
            }

            /// <summary>
            /// Sets value for ConfigNodePropertyBoolean.Optional property.
            /// </summary>
            /// <param name="value">True if optional</param>
            public ConfigNodePropertyBooleanBuilder Optional(bool? value)
            {
                _Optional = value;
                return this;
            }

            /// <summary>
            /// Sets value for ConfigNodePropertyBoolean.IsSet property.
            /// </summary>
            /// <param name="value">True if property is set</param>
            public ConfigNodePropertyBooleanBuilder IsSet(bool? value)
            {
                _IsSet = value;
                return this;
            }

            /// <summary>
            /// Sets value for ConfigNodePropertyBoolean.Type property.
            /// </summary>
            /// <param name="value">Property type, 1&#x3D;String, 2&#x3D;Long, 3&#x3D;Integer, 7&#x3D;Float, 11&#x3D;Boolean, 12&#x3D;Secrets(String)</param>
            public ConfigNodePropertyBooleanBuilder Type(int? value)
            {
                _Type = value;
                return this;
            }

            /// <summary>
            /// Sets value for ConfigNodePropertyBoolean.Value property.
            /// </summary>
            /// <param name="value">Property value</param>
            public ConfigNodePropertyBooleanBuilder Value(bool? value)
            {
                _Value = value;
                return this;
            }

            /// <summary>
            /// Sets value for ConfigNodePropertyBoolean.Description property.
            /// </summary>
            /// <param name="value">Property description</param>
            public ConfigNodePropertyBooleanBuilder Description(string value)
            {
                _Description = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ConfigNodePropertyBoolean.
            /// </summary>
            /// <returns>ConfigNodePropertyBoolean</returns>
            public ConfigNodePropertyBoolean Build()
            {
                Validate();
                return new ConfigNodePropertyBoolean(
                    Name: _Name,
                    Optional: _Optional,
                    IsSet: _IsSet,
                    Type: _Type,
                    Value: _Value,
                    Description: _Description
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}