using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingJmxProviderImplJMXResourceProviderProperties
    /// </summary>
    public sealed class OrgApacheSlingJmxProviderImplJMXResourceProviderProperties:  IEquatable<OrgApacheSlingJmxProviderImplJMXResourceProviderProperties>
    { 
        /// <summary>
        /// ProviderRoots
        /// </summary>
        public ConfigNodePropertyString ProviderRoots { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheSlingJmxProviderImplJMXResourceProviderProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingJmxProviderImplJMXResourceProviderProperties()
        {
        }

        private OrgApacheSlingJmxProviderImplJMXResourceProviderProperties(ConfigNodePropertyString ProviderRoots)
        {
            
            this.ProviderRoots = ProviderRoots;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingJmxProviderImplJMXResourceProviderProperties.
        /// </summary>
        /// <returns>OrgApacheSlingJmxProviderImplJMXResourceProviderPropertiesBuilder</returns>
        public static OrgApacheSlingJmxProviderImplJMXResourceProviderPropertiesBuilder Builder()
        {
            return new OrgApacheSlingJmxProviderImplJMXResourceProviderPropertiesBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingJmxProviderImplJMXResourceProviderPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingJmxProviderImplJMXResourceProviderPropertiesBuilder</returns>
        public OrgApacheSlingJmxProviderImplJMXResourceProviderPropertiesBuilder With()
        {
            return Builder()
                .ProviderRoots(ProviderRoots);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(OrgApacheSlingJmxProviderImplJMXResourceProviderProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingJmxProviderImplJMXResourceProviderProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingJmxProviderImplJMXResourceProviderProperties</param>
        /// <param name="right">Compared (OrgApacheSlingJmxProviderImplJMXResourceProviderProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingJmxProviderImplJMXResourceProviderProperties left, OrgApacheSlingJmxProviderImplJMXResourceProviderProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingJmxProviderImplJMXResourceProviderProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingJmxProviderImplJMXResourceProviderProperties</param>
        /// <param name="right">Compared (OrgApacheSlingJmxProviderImplJMXResourceProviderProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingJmxProviderImplJMXResourceProviderProperties left, OrgApacheSlingJmxProviderImplJMXResourceProviderProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingJmxProviderImplJMXResourceProviderProperties.
        /// </summary>
        public sealed class OrgApacheSlingJmxProviderImplJMXResourceProviderPropertiesBuilder
        {
            private ConfigNodePropertyString _ProviderRoots;

            internal OrgApacheSlingJmxProviderImplJMXResourceProviderPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingJmxProviderImplJMXResourceProviderProperties.ProviderRoots property.
            /// </summary>
            /// <param name="value">ProviderRoots</param>
            public OrgApacheSlingJmxProviderImplJMXResourceProviderPropertiesBuilder ProviderRoots(ConfigNodePropertyString value)
            {
                _ProviderRoots = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingJmxProviderImplJMXResourceProviderProperties.
            /// </summary>
            /// <returns>OrgApacheSlingJmxProviderImplJMXResourceProviderProperties</returns>
            public OrgApacheSlingJmxProviderImplJMXResourceProviderProperties Build()
            {
                Validate();
                return new OrgApacheSlingJmxProviderImplJMXResourceProviderProperties(
                    ProviderRoots: _ProviderRoots
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}