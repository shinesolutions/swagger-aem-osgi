using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqSocialUserImplTransportHttpToPublisherProperties
    /// </summary>
    public sealed class ComAdobeCqSocialUserImplTransportHttpToPublisherProperties:  IEquatable<ComAdobeCqSocialUserImplTransportHttpToPublisherProperties>
    { 
        /// <summary>
        /// Enable
        /// </summary>
        public ConfigNodePropertyBoolean Enable { get; private set; }

        /// <summary>
        /// AgentConfiguration
        /// </summary>
        public ConfigNodePropertyArray AgentConfiguration { get; private set; }

        /// <summary>
        /// ContextPath
        /// </summary>
        public ConfigNodePropertyString ContextPath { get; private set; }

        /// <summary>
        /// DisabledCipherSuites
        /// </summary>
        public ConfigNodePropertyArray DisabledCipherSuites { get; private set; }

        /// <summary>
        /// EnabledCipherSuites
        /// </summary>
        public ConfigNodePropertyArray EnabledCipherSuites { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqSocialUserImplTransportHttpToPublisherProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqSocialUserImplTransportHttpToPublisherProperties()
        {
        }

        private ComAdobeCqSocialUserImplTransportHttpToPublisherProperties(ConfigNodePropertyBoolean Enable, ConfigNodePropertyArray AgentConfiguration, ConfigNodePropertyString ContextPath, ConfigNodePropertyArray DisabledCipherSuites, ConfigNodePropertyArray EnabledCipherSuites)
        {
            
            this.Enable = Enable;
            
            this.AgentConfiguration = AgentConfiguration;
            
            this.ContextPath = ContextPath;
            
            this.DisabledCipherSuites = DisabledCipherSuites;
            
            this.EnabledCipherSuites = EnabledCipherSuites;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqSocialUserImplTransportHttpToPublisherProperties.
        /// </summary>
        /// <returns>ComAdobeCqSocialUserImplTransportHttpToPublisherPropertiesBuilder</returns>
        public static ComAdobeCqSocialUserImplTransportHttpToPublisherPropertiesBuilder Builder()
        {
            return new ComAdobeCqSocialUserImplTransportHttpToPublisherPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqSocialUserImplTransportHttpToPublisherPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqSocialUserImplTransportHttpToPublisherPropertiesBuilder</returns>
        public ComAdobeCqSocialUserImplTransportHttpToPublisherPropertiesBuilder With()
        {
            return Builder()
                .Enable(Enable)
                .AgentConfiguration(AgentConfiguration)
                .ContextPath(ContextPath)
                .DisabledCipherSuites(DisabledCipherSuites)
                .EnabledCipherSuites(EnabledCipherSuites);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeCqSocialUserImplTransportHttpToPublisherProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqSocialUserImplTransportHttpToPublisherProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialUserImplTransportHttpToPublisherProperties</param>
        /// <param name="right">Compared (ComAdobeCqSocialUserImplTransportHttpToPublisherProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqSocialUserImplTransportHttpToPublisherProperties left, ComAdobeCqSocialUserImplTransportHttpToPublisherProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqSocialUserImplTransportHttpToPublisherProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialUserImplTransportHttpToPublisherProperties</param>
        /// <param name="right">Compared (ComAdobeCqSocialUserImplTransportHttpToPublisherProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqSocialUserImplTransportHttpToPublisherProperties left, ComAdobeCqSocialUserImplTransportHttpToPublisherProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqSocialUserImplTransportHttpToPublisherProperties.
        /// </summary>
        public sealed class ComAdobeCqSocialUserImplTransportHttpToPublisherPropertiesBuilder
        {
            private ConfigNodePropertyBoolean _Enable;
            private ConfigNodePropertyArray _AgentConfiguration;
            private ConfigNodePropertyString _ContextPath;
            private ConfigNodePropertyArray _DisabledCipherSuites;
            private ConfigNodePropertyArray _EnabledCipherSuites;

            internal ComAdobeCqSocialUserImplTransportHttpToPublisherPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialUserImplTransportHttpToPublisherProperties.Enable property.
            /// </summary>
            /// <param name="value">Enable</param>
            public ComAdobeCqSocialUserImplTransportHttpToPublisherPropertiesBuilder Enable(ConfigNodePropertyBoolean value)
            {
                _Enable = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialUserImplTransportHttpToPublisherProperties.AgentConfiguration property.
            /// </summary>
            /// <param name="value">AgentConfiguration</param>
            public ComAdobeCqSocialUserImplTransportHttpToPublisherPropertiesBuilder AgentConfiguration(ConfigNodePropertyArray value)
            {
                _AgentConfiguration = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialUserImplTransportHttpToPublisherProperties.ContextPath property.
            /// </summary>
            /// <param name="value">ContextPath</param>
            public ComAdobeCqSocialUserImplTransportHttpToPublisherPropertiesBuilder ContextPath(ConfigNodePropertyString value)
            {
                _ContextPath = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialUserImplTransportHttpToPublisherProperties.DisabledCipherSuites property.
            /// </summary>
            /// <param name="value">DisabledCipherSuites</param>
            public ComAdobeCqSocialUserImplTransportHttpToPublisherPropertiesBuilder DisabledCipherSuites(ConfigNodePropertyArray value)
            {
                _DisabledCipherSuites = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialUserImplTransportHttpToPublisherProperties.EnabledCipherSuites property.
            /// </summary>
            /// <param name="value">EnabledCipherSuites</param>
            public ComAdobeCqSocialUserImplTransportHttpToPublisherPropertiesBuilder EnabledCipherSuites(ConfigNodePropertyArray value)
            {
                _EnabledCipherSuites = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqSocialUserImplTransportHttpToPublisherProperties.
            /// </summary>
            /// <returns>ComAdobeCqSocialUserImplTransportHttpToPublisherProperties</returns>
            public ComAdobeCqSocialUserImplTransportHttpToPublisherProperties Build()
            {
                Validate();
                return new ComAdobeCqSocialUserImplTransportHttpToPublisherProperties(
                    Enable: _Enable,
                    AgentConfiguration: _AgentConfiguration,
                    ContextPath: _ContextPath,
                    DisabledCipherSuites: _DisabledCipherSuites,
                    EnabledCipherSuites: _EnabledCipherSuites
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}