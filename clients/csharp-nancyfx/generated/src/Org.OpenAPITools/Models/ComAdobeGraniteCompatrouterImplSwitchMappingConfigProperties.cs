using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteCompatrouterImplSwitchMappingConfigProperties
    /// </summary>
    public sealed class ComAdobeGraniteCompatrouterImplSwitchMappingConfigProperties:  IEquatable<ComAdobeGraniteCompatrouterImplSwitchMappingConfigProperties>
    { 
        /// <summary>
        /// Group
        /// </summary>
        public ConfigNodePropertyString Group { get; private set; }

        /// <summary>
        /// Ids
        /// </summary>
        public ConfigNodePropertyArray Ids { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteCompatrouterImplSwitchMappingConfigProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteCompatrouterImplSwitchMappingConfigProperties()
        {
        }

        private ComAdobeGraniteCompatrouterImplSwitchMappingConfigProperties(ConfigNodePropertyString Group, ConfigNodePropertyArray Ids)
        {
            
            this.Group = Group;
            
            this.Ids = Ids;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteCompatrouterImplSwitchMappingConfigProperties.
        /// </summary>
        /// <returns>ComAdobeGraniteCompatrouterImplSwitchMappingConfigPropertiesBuilder</returns>
        public static ComAdobeGraniteCompatrouterImplSwitchMappingConfigPropertiesBuilder Builder()
        {
            return new ComAdobeGraniteCompatrouterImplSwitchMappingConfigPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteCompatrouterImplSwitchMappingConfigPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteCompatrouterImplSwitchMappingConfigPropertiesBuilder</returns>
        public ComAdobeGraniteCompatrouterImplSwitchMappingConfigPropertiesBuilder With()
        {
            return Builder()
                .Group(Group)
                .Ids(Ids);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeGraniteCompatrouterImplSwitchMappingConfigProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteCompatrouterImplSwitchMappingConfigProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteCompatrouterImplSwitchMappingConfigProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteCompatrouterImplSwitchMappingConfigProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteCompatrouterImplSwitchMappingConfigProperties left, ComAdobeGraniteCompatrouterImplSwitchMappingConfigProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteCompatrouterImplSwitchMappingConfigProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteCompatrouterImplSwitchMappingConfigProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteCompatrouterImplSwitchMappingConfigProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteCompatrouterImplSwitchMappingConfigProperties left, ComAdobeGraniteCompatrouterImplSwitchMappingConfigProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteCompatrouterImplSwitchMappingConfigProperties.
        /// </summary>
        public sealed class ComAdobeGraniteCompatrouterImplSwitchMappingConfigPropertiesBuilder
        {
            private ConfigNodePropertyString _Group;
            private ConfigNodePropertyArray _Ids;

            internal ComAdobeGraniteCompatrouterImplSwitchMappingConfigPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteCompatrouterImplSwitchMappingConfigProperties.Group property.
            /// </summary>
            /// <param name="value">Group</param>
            public ComAdobeGraniteCompatrouterImplSwitchMappingConfigPropertiesBuilder Group(ConfigNodePropertyString value)
            {
                _Group = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteCompatrouterImplSwitchMappingConfigProperties.Ids property.
            /// </summary>
            /// <param name="value">Ids</param>
            public ComAdobeGraniteCompatrouterImplSwitchMappingConfigPropertiesBuilder Ids(ConfigNodePropertyArray value)
            {
                _Ids = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteCompatrouterImplSwitchMappingConfigProperties.
            /// </summary>
            /// <returns>ComAdobeGraniteCompatrouterImplSwitchMappingConfigProperties</returns>
            public ComAdobeGraniteCompatrouterImplSwitchMappingConfigProperties Build()
            {
                Validate();
                return new ComAdobeGraniteCompatrouterImplSwitchMappingConfigProperties(
                    Group: _Group,
                    Ids: _Ids
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}