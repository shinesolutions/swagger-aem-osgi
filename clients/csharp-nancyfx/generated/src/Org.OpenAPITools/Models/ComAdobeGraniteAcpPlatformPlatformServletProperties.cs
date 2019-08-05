using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteAcpPlatformPlatformServletProperties
    /// </summary>
    public sealed class ComAdobeGraniteAcpPlatformPlatformServletProperties:  IEquatable<ComAdobeGraniteAcpPlatformPlatformServletProperties>
    { 
        /// <summary>
        /// QueryLimit
        /// </summary>
        public ConfigNodePropertyInteger QueryLimit { get; private set; }

        /// <summary>
        /// FileTypeExtensionMap
        /// </summary>
        public ConfigNodePropertyArray FileTypeExtensionMap { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteAcpPlatformPlatformServletProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteAcpPlatformPlatformServletProperties()
        {
        }

        private ComAdobeGraniteAcpPlatformPlatformServletProperties(ConfigNodePropertyInteger QueryLimit, ConfigNodePropertyArray FileTypeExtensionMap)
        {
            
            this.QueryLimit = QueryLimit;
            
            this.FileTypeExtensionMap = FileTypeExtensionMap;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteAcpPlatformPlatformServletProperties.
        /// </summary>
        /// <returns>ComAdobeGraniteAcpPlatformPlatformServletPropertiesBuilder</returns>
        public static ComAdobeGraniteAcpPlatformPlatformServletPropertiesBuilder Builder()
        {
            return new ComAdobeGraniteAcpPlatformPlatformServletPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteAcpPlatformPlatformServletPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteAcpPlatformPlatformServletPropertiesBuilder</returns>
        public ComAdobeGraniteAcpPlatformPlatformServletPropertiesBuilder With()
        {
            return Builder()
                .QueryLimit(QueryLimit)
                .FileTypeExtensionMap(FileTypeExtensionMap);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeGraniteAcpPlatformPlatformServletProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteAcpPlatformPlatformServletProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteAcpPlatformPlatformServletProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteAcpPlatformPlatformServletProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteAcpPlatformPlatformServletProperties left, ComAdobeGraniteAcpPlatformPlatformServletProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteAcpPlatformPlatformServletProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteAcpPlatformPlatformServletProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteAcpPlatformPlatformServletProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteAcpPlatformPlatformServletProperties left, ComAdobeGraniteAcpPlatformPlatformServletProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteAcpPlatformPlatformServletProperties.
        /// </summary>
        public sealed class ComAdobeGraniteAcpPlatformPlatformServletPropertiesBuilder
        {
            private ConfigNodePropertyInteger _QueryLimit;
            private ConfigNodePropertyArray _FileTypeExtensionMap;

            internal ComAdobeGraniteAcpPlatformPlatformServletPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAcpPlatformPlatformServletProperties.QueryLimit property.
            /// </summary>
            /// <param name="value">QueryLimit</param>
            public ComAdobeGraniteAcpPlatformPlatformServletPropertiesBuilder QueryLimit(ConfigNodePropertyInteger value)
            {
                _QueryLimit = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAcpPlatformPlatformServletProperties.FileTypeExtensionMap property.
            /// </summary>
            /// <param name="value">FileTypeExtensionMap</param>
            public ComAdobeGraniteAcpPlatformPlatformServletPropertiesBuilder FileTypeExtensionMap(ConfigNodePropertyArray value)
            {
                _FileTypeExtensionMap = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteAcpPlatformPlatformServletProperties.
            /// </summary>
            /// <returns>ComAdobeGraniteAcpPlatformPlatformServletProperties</returns>
            public ComAdobeGraniteAcpPlatformPlatformServletProperties Build()
            {
                Validate();
                return new ComAdobeGraniteAcpPlatformPlatformServletProperties(
                    QueryLimit: _QueryLimit,
                    FileTypeExtensionMap: _FileTypeExtensionMap
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}