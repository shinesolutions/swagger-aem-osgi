using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ConfigNodePropertyFloat
    /// </summary>
    public sealed class ConfigNodePropertyFloat:  IEquatable<ConfigNodePropertyFloat>
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
        public decimal? Value { get; private set; }

        /// <summary>
        /// Property description
        /// </summary>
        public string Description { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ConfigNodePropertyFloat.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ConfigNodePropertyFloat()
        {
        }

        private ConfigNodePropertyFloat(string Name, bool? Optional, bool? IsSet, int? Type, decimal? Value, string Description)
        {
            
            this.Name = Name;
            
            this.Optional = Optional;
            
            this.IsSet = IsSet;
            
            this.Type = Type;
            
            this.Value = Value;
            
            this.Description = Description;
            
        }

        /// <summary>
        /// Returns builder of ConfigNodePropertyFloat.
        /// </summary>
        /// <returns>ConfigNodePropertyFloatBuilder</returns>
        public static ConfigNodePropertyFloatBuilder Builder()
        {
            return new ConfigNodePropertyFloatBuilder();
        }

        /// <summary>
        /// Returns ConfigNodePropertyFloatBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ConfigNodePropertyFloatBuilder</returns>
        public ConfigNodePropertyFloatBuilder With()
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

        public bool Equals(ConfigNodePropertyFloat other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ConfigNodePropertyFloat.
        /// </summary>
        /// <param name="left">Compared (ConfigNodePropertyFloat</param>
        /// <param name="right">Compared (ConfigNodePropertyFloat</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ConfigNodePropertyFloat left, ConfigNodePropertyFloat right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ConfigNodePropertyFloat.
        /// </summary>
        /// <param name="left">Compared (ConfigNodePropertyFloat</param>
        /// <param name="right">Compared (ConfigNodePropertyFloat</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ConfigNodePropertyFloat left, ConfigNodePropertyFloat right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ConfigNodePropertyFloat.
        /// </summary>
        public sealed class ConfigNodePropertyFloatBuilder
        {
            private string _Name;
            private bool? _Optional;
            private bool? _IsSet;
            private int? _Type;
            private decimal? _Value;
            private string _Description;

            internal ConfigNodePropertyFloatBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ConfigNodePropertyFloat.Name property.
            /// </summary>
            /// <param name="value">property name</param>
            public ConfigNodePropertyFloatBuilder Name(string value)
            {
                _Name = value;
                return this;
            }

            /// <summary>
            /// Sets value for ConfigNodePropertyFloat.Optional property.
            /// </summary>
            /// <param name="value">True if optional</param>
            public ConfigNodePropertyFloatBuilder Optional(bool? value)
            {
                _Optional = value;
                return this;
            }

            /// <summary>
            /// Sets value for ConfigNodePropertyFloat.IsSet property.
            /// </summary>
            /// <param name="value">True if property is set</param>
            public ConfigNodePropertyFloatBuilder IsSet(bool? value)
            {
                _IsSet = value;
                return this;
            }

            /// <summary>
            /// Sets value for ConfigNodePropertyFloat.Type property.
            /// </summary>
            /// <param name="value">Property type, 1&#x3D;String, 2&#x3D;Long, 3&#x3D;Integer, 7&#x3D;Float, 11&#x3D;Boolean, 12&#x3D;Secrets(String)</param>
            public ConfigNodePropertyFloatBuilder Type(int? value)
            {
                _Type = value;
                return this;
            }

            /// <summary>
            /// Sets value for ConfigNodePropertyFloat.Value property.
            /// </summary>
            /// <param name="value">Property value</param>
            public ConfigNodePropertyFloatBuilder Value(decimal? value)
            {
                _Value = value;
                return this;
            }

            /// <summary>
            /// Sets value for ConfigNodePropertyFloat.Description property.
            /// </summary>
            /// <param name="value">Property description</param>
            public ConfigNodePropertyFloatBuilder Description(string value)
            {
                _Description = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ConfigNodePropertyFloat.
            /// </summary>
            /// <returns>ConfigNodePropertyFloat</returns>
            public ConfigNodePropertyFloat Build()
            {
                Validate();
                return new ConfigNodePropertyFloat(
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