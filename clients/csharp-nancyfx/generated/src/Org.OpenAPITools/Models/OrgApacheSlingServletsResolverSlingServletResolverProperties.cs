using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingServletsResolverSlingServletResolverProperties
    /// </summary>
    public sealed class OrgApacheSlingServletsResolverSlingServletResolverProperties:  IEquatable<OrgApacheSlingServletsResolverSlingServletResolverProperties>
    { 
        /// <summary>
        /// ServletresolverServletRoot
        /// </summary>
        public ConfigNodePropertyString ServletresolverServletRoot { get; private set; }

        /// <summary>
        /// ServletresolverCacheSize
        /// </summary>
        public ConfigNodePropertyInteger ServletresolverCacheSize { get; private set; }

        /// <summary>
        /// ServletresolverPaths
        /// </summary>
        public ConfigNodePropertyArray ServletresolverPaths { get; private set; }

        /// <summary>
        /// ServletresolverDefaultExtensions
        /// </summary>
        public ConfigNodePropertyArray ServletresolverDefaultExtensions { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheSlingServletsResolverSlingServletResolverProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingServletsResolverSlingServletResolverProperties()
        {
        }

        private OrgApacheSlingServletsResolverSlingServletResolverProperties(ConfigNodePropertyString ServletresolverServletRoot, ConfigNodePropertyInteger ServletresolverCacheSize, ConfigNodePropertyArray ServletresolverPaths, ConfigNodePropertyArray ServletresolverDefaultExtensions)
        {
            
            this.ServletresolverServletRoot = ServletresolverServletRoot;
            
            this.ServletresolverCacheSize = ServletresolverCacheSize;
            
            this.ServletresolverPaths = ServletresolverPaths;
            
            this.ServletresolverDefaultExtensions = ServletresolverDefaultExtensions;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingServletsResolverSlingServletResolverProperties.
        /// </summary>
        /// <returns>OrgApacheSlingServletsResolverSlingServletResolverPropertiesBuilder</returns>
        public static OrgApacheSlingServletsResolverSlingServletResolverPropertiesBuilder Builder()
        {
            return new OrgApacheSlingServletsResolverSlingServletResolverPropertiesBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingServletsResolverSlingServletResolverPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingServletsResolverSlingServletResolverPropertiesBuilder</returns>
        public OrgApacheSlingServletsResolverSlingServletResolverPropertiesBuilder With()
        {
            return Builder()
                .ServletresolverServletRoot(ServletresolverServletRoot)
                .ServletresolverCacheSize(ServletresolverCacheSize)
                .ServletresolverPaths(ServletresolverPaths)
                .ServletresolverDefaultExtensions(ServletresolverDefaultExtensions);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(OrgApacheSlingServletsResolverSlingServletResolverProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingServletsResolverSlingServletResolverProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingServletsResolverSlingServletResolverProperties</param>
        /// <param name="right">Compared (OrgApacheSlingServletsResolverSlingServletResolverProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingServletsResolverSlingServletResolverProperties left, OrgApacheSlingServletsResolverSlingServletResolverProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingServletsResolverSlingServletResolverProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingServletsResolverSlingServletResolverProperties</param>
        /// <param name="right">Compared (OrgApacheSlingServletsResolverSlingServletResolverProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingServletsResolverSlingServletResolverProperties left, OrgApacheSlingServletsResolverSlingServletResolverProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingServletsResolverSlingServletResolverProperties.
        /// </summary>
        public sealed class OrgApacheSlingServletsResolverSlingServletResolverPropertiesBuilder
        {
            private ConfigNodePropertyString _ServletresolverServletRoot;
            private ConfigNodePropertyInteger _ServletresolverCacheSize;
            private ConfigNodePropertyArray _ServletresolverPaths;
            private ConfigNodePropertyArray _ServletresolverDefaultExtensions;

            internal OrgApacheSlingServletsResolverSlingServletResolverPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingServletsResolverSlingServletResolverProperties.ServletresolverServletRoot property.
            /// </summary>
            /// <param name="value">ServletresolverServletRoot</param>
            public OrgApacheSlingServletsResolverSlingServletResolverPropertiesBuilder ServletresolverServletRoot(ConfigNodePropertyString value)
            {
                _ServletresolverServletRoot = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingServletsResolverSlingServletResolverProperties.ServletresolverCacheSize property.
            /// </summary>
            /// <param name="value">ServletresolverCacheSize</param>
            public OrgApacheSlingServletsResolverSlingServletResolverPropertiesBuilder ServletresolverCacheSize(ConfigNodePropertyInteger value)
            {
                _ServletresolverCacheSize = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingServletsResolverSlingServletResolverProperties.ServletresolverPaths property.
            /// </summary>
            /// <param name="value">ServletresolverPaths</param>
            public OrgApacheSlingServletsResolverSlingServletResolverPropertiesBuilder ServletresolverPaths(ConfigNodePropertyArray value)
            {
                _ServletresolverPaths = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingServletsResolverSlingServletResolverProperties.ServletresolverDefaultExtensions property.
            /// </summary>
            /// <param name="value">ServletresolverDefaultExtensions</param>
            public OrgApacheSlingServletsResolverSlingServletResolverPropertiesBuilder ServletresolverDefaultExtensions(ConfigNodePropertyArray value)
            {
                _ServletresolverDefaultExtensions = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingServletsResolverSlingServletResolverProperties.
            /// </summary>
            /// <returns>OrgApacheSlingServletsResolverSlingServletResolverProperties</returns>
            public OrgApacheSlingServletsResolverSlingServletResolverProperties Build()
            {
                Validate();
                return new OrgApacheSlingServletsResolverSlingServletResolverProperties(
                    ServletresolverServletRoot: _ServletresolverServletRoot,
                    ServletresolverCacheSize: _ServletresolverCacheSize,
                    ServletresolverPaths: _ServletresolverPaths,
                    ServletresolverDefaultExtensions: _ServletresolverDefaultExtensions
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}