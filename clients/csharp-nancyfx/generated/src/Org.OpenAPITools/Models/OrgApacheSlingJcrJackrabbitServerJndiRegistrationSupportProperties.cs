using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportProperties
    /// </summary>
    public sealed class OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportProperties:  IEquatable<OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportProperties>
    { 
        /// <summary>
        /// JavaNamingFactoryInitial
        /// </summary>
        public ConfigNodePropertyString JavaNamingFactoryInitial { get; private set; }

        /// <summary>
        /// JavaNamingProviderUrl
        /// </summary>
        public ConfigNodePropertyString JavaNamingProviderUrl { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportProperties()
        {
        }

        private OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportProperties(ConfigNodePropertyString JavaNamingFactoryInitial, ConfigNodePropertyString JavaNamingProviderUrl)
        {
            
            this.JavaNamingFactoryInitial = JavaNamingFactoryInitial;
            
            this.JavaNamingProviderUrl = JavaNamingProviderUrl;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportProperties.
        /// </summary>
        /// <returns>OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportPropertiesBuilder</returns>
        public static OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportPropertiesBuilder Builder()
        {
            return new OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportPropertiesBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportPropertiesBuilder</returns>
        public OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportPropertiesBuilder With()
        {
            return Builder()
                .JavaNamingFactoryInitial(JavaNamingFactoryInitial)
                .JavaNamingProviderUrl(JavaNamingProviderUrl);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportProperties</param>
        /// <param name="right">Compared (OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportProperties left, OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportProperties</param>
        /// <param name="right">Compared (OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportProperties left, OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportProperties.
        /// </summary>
        public sealed class OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportPropertiesBuilder
        {
            private ConfigNodePropertyString _JavaNamingFactoryInitial;
            private ConfigNodePropertyString _JavaNamingProviderUrl;

            internal OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportProperties.JavaNamingFactoryInitial property.
            /// </summary>
            /// <param name="value">JavaNamingFactoryInitial</param>
            public OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportPropertiesBuilder JavaNamingFactoryInitial(ConfigNodePropertyString value)
            {
                _JavaNamingFactoryInitial = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportProperties.JavaNamingProviderUrl property.
            /// </summary>
            /// <param name="value">JavaNamingProviderUrl</param>
            public OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportPropertiesBuilder JavaNamingProviderUrl(ConfigNodePropertyString value)
            {
                _JavaNamingProviderUrl = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportProperties.
            /// </summary>
            /// <returns>OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportProperties</returns>
            public OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportProperties Build()
            {
                Validate();
                return new OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportProperties(
                    JavaNamingFactoryInitial: _JavaNamingFactoryInitial,
                    JavaNamingProviderUrl: _JavaNamingProviderUrl
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}