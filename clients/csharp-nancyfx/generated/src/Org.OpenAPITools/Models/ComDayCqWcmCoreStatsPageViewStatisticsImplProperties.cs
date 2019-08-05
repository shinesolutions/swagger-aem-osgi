using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqWcmCoreStatsPageViewStatisticsImplProperties
    /// </summary>
    public sealed class ComDayCqWcmCoreStatsPageViewStatisticsImplProperties:  IEquatable<ComDayCqWcmCoreStatsPageViewStatisticsImplProperties>
    { 
        /// <summary>
        /// PageviewstatisticsTrackingurl
        /// </summary>
        public ConfigNodePropertyString PageviewstatisticsTrackingurl { get; private set; }

        /// <summary>
        /// PageviewstatisticsTrackingscriptEnabled
        /// </summary>
        public ConfigNodePropertyString PageviewstatisticsTrackingscriptEnabled { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqWcmCoreStatsPageViewStatisticsImplProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqWcmCoreStatsPageViewStatisticsImplProperties()
        {
        }

        private ComDayCqWcmCoreStatsPageViewStatisticsImplProperties(ConfigNodePropertyString PageviewstatisticsTrackingurl, ConfigNodePropertyString PageviewstatisticsTrackingscriptEnabled)
        {
            
            this.PageviewstatisticsTrackingurl = PageviewstatisticsTrackingurl;
            
            this.PageviewstatisticsTrackingscriptEnabled = PageviewstatisticsTrackingscriptEnabled;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqWcmCoreStatsPageViewStatisticsImplProperties.
        /// </summary>
        /// <returns>ComDayCqWcmCoreStatsPageViewStatisticsImplPropertiesBuilder</returns>
        public static ComDayCqWcmCoreStatsPageViewStatisticsImplPropertiesBuilder Builder()
        {
            return new ComDayCqWcmCoreStatsPageViewStatisticsImplPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqWcmCoreStatsPageViewStatisticsImplPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqWcmCoreStatsPageViewStatisticsImplPropertiesBuilder</returns>
        public ComDayCqWcmCoreStatsPageViewStatisticsImplPropertiesBuilder With()
        {
            return Builder()
                .PageviewstatisticsTrackingurl(PageviewstatisticsTrackingurl)
                .PageviewstatisticsTrackingscriptEnabled(PageviewstatisticsTrackingscriptEnabled);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqWcmCoreStatsPageViewStatisticsImplProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqWcmCoreStatsPageViewStatisticsImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmCoreStatsPageViewStatisticsImplProperties</param>
        /// <param name="right">Compared (ComDayCqWcmCoreStatsPageViewStatisticsImplProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqWcmCoreStatsPageViewStatisticsImplProperties left, ComDayCqWcmCoreStatsPageViewStatisticsImplProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqWcmCoreStatsPageViewStatisticsImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmCoreStatsPageViewStatisticsImplProperties</param>
        /// <param name="right">Compared (ComDayCqWcmCoreStatsPageViewStatisticsImplProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqWcmCoreStatsPageViewStatisticsImplProperties left, ComDayCqWcmCoreStatsPageViewStatisticsImplProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqWcmCoreStatsPageViewStatisticsImplProperties.
        /// </summary>
        public sealed class ComDayCqWcmCoreStatsPageViewStatisticsImplPropertiesBuilder
        {
            private ConfigNodePropertyString _PageviewstatisticsTrackingurl;
            private ConfigNodePropertyString _PageviewstatisticsTrackingscriptEnabled;

            internal ComDayCqWcmCoreStatsPageViewStatisticsImplPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqWcmCoreStatsPageViewStatisticsImplProperties.PageviewstatisticsTrackingurl property.
            /// </summary>
            /// <param name="value">PageviewstatisticsTrackingurl</param>
            public ComDayCqWcmCoreStatsPageViewStatisticsImplPropertiesBuilder PageviewstatisticsTrackingurl(ConfigNodePropertyString value)
            {
                _PageviewstatisticsTrackingurl = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmCoreStatsPageViewStatisticsImplProperties.PageviewstatisticsTrackingscriptEnabled property.
            /// </summary>
            /// <param name="value">PageviewstatisticsTrackingscriptEnabled</param>
            public ComDayCqWcmCoreStatsPageViewStatisticsImplPropertiesBuilder PageviewstatisticsTrackingscriptEnabled(ConfigNodePropertyString value)
            {
                _PageviewstatisticsTrackingscriptEnabled = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqWcmCoreStatsPageViewStatisticsImplProperties.
            /// </summary>
            /// <returns>ComDayCqWcmCoreStatsPageViewStatisticsImplProperties</returns>
            public ComDayCqWcmCoreStatsPageViewStatisticsImplProperties Build()
            {
                Validate();
                return new ComDayCqWcmCoreStatsPageViewStatisticsImplProperties(
                    PageviewstatisticsTrackingurl: _PageviewstatisticsTrackingurl,
                    PageviewstatisticsTrackingscriptEnabled: _PageviewstatisticsTrackingscriptEnabled
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}