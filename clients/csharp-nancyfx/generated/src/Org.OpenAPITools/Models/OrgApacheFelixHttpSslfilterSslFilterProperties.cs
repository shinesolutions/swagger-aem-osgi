using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheFelixHttpSslfilterSslFilterProperties
    /// </summary>
    public sealed class OrgApacheFelixHttpSslfilterSslFilterProperties:  IEquatable<OrgApacheFelixHttpSslfilterSslFilterProperties>
    { 
        /// <summary>
        /// SslForwardHeader
        /// </summary>
        public ConfigNodePropertyString SslForwardHeader { get; private set; }

        /// <summary>
        /// SslForwardValue
        /// </summary>
        public ConfigNodePropertyString SslForwardValue { get; private set; }

        /// <summary>
        /// SslForwardCertHeader
        /// </summary>
        public ConfigNodePropertyString SslForwardCertHeader { get; private set; }

        /// <summary>
        /// RewriteAbsoluteUrls
        /// </summary>
        public ConfigNodePropertyBoolean RewriteAbsoluteUrls { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheFelixHttpSslfilterSslFilterProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheFelixHttpSslfilterSslFilterProperties()
        {
        }

        private OrgApacheFelixHttpSslfilterSslFilterProperties(ConfigNodePropertyString SslForwardHeader, ConfigNodePropertyString SslForwardValue, ConfigNodePropertyString SslForwardCertHeader, ConfigNodePropertyBoolean RewriteAbsoluteUrls)
        {
            
            this.SslForwardHeader = SslForwardHeader;
            
            this.SslForwardValue = SslForwardValue;
            
            this.SslForwardCertHeader = SslForwardCertHeader;
            
            this.RewriteAbsoluteUrls = RewriteAbsoluteUrls;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheFelixHttpSslfilterSslFilterProperties.
        /// </summary>
        /// <returns>OrgApacheFelixHttpSslfilterSslFilterPropertiesBuilder</returns>
        public static OrgApacheFelixHttpSslfilterSslFilterPropertiesBuilder Builder()
        {
            return new OrgApacheFelixHttpSslfilterSslFilterPropertiesBuilder();
        }

        /// <summary>
        /// Returns OrgApacheFelixHttpSslfilterSslFilterPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheFelixHttpSslfilterSslFilterPropertiesBuilder</returns>
        public OrgApacheFelixHttpSslfilterSslFilterPropertiesBuilder With()
        {
            return Builder()
                .SslForwardHeader(SslForwardHeader)
                .SslForwardValue(SslForwardValue)
                .SslForwardCertHeader(SslForwardCertHeader)
                .RewriteAbsoluteUrls(RewriteAbsoluteUrls);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(OrgApacheFelixHttpSslfilterSslFilterProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheFelixHttpSslfilterSslFilterProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheFelixHttpSslfilterSslFilterProperties</param>
        /// <param name="right">Compared (OrgApacheFelixHttpSslfilterSslFilterProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheFelixHttpSslfilterSslFilterProperties left, OrgApacheFelixHttpSslfilterSslFilterProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheFelixHttpSslfilterSslFilterProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheFelixHttpSslfilterSslFilterProperties</param>
        /// <param name="right">Compared (OrgApacheFelixHttpSslfilterSslFilterProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheFelixHttpSslfilterSslFilterProperties left, OrgApacheFelixHttpSslfilterSslFilterProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheFelixHttpSslfilterSslFilterProperties.
        /// </summary>
        public sealed class OrgApacheFelixHttpSslfilterSslFilterPropertiesBuilder
        {
            private ConfigNodePropertyString _SslForwardHeader;
            private ConfigNodePropertyString _SslForwardValue;
            private ConfigNodePropertyString _SslForwardCertHeader;
            private ConfigNodePropertyBoolean _RewriteAbsoluteUrls;

            internal OrgApacheFelixHttpSslfilterSslFilterPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheFelixHttpSslfilterSslFilterProperties.SslForwardHeader property.
            /// </summary>
            /// <param name="value">SslForwardHeader</param>
            public OrgApacheFelixHttpSslfilterSslFilterPropertiesBuilder SslForwardHeader(ConfigNodePropertyString value)
            {
                _SslForwardHeader = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheFelixHttpSslfilterSslFilterProperties.SslForwardValue property.
            /// </summary>
            /// <param name="value">SslForwardValue</param>
            public OrgApacheFelixHttpSslfilterSslFilterPropertiesBuilder SslForwardValue(ConfigNodePropertyString value)
            {
                _SslForwardValue = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheFelixHttpSslfilterSslFilterProperties.SslForwardCertHeader property.
            /// </summary>
            /// <param name="value">SslForwardCertHeader</param>
            public OrgApacheFelixHttpSslfilterSslFilterPropertiesBuilder SslForwardCertHeader(ConfigNodePropertyString value)
            {
                _SslForwardCertHeader = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheFelixHttpSslfilterSslFilterProperties.RewriteAbsoluteUrls property.
            /// </summary>
            /// <param name="value">RewriteAbsoluteUrls</param>
            public OrgApacheFelixHttpSslfilterSslFilterPropertiesBuilder RewriteAbsoluteUrls(ConfigNodePropertyBoolean value)
            {
                _RewriteAbsoluteUrls = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheFelixHttpSslfilterSslFilterProperties.
            /// </summary>
            /// <returns>OrgApacheFelixHttpSslfilterSslFilterProperties</returns>
            public OrgApacheFelixHttpSslfilterSslFilterProperties Build()
            {
                Validate();
                return new OrgApacheFelixHttpSslfilterSslFilterProperties(
                    SslForwardHeader: _SslForwardHeader,
                    SslForwardValue: _SslForwardValue,
                    SslForwardCertHeader: _SslForwardCertHeader,
                    RewriteAbsoluteUrls: _RewriteAbsoluteUrls
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}