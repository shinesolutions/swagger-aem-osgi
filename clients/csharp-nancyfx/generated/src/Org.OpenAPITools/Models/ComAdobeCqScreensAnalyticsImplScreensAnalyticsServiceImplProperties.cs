using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties
    /// </summary>
    public sealed class ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties:  IEquatable<ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties>
    { 
        /// <summary>
        /// ComAdobeCqScreensAnalyticsImplUrl
        /// </summary>
        public ConfigNodePropertyString ComAdobeCqScreensAnalyticsImplUrl { get; private set; }

        /// <summary>
        /// ComAdobeCqScreensAnalyticsImplApikey
        /// </summary>
        public ConfigNodePropertyString ComAdobeCqScreensAnalyticsImplApikey { get; private set; }

        /// <summary>
        /// ComAdobeCqScreensAnalyticsImplProject
        /// </summary>
        public ConfigNodePropertyString ComAdobeCqScreensAnalyticsImplProject { get; private set; }

        /// <summary>
        /// ComAdobeCqScreensAnalyticsImplEnvironment
        /// </summary>
        public ConfigNodePropertyDropDown ComAdobeCqScreensAnalyticsImplEnvironment { get; private set; }

        /// <summary>
        /// ComAdobeCqScreensAnalyticsImplSendFrequency
        /// </summary>
        public ConfigNodePropertyInteger ComAdobeCqScreensAnalyticsImplSendFrequency { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties()
        {
        }

        private ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties(ConfigNodePropertyString ComAdobeCqScreensAnalyticsImplUrl, ConfigNodePropertyString ComAdobeCqScreensAnalyticsImplApikey, ConfigNodePropertyString ComAdobeCqScreensAnalyticsImplProject, ConfigNodePropertyDropDown ComAdobeCqScreensAnalyticsImplEnvironment, ConfigNodePropertyInteger ComAdobeCqScreensAnalyticsImplSendFrequency)
        {
            
            this.ComAdobeCqScreensAnalyticsImplUrl = ComAdobeCqScreensAnalyticsImplUrl;
            
            this.ComAdobeCqScreensAnalyticsImplApikey = ComAdobeCqScreensAnalyticsImplApikey;
            
            this.ComAdobeCqScreensAnalyticsImplProject = ComAdobeCqScreensAnalyticsImplProject;
            
            this.ComAdobeCqScreensAnalyticsImplEnvironment = ComAdobeCqScreensAnalyticsImplEnvironment;
            
            this.ComAdobeCqScreensAnalyticsImplSendFrequency = ComAdobeCqScreensAnalyticsImplSendFrequency;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties.
        /// </summary>
        /// <returns>ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplPropertiesBuilder</returns>
        public static ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplPropertiesBuilder Builder()
        {
            return new ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplPropertiesBuilder</returns>
        public ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplPropertiesBuilder With()
        {
            return Builder()
                .ComAdobeCqScreensAnalyticsImplUrl(ComAdobeCqScreensAnalyticsImplUrl)
                .ComAdobeCqScreensAnalyticsImplApikey(ComAdobeCqScreensAnalyticsImplApikey)
                .ComAdobeCqScreensAnalyticsImplProject(ComAdobeCqScreensAnalyticsImplProject)
                .ComAdobeCqScreensAnalyticsImplEnvironment(ComAdobeCqScreensAnalyticsImplEnvironment)
                .ComAdobeCqScreensAnalyticsImplSendFrequency(ComAdobeCqScreensAnalyticsImplSendFrequency);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties</param>
        /// <param name="right">Compared (ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties left, ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties</param>
        /// <param name="right">Compared (ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties left, ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties.
        /// </summary>
        public sealed class ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplPropertiesBuilder
        {
            private ConfigNodePropertyString _ComAdobeCqScreensAnalyticsImplUrl;
            private ConfigNodePropertyString _ComAdobeCqScreensAnalyticsImplApikey;
            private ConfigNodePropertyString _ComAdobeCqScreensAnalyticsImplProject;
            private ConfigNodePropertyDropDown _ComAdobeCqScreensAnalyticsImplEnvironment;
            private ConfigNodePropertyInteger _ComAdobeCqScreensAnalyticsImplSendFrequency;

            internal ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties.ComAdobeCqScreensAnalyticsImplUrl property.
            /// </summary>
            /// <param name="value">ComAdobeCqScreensAnalyticsImplUrl</param>
            public ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplPropertiesBuilder ComAdobeCqScreensAnalyticsImplUrl(ConfigNodePropertyString value)
            {
                _ComAdobeCqScreensAnalyticsImplUrl = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties.ComAdobeCqScreensAnalyticsImplApikey property.
            /// </summary>
            /// <param name="value">ComAdobeCqScreensAnalyticsImplApikey</param>
            public ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplPropertiesBuilder ComAdobeCqScreensAnalyticsImplApikey(ConfigNodePropertyString value)
            {
                _ComAdobeCqScreensAnalyticsImplApikey = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties.ComAdobeCqScreensAnalyticsImplProject property.
            /// </summary>
            /// <param name="value">ComAdobeCqScreensAnalyticsImplProject</param>
            public ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplPropertiesBuilder ComAdobeCqScreensAnalyticsImplProject(ConfigNodePropertyString value)
            {
                _ComAdobeCqScreensAnalyticsImplProject = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties.ComAdobeCqScreensAnalyticsImplEnvironment property.
            /// </summary>
            /// <param name="value">ComAdobeCqScreensAnalyticsImplEnvironment</param>
            public ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplPropertiesBuilder ComAdobeCqScreensAnalyticsImplEnvironment(ConfigNodePropertyDropDown value)
            {
                _ComAdobeCqScreensAnalyticsImplEnvironment = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties.ComAdobeCqScreensAnalyticsImplSendFrequency property.
            /// </summary>
            /// <param name="value">ComAdobeCqScreensAnalyticsImplSendFrequency</param>
            public ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplPropertiesBuilder ComAdobeCqScreensAnalyticsImplSendFrequency(ConfigNodePropertyInteger value)
            {
                _ComAdobeCqScreensAnalyticsImplSendFrequency = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties.
            /// </summary>
            /// <returns>ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties</returns>
            public ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties Build()
            {
                Validate();
                return new ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties(
                    ComAdobeCqScreensAnalyticsImplUrl: _ComAdobeCqScreensAnalyticsImplUrl,
                    ComAdobeCqScreensAnalyticsImplApikey: _ComAdobeCqScreensAnalyticsImplApikey,
                    ComAdobeCqScreensAnalyticsImplProject: _ComAdobeCqScreensAnalyticsImplProject,
                    ComAdobeCqScreensAnalyticsImplEnvironment: _ComAdobeCqScreensAnalyticsImplEnvironment,
                    ComAdobeCqScreensAnalyticsImplSendFrequency: _ComAdobeCqScreensAnalyticsImplSendFrequency
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}