using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteAuthCertImplClientCertAuthHandlerProperties
    /// </summary>
    public sealed class ComAdobeGraniteAuthCertImplClientCertAuthHandlerProperties:  IEquatable<ComAdobeGraniteAuthCertImplClientCertAuthHandlerProperties>
    { 
        /// <summary>
        /// Path
        /// </summary>
        public ConfigNodePropertyString Path { get; private set; }

        /// <summary>
        /// ServiceRanking
        /// </summary>
        public ConfigNodePropertyInteger ServiceRanking { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteAuthCertImplClientCertAuthHandlerProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteAuthCertImplClientCertAuthHandlerProperties()
        {
        }

        private ComAdobeGraniteAuthCertImplClientCertAuthHandlerProperties(ConfigNodePropertyString Path, ConfigNodePropertyInteger ServiceRanking)
        {
            
            this.Path = Path;
            
            this.ServiceRanking = ServiceRanking;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteAuthCertImplClientCertAuthHandlerProperties.
        /// </summary>
        /// <returns>ComAdobeGraniteAuthCertImplClientCertAuthHandlerPropertiesBuilder</returns>
        public static ComAdobeGraniteAuthCertImplClientCertAuthHandlerPropertiesBuilder Builder()
        {
            return new ComAdobeGraniteAuthCertImplClientCertAuthHandlerPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteAuthCertImplClientCertAuthHandlerPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteAuthCertImplClientCertAuthHandlerPropertiesBuilder</returns>
        public ComAdobeGraniteAuthCertImplClientCertAuthHandlerPropertiesBuilder With()
        {
            return Builder()
                .Path(Path)
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

        public bool Equals(ComAdobeGraniteAuthCertImplClientCertAuthHandlerProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteAuthCertImplClientCertAuthHandlerProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteAuthCertImplClientCertAuthHandlerProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteAuthCertImplClientCertAuthHandlerProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteAuthCertImplClientCertAuthHandlerProperties left, ComAdobeGraniteAuthCertImplClientCertAuthHandlerProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteAuthCertImplClientCertAuthHandlerProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteAuthCertImplClientCertAuthHandlerProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteAuthCertImplClientCertAuthHandlerProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteAuthCertImplClientCertAuthHandlerProperties left, ComAdobeGraniteAuthCertImplClientCertAuthHandlerProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteAuthCertImplClientCertAuthHandlerProperties.
        /// </summary>
        public sealed class ComAdobeGraniteAuthCertImplClientCertAuthHandlerPropertiesBuilder
        {
            private ConfigNodePropertyString _Path;
            private ConfigNodePropertyInteger _ServiceRanking;

            internal ComAdobeGraniteAuthCertImplClientCertAuthHandlerPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthCertImplClientCertAuthHandlerProperties.Path property.
            /// </summary>
            /// <param name="value">Path</param>
            public ComAdobeGraniteAuthCertImplClientCertAuthHandlerPropertiesBuilder Path(ConfigNodePropertyString value)
            {
                _Path = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthCertImplClientCertAuthHandlerProperties.ServiceRanking property.
            /// </summary>
            /// <param name="value">ServiceRanking</param>
            public ComAdobeGraniteAuthCertImplClientCertAuthHandlerPropertiesBuilder ServiceRanking(ConfigNodePropertyInteger value)
            {
                _ServiceRanking = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteAuthCertImplClientCertAuthHandlerProperties.
            /// </summary>
            /// <returns>ComAdobeGraniteAuthCertImplClientCertAuthHandlerProperties</returns>
            public ComAdobeGraniteAuthCertImplClientCertAuthHandlerProperties Build()
            {
                Validate();
                return new ComAdobeGraniteAuthCertImplClientCertAuthHandlerProperties(
                    Path: _Path,
                    ServiceRanking: _ServiceRanking
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}