using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingHcCoreImplCompositeHealthCheckProperties
    /// </summary>
    public sealed class OrgApacheSlingHcCoreImplCompositeHealthCheckProperties:  IEquatable<OrgApacheSlingHcCoreImplCompositeHealthCheckProperties>
    { 
        /// <summary>
        /// HcName
        /// </summary>
        public ConfigNodePropertyString HcName { get; private set; }

        /// <summary>
        /// HcTags
        /// </summary>
        public ConfigNodePropertyArray HcTags { get; private set; }

        /// <summary>
        /// HcMbeanName
        /// </summary>
        public ConfigNodePropertyString HcMbeanName { get; private set; }

        /// <summary>
        /// FilterTags
        /// </summary>
        public ConfigNodePropertyArray FilterTags { get; private set; }

        /// <summary>
        /// FilterCombineTagsWithOr
        /// </summary>
        public ConfigNodePropertyBoolean FilterCombineTagsWithOr { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheSlingHcCoreImplCompositeHealthCheckProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingHcCoreImplCompositeHealthCheckProperties()
        {
        }

        private OrgApacheSlingHcCoreImplCompositeHealthCheckProperties(ConfigNodePropertyString HcName, ConfigNodePropertyArray HcTags, ConfigNodePropertyString HcMbeanName, ConfigNodePropertyArray FilterTags, ConfigNodePropertyBoolean FilterCombineTagsWithOr)
        {
            
            this.HcName = HcName;
            
            this.HcTags = HcTags;
            
            this.HcMbeanName = HcMbeanName;
            
            this.FilterTags = FilterTags;
            
            this.FilterCombineTagsWithOr = FilterCombineTagsWithOr;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingHcCoreImplCompositeHealthCheckProperties.
        /// </summary>
        /// <returns>OrgApacheSlingHcCoreImplCompositeHealthCheckPropertiesBuilder</returns>
        public static OrgApacheSlingHcCoreImplCompositeHealthCheckPropertiesBuilder Builder()
        {
            return new OrgApacheSlingHcCoreImplCompositeHealthCheckPropertiesBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingHcCoreImplCompositeHealthCheckPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingHcCoreImplCompositeHealthCheckPropertiesBuilder</returns>
        public OrgApacheSlingHcCoreImplCompositeHealthCheckPropertiesBuilder With()
        {
            return Builder()
                .HcName(HcName)
                .HcTags(HcTags)
                .HcMbeanName(HcMbeanName)
                .FilterTags(FilterTags)
                .FilterCombineTagsWithOr(FilterCombineTagsWithOr);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(OrgApacheSlingHcCoreImplCompositeHealthCheckProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingHcCoreImplCompositeHealthCheckProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingHcCoreImplCompositeHealthCheckProperties</param>
        /// <param name="right">Compared (OrgApacheSlingHcCoreImplCompositeHealthCheckProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingHcCoreImplCompositeHealthCheckProperties left, OrgApacheSlingHcCoreImplCompositeHealthCheckProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingHcCoreImplCompositeHealthCheckProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingHcCoreImplCompositeHealthCheckProperties</param>
        /// <param name="right">Compared (OrgApacheSlingHcCoreImplCompositeHealthCheckProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingHcCoreImplCompositeHealthCheckProperties left, OrgApacheSlingHcCoreImplCompositeHealthCheckProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingHcCoreImplCompositeHealthCheckProperties.
        /// </summary>
        public sealed class OrgApacheSlingHcCoreImplCompositeHealthCheckPropertiesBuilder
        {
            private ConfigNodePropertyString _HcName;
            private ConfigNodePropertyArray _HcTags;
            private ConfigNodePropertyString _HcMbeanName;
            private ConfigNodePropertyArray _FilterTags;
            private ConfigNodePropertyBoolean _FilterCombineTagsWithOr;

            internal OrgApacheSlingHcCoreImplCompositeHealthCheckPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingHcCoreImplCompositeHealthCheckProperties.HcName property.
            /// </summary>
            /// <param name="value">HcName</param>
            public OrgApacheSlingHcCoreImplCompositeHealthCheckPropertiesBuilder HcName(ConfigNodePropertyString value)
            {
                _HcName = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingHcCoreImplCompositeHealthCheckProperties.HcTags property.
            /// </summary>
            /// <param name="value">HcTags</param>
            public OrgApacheSlingHcCoreImplCompositeHealthCheckPropertiesBuilder HcTags(ConfigNodePropertyArray value)
            {
                _HcTags = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingHcCoreImplCompositeHealthCheckProperties.HcMbeanName property.
            /// </summary>
            /// <param name="value">HcMbeanName</param>
            public OrgApacheSlingHcCoreImplCompositeHealthCheckPropertiesBuilder HcMbeanName(ConfigNodePropertyString value)
            {
                _HcMbeanName = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingHcCoreImplCompositeHealthCheckProperties.FilterTags property.
            /// </summary>
            /// <param name="value">FilterTags</param>
            public OrgApacheSlingHcCoreImplCompositeHealthCheckPropertiesBuilder FilterTags(ConfigNodePropertyArray value)
            {
                _FilterTags = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingHcCoreImplCompositeHealthCheckProperties.FilterCombineTagsWithOr property.
            /// </summary>
            /// <param name="value">FilterCombineTagsWithOr</param>
            public OrgApacheSlingHcCoreImplCompositeHealthCheckPropertiesBuilder FilterCombineTagsWithOr(ConfigNodePropertyBoolean value)
            {
                _FilterCombineTagsWithOr = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingHcCoreImplCompositeHealthCheckProperties.
            /// </summary>
            /// <returns>OrgApacheSlingHcCoreImplCompositeHealthCheckProperties</returns>
            public OrgApacheSlingHcCoreImplCompositeHealthCheckProperties Build()
            {
                Validate();
                return new OrgApacheSlingHcCoreImplCompositeHealthCheckProperties(
                    HcName: _HcName,
                    HcTags: _HcTags,
                    HcMbeanName: _HcMbeanName,
                    FilterTags: _FilterTags,
                    FilterCombineTagsWithOr: _FilterCombineTagsWithOr
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}