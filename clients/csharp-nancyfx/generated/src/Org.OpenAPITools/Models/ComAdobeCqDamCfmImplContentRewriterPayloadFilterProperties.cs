using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqDamCfmImplContentRewriterPayloadFilterProperties
    /// </summary>
    public sealed class ComAdobeCqDamCfmImplContentRewriterPayloadFilterProperties:  IEquatable<ComAdobeCqDamCfmImplContentRewriterPayloadFilterProperties>
    { 
        /// <summary>
        /// PipelineType
        /// </summary>
        public ConfigNodePropertyString PipelineType { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqDamCfmImplContentRewriterPayloadFilterProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqDamCfmImplContentRewriterPayloadFilterProperties()
        {
        }

        private ComAdobeCqDamCfmImplContentRewriterPayloadFilterProperties(ConfigNodePropertyString PipelineType)
        {
            
            this.PipelineType = PipelineType;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqDamCfmImplContentRewriterPayloadFilterProperties.
        /// </summary>
        /// <returns>ComAdobeCqDamCfmImplContentRewriterPayloadFilterPropertiesBuilder</returns>
        public static ComAdobeCqDamCfmImplContentRewriterPayloadFilterPropertiesBuilder Builder()
        {
            return new ComAdobeCqDamCfmImplContentRewriterPayloadFilterPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqDamCfmImplContentRewriterPayloadFilterPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqDamCfmImplContentRewriterPayloadFilterPropertiesBuilder</returns>
        public ComAdobeCqDamCfmImplContentRewriterPayloadFilterPropertiesBuilder With()
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

        public bool Equals(ComAdobeCqDamCfmImplContentRewriterPayloadFilterProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqDamCfmImplContentRewriterPayloadFilterProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqDamCfmImplContentRewriterPayloadFilterProperties</param>
        /// <param name="right">Compared (ComAdobeCqDamCfmImplContentRewriterPayloadFilterProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqDamCfmImplContentRewriterPayloadFilterProperties left, ComAdobeCqDamCfmImplContentRewriterPayloadFilterProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqDamCfmImplContentRewriterPayloadFilterProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqDamCfmImplContentRewriterPayloadFilterProperties</param>
        /// <param name="right">Compared (ComAdobeCqDamCfmImplContentRewriterPayloadFilterProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqDamCfmImplContentRewriterPayloadFilterProperties left, ComAdobeCqDamCfmImplContentRewriterPayloadFilterProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqDamCfmImplContentRewriterPayloadFilterProperties.
        /// </summary>
        public sealed class ComAdobeCqDamCfmImplContentRewriterPayloadFilterPropertiesBuilder
        {
            private ConfigNodePropertyString _PipelineType;

            internal ComAdobeCqDamCfmImplContentRewriterPayloadFilterPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqDamCfmImplContentRewriterPayloadFilterProperties.PipelineType property.
            /// </summary>
            /// <param name="value">PipelineType</param>
            public ComAdobeCqDamCfmImplContentRewriterPayloadFilterPropertiesBuilder PipelineType(ConfigNodePropertyString value)
            {
                _PipelineType = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqDamCfmImplContentRewriterPayloadFilterProperties.
            /// </summary>
            /// <returns>ComAdobeCqDamCfmImplContentRewriterPayloadFilterProperties</returns>
            public ComAdobeCqDamCfmImplContentRewriterPayloadFilterProperties Build()
            {
                Validate();
                return new ComAdobeCqDamCfmImplContentRewriterPayloadFilterProperties(
                    PipelineType: _PipelineType
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}