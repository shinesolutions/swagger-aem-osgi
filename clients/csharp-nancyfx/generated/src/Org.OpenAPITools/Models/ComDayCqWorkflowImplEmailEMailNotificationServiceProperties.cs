using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqWorkflowImplEmailEMailNotificationServiceProperties
    /// </summary>
    public sealed class ComDayCqWorkflowImplEmailEMailNotificationServiceProperties:  IEquatable<ComDayCqWorkflowImplEmailEMailNotificationServiceProperties>
    { 
        /// <summary>
        /// FromAddress
        /// </summary>
        public ConfigNodePropertyString FromAddress { get; private set; }

        /// <summary>
        /// HostPrefix
        /// </summary>
        public ConfigNodePropertyString HostPrefix { get; private set; }

        /// <summary>
        /// NotifyOnabort
        /// </summary>
        public ConfigNodePropertyBoolean NotifyOnabort { get; private set; }

        /// <summary>
        /// NotifyOncomplete
        /// </summary>
        public ConfigNodePropertyBoolean NotifyOncomplete { get; private set; }

        /// <summary>
        /// NotifyOncontainercomplete
        /// </summary>
        public ConfigNodePropertyBoolean NotifyOncontainercomplete { get; private set; }

        /// <summary>
        /// NotifyUseronly
        /// </summary>
        public ConfigNodePropertyBoolean NotifyUseronly { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqWorkflowImplEmailEMailNotificationServiceProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqWorkflowImplEmailEMailNotificationServiceProperties()
        {
        }

        private ComDayCqWorkflowImplEmailEMailNotificationServiceProperties(ConfigNodePropertyString FromAddress, ConfigNodePropertyString HostPrefix, ConfigNodePropertyBoolean NotifyOnabort, ConfigNodePropertyBoolean NotifyOncomplete, ConfigNodePropertyBoolean NotifyOncontainercomplete, ConfigNodePropertyBoolean NotifyUseronly)
        {
            
            this.FromAddress = FromAddress;
            
            this.HostPrefix = HostPrefix;
            
            this.NotifyOnabort = NotifyOnabort;
            
            this.NotifyOncomplete = NotifyOncomplete;
            
            this.NotifyOncontainercomplete = NotifyOncontainercomplete;
            
            this.NotifyUseronly = NotifyUseronly;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqWorkflowImplEmailEMailNotificationServiceProperties.
        /// </summary>
        /// <returns>ComDayCqWorkflowImplEmailEMailNotificationServicePropertiesBuilder</returns>
        public static ComDayCqWorkflowImplEmailEMailNotificationServicePropertiesBuilder Builder()
        {
            return new ComDayCqWorkflowImplEmailEMailNotificationServicePropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqWorkflowImplEmailEMailNotificationServicePropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqWorkflowImplEmailEMailNotificationServicePropertiesBuilder</returns>
        public ComDayCqWorkflowImplEmailEMailNotificationServicePropertiesBuilder With()
        {
            return Builder()
                .FromAddress(FromAddress)
                .HostPrefix(HostPrefix)
                .NotifyOnabort(NotifyOnabort)
                .NotifyOncomplete(NotifyOncomplete)
                .NotifyOncontainercomplete(NotifyOncontainercomplete)
                .NotifyUseronly(NotifyUseronly);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqWorkflowImplEmailEMailNotificationServiceProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqWorkflowImplEmailEMailNotificationServiceProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWorkflowImplEmailEMailNotificationServiceProperties</param>
        /// <param name="right">Compared (ComDayCqWorkflowImplEmailEMailNotificationServiceProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqWorkflowImplEmailEMailNotificationServiceProperties left, ComDayCqWorkflowImplEmailEMailNotificationServiceProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqWorkflowImplEmailEMailNotificationServiceProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWorkflowImplEmailEMailNotificationServiceProperties</param>
        /// <param name="right">Compared (ComDayCqWorkflowImplEmailEMailNotificationServiceProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqWorkflowImplEmailEMailNotificationServiceProperties left, ComDayCqWorkflowImplEmailEMailNotificationServiceProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqWorkflowImplEmailEMailNotificationServiceProperties.
        /// </summary>
        public sealed class ComDayCqWorkflowImplEmailEMailNotificationServicePropertiesBuilder
        {
            private ConfigNodePropertyString _FromAddress;
            private ConfigNodePropertyString _HostPrefix;
            private ConfigNodePropertyBoolean _NotifyOnabort;
            private ConfigNodePropertyBoolean _NotifyOncomplete;
            private ConfigNodePropertyBoolean _NotifyOncontainercomplete;
            private ConfigNodePropertyBoolean _NotifyUseronly;

            internal ComDayCqWorkflowImplEmailEMailNotificationServicePropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqWorkflowImplEmailEMailNotificationServiceProperties.FromAddress property.
            /// </summary>
            /// <param name="value">FromAddress</param>
            public ComDayCqWorkflowImplEmailEMailNotificationServicePropertiesBuilder FromAddress(ConfigNodePropertyString value)
            {
                _FromAddress = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWorkflowImplEmailEMailNotificationServiceProperties.HostPrefix property.
            /// </summary>
            /// <param name="value">HostPrefix</param>
            public ComDayCqWorkflowImplEmailEMailNotificationServicePropertiesBuilder HostPrefix(ConfigNodePropertyString value)
            {
                _HostPrefix = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWorkflowImplEmailEMailNotificationServiceProperties.NotifyOnabort property.
            /// </summary>
            /// <param name="value">NotifyOnabort</param>
            public ComDayCqWorkflowImplEmailEMailNotificationServicePropertiesBuilder NotifyOnabort(ConfigNodePropertyBoolean value)
            {
                _NotifyOnabort = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWorkflowImplEmailEMailNotificationServiceProperties.NotifyOncomplete property.
            /// </summary>
            /// <param name="value">NotifyOncomplete</param>
            public ComDayCqWorkflowImplEmailEMailNotificationServicePropertiesBuilder NotifyOncomplete(ConfigNodePropertyBoolean value)
            {
                _NotifyOncomplete = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWorkflowImplEmailEMailNotificationServiceProperties.NotifyOncontainercomplete property.
            /// </summary>
            /// <param name="value">NotifyOncontainercomplete</param>
            public ComDayCqWorkflowImplEmailEMailNotificationServicePropertiesBuilder NotifyOncontainercomplete(ConfigNodePropertyBoolean value)
            {
                _NotifyOncontainercomplete = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWorkflowImplEmailEMailNotificationServiceProperties.NotifyUseronly property.
            /// </summary>
            /// <param name="value">NotifyUseronly</param>
            public ComDayCqWorkflowImplEmailEMailNotificationServicePropertiesBuilder NotifyUseronly(ConfigNodePropertyBoolean value)
            {
                _NotifyUseronly = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqWorkflowImplEmailEMailNotificationServiceProperties.
            /// </summary>
            /// <returns>ComDayCqWorkflowImplEmailEMailNotificationServiceProperties</returns>
            public ComDayCqWorkflowImplEmailEMailNotificationServiceProperties Build()
            {
                Validate();
                return new ComDayCqWorkflowImplEmailEMailNotificationServiceProperties(
                    FromAddress: _FromAddress,
                    HostPrefix: _HostPrefix,
                    NotifyOnabort: _NotifyOnabort,
                    NotifyOncomplete: _NotifyOncomplete,
                    NotifyOncontainercomplete: _NotifyOncontainercomplete,
                    NotifyUseronly: _NotifyUseronly
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}