using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties
    /// </summary>
    public sealed class ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties:  IEquatable<ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties>
    { 
        /// <summary>
        /// ServiceRanking
        /// </summary>
        public ConfigNodePropertyInteger ServiceRanking { get; private set; }

        /// <summary>
        /// KeypairId
        /// </summary>
        public ConfigNodePropertyString KeypairId { get; private set; }

        /// <summary>
        /// KeypairAlias
        /// </summary>
        public ConfigNodePropertyString KeypairAlias { get; private set; }

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
        /// Use ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties()
        {
        }

        private ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties(ConfigNodePropertyInteger ServiceRanking, ConfigNodePropertyString KeypairId, ConfigNodePropertyString KeypairAlias, ConfigNodePropertyArray CdnrewriterAttributes, ConfigNodePropertyString CdnRewriterDistributionDomain)
        {
            
            this.ServiceRanking = ServiceRanking;
            
            this.KeypairId = KeypairId;
            
            this.KeypairAlias = KeypairAlias;
            
            this.CdnrewriterAttributes = CdnrewriterAttributes;
            
            this.CdnRewriterDistributionDomain = CdnRewriterDistributionDomain;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties.
        /// </summary>
        /// <returns>ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterPropertiesBuilder</returns>
        public static ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterPropertiesBuilder Builder()
        {
            return new ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterPropertiesBuilder</returns>
        public ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterPropertiesBuilder With()
        {
            return Builder()
                .ServiceRanking(ServiceRanking)
                .KeypairId(KeypairId)
                .KeypairAlias(KeypairAlias)
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

        public bool Equals(ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties</param>
        /// <param name="right">Compared (ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties left, ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties</param>
        /// <param name="right">Compared (ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties left, ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties.
        /// </summary>
        public sealed class ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterPropertiesBuilder
        {
            private ConfigNodePropertyInteger _ServiceRanking;
            private ConfigNodePropertyString _KeypairId;
            private ConfigNodePropertyString _KeypairAlias;
            private ConfigNodePropertyArray _CdnrewriterAttributes;
            private ConfigNodePropertyString _CdnRewriterDistributionDomain;

            internal ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties.ServiceRanking property.
            /// </summary>
            /// <param name="value">ServiceRanking</param>
            public ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterPropertiesBuilder ServiceRanking(ConfigNodePropertyInteger value)
            {
                _ServiceRanking = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties.KeypairId property.
            /// </summary>
            /// <param name="value">KeypairId</param>
            public ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterPropertiesBuilder KeypairId(ConfigNodePropertyString value)
            {
                _KeypairId = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties.KeypairAlias property.
            /// </summary>
            /// <param name="value">KeypairAlias</param>
            public ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterPropertiesBuilder KeypairAlias(ConfigNodePropertyString value)
            {
                _KeypairAlias = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties.CdnrewriterAttributes property.
            /// </summary>
            /// <param name="value">CdnrewriterAttributes</param>
            public ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterPropertiesBuilder CdnrewriterAttributes(ConfigNodePropertyArray value)
            {
                _CdnrewriterAttributes = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties.CdnRewriterDistributionDomain property.
            /// </summary>
            /// <param name="value">CdnRewriterDistributionDomain</param>
            public ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterPropertiesBuilder CdnRewriterDistributionDomain(ConfigNodePropertyString value)
            {
                _CdnRewriterDistributionDomain = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties.
            /// </summary>
            /// <returns>ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties</returns>
            public ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties Build()
            {
                Validate();
                return new ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties(
                    ServiceRanking: _ServiceRanking,
                    KeypairId: _KeypairId,
                    KeypairAlias: _KeypairAlias,
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