using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties
    /// </summary>
    public sealed class ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties:  IEquatable<ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties>
    { 
        /// <summary>
        /// HcTags
        /// </summary>
        public ConfigNodePropertyArray HcTags { get; private set; }

        /// <summary>
        /// WebserverAddress
        /// </summary>
        public ConfigNodePropertyString WebserverAddress { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties()
        {
        }

        private ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties(ConfigNodePropertyArray HcTags, ConfigNodePropertyString WebserverAddress)
        {
            
            this.HcTags = HcTags;
            
            this.WebserverAddress = WebserverAddress;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties.
        /// </summary>
        /// <returns>ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckPropertiesBuilder</returns>
        public static ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckPropertiesBuilder Builder()
        {
            return new ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckPropertiesBuilder</returns>
        public ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckPropertiesBuilder With()
        {
            return Builder()
                .HcTags(HcTags)
                .WebserverAddress(WebserverAddress);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties</param>
        /// <param name="right">Compared (ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties left, ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties</param>
        /// <param name="right">Compared (ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties left, ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties.
        /// </summary>
        public sealed class ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckPropertiesBuilder
        {
            private ConfigNodePropertyArray _HcTags;
            private ConfigNodePropertyString _WebserverAddress;

            internal ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties.HcTags property.
            /// </summary>
            /// <param name="value">HcTags</param>
            public ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckPropertiesBuilder HcTags(ConfigNodePropertyArray value)
            {
                _HcTags = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties.WebserverAddress property.
            /// </summary>
            /// <param name="value">WebserverAddress</param>
            public ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckPropertiesBuilder WebserverAddress(ConfigNodePropertyString value)
            {
                _WebserverAddress = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties.
            /// </summary>
            /// <returns>ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties</returns>
            public ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties Build()
            {
                Validate();
                return new ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties(
                    HcTags: _HcTags,
                    WebserverAddress: _WebserverAddress
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}