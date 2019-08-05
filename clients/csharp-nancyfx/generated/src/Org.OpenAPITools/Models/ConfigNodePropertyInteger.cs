using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ConfigNodePropertyInteger
    /// </summary>
    public sealed class ConfigNodePropertyInteger:  IEquatable<ConfigNodePropertyInteger>
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
        public int? Value { get; private set; }

        /// <summary>
        /// Property description
        /// </summary>
        public string Description { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ConfigNodePropertyInteger.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ConfigNodePropertyInteger()
        {
        }

        private ConfigNodePropertyInteger(string Name, bool? Optional, bool? IsSet, int? Type, int? Value, string Description)
        {
            
            this.Name = Name;
            
            this.Optional = Optional;
            
            this.IsSet = IsSet;
            
            this.Type = Type;
            
            this.Value = Value;
            
            this.Description = Description;
            
        }

        /// <summary>
        /// Returns builder of ConfigNodePropertyInteger.
        /// </summary>
        /// <returns>ConfigNodePropertyIntegerBuilder</returns>
        public static ConfigNodePropertyIntegerBuilder Builder()
        {
            return new ConfigNodePropertyIntegerBuilder();
        }

        /// <summary>
        /// Returns ConfigNodePropertyIntegerBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ConfigNodePropertyIntegerBuilder</returns>
        public ConfigNodePropertyIntegerBuilder With()
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

        public bool Equals(ConfigNodePropertyInteger other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ConfigNodePropertyInteger.
        /// </summary>
        /// <param name="left">Compared (ConfigNodePropertyInteger</param>
        /// <param name="right">Compared (ConfigNodePropertyInteger</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ConfigNodePropertyInteger left, ConfigNodePropertyInteger right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ConfigNodePropertyInteger.
        /// </summary>
        /// <param name="left">Compared (ConfigNodePropertyInteger</param>
        /// <param name="right">Compared (ConfigNodePropertyInteger</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ConfigNodePropertyInteger left, ConfigNodePropertyInteger right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ConfigNodePropertyInteger.
        /// </summary>
        public sealed class ConfigNodePropertyIntegerBuilder
        {
            private string _Name;
            private bool? _Optional;
            private bool? _IsSet;
            private int? _Type;
            private int? _Value;
            private string _Description;

            internal ConfigNodePropertyIntegerBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ConfigNodePropertyInteger.Name property.
            /// </summary>
            /// <param name="value">property name</param>
            public ConfigNodePropertyIntegerBuilder Name(string value)
            {
                _Name = value;
                return this;
            }

            /// <summary>
            /// Sets value for ConfigNodePropertyInteger.Optional property.
            /// </summary>
            /// <param name="value">True if optional</param>
            public ConfigNodePropertyIntegerBuilder Optional(bool? value)
            {
                _Optional = value;
                return this;
            }

            /// <summary>
            /// Sets value for ConfigNodePropertyInteger.IsSet property.
            /// </summary>
            /// <param name="value">True if property is set</param>
            public ConfigNodePropertyIntegerBuilder IsSet(bool? value)
            {
                _IsSet = value;
                return this;
            }

            /// <summary>
            /// Sets value for ConfigNodePropertyInteger.Type property.
            /// </summary>
            /// <param name="value">Property type, 1&#x3D;String, 2&#x3D;Long, 3&#x3D;Integer, 7&#x3D;Float, 11&#x3D;Boolean, 12&#x3D;Secrets(String)</param>
            public ConfigNodePropertyIntegerBuilder Type(int? value)
            {
                _Type = value;
                return this;
            }

            /// <summary>
            /// Sets value for ConfigNodePropertyInteger.Value property.
            /// </summary>
            /// <param name="value">Property value</param>
            public ConfigNodePropertyIntegerBuilder Value(int? value)
            {
                _Value = value;
                return this;
            }

            /// <summary>
            /// Sets value for ConfigNodePropertyInteger.Description property.
            /// </summary>
            /// <param name="value">Property description</param>
            public ConfigNodePropertyIntegerBuilder Description(string value)
            {
                _Description = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ConfigNodePropertyInteger.
            /// </summary>
            /// <returns>ConfigNodePropertyInteger</returns>
            public ConfigNodePropertyInteger Build()
            {
                Validate();
                return new ConfigNodePropertyInteger(
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