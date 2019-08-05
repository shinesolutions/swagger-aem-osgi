using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqScreensImplScreensChannelPostProcessorProperties
    /// </summary>
    public sealed class ComAdobeCqScreensImplScreensChannelPostProcessorProperties:  IEquatable<ComAdobeCqScreensImplScreensChannelPostProcessorProperties>
    { 
        /// <summary>
        /// ScreensChannelsPropertiesToRemove
        /// </summary>
        public ConfigNodePropertyArray ScreensChannelsPropertiesToRemove { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqScreensImplScreensChannelPostProcessorProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqScreensImplScreensChannelPostProcessorProperties()
        {
        }

        private ComAdobeCqScreensImplScreensChannelPostProcessorProperties(ConfigNodePropertyArray ScreensChannelsPropertiesToRemove)
        {
            
            this.ScreensChannelsPropertiesToRemove = ScreensChannelsPropertiesToRemove;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqScreensImplScreensChannelPostProcessorProperties.
        /// </summary>
        /// <returns>ComAdobeCqScreensImplScreensChannelPostProcessorPropertiesBuilder</returns>
        public static ComAdobeCqScreensImplScreensChannelPostProcessorPropertiesBuilder Builder()
        {
            return new ComAdobeCqScreensImplScreensChannelPostProcessorPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqScreensImplScreensChannelPostProcessorPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqScreensImplScreensChannelPostProcessorPropertiesBuilder</returns>
        public ComAdobeCqScreensImplScreensChannelPostProcessorPropertiesBuilder With()
        {
            return Builder()
                .ScreensChannelsPropertiesToRemove(ScreensChannelsPropertiesToRemove);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeCqScreensImplScreensChannelPostProcessorProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqScreensImplScreensChannelPostProcessorProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqScreensImplScreensChannelPostProcessorProperties</param>
        /// <param name="right">Compared (ComAdobeCqScreensImplScreensChannelPostProcessorProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqScreensImplScreensChannelPostProcessorProperties left, ComAdobeCqScreensImplScreensChannelPostProcessorProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqScreensImplScreensChannelPostProcessorProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqScreensImplScreensChannelPostProcessorProperties</param>
        /// <param name="right">Compared (ComAdobeCqScreensImplScreensChannelPostProcessorProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqScreensImplScreensChannelPostProcessorProperties left, ComAdobeCqScreensImplScreensChannelPostProcessorProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqScreensImplScreensChannelPostProcessorProperties.
        /// </summary>
        public sealed class ComAdobeCqScreensImplScreensChannelPostProcessorPropertiesBuilder
        {
            private ConfigNodePropertyArray _ScreensChannelsPropertiesToRemove;

            internal ComAdobeCqScreensImplScreensChannelPostProcessorPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqScreensImplScreensChannelPostProcessorProperties.ScreensChannelsPropertiesToRemove property.
            /// </summary>
            /// <param name="value">ScreensChannelsPropertiesToRemove</param>
            public ComAdobeCqScreensImplScreensChannelPostProcessorPropertiesBuilder ScreensChannelsPropertiesToRemove(ConfigNodePropertyArray value)
            {
                _ScreensChannelsPropertiesToRemove = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqScreensImplScreensChannelPostProcessorProperties.
            /// </summary>
            /// <returns>ComAdobeCqScreensImplScreensChannelPostProcessorProperties</returns>
            public ComAdobeCqScreensImplScreensChannelPostProcessorProperties Build()
            {
                Validate();
                return new ComAdobeCqScreensImplScreensChannelPostProcessorProperties(
                    ScreensChannelsPropertiesToRemove: _ScreensChannelsPropertiesToRemove
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}