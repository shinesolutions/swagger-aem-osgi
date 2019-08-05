using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteOauthServerImplAccessTokenCleanupTaskProperties
    /// </summary>
    public sealed class ComAdobeGraniteOauthServerImplAccessTokenCleanupTaskProperties:  IEquatable<ComAdobeGraniteOauthServerImplAccessTokenCleanupTaskProperties>
    { 
        /// <summary>
        /// SchedulerExpression
        /// </summary>
        public ConfigNodePropertyString SchedulerExpression { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteOauthServerImplAccessTokenCleanupTaskProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteOauthServerImplAccessTokenCleanupTaskProperties()
        {
        }

        private ComAdobeGraniteOauthServerImplAccessTokenCleanupTaskProperties(ConfigNodePropertyString SchedulerExpression)
        {
            
            this.SchedulerExpression = SchedulerExpression;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteOauthServerImplAccessTokenCleanupTaskProperties.
        /// </summary>
        /// <returns>ComAdobeGraniteOauthServerImplAccessTokenCleanupTaskPropertiesBuilder</returns>
        public static ComAdobeGraniteOauthServerImplAccessTokenCleanupTaskPropertiesBuilder Builder()
        {
            return new ComAdobeGraniteOauthServerImplAccessTokenCleanupTaskPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteOauthServerImplAccessTokenCleanupTaskPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteOauthServerImplAccessTokenCleanupTaskPropertiesBuilder</returns>
        public ComAdobeGraniteOauthServerImplAccessTokenCleanupTaskPropertiesBuilder With()
        {
            return Builder()
                .SchedulerExpression(SchedulerExpression);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeGraniteOauthServerImplAccessTokenCleanupTaskProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteOauthServerImplAccessTokenCleanupTaskProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteOauthServerImplAccessTokenCleanupTaskProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteOauthServerImplAccessTokenCleanupTaskProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteOauthServerImplAccessTokenCleanupTaskProperties left, ComAdobeGraniteOauthServerImplAccessTokenCleanupTaskProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteOauthServerImplAccessTokenCleanupTaskProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteOauthServerImplAccessTokenCleanupTaskProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteOauthServerImplAccessTokenCleanupTaskProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteOauthServerImplAccessTokenCleanupTaskProperties left, ComAdobeGraniteOauthServerImplAccessTokenCleanupTaskProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteOauthServerImplAccessTokenCleanupTaskProperties.
        /// </summary>
        public sealed class ComAdobeGraniteOauthServerImplAccessTokenCleanupTaskPropertiesBuilder
        {
            private ConfigNodePropertyString _SchedulerExpression;

            internal ComAdobeGraniteOauthServerImplAccessTokenCleanupTaskPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteOauthServerImplAccessTokenCleanupTaskProperties.SchedulerExpression property.
            /// </summary>
            /// <param name="value">SchedulerExpression</param>
            public ComAdobeGraniteOauthServerImplAccessTokenCleanupTaskPropertiesBuilder SchedulerExpression(ConfigNodePropertyString value)
            {
                _SchedulerExpression = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteOauthServerImplAccessTokenCleanupTaskProperties.
            /// </summary>
            /// <returns>ComAdobeGraniteOauthServerImplAccessTokenCleanupTaskProperties</returns>
            public ComAdobeGraniteOauthServerImplAccessTokenCleanupTaskProperties Build()
            {
                Validate();
                return new ComAdobeGraniteOauthServerImplAccessTokenCleanupTaskProperties(
                    SchedulerExpression: _SchedulerExpression
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}