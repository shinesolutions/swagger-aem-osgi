using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqCdnRewriterImplCDNRewriterProperties
    /// </summary>
    public sealed class ComAdobeCqCdnRewriterImplCDNRewriterProperties:  IEquatable<ComAdobeCqCdnRewriterImplCDNRewriterProperties>
    { 
        /// <summary>
        /// ServiceRanking
        /// </summary>
        public ConfigNodePropertyInteger ServiceRanking { get; private set; }

        /// <summary>
        /// CdnrewriterAttributes
        /// </summary>
        public ConfigNodePropertyArray CdnrewriterAttributes { get; private set; }

        /// <summary>
        /// CdnRewriterDistributionDomain
        /// </summary>
        public ConfigNodePropertyString CdnRewriterDistributionDomain { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqCdnRewriterImplCDNRewriterProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqCdnRewriterImplCDNRewriterProperties()
        {
        }

        private ComAdobeCqCdnRewriterImplCDNRewriterProperties(ConfigNodePropertyInteger ServiceRanking, ConfigNodePropertyArray CdnrewriterAttributes, ConfigNodePropertyString CdnRewriterDistributionDomain)
        {
            
            this.ServiceRanking = ServiceRanking;
            
            this.CdnrewriterAttributes = CdnrewriterAttributes;
            
            this.CdnRewriterDistributionDomain = CdnRewriterDistributionDomain;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqCdnRewriterImplCDNRewriterProperties.
        /// </summary>
        /// <returns>ComAdobeCqCdnRewriterImplCDNRewriterPropertiesBuilder</returns>
        public static ComAdobeCqCdnRewriterImplCDNRewriterPropertiesBuilder Builder()
        {
            return new ComAdobeCqCdnRewriterImplCDNRewriterPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqCdnRewriterImplCDNRewriterPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqCdnRewriterImplCDNRewriterPropertiesBuilder</returns>
        public ComAdobeCqCdnRewriterImplCDNRewriterPropertiesBuilder With()
        {
            return Builder()
                .ServiceRanking(ServiceRanking)
                .CdnrewriterAttributes(CdnrewriterAttributes)
                .CdnRewriterDistributionDomain(CdnRewriterDistributionDomain);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeCqCdnRewriterImplCDNRewriterProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqCdnRewriterImplCDNRewriterProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqCdnRewriterImplCDNRewriterProperties</param>
        /// <param name="right">Compared (ComAdobeCqCdnRewriterImplCDNRewriterProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqCdnRewriterImplCDNRewriterProperties left, ComAdobeCqCdnRewriterImplCDNRewriterProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqCdnRewriterImplCDNRewriterProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqCdnRewriterImplCDNRewriterProperties</param>
        /// <param name="right">Compared (ComAdobeCqCdnRewriterImplCDNRewriterProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqCdnRewriterImplCDNRewriterProperties left, ComAdobeCqCdnRewriterImplCDNRewriterProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqCdnRewriterImplCDNRewriterProperties.
        /// </summary>
        public sealed class ComAdobeCqCdnRewriterImplCDNRewriterPropertiesBuilder
        {
            private ConfigNodePropertyInteger _ServiceRanking;
            private ConfigNodePropertyArray _CdnrewriterAttributes;
            private ConfigNodePropertyString _CdnRewriterDistributionDomain;

            internal ComAdobeCqCdnRewriterImplCDNRewriterPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqCdnRewriterImplCDNRewriterProperties.ServiceRanking property.
            /// </summary>
            /// <param name="value">ServiceRanking</param>
            public ComAdobeCqCdnRewriterImplCDNRewriterPropertiesBuilder ServiceRanking(ConfigNodePropertyInteger value)
            {
                _ServiceRanking = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqCdnRewriterImplCDNRewriterProperties.CdnrewriterAttributes property.
            /// </summary>
            /// <param name="value">CdnrewriterAttributes</param>
            public ComAdobeCqCdnRewriterImplCDNRewriterPropertiesBuilder CdnrewriterAttributes(ConfigNodePropertyArray value)
            {
                _CdnrewriterAttributes = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqCdnRewriterImplCDNRewriterProperties.CdnRewriterDistributionDomain property.
            /// </summary>
            /// <param name="value">CdnRewriterDistributionDomain</param>
            public ComAdobeCqCdnRewriterImplCDNRewriterPropertiesBuilder CdnRewriterDistributionDomain(ConfigNodePropertyString value)
            {
                _CdnRewriterDistributionDomain = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqCdnRewriterImplCDNRewriterProperties.
            /// </summary>
            /// <returns>ComAdobeCqCdnRewriterImplCDNRewriterProperties</returns>
            public ComAdobeCqCdnRewriterImplCDNRewriterProperties Build()
            {
                Validate();
                return new ComAdobeCqCdnRewriterImplCDNRewriterProperties(
                    ServiceRanking: _ServiceRanking,
                    CdnrewriterAttributes: _CdnrewriterAttributes,
                    CdnRewriterDistributionDomain: _CdnRewriterDistributionDomain
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}