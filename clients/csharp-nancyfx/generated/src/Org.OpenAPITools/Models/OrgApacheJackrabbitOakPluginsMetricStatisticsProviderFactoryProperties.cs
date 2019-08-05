using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryProperties
    /// </summary>
    public sealed class OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryProperties:  IEquatable<OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryProperties>
    { 
        /// <summary>
        /// ProviderType
        /// </summary>
        public ConfigNodePropertyDropDown ProviderType { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryProperties()
        {
        }

        private OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryProperties(ConfigNodePropertyDropDown ProviderType)
        {
            
            this.ProviderType = ProviderType;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryProperties.
        /// </summary>
        /// <returns>OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryPropertiesBuilder</returns>
        public static OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryPropertiesBuilder Builder()
        {
            return new OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryPropertiesBuilder();
        }

        /// <summary>
        /// Returns OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryPropertiesBuilder</returns>
        public OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryPropertiesBuilder With()
        {
            return Builder()
                .ProviderType(ProviderType);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryProperties</param>
        /// <param name="right">Compared (OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryProperties left, OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryProperties</param>
        /// <param name="right">Compared (OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryProperties left, OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryProperties.
        /// </summary>
        public sealed class OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryPropertiesBuilder
        {
            private ConfigNodePropertyDropDown _ProviderType;

            internal OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryProperties.ProviderType property.
            /// </summary>
            /// <param name="value">ProviderType</param>
            public OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryPropertiesBuilder ProviderType(ConfigNodePropertyDropDown value)
            {
                _ProviderType = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryProperties.
            /// </summary>
            /// <returns>OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryProperties</returns>
            public OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryProperties Build()
            {
                Validate();
                return new OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryProperties(
                    ProviderType: _ProviderType
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}