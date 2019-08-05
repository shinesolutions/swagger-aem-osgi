using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties
    /// </summary>
    public sealed class ComAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties:  IEquatable<ComAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties>
    { 
        /// <summary>
        /// ComAdobeDamMacSyncClientSoTimeout
        /// </summary>
        public ConfigNodePropertyInteger ComAdobeDamMacSyncClientSoTimeout { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties()
        {
        }

        private ComAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties(ConfigNodePropertyInteger ComAdobeDamMacSyncClientSoTimeout)
        {
            
            this.ComAdobeDamMacSyncClientSoTimeout = ComAdobeDamMacSyncClientSoTimeout;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties.
        /// </summary>
        /// <returns>ComAdobeCqDamMacSyncHelperImplMACSyncClientImplPropertiesBuilder</returns>
        public static ComAdobeCqDamMacSyncHelperImplMACSyncClientImplPropertiesBuilder Builder()
        {
            return new ComAdobeCqDamMacSyncHelperImplMACSyncClientImplPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqDamMacSyncHelperImplMACSyncClientImplPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqDamMacSyncHelperImplMACSyncClientImplPropertiesBuilder</returns>
        public ComAdobeCqDamMacSyncHelperImplMACSyncClientImplPropertiesBuilder With()
        {
            return Builder()
                .ComAdobeDamMacSyncClientSoTimeout(ComAdobeDamMacSyncClientSoTimeout);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties</param>
        /// <param name="right">Compared (ComAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties left, ComAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties</param>
        /// <param name="right">Compared (ComAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties left, ComAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties.
        /// </summary>
        public sealed class ComAdobeCqDamMacSyncHelperImplMACSyncClientImplPropertiesBuilder
        {
            private ConfigNodePropertyInteger _ComAdobeDamMacSyncClientSoTimeout;

            internal ComAdobeCqDamMacSyncHelperImplMACSyncClientImplPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties.ComAdobeDamMacSyncClientSoTimeout property.
            /// </summary>
            /// <param name="value">ComAdobeDamMacSyncClientSoTimeout</param>
            public ComAdobeCqDamMacSyncHelperImplMACSyncClientImplPropertiesBuilder ComAdobeDamMacSyncClientSoTimeout(ConfigNodePropertyInteger value)
            {
                _ComAdobeDamMacSyncClientSoTimeout = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties.
            /// </summary>
            /// <returns>ComAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties</returns>
            public ComAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties Build()
            {
                Validate();
                return new ComAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties(
                    ComAdobeDamMacSyncClientSoTimeout: _ComAdobeDamMacSyncClientSoTimeout
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}