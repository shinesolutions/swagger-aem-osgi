using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteSecurityUserUserPropertiesServiceProperties
    /// </summary>
    public sealed class ComAdobeGraniteSecurityUserUserPropertiesServiceProperties:  IEquatable<ComAdobeGraniteSecurityUserUserPropertiesServiceProperties>
    { 
        /// <summary>
        /// AdapterCondition
        /// </summary>
        public ConfigNodePropertyString AdapterCondition { get; private set; }

        /// <summary>
        /// GraniteUserpropertiesNodetypes
        /// </summary>
        public ConfigNodePropertyArray GraniteUserpropertiesNodetypes { get; private set; }

        /// <summary>
        /// GraniteUserpropertiesResourcetypes
        /// </summary>
        public ConfigNodePropertyArray GraniteUserpropertiesResourcetypes { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteSecurityUserUserPropertiesServiceProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteSecurityUserUserPropertiesServiceProperties()
        {
        }

        private ComAdobeGraniteSecurityUserUserPropertiesServiceProperties(ConfigNodePropertyString AdapterCondition, ConfigNodePropertyArray GraniteUserpropertiesNodetypes, ConfigNodePropertyArray GraniteUserpropertiesResourcetypes)
        {
            
            this.AdapterCondition = AdapterCondition;
            
            this.GraniteUserpropertiesNodetypes = GraniteUserpropertiesNodetypes;
            
            this.GraniteUserpropertiesResourcetypes = GraniteUserpropertiesResourcetypes;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteSecurityUserUserPropertiesServiceProperties.
        /// </summary>
        /// <returns>ComAdobeGraniteSecurityUserUserPropertiesServicePropertiesBuilder</returns>
        public static ComAdobeGraniteSecurityUserUserPropertiesServicePropertiesBuilder Builder()
        {
            return new ComAdobeGraniteSecurityUserUserPropertiesServicePropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteSecurityUserUserPropertiesServicePropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteSecurityUserUserPropertiesServicePropertiesBuilder</returns>
        public ComAdobeGraniteSecurityUserUserPropertiesServicePropertiesBuilder With()
        {
            return Builder()
                .AdapterCondition(AdapterCondition)
                .GraniteUserpropertiesNodetypes(GraniteUserpropertiesNodetypes)
                .GraniteUserpropertiesResourcetypes(GraniteUserpropertiesResourcetypes);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeGraniteSecurityUserUserPropertiesServiceProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteSecurityUserUserPropertiesServiceProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteSecurityUserUserPropertiesServiceProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteSecurityUserUserPropertiesServiceProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteSecurityUserUserPropertiesServiceProperties left, ComAdobeGraniteSecurityUserUserPropertiesServiceProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteSecurityUserUserPropertiesServiceProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteSecurityUserUserPropertiesServiceProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteSecurityUserUserPropertiesServiceProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteSecurityUserUserPropertiesServiceProperties left, ComAdobeGraniteSecurityUserUserPropertiesServiceProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteSecurityUserUserPropertiesServiceProperties.
        /// </summary>
        public sealed class ComAdobeGraniteSecurityUserUserPropertiesServicePropertiesBuilder
        {
            private ConfigNodePropertyString _AdapterCondition;
            private ConfigNodePropertyArray _GraniteUserpropertiesNodetypes;
            private ConfigNodePropertyArray _GraniteUserpropertiesResourcetypes;

            internal ComAdobeGraniteSecurityUserUserPropertiesServicePropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteSecurityUserUserPropertiesServiceProperties.AdapterCondition property.
            /// </summary>
            /// <param name="value">AdapterCondition</param>
            public ComAdobeGraniteSecurityUserUserPropertiesServicePropertiesBuilder AdapterCondition(ConfigNodePropertyString value)
            {
                _AdapterCondition = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteSecurityUserUserPropertiesServiceProperties.GraniteUserpropertiesNodetypes property.
            /// </summary>
            /// <param name="value">GraniteUserpropertiesNodetypes</param>
            public ComAdobeGraniteSecurityUserUserPropertiesServicePropertiesBuilder GraniteUserpropertiesNodetypes(ConfigNodePropertyArray value)
            {
                _GraniteUserpropertiesNodetypes = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteSecurityUserUserPropertiesServiceProperties.GraniteUserpropertiesResourcetypes property.
            /// </summary>
            /// <param name="value">GraniteUserpropertiesResourcetypes</param>
            public ComAdobeGraniteSecurityUserUserPropertiesServicePropertiesBuilder GraniteUserpropertiesResourcetypes(ConfigNodePropertyArray value)
            {
                _GraniteUserpropertiesResourcetypes = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteSecurityUserUserPropertiesServiceProperties.
            /// </summary>
            /// <returns>ComAdobeGraniteSecurityUserUserPropertiesServiceProperties</returns>
            public ComAdobeGraniteSecurityUserUserPropertiesServiceProperties Build()
            {
                Validate();
                return new ComAdobeGraniteSecurityUserUserPropertiesServiceProperties(
                    AdapterCondition: _AdapterCondition,
                    GraniteUserpropertiesNodetypes: _GraniteUserpropertiesNodetypes,
                    GraniteUserpropertiesResourcetypes: _GraniteUserpropertiesResourcetypes
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}