using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingSecurityImplContentDispositionFilterProperties
    /// </summary>
    public sealed class OrgApacheSlingSecurityImplContentDispositionFilterProperties:  IEquatable<OrgApacheSlingSecurityImplContentDispositionFilterProperties>
    { 
        /// <summary>
        /// SlingContentDispositionPaths
        /// </summary>
        public ConfigNodePropertyArray SlingContentDispositionPaths { get; private set; }

        /// <summary>
        /// SlingContentDispositionExcludedPaths
        /// </summary>
        public ConfigNodePropertyArray SlingContentDispositionExcludedPaths { get; private set; }

        /// <summary>
        /// SlingContentDispositionAllPaths
        /// </summary>
        public ConfigNodePropertyBoolean SlingContentDispositionAllPaths { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheSlingSecurityImplContentDispositionFilterProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingSecurityImplContentDispositionFilterProperties()
        {
        }

        private OrgApacheSlingSecurityImplContentDispositionFilterProperties(ConfigNodePropertyArray SlingContentDispositionPaths, ConfigNodePropertyArray SlingContentDispositionExcludedPaths, ConfigNodePropertyBoolean SlingContentDispositionAllPaths)
        {
            
            this.SlingContentDispositionPaths = SlingContentDispositionPaths;
            
            this.SlingContentDispositionExcludedPaths = SlingContentDispositionExcludedPaths;
            
            this.SlingContentDispositionAllPaths = SlingContentDispositionAllPaths;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingSecurityImplContentDispositionFilterProperties.
        /// </summary>
        /// <returns>OrgApacheSlingSecurityImplContentDispositionFilterPropertiesBuilder</returns>
        public static OrgApacheSlingSecurityImplContentDispositionFilterPropertiesBuilder Builder()
        {
            return new OrgApacheSlingSecurityImplContentDispositionFilterPropertiesBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingSecurityImplContentDispositionFilterPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingSecurityImplContentDispositionFilterPropertiesBuilder</returns>
        public OrgApacheSlingSecurityImplContentDispositionFilterPropertiesBuilder With()
        {
            return Builder()
                .SlingContentDispositionPaths(SlingContentDispositionPaths)
                .SlingContentDispositionExcludedPaths(SlingContentDispositionExcludedPaths)
                .SlingContentDispositionAllPaths(SlingContentDispositionAllPaths);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(OrgApacheSlingSecurityImplContentDispositionFilterProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingSecurityImplContentDispositionFilterProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingSecurityImplContentDispositionFilterProperties</param>
        /// <param name="right">Compared (OrgApacheSlingSecurityImplContentDispositionFilterProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingSecurityImplContentDispositionFilterProperties left, OrgApacheSlingSecurityImplContentDispositionFilterProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingSecurityImplContentDispositionFilterProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingSecurityImplContentDispositionFilterProperties</param>
        /// <param name="right">Compared (OrgApacheSlingSecurityImplContentDispositionFilterProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingSecurityImplContentDispositionFilterProperties left, OrgApacheSlingSecurityImplContentDispositionFilterProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingSecurityImplContentDispositionFilterProperties.
        /// </summary>
        public sealed class OrgApacheSlingSecurityImplContentDispositionFilterPropertiesBuilder
        {
            private ConfigNodePropertyArray _SlingContentDispositionPaths;
            private ConfigNodePropertyArray _SlingContentDispositionExcludedPaths;
            private ConfigNodePropertyBoolean _SlingContentDispositionAllPaths;

            internal OrgApacheSlingSecurityImplContentDispositionFilterPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingSecurityImplContentDispositionFilterProperties.SlingContentDispositionPaths property.
            /// </summary>
            /// <param name="value">SlingContentDispositionPaths</param>
            public OrgApacheSlingSecurityImplContentDispositionFilterPropertiesBuilder SlingContentDispositionPaths(ConfigNodePropertyArray value)
            {
                _SlingContentDispositionPaths = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingSecurityImplContentDispositionFilterProperties.SlingContentDispositionExcludedPaths property.
            /// </summary>
            /// <param name="value">SlingContentDispositionExcludedPaths</param>
            public OrgApacheSlingSecurityImplContentDispositionFilterPropertiesBuilder SlingContentDispositionExcludedPaths(ConfigNodePropertyArray value)
            {
                _SlingContentDispositionExcludedPaths = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingSecurityImplContentDispositionFilterProperties.SlingContentDispositionAllPaths property.
            /// </summary>
            /// <param name="value">SlingContentDispositionAllPaths</param>
            public OrgApacheSlingSecurityImplContentDispositionFilterPropertiesBuilder SlingContentDispositionAllPaths(ConfigNodePropertyBoolean value)
            {
                _SlingContentDispositionAllPaths = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingSecurityImplContentDispositionFilterProperties.
            /// </summary>
            /// <returns>OrgApacheSlingSecurityImplContentDispositionFilterProperties</returns>
            public OrgApacheSlingSecurityImplContentDispositionFilterProperties Build()
            {
                Validate();
                return new OrgApacheSlingSecurityImplContentDispositionFilterProperties(
                    SlingContentDispositionPaths: _SlingContentDispositionPaths,
                    SlingContentDispositionExcludedPaths: _SlingContentDispositionExcludedPaths,
                    SlingContentDispositionAllPaths: _SlingContentDispositionAllPaths
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}