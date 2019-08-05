using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqProjectsImplServletProjectImageServletProperties
    /// </summary>
    public sealed class ComAdobeCqProjectsImplServletProjectImageServletProperties:  IEquatable<ComAdobeCqProjectsImplServletProjectImageServletProperties>
    { 
        /// <summary>
        /// ImageQuality
        /// </summary>
        public ConfigNodePropertyString ImageQuality { get; private set; }

        /// <summary>
        /// ImageSupportedResolutions
        /// </summary>
        public ConfigNodePropertyString ImageSupportedResolutions { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqProjectsImplServletProjectImageServletProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqProjectsImplServletProjectImageServletProperties()
        {
        }

        private ComAdobeCqProjectsImplServletProjectImageServletProperties(ConfigNodePropertyString ImageQuality, ConfigNodePropertyString ImageSupportedResolutions)
        {
            
            this.ImageQuality = ImageQuality;
            
            this.ImageSupportedResolutions = ImageSupportedResolutions;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqProjectsImplServletProjectImageServletProperties.
        /// </summary>
        /// <returns>ComAdobeCqProjectsImplServletProjectImageServletPropertiesBuilder</returns>
        public static ComAdobeCqProjectsImplServletProjectImageServletPropertiesBuilder Builder()
        {
            return new ComAdobeCqProjectsImplServletProjectImageServletPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqProjectsImplServletProjectImageServletPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqProjectsImplServletProjectImageServletPropertiesBuilder</returns>
        public ComAdobeCqProjectsImplServletProjectImageServletPropertiesBuilder With()
        {
            return Builder()
                .ImageQuality(ImageQuality)
                .ImageSupportedResolutions(ImageSupportedResolutions);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeCqProjectsImplServletProjectImageServletProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqProjectsImplServletProjectImageServletProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqProjectsImplServletProjectImageServletProperties</param>
        /// <param name="right">Compared (ComAdobeCqProjectsImplServletProjectImageServletProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqProjectsImplServletProjectImageServletProperties left, ComAdobeCqProjectsImplServletProjectImageServletProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqProjectsImplServletProjectImageServletProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqProjectsImplServletProjectImageServletProperties</param>
        /// <param name="right">Compared (ComAdobeCqProjectsImplServletProjectImageServletProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqProjectsImplServletProjectImageServletProperties left, ComAdobeCqProjectsImplServletProjectImageServletProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqProjectsImplServletProjectImageServletProperties.
        /// </summary>
        public sealed class ComAdobeCqProjectsImplServletProjectImageServletPropertiesBuilder
        {
            private ConfigNodePropertyString _ImageQuality;
            private ConfigNodePropertyString _ImageSupportedResolutions;

            internal ComAdobeCqProjectsImplServletProjectImageServletPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqProjectsImplServletProjectImageServletProperties.ImageQuality property.
            /// </summary>
            /// <param name="value">ImageQuality</param>
            public ComAdobeCqProjectsImplServletProjectImageServletPropertiesBuilder ImageQuality(ConfigNodePropertyString value)
            {
                _ImageQuality = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqProjectsImplServletProjectImageServletProperties.ImageSupportedResolutions property.
            /// </summary>
            /// <param name="value">ImageSupportedResolutions</param>
            public ComAdobeCqProjectsImplServletProjectImageServletPropertiesBuilder ImageSupportedResolutions(ConfigNodePropertyString value)
            {
                _ImageSupportedResolutions = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqProjectsImplServletProjectImageServletProperties.
            /// </summary>
            /// <returns>ComAdobeCqProjectsImplServletProjectImageServletProperties</returns>
            public ComAdobeCqProjectsImplServletProjectImageServletProperties Build()
            {
                Validate();
                return new ComAdobeCqProjectsImplServletProjectImageServletProperties(
                    ImageQuality: _ImageQuality,
                    ImageSupportedResolutions: _ImageSupportedResolutions
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}