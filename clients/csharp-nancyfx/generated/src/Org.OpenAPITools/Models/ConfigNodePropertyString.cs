using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ConfigNodePropertyString
    /// </summary>
    public sealed class ConfigNodePropertyString:  IEquatable<ConfigNodePropertyString>
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
        public string Value { get; private set; }

        /// <summary>
        /// Property description
        /// </summary>
        public string Description { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ConfigNodePropertyString.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ConfigNodePropertyString()
        {
        }

        private ConfigNodePropertyString(string Name, bool? Optional, bool? IsSet, int? Type, string Value, string Description)
        {
            
            this.Name = Name;
            
            this.Optional = Optional;
            
            this.IsSet = IsSet;
            
            this.Type = Type;
            
            this.Value = Value;
            
            this.Description = Description;
            
        }

        /// <summary>
        /// Returns builder of ConfigNodePropertyString.
        /// </summary>
        /// <returns>ConfigNodePropertyStringBuilder</returns>
        public static ConfigNodePropertyStringBuilder Builder()
        {
            return new ConfigNodePropertyStringBuilder();
        }

        /// <summary>
        /// Returns ConfigNodePropertyStringBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ConfigNodePropertyStringBuilder</returns>
        public ConfigNodePropertyStringBuilder With()
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

        public bool Equals(ConfigNodePropertyString other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ConfigNodePropertyString.
        /// </summary>
        /// <param name="left">Compared (ConfigNodePropertyString</param>
        /// <param name="right">Compared (ConfigNodePropertyString</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ConfigNodePropertyString left, ConfigNodePropertyString right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ConfigNodePropertyString.
        /// </summary>
        /// <param name="left">Compared (ConfigNodePropertyString</param>
        /// <param name="right">Compared (ConfigNodePropertyString</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ConfigNodePropertyString left, ConfigNodePropertyString right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ConfigNodePropertyString.
        /// </summary>
        public sealed class ConfigNodePropertyStringBuilder
        {
            private string _Name;
            private bool? _Optional;
            private bool? _IsSet;
            private int? _Type;
            private string _Value;
            private string _Description;

            internal ConfigNodePropertyStringBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ConfigNodePropertyString.Name property.
            /// </summary>
            /// <param name="value">property name</param>
            public ConfigNodePropertyStringBuilder Name(string value)
            {
                _Name = value;
                return this;
            }

            /// <summary>
            /// Sets value for ConfigNodePropertyString.Optional property.
            /// </summary>
            /// <param name="value">True if optional</param>
            public ConfigNodePropertyStringBuilder Optional(bool? value)
            {
                _Optional = value;
                return this;
            }

            /// <summary>
            /// Sets value for ConfigNodePropertyString.IsSet property.
            /// </summary>
            /// <param name="value">True if property is set</param>
            public ConfigNodePropertyStringBuilder IsSet(bool? value)
            {
                _IsSet = value;
                return this;
            }

            /// <summary>
            /// Sets value for ConfigNodePropertyString.Type property.
            /// </summary>
            /// <param name="value">Property type, 1&#x3D;String, 2&#x3D;Long, 3&#x3D;Integer, 7&#x3D;Float, 11&#x3D;Boolean, 12&#x3D;Secrets(String)</param>
            public ConfigNodePropertyStringBuilder Type(int? value)
            {
                _Type = value;
                return this;
            }

            /// <summary>
            /// Sets value for ConfigNodePropertyString.Value property.
            /// </summary>
            /// <param name="value">Property value</param>
            public ConfigNodePropertyStringBuilder Value(string value)
            {
                _Value = value;
                return this;
            }

            /// <summary>
            /// Sets value for ConfigNodePropertyString.Description property.
            /// </summary>
            /// <param name="value">Property description</param>
            public ConfigNodePropertyStringBuilder Description(string value)
            {
                _Description = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ConfigNodePropertyString.
            /// </summary>
            /// <returns>ConfigNodePropertyString</returns>
            public ConfigNodePropertyString Build()
            {
                Validate();
                return new ConfigNodePropertyString(
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