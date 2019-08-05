using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqSearchImplBuilderQueryBuilderImplProperties
    /// </summary>
    public sealed class ComDayCqSearchImplBuilderQueryBuilderImplProperties:  IEquatable<ComDayCqSearchImplBuilderQueryBuilderImplProperties>
    { 
        /// <summary>
        /// ExcerptProperties
        /// </summary>
        public ConfigNodePropertyArray ExcerptProperties { get; private set; }

        /// <summary>
        /// CacheMaxEntries
        /// </summary>
        public ConfigNodePropertyInteger CacheMaxEntries { get; private set; }

        /// <summary>
        /// CacheEntryLifetime
        /// </summary>
        public ConfigNodePropertyInteger CacheEntryLifetime { get; private set; }

        /// <summary>
        /// XpathUnion
        /// </summary>
        public ConfigNodePropertyBoolean XpathUnion { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqSearchImplBuilderQueryBuilderImplProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqSearchImplBuilderQueryBuilderImplProperties()
        {
        }

        private ComDayCqSearchImplBuilderQueryBuilderImplProperties(ConfigNodePropertyArray ExcerptProperties, ConfigNodePropertyInteger CacheMaxEntries, ConfigNodePropertyInteger CacheEntryLifetime, ConfigNodePropertyBoolean XpathUnion)
        {
            
            this.ExcerptProperties = ExcerptProperties;
            
            this.CacheMaxEntries = CacheMaxEntries;
            
            this.CacheEntryLifetime = CacheEntryLifetime;
            
            this.XpathUnion = XpathUnion;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqSearchImplBuilderQueryBuilderImplProperties.
        /// </summary>
        /// <returns>ComDayCqSearchImplBuilderQueryBuilderImplPropertiesBuilder</returns>
        public static ComDayCqSearchImplBuilderQueryBuilderImplPropertiesBuilder Builder()
        {
            return new ComDayCqSearchImplBuilderQueryBuilderImplPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqSearchImplBuilderQueryBuilderImplPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqSearchImplBuilderQueryBuilderImplPropertiesBuilder</returns>
        public ComDayCqSearchImplBuilderQueryBuilderImplPropertiesBuilder With()
        {
            return Builder()
                .ExcerptProperties(ExcerptProperties)
                .CacheMaxEntries(CacheMaxEntries)
                .CacheEntryLifetime(CacheEntryLifetime)
                .XpathUnion(XpathUnion);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqSearchImplBuilderQueryBuilderImplProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqSearchImplBuilderQueryBuilderImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqSearchImplBuilderQueryBuilderImplProperties</param>
        /// <param name="right">Compared (ComDayCqSearchImplBuilderQueryBuilderImplProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqSearchImplBuilderQueryBuilderImplProperties left, ComDayCqSearchImplBuilderQueryBuilderImplProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqSearchImplBuilderQueryBuilderImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqSearchImplBuilderQueryBuilderImplProperties</param>
        /// <param name="right">Compared (ComDayCqSearchImplBuilderQueryBuilderImplProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqSearchImplBuilderQueryBuilderImplProperties left, ComDayCqSearchImplBuilderQueryBuilderImplProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqSearchImplBuilderQueryBuilderImplProperties.
        /// </summary>
        public sealed class ComDayCqSearchImplBuilderQueryBuilderImplPropertiesBuilder
        {
            private ConfigNodePropertyArray _ExcerptProperties;
            private ConfigNodePropertyInteger _CacheMaxEntries;
            private ConfigNodePropertyInteger _CacheEntryLifetime;
            private ConfigNodePropertyBoolean _XpathUnion;

            internal ComDayCqSearchImplBuilderQueryBuilderImplPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqSearchImplBuilderQueryBuilderImplProperties.ExcerptProperties property.
            /// </summary>
            /// <param name="value">ExcerptProperties</param>
            public ComDayCqSearchImplBuilderQueryBuilderImplPropertiesBuilder ExcerptProperties(ConfigNodePropertyArray value)
            {
                _ExcerptProperties = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqSearchImplBuilderQueryBuilderImplProperties.CacheMaxEntries property.
            /// </summary>
            /// <param name="value">CacheMaxEntries</param>
            public ComDayCqSearchImplBuilderQueryBuilderImplPropertiesBuilder CacheMaxEntries(ConfigNodePropertyInteger value)
            {
                _CacheMaxEntries = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqSearchImplBuilderQueryBuilderImplProperties.CacheEntryLifetime property.
            /// </summary>
            /// <param name="value">CacheEntryLifetime</param>
            public ComDayCqSearchImplBuilderQueryBuilderImplPropertiesBuilder CacheEntryLifetime(ConfigNodePropertyInteger value)
            {
                _CacheEntryLifetime = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqSearchImplBuilderQueryBuilderImplProperties.XpathUnion property.
            /// </summary>
            /// <param name="value">XpathUnion</param>
            public ComDayCqSearchImplBuilderQueryBuilderImplPropertiesBuilder XpathUnion(ConfigNodePropertyBoolean value)
            {
                _XpathUnion = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqSearchImplBuilderQueryBuilderImplProperties.
            /// </summary>
            /// <returns>ComDayCqSearchImplBuilderQueryBuilderImplProperties</returns>
            public ComDayCqSearchImplBuilderQueryBuilderImplProperties Build()
            {
                Validate();
                return new ComDayCqSearchImplBuilderQueryBuilderImplProperties(
                    ExcerptProperties: _ExcerptProperties,
                    CacheMaxEntries: _CacheMaxEntries,
                    CacheEntryLifetime: _CacheEntryLifetime,
                    XpathUnion: _XpathUnion
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}