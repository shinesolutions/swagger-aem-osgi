using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqWcmNotificationEmailImplEmailChannelProperties
    /// </summary>
    public sealed class ComDayCqWcmNotificationEmailImplEmailChannelProperties:  IEquatable<ComDayCqWcmNotificationEmailImplEmailChannelProperties>
    { 
        /// <summary>
        /// EmailFrom
        /// </summary>
        public ConfigNodePropertyString EmailFrom { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqWcmNotificationEmailImplEmailChannelProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqWcmNotificationEmailImplEmailChannelProperties()
        {
        }

        private ComDayCqWcmNotificationEmailImplEmailChannelProperties(ConfigNodePropertyString EmailFrom)
        {
            
            this.EmailFrom = EmailFrom;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqWcmNotificationEmailImplEmailChannelProperties.
        /// </summary>
        /// <returns>ComDayCqWcmNotificationEmailImplEmailChannelPropertiesBuilder</returns>
        public static ComDayCqWcmNotificationEmailImplEmailChannelPropertiesBuilder Builder()
        {
            return new ComDayCqWcmNotificationEmailImplEmailChannelPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqWcmNotificationEmailImplEmailChannelPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqWcmNotificationEmailImplEmailChannelPropertiesBuilder</returns>
        public ComDayCqWcmNotificationEmailImplEmailChannelPropertiesBuilder With()
        {
            return Builder()
                .EmailFrom(EmailFrom);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqWcmNotificationEmailImplEmailChannelProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqWcmNotificationEmailImplEmailChannelProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmNotificationEmailImplEmailChannelProperties</param>
        /// <param name="right">Compared (ComDayCqWcmNotificationEmailImplEmailChannelProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqWcmNotificationEmailImplEmailChannelProperties left, ComDayCqWcmNotificationEmailImplEmailChannelProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqWcmNotificationEmailImplEmailChannelProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmNotificationEmailImplEmailChannelProperties</param>
        /// <param name="right">Compared (ComDayCqWcmNotificationEmailImplEmailChannelProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqWcmNotificationEmailImplEmailChannelProperties left, ComDayCqWcmNotificationEmailImplEmailChannelProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqWcmNotificationEmailImplEmailChannelProperties.
        /// </summary>
        public sealed class ComDayCqWcmNotificationEmailImplEmailChannelPropertiesBuilder
        {
            private ConfigNodePropertyString _EmailFrom;

            internal ComDayCqWcmNotificationEmailImplEmailChannelPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqWcmNotificationEmailImplEmailChannelProperties.EmailFrom property.
            /// </summary>
            /// <param name="value">EmailFrom</param>
            public ComDayCqWcmNotificationEmailImplEmailChannelPropertiesBuilder EmailFrom(ConfigNodePropertyString value)
            {
                _EmailFrom = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqWcmNotificationEmailImplEmailChannelProperties.
            /// </summary>
            /// <returns>ComDayCqWcmNotificationEmailImplEmailChannelProperties</returns>
            public ComDayCqWcmNotificationEmailImplEmailChannelProperties Build()
            {
                Validate();
                return new ComDayCqWcmNotificationEmailImplEmailChannelProperties(
                    EmailFrom: _EmailFrom
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}