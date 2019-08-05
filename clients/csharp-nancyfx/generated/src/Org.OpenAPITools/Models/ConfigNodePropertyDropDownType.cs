using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ConfigNodePropertyDropDownType
    /// </summary>
    public sealed class ConfigNodePropertyDropDownType:  IEquatable<ConfigNodePropertyDropDownType>
    { 
        /// <summary>
        /// Drop Down label
        /// </summary>
        public Object Labels { get; private set; }

        /// <summary>
        /// Drown Down value
        /// </summary>
        public Object Values { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ConfigNodePropertyDropDownType.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ConfigNodePropertyDropDownType()
        {
        }

        private ConfigNodePropertyDropDownType(Object Labels, Object Values)
        {
            
            this.Labels = Labels;
            
            this.Values = Values;
            
        }

        /// <summary>
        /// Returns builder of ConfigNodePropertyDropDownType.
        /// </summary>
        /// <returns>ConfigNodePropertyDropDownTypeBuilder</returns>
        public static ConfigNodePropertyDropDownTypeBuilder Builder()
        {
            return new ConfigNodePropertyDropDownTypeBuilder();
        }

        /// <summary>
        /// Returns ConfigNodePropertyDropDownTypeBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ConfigNodePropertyDropDownTypeBuilder</returns>
        public ConfigNodePropertyDropDownTypeBuilder With()
        {
            return Builder()
                .Labels(Labels)
                .Values(Values);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ConfigNodePropertyDropDownType other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ConfigNodePropertyDropDownType.
        /// </summary>
        /// <param name="left">Compared (ConfigNodePropertyDropDownType</param>
        /// <param name="right">Compared (ConfigNodePropertyDropDownType</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ConfigNodePropertyDropDownType left, ConfigNodePropertyDropDownType right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ConfigNodePropertyDropDownType.
        /// </summary>
        /// <param name="left">Compared (ConfigNodePropertyDropDownType</param>
        /// <param name="right">Compared (ConfigNodePropertyDropDownType</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ConfigNodePropertyDropDownType left, ConfigNodePropertyDropDownType right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ConfigNodePropertyDropDownType.
        /// </summary>
        public sealed class ConfigNodePropertyDropDownTypeBuilder
        {
            private Object _Labels;
            private Object _Values;

            internal ConfigNodePropertyDropDownTypeBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ConfigNodePropertyDropDownType.Labels property.
            /// </summary>
            /// <param name="value">Drop Down label</param>
            public ConfigNodePropertyDropDownTypeBuilder Labels(Object value)
            {
                _Labels = value;
                return this;
            }

            /// <summary>
            /// Sets value for ConfigNodePropertyDropDownType.Values property.
            /// </summary>
            /// <param name="value">Drown Down value</param>
            public ConfigNodePropertyDropDownTypeBuilder Values(Object value)
            {
                _Values = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ConfigNodePropertyDropDownType.
            /// </summary>
            /// <returns>ConfigNodePropertyDropDownType</returns>
            public ConfigNodePropertyDropDownType Build()
            {
                Validate();
                return new ConfigNodePropertyDropDownType(
                    Labels: _Labels,
                    Values: _Values
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}