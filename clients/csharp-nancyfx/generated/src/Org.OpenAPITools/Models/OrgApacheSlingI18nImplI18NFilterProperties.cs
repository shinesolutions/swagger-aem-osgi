using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingI18nImplI18NFilterProperties
    /// </summary>
    public sealed class OrgApacheSlingI18nImplI18NFilterProperties:  IEquatable<OrgApacheSlingI18nImplI18NFilterProperties>
    { 
        /// <summary>
        /// ServiceRanking
        /// </summary>
        public ConfigNodePropertyInteger ServiceRanking { get; private set; }

        /// <summary>
        /// SlingFilterScope
        /// </summary>
        public ConfigNodePropertyArray SlingFilterScope { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheSlingI18nImplI18NFilterProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingI18nImplI18NFilterProperties()
        {
        }

        private OrgApacheSlingI18nImplI18NFilterProperties(ConfigNodePropertyInteger ServiceRanking, ConfigNodePropertyArray SlingFilterScope)
        {
            
            this.ServiceRanking = ServiceRanking;
            
            this.SlingFilterScope = SlingFilterScope;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingI18nImplI18NFilterProperties.
        /// </summary>
        /// <returns>OrgApacheSlingI18nImplI18NFilterPropertiesBuilder</returns>
        public static OrgApacheSlingI18nImplI18NFilterPropertiesBuilder Builder()
        {
            return new OrgApacheSlingI18nImplI18NFilterPropertiesBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingI18nImplI18NFilterPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingI18nImplI18NFilterPropertiesBuilder</returns>
        public OrgApacheSlingI18nImplI18NFilterPropertiesBuilder With()
        {
            return Builder()
                .ServiceRanking(ServiceRanking)
                .SlingFilterScope(SlingFilterScope);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(OrgApacheSlingI18nImplI18NFilterProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingI18nImplI18NFilterProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingI18nImplI18NFilterProperties</param>
        /// <param name="right">Compared (OrgApacheSlingI18nImplI18NFilterProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingI18nImplI18NFilterProperties left, OrgApacheSlingI18nImplI18NFilterProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingI18nImplI18NFilterProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingI18nImplI18NFilterProperties</param>
        /// <param name="right">Compared (OrgApacheSlingI18nImplI18NFilterProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingI18nImplI18NFilterProperties left, OrgApacheSlingI18nImplI18NFilterProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingI18nImplI18NFilterProperties.
        /// </summary>
        public sealed class OrgApacheSlingI18nImplI18NFilterPropertiesBuilder
        {
            private ConfigNodePropertyInteger _ServiceRanking;
            private ConfigNodePropertyArray _SlingFilterScope;

            internal OrgApacheSlingI18nImplI18NFilterPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingI18nImplI18NFilterProperties.ServiceRanking property.
            /// </summary>
            /// <param name="value">ServiceRanking</param>
            public OrgApacheSlingI18nImplI18NFilterPropertiesBuilder ServiceRanking(ConfigNodePropertyInteger value)
            {
                _ServiceRanking = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingI18nImplI18NFilterProperties.SlingFilterScope property.
            /// </summary>
            /// <param name="value">SlingFilterScope</param>
            public OrgApacheSlingI18nImplI18NFilterPropertiesBuilder SlingFilterScope(ConfigNodePropertyArray value)
            {
                _SlingFilterScope = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingI18nImplI18NFilterProperties.
            /// </summary>
            /// <returns>OrgApacheSlingI18nImplI18NFilterProperties</returns>
            public OrgApacheSlingI18nImplI18NFilterProperties Build()
            {
                Validate();
                return new OrgApacheSlingI18nImplI18NFilterProperties(
                    ServiceRanking: _ServiceRanking,
                    SlingFilterScope: _SlingFilterScope
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}