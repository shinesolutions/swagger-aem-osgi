using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties
    /// </summary>
    public sealed class ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties:  IEquatable<ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties>
    { 
        /// <summary>
        /// HcTags
        /// </summary>
        public ConfigNodePropertyArray HcTags { get; private set; }

        /// <summary>
        /// DispatcherAddress
        /// </summary>
        public ConfigNodePropertyString DispatcherAddress { get; private set; }

        /// <summary>
        /// DispatcherFilterAllowed
        /// </summary>
        public ConfigNodePropertyArray DispatcherFilterAllowed { get; private set; }

        /// <summary>
        /// DispatcherFilterBlocked
        /// </summary>
        public ConfigNodePropertyArray DispatcherFilterBlocked { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties()
        {
        }

        private ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties(ConfigNodePropertyArray HcTags, ConfigNodePropertyString DispatcherAddress, ConfigNodePropertyArray DispatcherFilterAllowed, ConfigNodePropertyArray DispatcherFilterBlocked)
        {
            
            this.HcTags = HcTags;
            
            this.DispatcherAddress = DispatcherAddress;
            
            this.DispatcherFilterAllowed = DispatcherFilterAllowed;
            
            this.DispatcherFilterBlocked = DispatcherFilterBlocked;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties.
        /// </summary>
        /// <returns>ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckPropertiesBuilder</returns>
        public static ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckPropertiesBuilder Builder()
        {
            return new ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckPropertiesBuilder</returns>
        public ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckPropertiesBuilder With()
        {
            return Builder()
                .HcTags(HcTags)
                .DispatcherAddress(DispatcherAddress)
                .DispatcherFilterAllowed(DispatcherFilterAllowed)
                .DispatcherFilterBlocked(DispatcherFilterBlocked);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties</param>
        /// <param name="right">Compared (ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties left, ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties</param>
        /// <param name="right">Compared (ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties left, ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties.
        /// </summary>
        public sealed class ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckPropertiesBuilder
        {
            private ConfigNodePropertyArray _HcTags;
            private ConfigNodePropertyString _DispatcherAddress;
            private ConfigNodePropertyArray _DispatcherFilterAllowed;
            private ConfigNodePropertyArray _DispatcherFilterBlocked;

            internal ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties.HcTags property.
            /// </summary>
            /// <param name="value">HcTags</param>
            public ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckPropertiesBuilder HcTags(ConfigNodePropertyArray value)
            {
                _HcTags = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties.DispatcherAddress property.
            /// </summary>
            /// <param name="value">DispatcherAddress</param>
            public ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckPropertiesBuilder DispatcherAddress(ConfigNodePropertyString value)
            {
                _DispatcherAddress = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties.DispatcherFilterAllowed property.
            /// </summary>
            /// <param name="value">DispatcherFilterAllowed</param>
            public ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckPropertiesBuilder DispatcherFilterAllowed(ConfigNodePropertyArray value)
            {
                _DispatcherFilterAllowed = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties.DispatcherFilterBlocked property.
            /// </summary>
            /// <param name="value">DispatcherFilterBlocked</param>
            public ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckPropertiesBuilder DispatcherFilterBlocked(ConfigNodePropertyArray value)
            {
                _DispatcherFilterBlocked = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties.
            /// </summary>
            /// <returns>ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties</returns>
            public ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties Build()
            {
                Validate();
                return new ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties(
                    HcTags: _HcTags,
                    DispatcherAddress: _DispatcherAddress,
                    DispatcherFilterAllowed: _DispatcherFilterAllowed,
                    DispatcherFilterBlocked: _DispatcherFilterBlocked
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}