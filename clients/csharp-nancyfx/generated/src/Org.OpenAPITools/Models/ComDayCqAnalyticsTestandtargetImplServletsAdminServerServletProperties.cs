using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletProperties
    /// </summary>
    public sealed class ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletProperties:  IEquatable<ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletProperties>
    { 
        /// <summary>
        /// TestandtargetEndpointUrl
        /// </summary>
        public ConfigNodePropertyString TestandtargetEndpointUrl { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletProperties()
        {
        }

        private ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletProperties(ConfigNodePropertyString TestandtargetEndpointUrl)
        {
            
            this.TestandtargetEndpointUrl = TestandtargetEndpointUrl;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletProperties.
        /// </summary>
        /// <returns>ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletPropertiesBuilder</returns>
        public static ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletPropertiesBuilder Builder()
        {
            return new ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletPropertiesBuilder</returns>
        public ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletPropertiesBuilder With()
        {
            return Builder()
                .TestandtargetEndpointUrl(TestandtargetEndpointUrl);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletProperties</param>
        /// <param name="right">Compared (ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletProperties left, ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletProperties</param>
        /// <param name="right">Compared (ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletProperties left, ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletProperties.
        /// </summary>
        public sealed class ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletPropertiesBuilder
        {
            private ConfigNodePropertyString _TestandtargetEndpointUrl;

            internal ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletProperties.TestandtargetEndpointUrl property.
            /// </summary>
            /// <param name="value">TestandtargetEndpointUrl</param>
            public ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletPropertiesBuilder TestandtargetEndpointUrl(ConfigNodePropertyString value)
            {
                _TestandtargetEndpointUrl = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletProperties.
            /// </summary>
            /// <returns>ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletProperties</returns>
            public ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletProperties Build()
            {
                Validate();
                return new ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletProperties(
                    TestandtargetEndpointUrl: _TestandtargetEndpointUrl
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}