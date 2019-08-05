using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingServletsGetImplVersionVersionInfoServletProperties
    /// </summary>
    public sealed class OrgApacheSlingServletsGetImplVersionVersionInfoServletProperties:  IEquatable<OrgApacheSlingServletsGetImplVersionVersionInfoServletProperties>
    { 
        /// <summary>
        /// SlingServletSelectors
        /// </summary>
        public ConfigNodePropertyArray SlingServletSelectors { get; private set; }

        /// <summary>
        /// EcmaSuport
        /// </summary>
        public ConfigNodePropertyBoolean EcmaSuport { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheSlingServletsGetImplVersionVersionInfoServletProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingServletsGetImplVersionVersionInfoServletProperties()
        {
        }

        private OrgApacheSlingServletsGetImplVersionVersionInfoServletProperties(ConfigNodePropertyArray SlingServletSelectors, ConfigNodePropertyBoolean EcmaSuport)
        {
            
            this.SlingServletSelectors = SlingServletSelectors;
            
            this.EcmaSuport = EcmaSuport;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingServletsGetImplVersionVersionInfoServletProperties.
        /// </summary>
        /// <returns>OrgApacheSlingServletsGetImplVersionVersionInfoServletPropertiesBuilder</returns>
        public static OrgApacheSlingServletsGetImplVersionVersionInfoServletPropertiesBuilder Builder()
        {
            return new OrgApacheSlingServletsGetImplVersionVersionInfoServletPropertiesBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingServletsGetImplVersionVersionInfoServletPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingServletsGetImplVersionVersionInfoServletPropertiesBuilder</returns>
        public OrgApacheSlingServletsGetImplVersionVersionInfoServletPropertiesBuilder With()
        {
            return Builder()
                .SlingServletSelectors(SlingServletSelectors)
                .EcmaSuport(EcmaSuport);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(OrgApacheSlingServletsGetImplVersionVersionInfoServletProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingServletsGetImplVersionVersionInfoServletProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingServletsGetImplVersionVersionInfoServletProperties</param>
        /// <param name="right">Compared (OrgApacheSlingServletsGetImplVersionVersionInfoServletProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingServletsGetImplVersionVersionInfoServletProperties left, OrgApacheSlingServletsGetImplVersionVersionInfoServletProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingServletsGetImplVersionVersionInfoServletProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingServletsGetImplVersionVersionInfoServletProperties</param>
        /// <param name="right">Compared (OrgApacheSlingServletsGetImplVersionVersionInfoServletProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingServletsGetImplVersionVersionInfoServletProperties left, OrgApacheSlingServletsGetImplVersionVersionInfoServletProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingServletsGetImplVersionVersionInfoServletProperties.
        /// </summary>
        public sealed class OrgApacheSlingServletsGetImplVersionVersionInfoServletPropertiesBuilder
        {
            private ConfigNodePropertyArray _SlingServletSelectors;
            private ConfigNodePropertyBoolean _EcmaSuport;

            internal OrgApacheSlingServletsGetImplVersionVersionInfoServletPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingServletsGetImplVersionVersionInfoServletProperties.SlingServletSelectors property.
            /// </summary>
            /// <param name="value">SlingServletSelectors</param>
            public OrgApacheSlingServletsGetImplVersionVersionInfoServletPropertiesBuilder SlingServletSelectors(ConfigNodePropertyArray value)
            {
                _SlingServletSelectors = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingServletsGetImplVersionVersionInfoServletProperties.EcmaSuport property.
            /// </summary>
            /// <param name="value">EcmaSuport</param>
            public OrgApacheSlingServletsGetImplVersionVersionInfoServletPropertiesBuilder EcmaSuport(ConfigNodePropertyBoolean value)
            {
                _EcmaSuport = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingServletsGetImplVersionVersionInfoServletProperties.
            /// </summary>
            /// <returns>OrgApacheSlingServletsGetImplVersionVersionInfoServletProperties</returns>
            public OrgApacheSlingServletsGetImplVersionVersionInfoServletProperties Build()
            {
                Validate();
                return new OrgApacheSlingServletsGetImplVersionVersionInfoServletProperties(
                    SlingServletSelectors: _SlingServletSelectors,
                    EcmaSuport: _EcmaSuport
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}