using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties
    /// </summary>
    public sealed class ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties:  IEquatable<ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties>
    { 
        /// <summary>
        /// HcTags
        /// </summary>
        public ConfigNodePropertyArray HcTags { get; private set; }

        /// <summary>
        /// AccountLogins
        /// </summary>
        public ConfigNodePropertyArray AccountLogins { get; private set; }

        /// <summary>
        /// ConsoleLogins
        /// </summary>
        public ConfigNodePropertyArray ConsoleLogins { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties()
        {
        }

        private ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties(ConfigNodePropertyArray HcTags, ConfigNodePropertyArray AccountLogins, ConfigNodePropertyArray ConsoleLogins)
        {
            
            this.HcTags = HcTags;
            
            this.AccountLogins = AccountLogins;
            
            this.ConsoleLogins = ConsoleLogins;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties.
        /// </summary>
        /// <returns>ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckPropertiesBuilder</returns>
        public static ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckPropertiesBuilder Builder()
        {
            return new ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckPropertiesBuilder</returns>
        public ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckPropertiesBuilder With()
        {
            return Builder()
                .HcTags(HcTags)
                .AccountLogins(AccountLogins)
                .ConsoleLogins(ConsoleLogins);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties left, ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties left, ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties.
        /// </summary>
        public sealed class ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckPropertiesBuilder
        {
            private ConfigNodePropertyArray _HcTags;
            private ConfigNodePropertyArray _AccountLogins;
            private ConfigNodePropertyArray _ConsoleLogins;

            internal ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties.HcTags property.
            /// </summary>
            /// <param name="value">HcTags</param>
            public ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckPropertiesBuilder HcTags(ConfigNodePropertyArray value)
            {
                _HcTags = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties.AccountLogins property.
            /// </summary>
            /// <param name="value">AccountLogins</param>
            public ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckPropertiesBuilder AccountLogins(ConfigNodePropertyArray value)
            {
                _AccountLogins = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties.ConsoleLogins property.
            /// </summary>
            /// <param name="value">ConsoleLogins</param>
            public ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckPropertiesBuilder ConsoleLogins(ConfigNodePropertyArray value)
            {
                _ConsoleLogins = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties.
            /// </summary>
            /// <returns>ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties</returns>
            public ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties Build()
            {
                Validate();
                return new ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties(
                    HcTags: _HcTags,
                    AccountLogins: _AccountLogins,
                    ConsoleLogins: _ConsoleLogins
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}