using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqDamCfmImplContentRewriterAssetProcessorProperties
    /// </summary>
    public sealed class ComAdobeCqDamCfmImplContentRewriterAssetProcessorProperties:  IEquatable<ComAdobeCqDamCfmImplContentRewriterAssetProcessorProperties>
    { 
        /// <summary>
        /// PipelineType
        /// </summary>
        public ConfigNodePropertyString PipelineType { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqDamCfmImplContentRewriterAssetProcessorProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqDamCfmImplContentRewriterAssetProcessorProperties()
        {
        }

        private ComAdobeCqDamCfmImplContentRewriterAssetProcessorProperties(ConfigNodePropertyString PipelineType)
        {
            
            this.PipelineType = PipelineType;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqDamCfmImplContentRewriterAssetProcessorProperties.
        /// </summary>
        /// <returns>ComAdobeCqDamCfmImplContentRewriterAssetProcessorPropertiesBuilder</returns>
        public static ComAdobeCqDamCfmImplContentRewriterAssetProcessorPropertiesBuilder Builder()
        {
            return new ComAdobeCqDamCfmImplContentRewriterAssetProcessorPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqDamCfmImplContentRewriterAssetProcessorPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqDamCfmImplContentRewriterAssetProcessorPropertiesBuilder</returns>
        public ComAdobeCqDamCfmImplContentRewriterAssetProcessorPropertiesBuilder With()
        {
            return Builder()
                .PipelineType(PipelineType);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeCqDamCfmImplContentRewriterAssetProcessorProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqDamCfmImplContentRewriterAssetProcessorProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqDamCfmImplContentRewriterAssetProcessorProperties</param>
        /// <param name="right">Compared (ComAdobeCqDamCfmImplContentRewriterAssetProcessorProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqDamCfmImplContentRewriterAssetProcessorProperties left, ComAdobeCqDamCfmImplContentRewriterAssetProcessorProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqDamCfmImplContentRewriterAssetProcessorProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqDamCfmImplContentRewriterAssetProcessorProperties</param>
        /// <param name="right">Compared (ComAdobeCqDamCfmImplContentRewriterAssetProcessorProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqDamCfmImplContentRewriterAssetProcessorProperties left, ComAdobeCqDamCfmImplContentRewriterAssetProcessorProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqDamCfmImplContentRewriterAssetProcessorProperties.
        /// </summary>
        public sealed class ComAdobeCqDamCfmImplContentRewriterAssetProcessorPropertiesBuilder
        {
            private ConfigNodePropertyString _PipelineType;

            internal ComAdobeCqDamCfmImplContentRewriterAssetProcessorPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqDamCfmImplContentRewriterAssetProcessorProperties.PipelineType property.
            /// </summary>
            /// <param name="value">PipelineType</param>
            public ComAdobeCqDamCfmImplContentRewriterAssetProcessorPropertiesBuilder PipelineType(ConfigNodePropertyString value)
            {
                _PipelineType = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqDamCfmImplContentRewriterAssetProcessorProperties.
            /// </summary>
            /// <returns>ComAdobeCqDamCfmImplContentRewriterAssetProcessorProperties</returns>
            public ComAdobeCqDamCfmImplContentRewriterAssetProcessorProperties Build()
            {
                Validate();
                return new ComAdobeCqDamCfmImplContentRewriterAssetProcessorProperties(
                    PipelineType: _PipelineType
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}