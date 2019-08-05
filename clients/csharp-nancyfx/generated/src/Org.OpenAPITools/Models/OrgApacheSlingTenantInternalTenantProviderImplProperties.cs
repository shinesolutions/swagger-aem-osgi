using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingTenantInternalTenantProviderImplProperties
    /// </summary>
    public sealed class OrgApacheSlingTenantInternalTenantProviderImplProperties:  IEquatable<OrgApacheSlingTenantInternalTenantProviderImplProperties>
    { 
        /// <summary>
        /// TenantRoot
        /// </summary>
        public ConfigNodePropertyString TenantRoot { get; private set; }

        /// <summary>
        /// TenantPathMatcher
        /// </summary>
        public ConfigNodePropertyArray TenantPathMatcher { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheSlingTenantInternalTenantProviderImplProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingTenantInternalTenantProviderImplProperties()
        {
        }

        private OrgApacheSlingTenantInternalTenantProviderImplProperties(ConfigNodePropertyString TenantRoot, ConfigNodePropertyArray TenantPathMatcher)
        {
            
            this.TenantRoot = TenantRoot;
            
            this.TenantPathMatcher = TenantPathMatcher;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingTenantInternalTenantProviderImplProperties.
        /// </summary>
        /// <returns>OrgApacheSlingTenantInternalTenantProviderImplPropertiesBuilder</returns>
        public static OrgApacheSlingTenantInternalTenantProviderImplPropertiesBuilder Builder()
        {
            return new OrgApacheSlingTenantInternalTenantProviderImplPropertiesBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingTenantInternalTenantProviderImplPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingTenantInternalTenantProviderImplPropertiesBuilder</returns>
        public OrgApacheSlingTenantInternalTenantProviderImplPropertiesBuilder With()
        {
            return Builder()
                .TenantRoot(TenantRoot)
                .TenantPathMatcher(TenantPathMatcher);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(OrgApacheSlingTenantInternalTenantProviderImplProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingTenantInternalTenantProviderImplProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingTenantInternalTenantProviderImplProperties</param>
        /// <param name="right">Compared (OrgApacheSlingTenantInternalTenantProviderImplProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingTenantInternalTenantProviderImplProperties left, OrgApacheSlingTenantInternalTenantProviderImplProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingTenantInternalTenantProviderImplProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingTenantInternalTenantProviderImplProperties</param>
        /// <param name="right">Compared (OrgApacheSlingTenantInternalTenantProviderImplProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingTenantInternalTenantProviderImplProperties left, OrgApacheSlingTenantInternalTenantProviderImplProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingTenantInternalTenantProviderImplProperties.
        /// </summary>
        public sealed class OrgApacheSlingTenantInternalTenantProviderImplPropertiesBuilder
        {
            private ConfigNodePropertyString _TenantRoot;
            private ConfigNodePropertyArray _TenantPathMatcher;

            internal OrgApacheSlingTenantInternalTenantProviderImplPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingTenantInternalTenantProviderImplProperties.TenantRoot property.
            /// </summary>
            /// <param name="value">TenantRoot</param>
            public OrgApacheSlingTenantInternalTenantProviderImplPropertiesBuilder TenantRoot(ConfigNodePropertyString value)
            {
                _TenantRoot = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingTenantInternalTenantProviderImplProperties.TenantPathMatcher property.
            /// </summary>
            /// <param name="value">TenantPathMatcher</param>
            public OrgApacheSlingTenantInternalTenantProviderImplPropertiesBuilder TenantPathMatcher(ConfigNodePropertyArray value)
            {
                _TenantPathMatcher = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingTenantInternalTenantProviderImplProperties.
            /// </summary>
            /// <returns>OrgApacheSlingTenantInternalTenantProviderImplProperties</returns>
            public OrgApacheSlingTenantInternalTenantProviderImplProperties Build()
            {
                Validate();
                return new OrgApacheSlingTenantInternalTenantProviderImplProperties(
                    TenantRoot: _TenantRoot,
                    TenantPathMatcher: _TenantPathMatcher
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}