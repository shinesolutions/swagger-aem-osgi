using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties
    /// </summary>
    public sealed class ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties:  IEquatable<ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties>
    { 
        /// <summary>
        /// CdnConfigDistributionDomain
        /// </summary>
        public ConfigNodePropertyString CdnConfigDistributionDomain { get; private set; }

        /// <summary>
        /// CdnConfigEnableRewriting
        /// </summary>
        public ConfigNodePropertyBoolean CdnConfigEnableRewriting { get; private set; }

        /// <summary>
        /// CdnConfigPathPrefixes
        /// </summary>
        public ConfigNodePropertyArray CdnConfigPathPrefixes { get; private set; }

        /// <summary>
        /// CdnConfigCdnttl
        /// </summary>
        public ConfigNodePropertyInteger CdnConfigCdnttl { get; private set; }

        /// <summary>
        /// CdnConfigApplicationProtocol
        /// </summary>
        public ConfigNodePropertyString CdnConfigApplicationProtocol { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties()
        {
        }

        private ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties(ConfigNodePropertyString CdnConfigDistributionDomain, ConfigNodePropertyBoolean CdnConfigEnableRewriting, ConfigNodePropertyArray CdnConfigPathPrefixes, ConfigNodePropertyInteger CdnConfigCdnttl, ConfigNodePropertyString CdnConfigApplicationProtocol)
        {
            
            this.CdnConfigDistributionDomain = CdnConfigDistributionDomain;
            
            this.CdnConfigEnableRewriting = CdnConfigEnableRewriting;
            
            this.CdnConfigPathPrefixes = CdnConfigPathPrefixes;
            
            this.CdnConfigCdnttl = CdnConfigCdnttl;
            
            this.CdnConfigApplicationProtocol = CdnConfigApplicationProtocol;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties.
        /// </summary>
        /// <returns>ComAdobeCqCdnRewriterImplCDNConfigServiceImplPropertiesBuilder</returns>
        public static ComAdobeCqCdnRewriterImplCDNConfigServiceImplPropertiesBuilder Builder()
        {
            return new ComAdobeCqCdnRewriterImplCDNConfigServiceImplPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqCdnRewriterImplCDNConfigServiceImplPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqCdnRewriterImplCDNConfigServiceImplPropertiesBuilder</returns>
        public ComAdobeCqCdnRewriterImplCDNConfigServiceImplPropertiesBuilder With()
        {
            return Builder()
                .CdnConfigDistributionDomain(CdnConfigDistributionDomain)
                .CdnConfigEnableRewriting(CdnConfigEnableRewriting)
                .CdnConfigPathPrefixes(CdnConfigPathPrefixes)
                .CdnConfigCdnttl(CdnConfigCdnttl)
                .CdnConfigApplicationProtocol(CdnConfigApplicationProtocol);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties</param>
        /// <param name="right">Compared (ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties left, ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties</param>
        /// <param name="right">Compared (ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties left, ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties.
        /// </summary>
        public sealed class ComAdobeCqCdnRewriterImplCDNConfigServiceImplPropertiesBuilder
        {
            private ConfigNodePropertyString _CdnConfigDistributionDomain;
            private ConfigNodePropertyBoolean _CdnConfigEnableRewriting;
            private ConfigNodePropertyArray _CdnConfigPathPrefixes;
            private ConfigNodePropertyInteger _CdnConfigCdnttl;
            private ConfigNodePropertyString _CdnConfigApplicationProtocol;

            internal ComAdobeCqCdnRewriterImplCDNConfigServiceImplPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties.CdnConfigDistributionDomain property.
            /// </summary>
            /// <param name="value">CdnConfigDistributionDomain</param>
            public ComAdobeCqCdnRewriterImplCDNConfigServiceImplPropertiesBuilder CdnConfigDistributionDomain(ConfigNodePropertyString value)
            {
                _CdnConfigDistributionDomain = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties.CdnConfigEnableRewriting property.
            /// </summary>
            /// <param name="value">CdnConfigEnableRewriting</param>
            public ComAdobeCqCdnRewriterImplCDNConfigServiceImplPropertiesBuilder CdnConfigEnableRewriting(ConfigNodePropertyBoolean value)
            {
                _CdnConfigEnableRewriting = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties.CdnConfigPathPrefixes property.
            /// </summary>
            /// <param name="value">CdnConfigPathPrefixes</param>
            public ComAdobeCqCdnRewriterImplCDNConfigServiceImplPropertiesBuilder CdnConfigPathPrefixes(ConfigNodePropertyArray value)
            {
                _CdnConfigPathPrefixes = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties.CdnConfigCdnttl property.
            /// </summary>
            /// <param name="value">CdnConfigCdnttl</param>
            public ComAdobeCqCdnRewriterImplCDNConfigServiceImplPropertiesBuilder CdnConfigCdnttl(ConfigNodePropertyInteger value)
            {
                _CdnConfigCdnttl = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties.CdnConfigApplicationProtocol property.
            /// </summary>
            /// <param name="value">CdnConfigApplicationProtocol</param>
            public ComAdobeCqCdnRewriterImplCDNConfigServiceImplPropertiesBuilder CdnConfigApplicationProtocol(ConfigNodePropertyString value)
            {
                _CdnConfigApplicationProtocol = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties.
            /// </summary>
            /// <returns>ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties</returns>
            public ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties Build()
            {
                Validate();
                return new ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties(
                    CdnConfigDistributionDomain: _CdnConfigDistributionDomain,
                    CdnConfigEnableRewriting: _CdnConfigEnableRewriting,
                    CdnConfigPathPrefixes: _CdnConfigPathPrefixes,
                    CdnConfigCdnttl: _CdnConfigCdnttl,
                    CdnConfigApplicationProtocol: _CdnConfigApplicationProtocol
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}