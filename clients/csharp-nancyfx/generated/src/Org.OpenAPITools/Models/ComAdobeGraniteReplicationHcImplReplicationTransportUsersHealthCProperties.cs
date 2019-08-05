using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCProperties
    /// </summary>
    public sealed class ComAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCProperties:  IEquatable<ComAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCProperties>
    { 
        /// <summary>
        /// HcTags
        /// </summary>
        public ConfigNodePropertyArray HcTags { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCProperties()
        {
        }

        private ComAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCProperties(ConfigNodePropertyArray HcTags)
        {
            
            this.HcTags = HcTags;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCProperties.
        /// </summary>
        /// <returns>ComAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCPropertiesBuilder</returns>
        public static ComAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCPropertiesBuilder Builder()
        {
            return new ComAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCPropertiesBuilder</returns>
        public ComAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCPropertiesBuilder With()
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

        public bool Equals(ComAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCProperties left, ComAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCProperties left, ComAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCProperties.
        /// </summary>
        public sealed class ComAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCPropertiesBuilder
        {
            private ConfigNodePropertyArray _HcTags;

            internal ComAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCProperties.HcTags property.
            /// </summary>
            /// <param name="value">HcTags</param>
            public ComAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCPropertiesBuilder HcTags(ConfigNodePropertyArray value)
            {
                _HcTags = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCProperties.
            /// </summary>
            /// <returns>ComAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCProperties</returns>
            public ComAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCProperties Build()
            {
                Validate();
                return new ComAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCProperties(
                    HcTags: _HcTags
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}