using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqWcmCoreImplEventPageEventAuditListenerProperties
    /// </summary>
    public sealed class ComDayCqWcmCoreImplEventPageEventAuditListenerProperties:  IEquatable<ComDayCqWcmCoreImplEventPageEventAuditListenerProperties>
    { 
        /// <summary>
        /// Configured
        /// </summary>
        public ConfigNodePropertyString Configured { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqWcmCoreImplEventPageEventAuditListenerProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqWcmCoreImplEventPageEventAuditListenerProperties()
        {
        }

        private ComDayCqWcmCoreImplEventPageEventAuditListenerProperties(ConfigNodePropertyString Configured)
        {
            
            this.Configured = Configured;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqWcmCoreImplEventPageEventAuditListenerProperties.
        /// </summary>
        /// <returns>ComDayCqWcmCoreImplEventPageEventAuditListenerPropertiesBuilder</returns>
        public static ComDayCqWcmCoreImplEventPageEventAuditListenerPropertiesBuilder Builder()
        {
            return new ComDayCqWcmCoreImplEventPageEventAuditListenerPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqWcmCoreImplEventPageEventAuditListenerPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqWcmCoreImplEventPageEventAuditListenerPropertiesBuilder</returns>
        public ComDayCqWcmCoreImplEventPageEventAuditListenerPropertiesBuilder With()
        {
            return Builder()
                .Configured(Configured);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqWcmCoreImplEventPageEventAuditListenerProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqWcmCoreImplEventPageEventAuditListenerProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmCoreImplEventPageEventAuditListenerProperties</param>
        /// <param name="right">Compared (ComDayCqWcmCoreImplEventPageEventAuditListenerProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqWcmCoreImplEventPageEventAuditListenerProperties left, ComDayCqWcmCoreImplEventPageEventAuditListenerProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqWcmCoreImplEventPageEventAuditListenerProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmCoreImplEventPageEventAuditListenerProperties</param>
        /// <param name="right">Compared (ComDayCqWcmCoreImplEventPageEventAuditListenerProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqWcmCoreImplEventPageEventAuditListenerProperties left, ComDayCqWcmCoreImplEventPageEventAuditListenerProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqWcmCoreImplEventPageEventAuditListenerProperties.
        /// </summary>
        public sealed class ComDayCqWcmCoreImplEventPageEventAuditListenerPropertiesBuilder
        {
            private ConfigNodePropertyString _Configured;

            internal ComDayCqWcmCoreImplEventPageEventAuditListenerPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqWcmCoreImplEventPageEventAuditListenerProperties.Configured property.
            /// </summary>
            /// <param name="value">Configured</param>
            public ComDayCqWcmCoreImplEventPageEventAuditListenerPropertiesBuilder Configured(ConfigNodePropertyString value)
            {
                _Configured = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqWcmCoreImplEventPageEventAuditListenerProperties.
            /// </summary>
            /// <returns>ComDayCqWcmCoreImplEventPageEventAuditListenerProperties</returns>
            public ComDayCqWcmCoreImplEventPageEventAuditListenerProperties Build()
            {
                Validate();
                return new ComDayCqWcmCoreImplEventPageEventAuditListenerProperties(
                    Configured: _Configured
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}