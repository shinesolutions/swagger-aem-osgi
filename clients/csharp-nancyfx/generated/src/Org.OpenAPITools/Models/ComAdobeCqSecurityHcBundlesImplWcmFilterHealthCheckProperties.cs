using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckProperties
    /// </summary>
    public sealed class ComAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckProperties:  IEquatable<ComAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckProperties>
    { 
        /// <summary>
        /// HcTags
        /// </summary>
        public ConfigNodePropertyArray HcTags { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckProperties()
        {
        }

        private ComAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckProperties(ConfigNodePropertyArray HcTags)
        {
            
            this.HcTags = HcTags;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckProperties.
        /// </summary>
        /// <returns>ComAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckPropertiesBuilder</returns>
        public static ComAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckPropertiesBuilder Builder()
        {
            return new ComAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckPropertiesBuilder</returns>
        public ComAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckPropertiesBuilder With()
        {
            return Builder()
                .HcTags(HcTags);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckProperties</param>
        /// <param name="right">Compared (ComAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckProperties left, ComAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckProperties</param>
        /// <param name="right">Compared (ComAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckProperties left, ComAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckProperties.
        /// </summary>
        public sealed class ComAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckPropertiesBuilder
        {
            private ConfigNodePropertyArray _HcTags;

            internal ComAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckProperties.HcTags property.
            /// </summary>
            /// <param name="value">HcTags</param>
            public ComAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckPropertiesBuilder HcTags(ConfigNodePropertyArray value)
            {
                _HcTags = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckProperties.
            /// </summary>
            /// <returns>ComAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckProperties</returns>
            public ComAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckProperties Build()
            {
                Validate();
                return new ComAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckProperties(
                    HcTags: _HcTags
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}