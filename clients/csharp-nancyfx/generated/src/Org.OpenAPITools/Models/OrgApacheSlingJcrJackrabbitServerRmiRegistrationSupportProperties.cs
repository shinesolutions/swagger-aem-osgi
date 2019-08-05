using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties
    /// </summary>
    public sealed class OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties:  IEquatable<OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties>
    { 
        /// <summary>
        /// Port
        /// </summary>
        public ConfigNodePropertyInteger Port { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties()
        {
        }

        private OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties(ConfigNodePropertyInteger Port)
        {
            
            this.Port = Port;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties.
        /// </summary>
        /// <returns>OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportPropertiesBuilder</returns>
        public static OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportPropertiesBuilder Builder()
        {
            return new OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportPropertiesBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportPropertiesBuilder</returns>
        public OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportPropertiesBuilder With()
        {
            return Builder()
                .Port(Port);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties</param>
        /// <param name="right">Compared (OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties left, OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties</param>
        /// <param name="right">Compared (OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties left, OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties.
        /// </summary>
        public sealed class OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportPropertiesBuilder
        {
            private ConfigNodePropertyInteger _Port;

            internal OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties.Port property.
            /// </summary>
            /// <param name="value">Port</param>
            public OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportPropertiesBuilder Port(ConfigNodePropertyInteger value)
            {
                _Port = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties.
            /// </summary>
            /// <returns>OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties</returns>
            public OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties Build()
            {
                Validate();
                return new OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties(
                    Port: _Port
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}