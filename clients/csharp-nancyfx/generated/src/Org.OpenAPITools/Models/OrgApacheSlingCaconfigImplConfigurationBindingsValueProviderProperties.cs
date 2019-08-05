using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingCaconfigImplConfigurationBindingsValueProviderProperties
    /// </summary>
    public sealed class OrgApacheSlingCaconfigImplConfigurationBindingsValueProviderProperties:  IEquatable<OrgApacheSlingCaconfigImplConfigurationBindingsValueProviderProperties>
    { 
        /// <summary>
        /// Enabled
        /// </summary>
        public ConfigNodePropertyBoolean Enabled { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheSlingCaconfigImplConfigurationBindingsValueProviderProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingCaconfigImplConfigurationBindingsValueProviderProperties()
        {
        }

        private OrgApacheSlingCaconfigImplConfigurationBindingsValueProviderProperties(ConfigNodePropertyBoolean Enabled)
        {
            
            this.Enabled = Enabled;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingCaconfigImplConfigurationBindingsValueProviderProperties.
        /// </summary>
        /// <returns>OrgApacheSlingCaconfigImplConfigurationBindingsValueProviderPropertiesBuilder</returns>
        public static OrgApacheSlingCaconfigImplConfigurationBindingsValueProviderPropertiesBuilder Builder()
        {
            return new OrgApacheSlingCaconfigImplConfigurationBindingsValueProviderPropertiesBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingCaconfigImplConfigurationBindingsValueProviderPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingCaconfigImplConfigurationBindingsValueProviderPropertiesBuilder</returns>
        public OrgApacheSlingCaconfigImplConfigurationBindingsValueProviderPropertiesBuilder With()
        {
            return Builder()
                .Enabled(Enabled);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(OrgApacheSlingCaconfigImplConfigurationBindingsValueProviderProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingCaconfigImplConfigurationBindingsValueProviderProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingCaconfigImplConfigurationBindingsValueProviderProperties</param>
        /// <param name="right">Compared (OrgApacheSlingCaconfigImplConfigurationBindingsValueProviderProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingCaconfigImplConfigurationBindingsValueProviderProperties left, OrgApacheSlingCaconfigImplConfigurationBindingsValueProviderProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingCaconfigImplConfigurationBindingsValueProviderProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingCaconfigImplConfigurationBindingsValueProviderProperties</param>
        /// <param name="right">Compared (OrgApacheSlingCaconfigImplConfigurationBindingsValueProviderProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingCaconfigImplConfigurationBindingsValueProviderProperties left, OrgApacheSlingCaconfigImplConfigurationBindingsValueProviderProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingCaconfigImplConfigurationBindingsValueProviderProperties.
        /// </summary>
        public sealed class OrgApacheSlingCaconfigImplConfigurationBindingsValueProviderPropertiesBuilder
        {
            private ConfigNodePropertyBoolean _Enabled;

            internal OrgApacheSlingCaconfigImplConfigurationBindingsValueProviderPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingCaconfigImplConfigurationBindingsValueProviderProperties.Enabled property.
            /// </summary>
            /// <param name="value">Enabled</param>
            public OrgApacheSlingCaconfigImplConfigurationBindingsValueProviderPropertiesBuilder Enabled(ConfigNodePropertyBoolean value)
            {
                _Enabled = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingCaconfigImplConfigurationBindingsValueProviderProperties.
            /// </summary>
            /// <returns>OrgApacheSlingCaconfigImplConfigurationBindingsValueProviderProperties</returns>
            public OrgApacheSlingCaconfigImplConfigurationBindingsValueProviderProperties Build()
            {
                Validate();
                return new OrgApacheSlingCaconfigImplConfigurationBindingsValueProviderProperties(
                    Enabled: _Enabled
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}