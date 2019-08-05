using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties
    /// </summary>
    public sealed class ComAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties:  IEquatable<ComAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties>
    { 
        /// <summary>
        /// EnableDataTriggeredContent
        /// </summary>
        public ConfigNodePropertyBoolean EnableDataTriggeredContent { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties()
        {
        }

        private ComAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties(ConfigNodePropertyBoolean EnableDataTriggeredContent)
        {
            
            this.EnableDataTriggeredContent = EnableDataTriggeredContent;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties.
        /// </summary>
        /// <returns>ComAdobeCqScreensSegmentationImplSegmentationFeatureFlagPropertiesBuilder</returns>
        public static ComAdobeCqScreensSegmentationImplSegmentationFeatureFlagPropertiesBuilder Builder()
        {
            return new ComAdobeCqScreensSegmentationImplSegmentationFeatureFlagPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqScreensSegmentationImplSegmentationFeatureFlagPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqScreensSegmentationImplSegmentationFeatureFlagPropertiesBuilder</returns>
        public ComAdobeCqScreensSegmentationImplSegmentationFeatureFlagPropertiesBuilder With()
        {
            return Builder()
                .EnableDataTriggeredContent(EnableDataTriggeredContent);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties</param>
        /// <param name="right">Compared (ComAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties left, ComAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties</param>
        /// <param name="right">Compared (ComAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties left, ComAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties.
        /// </summary>
        public sealed class ComAdobeCqScreensSegmentationImplSegmentationFeatureFlagPropertiesBuilder
        {
            private ConfigNodePropertyBoolean _EnableDataTriggeredContent;

            internal ComAdobeCqScreensSegmentationImplSegmentationFeatureFlagPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties.EnableDataTriggeredContent property.
            /// </summary>
            /// <param name="value">EnableDataTriggeredContent</param>
            public ComAdobeCqScreensSegmentationImplSegmentationFeatureFlagPropertiesBuilder EnableDataTriggeredContent(ConfigNodePropertyBoolean value)
            {
                _EnableDataTriggeredContent = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties.
            /// </summary>
            /// <returns>ComAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties</returns>
            public ComAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties Build()
            {
                Validate();
                return new ComAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties(
                    EnableDataTriggeredContent: _EnableDataTriggeredContent
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}