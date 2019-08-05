using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingSecurityImplReferrerFilterProperties
    /// </summary>
    public sealed class OrgApacheSlingSecurityImplReferrerFilterProperties:  IEquatable<OrgApacheSlingSecurityImplReferrerFilterProperties>
    { 
        /// <summary>
        /// AllowEmpty
        /// </summary>
        public ConfigNodePropertyBoolean AllowEmpty { get; private set; }

        /// <summary>
        /// AllowHosts
        /// </summary>
        public ConfigNodePropertyArray AllowHosts { get; private set; }

        /// <summary>
        /// AllowHostsRegexp
        /// </summary>
        public ConfigNodePropertyArray AllowHostsRegexp { get; private set; }

        /// <summary>
        /// FilterMethods
        /// </summary>
        public ConfigNodePropertyArray FilterMethods { get; private set; }

        /// <summary>
        /// ExcludeAgentsRegexp
        /// </summary>
        public ConfigNodePropertyArray ExcludeAgentsRegexp { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheSlingSecurityImplReferrerFilterProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingSecurityImplReferrerFilterProperties()
        {
        }

        private OrgApacheSlingSecurityImplReferrerFilterProperties(ConfigNodePropertyBoolean AllowEmpty, ConfigNodePropertyArray AllowHosts, ConfigNodePropertyArray AllowHostsRegexp, ConfigNodePropertyArray FilterMethods, ConfigNodePropertyArray ExcludeAgentsRegexp)
        {
            
            this.AllowEmpty = AllowEmpty;
            
            this.AllowHosts = AllowHosts;
            
            this.AllowHostsRegexp = AllowHostsRegexp;
            
            this.FilterMethods = FilterMethods;
            
            this.ExcludeAgentsRegexp = ExcludeAgentsRegexp;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingSecurityImplReferrerFilterProperties.
        /// </summary>
        /// <returns>OrgApacheSlingSecurityImplReferrerFilterPropertiesBuilder</returns>
        public static OrgApacheSlingSecurityImplReferrerFilterPropertiesBuilder Builder()
        {
            return new OrgApacheSlingSecurityImplReferrerFilterPropertiesBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingSecurityImplReferrerFilterPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingSecurityImplReferrerFilterPropertiesBuilder</returns>
        public OrgApacheSlingSecurityImplReferrerFilterPropertiesBuilder With()
        {
            return Builder()
                .AllowEmpty(AllowEmpty)
                .AllowHosts(AllowHosts)
                .AllowHostsRegexp(AllowHostsRegexp)
                .FilterMethods(FilterMethods)
                .ExcludeAgentsRegexp(ExcludeAgentsRegexp);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(OrgApacheSlingSecurityImplReferrerFilterProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingSecurityImplReferrerFilterProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingSecurityImplReferrerFilterProperties</param>
        /// <param name="right">Compared (OrgApacheSlingSecurityImplReferrerFilterProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingSecurityImplReferrerFilterProperties left, OrgApacheSlingSecurityImplReferrerFilterProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingSecurityImplReferrerFilterProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingSecurityImplReferrerFilterProperties</param>
        /// <param name="right">Compared (OrgApacheSlingSecurityImplReferrerFilterProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingSecurityImplReferrerFilterProperties left, OrgApacheSlingSecurityImplReferrerFilterProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingSecurityImplReferrerFilterProperties.
        /// </summary>
        public sealed class OrgApacheSlingSecurityImplReferrerFilterPropertiesBuilder
        {
            private ConfigNodePropertyBoolean _AllowEmpty;
            private ConfigNodePropertyArray _AllowHosts;
            private ConfigNodePropertyArray _AllowHostsRegexp;
            private ConfigNodePropertyArray _FilterMethods;
            private ConfigNodePropertyArray _ExcludeAgentsRegexp;

            internal OrgApacheSlingSecurityImplReferrerFilterPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingSecurityImplReferrerFilterProperties.AllowEmpty property.
            /// </summary>
            /// <param name="value">AllowEmpty</param>
            public OrgApacheSlingSecurityImplReferrerFilterPropertiesBuilder AllowEmpty(ConfigNodePropertyBoolean value)
            {
                _AllowEmpty = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingSecurityImplReferrerFilterProperties.AllowHosts property.
            /// </summary>
            /// <param name="value">AllowHosts</param>
            public OrgApacheSlingSecurityImplReferrerFilterPropertiesBuilder AllowHosts(ConfigNodePropertyArray value)
            {
                _AllowHosts = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingSecurityImplReferrerFilterProperties.AllowHostsRegexp property.
            /// </summary>
            /// <param name="value">AllowHostsRegexp</param>
            public OrgApacheSlingSecurityImplReferrerFilterPropertiesBuilder AllowHostsRegexp(ConfigNodePropertyArray value)
            {
                _AllowHostsRegexp = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingSecurityImplReferrerFilterProperties.FilterMethods property.
            /// </summary>
            /// <param name="value">FilterMethods</param>
            public OrgApacheSlingSecurityImplReferrerFilterPropertiesBuilder FilterMethods(ConfigNodePropertyArray value)
            {
                _FilterMethods = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingSecurityImplReferrerFilterProperties.ExcludeAgentsRegexp property.
            /// </summary>
            /// <param name="value">ExcludeAgentsRegexp</param>
            public OrgApacheSlingSecurityImplReferrerFilterPropertiesBuilder ExcludeAgentsRegexp(ConfigNodePropertyArray value)
            {
                _ExcludeAgentsRegexp = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingSecurityImplReferrerFilterProperties.
            /// </summary>
            /// <returns>OrgApacheSlingSecurityImplReferrerFilterProperties</returns>
            public OrgApacheSlingSecurityImplReferrerFilterProperties Build()
            {
                Validate();
                return new OrgApacheSlingSecurityImplReferrerFilterProperties(
                    AllowEmpty: _AllowEmpty,
                    AllowHosts: _AllowHosts,
                    AllowHostsRegexp: _AllowHostsRegexp,
                    FilterMethods: _FilterMethods,
                    ExcludeAgentsRegexp: _ExcludeAgentsRegexp
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}