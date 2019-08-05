using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqDamCfmImplContentRewriterParRangeFilterProperties
    /// </summary>
    public sealed class ComAdobeCqDamCfmImplContentRewriterParRangeFilterProperties:  IEquatable<ComAdobeCqDamCfmImplContentRewriterParRangeFilterProperties>
    { 
        /// <summary>
        /// PipelineType
        /// </summary>
        public ConfigNodePropertyString PipelineType { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqDamCfmImplContentRewriterParRangeFilterProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqDamCfmImplContentRewriterParRangeFilterProperties()
        {
        }

        private ComAdobeCqDamCfmImplContentRewriterParRangeFilterProperties(ConfigNodePropertyString PipelineType)
        {
            
            this.PipelineType = PipelineType;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqDamCfmImplContentRewriterParRangeFilterProperties.
        /// </summary>
        /// <returns>ComAdobeCqDamCfmImplContentRewriterParRangeFilterPropertiesBuilder</returns>
        public static ComAdobeCqDamCfmImplContentRewriterParRangeFilterPropertiesBuilder Builder()
        {
            return new ComAdobeCqDamCfmImplContentRewriterParRangeFilterPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqDamCfmImplContentRewriterParRangeFilterPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqDamCfmImplContentRewriterParRangeFilterPropertiesBuilder</returns>
        public ComAdobeCqDamCfmImplContentRewriterParRangeFilterPropertiesBuilder With()
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

        public bool Equals(ComAdobeCqDamCfmImplContentRewriterParRangeFilterProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqDamCfmImplContentRewriterParRangeFilterProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqDamCfmImplContentRewriterParRangeFilterProperties</param>
        /// <param name="right">Compared (ComAdobeCqDamCfmImplContentRewriterParRangeFilterProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqDamCfmImplContentRewriterParRangeFilterProperties left, ComAdobeCqDamCfmImplContentRewriterParRangeFilterProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqDamCfmImplContentRewriterParRangeFilterProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqDamCfmImplContentRewriterParRangeFilterProperties</param>
        /// <param name="right">Compared (ComAdobeCqDamCfmImplContentRewriterParRangeFilterProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqDamCfmImplContentRewriterParRangeFilterProperties left, ComAdobeCqDamCfmImplContentRewriterParRangeFilterProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqDamCfmImplContentRewriterParRangeFilterProperties.
        /// </summary>
        public sealed class ComAdobeCqDamCfmImplContentRewriterParRangeFilterPropertiesBuilder
        {
            private ConfigNodePropertyString _PipelineType;

            internal ComAdobeCqDamCfmImplContentRewriterParRangeFilterPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqDamCfmImplContentRewriterParRangeFilterProperties.PipelineType property.
            /// </summary>
            /// <param name="value">PipelineType</param>
            public ComAdobeCqDamCfmImplContentRewriterParRangeFilterPropertiesBuilder PipelineType(ConfigNodePropertyString value)
            {
                _PipelineType = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqDamCfmImplContentRewriterParRangeFilterProperties.
            /// </summary>
            /// <returns>ComAdobeCqDamCfmImplContentRewriterParRangeFilterProperties</returns>
            public ComAdobeCqDamCfmImplContentRewriterParRangeFilterProperties Build()
            {
                Validate();
                return new ComAdobeCqDamCfmImplContentRewriterParRangeFilterProperties(
                    PipelineType: _PipelineType
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}