using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties
    /// </summary>
    public sealed class ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties:  IEquatable<ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties>
    { 
        /// <summary>
        /// CqContentsyncPathrewritertransformerMappingLinks
        /// </summary>
        public ConfigNodePropertyArray CqContentsyncPathrewritertransformerMappingLinks { get; private set; }

        /// <summary>
        /// CqContentsyncPathrewritertransformerMappingClientlibs
        /// </summary>
        public ConfigNodePropertyArray CqContentsyncPathrewritertransformerMappingClientlibs { get; private set; }

        /// <summary>
        /// CqContentsyncPathrewritertransformerMappingImages
        /// </summary>
        public ConfigNodePropertyArray CqContentsyncPathrewritertransformerMappingImages { get; private set; }

        /// <summary>
        /// CqContentsyncPathrewritertransformerAttributePattern
        /// </summary>
        public ConfigNodePropertyString CqContentsyncPathrewritertransformerAttributePattern { get; private set; }

        /// <summary>
        /// CqContentsyncPathrewritertransformerClientlibraryPattern
        /// </summary>
        public ConfigNodePropertyString CqContentsyncPathrewritertransformerClientlibraryPattern { get; private set; }

        /// <summary>
        /// CqContentsyncPathrewritertransformerClientlibraryReplace
        /// </summary>
        public ConfigNodePropertyString CqContentsyncPathrewritertransformerClientlibraryReplace { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties()
        {
        }

        private ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties(ConfigNodePropertyArray CqContentsyncPathrewritertransformerMappingLinks, ConfigNodePropertyArray CqContentsyncPathrewritertransformerMappingClientlibs, ConfigNodePropertyArray CqContentsyncPathrewritertransformerMappingImages, ConfigNodePropertyString CqContentsyncPathrewritertransformerAttributePattern, ConfigNodePropertyString CqContentsyncPathrewritertransformerClientlibraryPattern, ConfigNodePropertyString CqContentsyncPathrewritertransformerClientlibraryReplace)
        {
            
            this.CqContentsyncPathrewritertransformerMappingLinks = CqContentsyncPathrewritertransformerMappingLinks;
            
            this.CqContentsyncPathrewritertransformerMappingClientlibs = CqContentsyncPathrewritertransformerMappingClientlibs;
            
            this.CqContentsyncPathrewritertransformerMappingImages = CqContentsyncPathrewritertransformerMappingImages;
            
            this.CqContentsyncPathrewritertransformerAttributePattern = CqContentsyncPathrewritertransformerAttributePattern;
            
            this.CqContentsyncPathrewritertransformerClientlibraryPattern = CqContentsyncPathrewritertransformerClientlibraryPattern;
            
            this.CqContentsyncPathrewritertransformerClientlibraryReplace = CqContentsyncPathrewritertransformerClientlibraryReplace;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties.
        /// </summary>
        /// <returns>ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorPropertiesBuilder</returns>
        public static ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorPropertiesBuilder Builder()
        {
            return new ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorPropertiesBuilder</returns>
        public ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorPropertiesBuilder With()
        {
            return Builder()
                .CqContentsyncPathrewritertransformerMappingLinks(CqContentsyncPathrewritertransformerMappingLinks)
                .CqContentsyncPathrewritertransformerMappingClientlibs(CqContentsyncPathrewritertransformerMappingClientlibs)
                .CqContentsyncPathrewritertransformerMappingImages(CqContentsyncPathrewritertransformerMappingImages)
                .CqContentsyncPathrewritertransformerAttributePattern(CqContentsyncPathrewritertransformerAttributePattern)
                .CqContentsyncPathrewritertransformerClientlibraryPattern(CqContentsyncPathrewritertransformerClientlibraryPattern)
                .CqContentsyncPathrewritertransformerClientlibraryReplace(CqContentsyncPathrewritertransformerClientlibraryReplace);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties</param>
        /// <param name="right">Compared (ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties left, ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties</param>
        /// <param name="right">Compared (ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties left, ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties.
        /// </summary>
        public sealed class ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorPropertiesBuilder
        {
            private ConfigNodePropertyArray _CqContentsyncPathrewritertransformerMappingLinks;
            private ConfigNodePropertyArray _CqContentsyncPathrewritertransformerMappingClientlibs;
            private ConfigNodePropertyArray _CqContentsyncPathrewritertransformerMappingImages;
            private ConfigNodePropertyString _CqContentsyncPathrewritertransformerAttributePattern;
            private ConfigNodePropertyString _CqContentsyncPathrewritertransformerClientlibraryPattern;
            private ConfigNodePropertyString _CqContentsyncPathrewritertransformerClientlibraryReplace;

            internal ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties.CqContentsyncPathrewritertransformerMappingLinks property.
            /// </summary>
            /// <param name="value">CqContentsyncPathrewritertransformerMappingLinks</param>
            public ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorPropertiesBuilder CqContentsyncPathrewritertransformerMappingLinks(ConfigNodePropertyArray value)
            {
                _CqContentsyncPathrewritertransformerMappingLinks = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties.CqContentsyncPathrewritertransformerMappingClientlibs property.
            /// </summary>
            /// <param name="value">CqContentsyncPathrewritertransformerMappingClientlibs</param>
            public ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorPropertiesBuilder CqContentsyncPathrewritertransformerMappingClientlibs(ConfigNodePropertyArray value)
            {
                _CqContentsyncPathrewritertransformerMappingClientlibs = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties.CqContentsyncPathrewritertransformerMappingImages property.
            /// </summary>
            /// <param name="value">CqContentsyncPathrewritertransformerMappingImages</param>
            public ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorPropertiesBuilder CqContentsyncPathrewritertransformerMappingImages(ConfigNodePropertyArray value)
            {
                _CqContentsyncPathrewritertransformerMappingImages = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties.CqContentsyncPathrewritertransformerAttributePattern property.
            /// </summary>
            /// <param name="value">CqContentsyncPathrewritertransformerAttributePattern</param>
            public ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorPropertiesBuilder CqContentsyncPathrewritertransformerAttributePattern(ConfigNodePropertyString value)
            {
                _CqContentsyncPathrewritertransformerAttributePattern = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties.CqContentsyncPathrewritertransformerClientlibraryPattern property.
            /// </summary>
            /// <param name="value">CqContentsyncPathrewritertransformerClientlibraryPattern</param>
            public ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorPropertiesBuilder CqContentsyncPathrewritertransformerClientlibraryPattern(ConfigNodePropertyString value)
            {
                _CqContentsyncPathrewritertransformerClientlibraryPattern = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties.CqContentsyncPathrewritertransformerClientlibraryReplace property.
            /// </summary>
            /// <param name="value">CqContentsyncPathrewritertransformerClientlibraryReplace</param>
            public ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorPropertiesBuilder CqContentsyncPathrewritertransformerClientlibraryReplace(ConfigNodePropertyString value)
            {
                _CqContentsyncPathrewritertransformerClientlibraryReplace = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties.
            /// </summary>
            /// <returns>ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties</returns>
            public ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties Build()
            {
                Validate();
                return new ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties(
                    CqContentsyncPathrewritertransformerMappingLinks: _CqContentsyncPathrewritertransformerMappingLinks,
                    CqContentsyncPathrewritertransformerMappingClientlibs: _CqContentsyncPathrewritertransformerMappingClientlibs,
                    CqContentsyncPathrewritertransformerMappingImages: _CqContentsyncPathrewritertransformerMappingImages,
                    CqContentsyncPathrewritertransformerAttributePattern: _CqContentsyncPathrewritertransformerAttributePattern,
                    CqContentsyncPathrewritertransformerClientlibraryPattern: _CqContentsyncPathrewritertransformerClientlibraryPattern,
                    CqContentsyncPathrewritertransformerClientlibraryReplace: _CqContentsyncPathrewritertransformerClientlibraryReplace
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}