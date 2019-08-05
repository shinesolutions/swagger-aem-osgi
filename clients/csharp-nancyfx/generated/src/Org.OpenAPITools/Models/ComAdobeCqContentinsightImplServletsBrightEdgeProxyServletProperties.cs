using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletProperties
    /// </summary>
    public sealed class ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletProperties:  IEquatable<ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletProperties>
    { 
        /// <summary>
        /// BrightedgeUrl
        /// </summary>
        public ConfigNodePropertyString BrightedgeUrl { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletProperties()
        {
        }

        private ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletProperties(ConfigNodePropertyString BrightedgeUrl)
        {
            
            this.BrightedgeUrl = BrightedgeUrl;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletProperties.
        /// </summary>
        /// <returns>ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletPropertiesBuilder</returns>
        public static ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletPropertiesBuilder Builder()
        {
            return new ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletPropertiesBuilder</returns>
        public ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletPropertiesBuilder With()
        {
            return Builder()
                .BrightedgeUrl(BrightedgeUrl);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletProperties</param>
        /// <param name="right">Compared (ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletProperties left, ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletProperties</param>
        /// <param name="right">Compared (ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletProperties left, ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletProperties.
        /// </summary>
        public sealed class ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletPropertiesBuilder
        {
            private ConfigNodePropertyString _BrightedgeUrl;

            internal ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletProperties.BrightedgeUrl property.
            /// </summary>
            /// <param name="value">BrightedgeUrl</param>
            public ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletPropertiesBuilder BrightedgeUrl(ConfigNodePropertyString value)
            {
                _BrightedgeUrl = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletProperties.
            /// </summary>
            /// <returns>ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletProperties</returns>
            public ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletProperties Build()
            {
                Validate();
                return new ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletProperties(
                    BrightedgeUrl: _BrightedgeUrl
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}