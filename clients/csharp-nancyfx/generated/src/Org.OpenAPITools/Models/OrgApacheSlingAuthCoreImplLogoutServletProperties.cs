using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingAuthCoreImplLogoutServletProperties
    /// </summary>
    public sealed class OrgApacheSlingAuthCoreImplLogoutServletProperties:  IEquatable<OrgApacheSlingAuthCoreImplLogoutServletProperties>
    { 
        /// <summary>
        /// SlingServletMethods
        /// </summary>
        public ConfigNodePropertyArray SlingServletMethods { get; private set; }

        /// <summary>
        /// SlingServletPaths
        /// </summary>
        public ConfigNodePropertyString SlingServletPaths { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheSlingAuthCoreImplLogoutServletProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingAuthCoreImplLogoutServletProperties()
        {
        }

        private OrgApacheSlingAuthCoreImplLogoutServletProperties(ConfigNodePropertyArray SlingServletMethods, ConfigNodePropertyString SlingServletPaths)
        {
            
            this.SlingServletMethods = SlingServletMethods;
            
            this.SlingServletPaths = SlingServletPaths;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingAuthCoreImplLogoutServletProperties.
        /// </summary>
        /// <returns>OrgApacheSlingAuthCoreImplLogoutServletPropertiesBuilder</returns>
        public static OrgApacheSlingAuthCoreImplLogoutServletPropertiesBuilder Builder()
        {
            return new OrgApacheSlingAuthCoreImplLogoutServletPropertiesBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingAuthCoreImplLogoutServletPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingAuthCoreImplLogoutServletPropertiesBuilder</returns>
        public OrgApacheSlingAuthCoreImplLogoutServletPropertiesBuilder With()
        {
            return Builder()
                .SlingServletMethods(SlingServletMethods)
                .SlingServletPaths(SlingServletPaths);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(OrgApacheSlingAuthCoreImplLogoutServletProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingAuthCoreImplLogoutServletProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingAuthCoreImplLogoutServletProperties</param>
        /// <param name="right">Compared (OrgApacheSlingAuthCoreImplLogoutServletProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingAuthCoreImplLogoutServletProperties left, OrgApacheSlingAuthCoreImplLogoutServletProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingAuthCoreImplLogoutServletProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingAuthCoreImplLogoutServletProperties</param>
        /// <param name="right">Compared (OrgApacheSlingAuthCoreImplLogoutServletProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingAuthCoreImplLogoutServletProperties left, OrgApacheSlingAuthCoreImplLogoutServletProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingAuthCoreImplLogoutServletProperties.
        /// </summary>
        public sealed class OrgApacheSlingAuthCoreImplLogoutServletPropertiesBuilder
        {
            private ConfigNodePropertyArray _SlingServletMethods;
            private ConfigNodePropertyString _SlingServletPaths;

            internal OrgApacheSlingAuthCoreImplLogoutServletPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingAuthCoreImplLogoutServletProperties.SlingServletMethods property.
            /// </summary>
            /// <param name="value">SlingServletMethods</param>
            public OrgApacheSlingAuthCoreImplLogoutServletPropertiesBuilder SlingServletMethods(ConfigNodePropertyArray value)
            {
                _SlingServletMethods = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingAuthCoreImplLogoutServletProperties.SlingServletPaths property.
            /// </summary>
            /// <param name="value">SlingServletPaths</param>
            public OrgApacheSlingAuthCoreImplLogoutServletPropertiesBuilder SlingServletPaths(ConfigNodePropertyString value)
            {
                _SlingServletPaths = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingAuthCoreImplLogoutServletProperties.
            /// </summary>
            /// <returns>OrgApacheSlingAuthCoreImplLogoutServletProperties</returns>
            public OrgApacheSlingAuthCoreImplLogoutServletProperties Build()
            {
                Validate();
                return new OrgApacheSlingAuthCoreImplLogoutServletProperties(
                    SlingServletMethods: _SlingServletMethods,
                    SlingServletPaths: _SlingServletPaths
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}