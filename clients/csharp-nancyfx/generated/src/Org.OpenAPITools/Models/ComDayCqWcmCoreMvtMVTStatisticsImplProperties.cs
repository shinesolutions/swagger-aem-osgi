using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqWcmCoreMvtMVTStatisticsImplProperties
    /// </summary>
    public sealed class ComDayCqWcmCoreMvtMVTStatisticsImplProperties:  IEquatable<ComDayCqWcmCoreMvtMVTStatisticsImplProperties>
    { 
        /// <summary>
        /// MvtstatisticsTrackingurl
        /// </summary>
        public ConfigNodePropertyString MvtstatisticsTrackingurl { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqWcmCoreMvtMVTStatisticsImplProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqWcmCoreMvtMVTStatisticsImplProperties()
        {
        }

        private ComDayCqWcmCoreMvtMVTStatisticsImplProperties(ConfigNodePropertyString MvtstatisticsTrackingurl)
        {
            
            this.MvtstatisticsTrackingurl = MvtstatisticsTrackingurl;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqWcmCoreMvtMVTStatisticsImplProperties.
        /// </summary>
        /// <returns>ComDayCqWcmCoreMvtMVTStatisticsImplPropertiesBuilder</returns>
        public static ComDayCqWcmCoreMvtMVTStatisticsImplPropertiesBuilder Builder()
        {
            return new ComDayCqWcmCoreMvtMVTStatisticsImplPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqWcmCoreMvtMVTStatisticsImplPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqWcmCoreMvtMVTStatisticsImplPropertiesBuilder</returns>
        public ComDayCqWcmCoreMvtMVTStatisticsImplPropertiesBuilder With()
        {
            return Builder()
                .MvtstatisticsTrackingurl(MvtstatisticsTrackingurl);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqWcmCoreMvtMVTStatisticsImplProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqWcmCoreMvtMVTStatisticsImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmCoreMvtMVTStatisticsImplProperties</param>
        /// <param name="right">Compared (ComDayCqWcmCoreMvtMVTStatisticsImplProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqWcmCoreMvtMVTStatisticsImplProperties left, ComDayCqWcmCoreMvtMVTStatisticsImplProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqWcmCoreMvtMVTStatisticsImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmCoreMvtMVTStatisticsImplProperties</param>
        /// <param name="right">Compared (ComDayCqWcmCoreMvtMVTStatisticsImplProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqWcmCoreMvtMVTStatisticsImplProperties left, ComDayCqWcmCoreMvtMVTStatisticsImplProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqWcmCoreMvtMVTStatisticsImplProperties.
        /// </summary>
        public sealed class ComDayCqWcmCoreMvtMVTStatisticsImplPropertiesBuilder
        {
            private ConfigNodePropertyString _MvtstatisticsTrackingurl;

            internal ComDayCqWcmCoreMvtMVTStatisticsImplPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqWcmCoreMvtMVTStatisticsImplProperties.MvtstatisticsTrackingurl property.
            /// </summary>
            /// <param name="value">MvtstatisticsTrackingurl</param>
            public ComDayCqWcmCoreMvtMVTStatisticsImplPropertiesBuilder MvtstatisticsTrackingurl(ConfigNodePropertyString value)
            {
                _MvtstatisticsTrackingurl = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqWcmCoreMvtMVTStatisticsImplProperties.
            /// </summary>
            /// <returns>ComDayCqWcmCoreMvtMVTStatisticsImplProperties</returns>
            public ComDayCqWcmCoreMvtMVTStatisticsImplProperties Build()
            {
                Validate();
                return new ComDayCqWcmCoreMvtMVTStatisticsImplProperties(
                    MvtstatisticsTrackingurl: _MvtstatisticsTrackingurl
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}