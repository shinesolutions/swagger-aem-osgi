using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckProperties
    /// </summary>
    public sealed class ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckProperties:  IEquatable<ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckProperties>
    { 
        /// <summary>
        /// HcTags
        /// </summary>
        public ConfigNodePropertyArray HcTags { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckProperties()
        {
        }

        private ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckProperties(ConfigNodePropertyArray HcTags)
        {
            
            this.HcTags = HcTags;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckProperties.
        /// </summary>
        /// <returns>ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckPropertiesBuilder</returns>
        public static ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckPropertiesBuilder Builder()
        {
            return new ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckPropertiesBuilder</returns>
        public ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckPropertiesBuilder With()
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

        public bool Equals(ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckProperties</param>
        /// <param name="right">Compared (ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckProperties left, ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckProperties</param>
        /// <param name="right">Compared (ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckProperties left, ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckProperties.
        /// </summary>
        public sealed class ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckPropertiesBuilder
        {
            private ConfigNodePropertyArray _HcTags;

            internal ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckProperties.HcTags property.
            /// </summary>
            /// <param name="value">HcTags</param>
            public ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckPropertiesBuilder HcTags(ConfigNodePropertyArray value)
            {
                _HcTags = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckProperties.
            /// </summary>
            /// <returns>ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckProperties</returns>
            public ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckProperties Build()
            {
                Validate();
                return new ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckProperties(
                    HcTags: _HcTags
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}