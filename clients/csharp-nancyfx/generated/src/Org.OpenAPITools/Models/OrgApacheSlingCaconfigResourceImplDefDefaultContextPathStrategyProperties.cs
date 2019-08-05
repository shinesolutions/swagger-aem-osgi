using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties
    /// </summary>
    public sealed class OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties:  IEquatable<OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties>
    { 
        /// <summary>
        /// Enabled
        /// </summary>
        public ConfigNodePropertyBoolean Enabled { get; private set; }

        /// <summary>
        /// ConfigRefResourceNames
        /// </summary>
        public ConfigNodePropertyArray ConfigRefResourceNames { get; private set; }

        /// <summary>
        /// ConfigRefPropertyNames
        /// </summary>
        public ConfigNodePropertyArray ConfigRefPropertyNames { get; private set; }

        /// <summary>
        /// ServiceRanking
        /// </summary>
        public ConfigNodePropertyInteger ServiceRanking { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties()
        {
        }

        private OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties(ConfigNodePropertyBoolean Enabled, ConfigNodePropertyArray ConfigRefResourceNames, ConfigNodePropertyArray ConfigRefPropertyNames, ConfigNodePropertyInteger ServiceRanking)
        {
            
            this.Enabled = Enabled;
            
            this.ConfigRefResourceNames = ConfigRefResourceNames;
            
            this.ConfigRefPropertyNames = ConfigRefPropertyNames;
            
            this.ServiceRanking = ServiceRanking;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties.
        /// </summary>
        /// <returns>OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyPropertiesBuilder</returns>
        public static OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyPropertiesBuilder Builder()
        {
            return new OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyPropertiesBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyPropertiesBuilder</returns>
        public OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyPropertiesBuilder With()
        {
            return Builder()
                .Enabled(Enabled)
                .ConfigRefResourceNames(ConfigRefResourceNames)
                .ConfigRefPropertyNames(ConfigRefPropertyNames)
                .ServiceRanking(ServiceRanking);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties</param>
        /// <param name="right">Compared (OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties left, OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties</param>
        /// <param name="right">Compared (OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties left, OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties.
        /// </summary>
        public sealed class OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyPropertiesBuilder
        {
            private ConfigNodePropertyBoolean _Enabled;
            private ConfigNodePropertyArray _ConfigRefResourceNames;
            private ConfigNodePropertyArray _ConfigRefPropertyNames;
            private ConfigNodePropertyInteger _ServiceRanking;

            internal OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties.Enabled property.
            /// </summary>
            /// <param name="value">Enabled</param>
            public OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyPropertiesBuilder Enabled(ConfigNodePropertyBoolean value)
            {
                _Enabled = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties.ConfigRefResourceNames property.
            /// </summary>
            /// <param name="value">ConfigRefResourceNames</param>
            public OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyPropertiesBuilder ConfigRefResourceNames(ConfigNodePropertyArray value)
            {
                _ConfigRefResourceNames = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties.ConfigRefPropertyNames property.
            /// </summary>
            /// <param name="value">ConfigRefPropertyNames</param>
            public OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyPropertiesBuilder ConfigRefPropertyNames(ConfigNodePropertyArray value)
            {
                _ConfigRefPropertyNames = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties.ServiceRanking property.
            /// </summary>
            /// <param name="value">ServiceRanking</param>
            public OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyPropertiesBuilder ServiceRanking(ConfigNodePropertyInteger value)
            {
                _ServiceRanking = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties.
            /// </summary>
            /// <returns>OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties</returns>
            public OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties Build()
            {
                Validate();
                return new OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties(
                    Enabled: _Enabled,
                    ConfigRefResourceNames: _ConfigRefResourceNames,
                    ConfigRefPropertyNames: _ConfigRefPropertyNames,
                    ServiceRanking: _ServiceRanking
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}