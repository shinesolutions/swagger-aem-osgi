using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties
    /// </summary>
    public sealed class ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties:  IEquatable<ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties>
    { 
        /// <summary>
        /// ComAdobeAemScreensImplRemoteRequestTimeout
        /// </summary>
        public ConfigNodePropertyInteger ComAdobeAemScreensImplRemoteRequestTimeout { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties()
        {
        }

        private ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties(ConfigNodePropertyInteger ComAdobeAemScreensImplRemoteRequestTimeout)
        {
            
            this.ComAdobeAemScreensImplRemoteRequestTimeout = ComAdobeAemScreensImplRemoteRequestTimeout;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties.
        /// </summary>
        /// <returns>ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplPropertiesBuilder</returns>
        public static ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplPropertiesBuilder Builder()
        {
            return new ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplPropertiesBuilder</returns>
        public ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplPropertiesBuilder With()
        {
            return Builder()
                .ComAdobeAemScreensImplRemoteRequestTimeout(ComAdobeAemScreensImplRemoteRequestTimeout);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties</param>
        /// <param name="right">Compared (ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties left, ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties</param>
        /// <param name="right">Compared (ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties left, ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties.
        /// </summary>
        public sealed class ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplPropertiesBuilder
        {
            private ConfigNodePropertyInteger _ComAdobeAemScreensImplRemoteRequestTimeout;

            internal ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties.ComAdobeAemScreensImplRemoteRequestTimeout property.
            /// </summary>
            /// <param name="value">ComAdobeAemScreensImplRemoteRequestTimeout</param>
            public ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplPropertiesBuilder ComAdobeAemScreensImplRemoteRequestTimeout(ConfigNodePropertyInteger value)
            {
                _ComAdobeAemScreensImplRemoteRequestTimeout = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties.
            /// </summary>
            /// <returns>ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties</returns>
            public ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties Build()
            {
                Validate();
                return new ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties(
                    ComAdobeAemScreensImplRemoteRequestTimeout: _ComAdobeAemScreensImplRemoteRequestTimeout
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}