using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties
    /// </summary>
    public sealed class ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties:  IEquatable<ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties>
    { 
        /// <summary>
        /// CacheEnable
        /// </summary>
        public ConfigNodePropertyBoolean CacheEnable { get; private set; }

        /// <summary>
        /// CacheRootPaths
        /// </summary>
        public ConfigNodePropertyArray CacheRootPaths { get; private set; }

        /// <summary>
        /// CacheMaxSize
        /// </summary>
        public ConfigNodePropertyInteger CacheMaxSize { get; private set; }

        /// <summary>
        /// CacheMaxEntries
        /// </summary>
        public ConfigNodePropertyInteger CacheMaxEntries { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties()
        {
        }

        private ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties(ConfigNodePropertyBoolean CacheEnable, ConfigNodePropertyArray CacheRootPaths, ConfigNodePropertyInteger CacheMaxSize, ConfigNodePropertyInteger CacheMaxEntries)
        {
            
            this.CacheEnable = CacheEnable;
            
            this.CacheRootPaths = CacheRootPaths;
            
            this.CacheMaxSize = CacheMaxSize;
            
            this.CacheMaxEntries = CacheMaxEntries;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties.
        /// </summary>
        /// <returns>ComAdobeCqDamS7imagingImplPsPlatformServerServletPropertiesBuilder</returns>
        public static ComAdobeCqDamS7imagingImplPsPlatformServerServletPropertiesBuilder Builder()
        {
            return new ComAdobeCqDamS7imagingImplPsPlatformServerServletPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqDamS7imagingImplPsPlatformServerServletPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqDamS7imagingImplPsPlatformServerServletPropertiesBuilder</returns>
        public ComAdobeCqDamS7imagingImplPsPlatformServerServletPropertiesBuilder With()
        {
            return Builder()
                .CacheEnable(CacheEnable)
                .CacheRootPaths(CacheRootPaths)
                .CacheMaxSize(CacheMaxSize)
                .CacheMaxEntries(CacheMaxEntries);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties</param>
        /// <param name="right">Compared (ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties left, ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties</param>
        /// <param name="right">Compared (ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties left, ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties.
        /// </summary>
        public sealed class ComAdobeCqDamS7imagingImplPsPlatformServerServletPropertiesBuilder
        {
            private ConfigNodePropertyBoolean _CacheEnable;
            private ConfigNodePropertyArray _CacheRootPaths;
            private ConfigNodePropertyInteger _CacheMaxSize;
            private ConfigNodePropertyInteger _CacheMaxEntries;

            internal ComAdobeCqDamS7imagingImplPsPlatformServerServletPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties.CacheEnable property.
            /// </summary>
            /// <param name="value">CacheEnable</param>
            public ComAdobeCqDamS7imagingImplPsPlatformServerServletPropertiesBuilder CacheEnable(ConfigNodePropertyBoolean value)
            {
                _CacheEnable = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties.CacheRootPaths property.
            /// </summary>
            /// <param name="value">CacheRootPaths</param>
            public ComAdobeCqDamS7imagingImplPsPlatformServerServletPropertiesBuilder CacheRootPaths(ConfigNodePropertyArray value)
            {
                _CacheRootPaths = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties.CacheMaxSize property.
            /// </summary>
            /// <param name="value">CacheMaxSize</param>
            public ComAdobeCqDamS7imagingImplPsPlatformServerServletPropertiesBuilder CacheMaxSize(ConfigNodePropertyInteger value)
            {
                _CacheMaxSize = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties.CacheMaxEntries property.
            /// </summary>
            /// <param name="value">CacheMaxEntries</param>
            public ComAdobeCqDamS7imagingImplPsPlatformServerServletPropertiesBuilder CacheMaxEntries(ConfigNodePropertyInteger value)
            {
                _CacheMaxEntries = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties.
            /// </summary>
            /// <returns>ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties</returns>
            public ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties Build()
            {
                Validate();
                return new ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties(
                    CacheEnable: _CacheEnable,
                    CacheRootPaths: _CacheRootPaths,
                    CacheMaxSize: _CacheMaxSize,
                    CacheMaxEntries: _CacheMaxEntries
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}