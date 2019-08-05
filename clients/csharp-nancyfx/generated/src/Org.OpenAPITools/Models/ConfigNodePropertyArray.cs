using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ConfigNodePropertyArray
    /// </summary>
    public sealed class ConfigNodePropertyArray:  IEquatable<ConfigNodePropertyArray>
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
        public List<string> Values { get; private set; }

        /// <summary>
        /// Property description
        /// </summary>
        public string Description { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ConfigNodePropertyArray.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ConfigNodePropertyArray()
        {
        }

        private ConfigNodePropertyArray(string Name, bool? Optional, bool? IsSet, int? Type, List<string> Values, string Description)
        {
            
            this.Name = Name;
            
            this.Optional = Optional;
            
            this.IsSet = IsSet;
            
            this.Type = Type;
            
            this.Values = Values;
            
            this.Description = Description;
            
        }

        /// <summary>
        /// Returns builder of ConfigNodePropertyArray.
        /// </summary>
        /// <returns>ConfigNodePropertyArrayBuilder</returns>
        public static ConfigNodePropertyArrayBuilder Builder()
        {
            return new ConfigNodePropertyArrayBuilder();
        }

        /// <summary>
        /// Returns ConfigNodePropertyArrayBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ConfigNodePropertyArrayBuilder</returns>
        public ConfigNodePropertyArrayBuilder With()
        {
            return Builder()
                .Name(Name)
                .Optional(Optional)
                .IsSet(IsSet)
                .Type(Type)
                .Values(Values)
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

        public bool Equals(ConfigNodePropertyArray other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ConfigNodePropertyArray.
        /// </summary>
        /// <param name="left">Compared (ConfigNodePropertyArray</param>
        /// <param name="right">Compared (ConfigNodePropertyArray</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ConfigNodePropertyArray left, ConfigNodePropertyArray right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ConfigNodePropertyArray.
        /// </summary>
        /// <param name="left">Compared (ConfigNodePropertyArray</param>
        /// <param name="right">Compared (ConfigNodePropertyArray</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ConfigNodePropertyArray left, ConfigNodePropertyArray right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ConfigNodePropertyArray.
        /// </summary>
        public sealed class ConfigNodePropertyArrayBuilder
        {
            private string _Name;
            private bool? _Optional;
            private bool? _IsSet;
            private int? _Type;
            private List<string> _Values;
            private string _Description;

            internal ConfigNodePropertyArrayBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ConfigNodePropertyArray.Name property.
            /// </summary>
            /// <param name="value">property name</param>
            public ConfigNodePropertyArrayBuilder Name(string value)
            {
                _Name = value;
                return this;
            }

            /// <summary>
            /// Sets value for ConfigNodePropertyArray.Optional property.
            /// </summary>
            /// <param name="value">True if optional</param>
            public ConfigNodePropertyArrayBuilder Optional(bool? value)
            {
                _Optional = value;
                return this;
            }

            /// <summary>
            /// Sets value for ConfigNodePropertyArray.IsSet property.
            /// </summary>
            /// <param name="value">True if property is set</param>
            public ConfigNodePropertyArrayBuilder IsSet(bool? value)
            {
                _IsSet = value;
                return this;
            }

            /// <summary>
            /// Sets value for ConfigNodePropertyArray.Type property.
            /// </summary>
            /// <param name="value">Property type, 1&#x3D;String, 2&#x3D;Long, 3&#x3D;Integer, 7&#x3D;Float, 11&#x3D;Boolean, 12&#x3D;Secrets(String)</param>
            public ConfigNodePropertyArrayBuilder Type(int? value)
            {
                _Type = value;
                return this;
            }

            /// <summary>
            /// Sets value for ConfigNodePropertyArray.Values property.
            /// </summary>
            /// <param name="value">Property value</param>
            public ConfigNodePropertyArrayBuilder Values(List<string> value)
            {
                _Values = value;
                return this;
            }

            /// <summary>
            /// Sets value for ConfigNodePropertyArray.Description property.
            /// </summary>
            /// <param name="value">Property description</param>
            public ConfigNodePropertyArrayBuilder Description(string value)
            {
                _Description = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ConfigNodePropertyArray.
            /// </summary>
            /// <returns>ConfigNodePropertyArray</returns>
            public ConfigNodePropertyArray Build()
            {
                Validate();
                return new ConfigNodePropertyArray(
                    Name: _Name,
                    Optional: _Optional,
                    IsSet: _IsSet,
                    Type: _Type,
                    Values: _Values,
                    Description: _Description
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}