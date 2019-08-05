using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqMcmImplMCMConfigurationProperties
    /// </summary>
    public sealed class ComDayCqMcmImplMCMConfigurationProperties:  IEquatable<ComDayCqMcmImplMCMConfigurationProperties>
    { 
        /// <summary>
        /// ExperienceIndirection
        /// </summary>
        public ConfigNodePropertyArray ExperienceIndirection { get; private set; }

        /// <summary>
        /// TouchpointIndirection
        /// </summary>
        public ConfigNodePropertyArray TouchpointIndirection { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqMcmImplMCMConfigurationProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqMcmImplMCMConfigurationProperties()
        {
        }

        private ComDayCqMcmImplMCMConfigurationProperties(ConfigNodePropertyArray ExperienceIndirection, ConfigNodePropertyArray TouchpointIndirection)
        {
            
            this.ExperienceIndirection = ExperienceIndirection;
            
            this.TouchpointIndirection = TouchpointIndirection;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqMcmImplMCMConfigurationProperties.
        /// </summary>
        /// <returns>ComDayCqMcmImplMCMConfigurationPropertiesBuilder</returns>
        public static ComDayCqMcmImplMCMConfigurationPropertiesBuilder Builder()
        {
            return new ComDayCqMcmImplMCMConfigurationPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqMcmImplMCMConfigurationPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqMcmImplMCMConfigurationPropertiesBuilder</returns>
        public ComDayCqMcmImplMCMConfigurationPropertiesBuilder With()
        {
            return Builder()
                .ExperienceIndirection(ExperienceIndirection)
                .TouchpointIndirection(TouchpointIndirection);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqMcmImplMCMConfigurationProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqMcmImplMCMConfigurationProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqMcmImplMCMConfigurationProperties</param>
        /// <param name="right">Compared (ComDayCqMcmImplMCMConfigurationProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqMcmImplMCMConfigurationProperties left, ComDayCqMcmImplMCMConfigurationProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqMcmImplMCMConfigurationProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqMcmImplMCMConfigurationProperties</param>
        /// <param name="right">Compared (ComDayCqMcmImplMCMConfigurationProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqMcmImplMCMConfigurationProperties left, ComDayCqMcmImplMCMConfigurationProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqMcmImplMCMConfigurationProperties.
        /// </summary>
        public sealed class ComDayCqMcmImplMCMConfigurationPropertiesBuilder
        {
            private ConfigNodePropertyArray _ExperienceIndirection;
            private ConfigNodePropertyArray _TouchpointIndirection;

            internal ComDayCqMcmImplMCMConfigurationPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqMcmImplMCMConfigurationProperties.ExperienceIndirection property.
            /// </summary>
            /// <param name="value">ExperienceIndirection</param>
            public ComDayCqMcmImplMCMConfigurationPropertiesBuilder ExperienceIndirection(ConfigNodePropertyArray value)
            {
                _ExperienceIndirection = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqMcmImplMCMConfigurationProperties.TouchpointIndirection property.
            /// </summary>
            /// <param name="value">TouchpointIndirection</param>
            public ComDayCqMcmImplMCMConfigurationPropertiesBuilder TouchpointIndirection(ConfigNodePropertyArray value)
            {
                _TouchpointIndirection = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqMcmImplMCMConfigurationProperties.
            /// </summary>
            /// <returns>ComDayCqMcmImplMCMConfigurationProperties</returns>
            public ComDayCqMcmImplMCMConfigurationProperties Build()
            {
                Validate();
                return new ComDayCqMcmImplMCMConfigurationProperties(
                    ExperienceIndirection: _ExperienceIndirection,
                    TouchpointIndirection: _TouchpointIndirection
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}