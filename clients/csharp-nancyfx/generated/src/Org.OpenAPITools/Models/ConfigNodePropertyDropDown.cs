using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ConfigNodePropertyDropDown
    /// </summary>
    public sealed class ConfigNodePropertyDropDown:  IEquatable<ConfigNodePropertyDropDown>
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
        /// Type
        /// </summary>
        public ConfigNodePropertyDropDownType Type { get; private set; }

        /// <summary>
        /// Property value
        /// </summary>
        public Object Value { get; private set; }

        /// <summary>
        /// Property description
        /// </summary>
        public string Description { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ConfigNodePropertyDropDown.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ConfigNodePropertyDropDown()
        {
        }

        private ConfigNodePropertyDropDown(string Name, bool? Optional, bool? IsSet, ConfigNodePropertyDropDownType Type, Object Value, string Description)
        {
            
            this.Name = Name;
            
            this.Optional = Optional;
            
            this.IsSet = IsSet;
            
            this.Type = Type;
            
            this.Value = Value;
            
            this.Description = Description;
            
        }

        /// <summary>
        /// Returns builder of ConfigNodePropertyDropDown.
        /// </summary>
        /// <returns>ConfigNodePropertyDropDownBuilder</returns>
        public static ConfigNodePropertyDropDownBuilder Builder()
        {
            return new ConfigNodePropertyDropDownBuilder();
        }

        /// <summary>
        /// Returns ConfigNodePropertyDropDownBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ConfigNodePropertyDropDownBuilder</returns>
        public ConfigNodePropertyDropDownBuilder With()
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

        public bool Equals(ConfigNodePropertyDropDown other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ConfigNodePropertyDropDown.
        /// </summary>
        /// <param name="left">Compared (ConfigNodePropertyDropDown</param>
        /// <param name="right">Compared (ConfigNodePropertyDropDown</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ConfigNodePropertyDropDown left, ConfigNodePropertyDropDown right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ConfigNodePropertyDropDown.
        /// </summary>
        /// <param name="left">Compared (ConfigNodePropertyDropDown</param>
        /// <param name="right">Compared (ConfigNodePropertyDropDown</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ConfigNodePropertyDropDown left, ConfigNodePropertyDropDown right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ConfigNodePropertyDropDown.
        /// </summary>
        public sealed class ConfigNodePropertyDropDownBuilder
        {
            private string _Name;
            private bool? _Optional;
            private bool? _IsSet;
            private ConfigNodePropertyDropDownType _Type;
            private Object _Value;
            private string _Description;

            internal ConfigNodePropertyDropDownBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ConfigNodePropertyDropDown.Name property.
            /// </summary>
            /// <param name="value">property name</param>
            public ConfigNodePropertyDropDownBuilder Name(string value)
            {
                _Name = value;
                return this;
            }

            /// <summary>
            /// Sets value for ConfigNodePropertyDropDown.Optional property.
            /// </summary>
            /// <param name="value">True if optional</param>
            public ConfigNodePropertyDropDownBuilder Optional(bool? value)
            {
                _Optional = value;
                return this;
            }

            /// <summary>
            /// Sets value for ConfigNodePropertyDropDown.IsSet property.
            /// </summary>
            /// <param name="value">True if property is set</param>
            public ConfigNodePropertyDropDownBuilder IsSet(bool? value)
            {
                _IsSet = value;
                return this;
            }

            /// <summary>
            /// Sets value for ConfigNodePropertyDropDown.Type property.
            /// </summary>
            /// <param name="value">Type</param>
            public ConfigNodePropertyDropDownBuilder Type(ConfigNodePropertyDropDownType value)
            {
                _Type = value;
                return this;
            }

            /// <summary>
            /// Sets value for ConfigNodePropertyDropDown.Value property.
            /// </summary>
            /// <param name="value">Property value</param>
            public ConfigNodePropertyDropDownBuilder Value(Object value)
            {
                _Value = value;
                return this;
            }

            /// <summary>
            /// Sets value for ConfigNodePropertyDropDown.Description property.
            /// </summary>
            /// <param name="value">Property description</param>
            public ConfigNodePropertyDropDownBuilder Description(string value)
            {
                _Description = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ConfigNodePropertyDropDown.
            /// </summary>
            /// <returns>ConfigNodePropertyDropDown</returns>
            public ConfigNodePropertyDropDown Build()
            {
                Validate();
                return new ConfigNodePropertyDropDown(
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