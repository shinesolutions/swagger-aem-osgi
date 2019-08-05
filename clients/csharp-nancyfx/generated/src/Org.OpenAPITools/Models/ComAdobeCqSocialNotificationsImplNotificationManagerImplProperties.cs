using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqSocialNotificationsImplNotificationManagerImplProperties
    /// </summary>
    public sealed class ComAdobeCqSocialNotificationsImplNotificationManagerImplProperties:  IEquatable<ComAdobeCqSocialNotificationsImplNotificationManagerImplProperties>
    { 
        /// <summary>
        /// MaxUnreadNotificationCount
        /// </summary>
        public ConfigNodePropertyInteger MaxUnreadNotificationCount { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqSocialNotificationsImplNotificationManagerImplProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqSocialNotificationsImplNotificationManagerImplProperties()
        {
        }

        private ComAdobeCqSocialNotificationsImplNotificationManagerImplProperties(ConfigNodePropertyInteger MaxUnreadNotificationCount)
        {
            
            this.MaxUnreadNotificationCount = MaxUnreadNotificationCount;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqSocialNotificationsImplNotificationManagerImplProperties.
        /// </summary>
        /// <returns>ComAdobeCqSocialNotificationsImplNotificationManagerImplPropertiesBuilder</returns>
        public static ComAdobeCqSocialNotificationsImplNotificationManagerImplPropertiesBuilder Builder()
        {
            return new ComAdobeCqSocialNotificationsImplNotificationManagerImplPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqSocialNotificationsImplNotificationManagerImplPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqSocialNotificationsImplNotificationManagerImplPropertiesBuilder</returns>
        public ComAdobeCqSocialNotificationsImplNotificationManagerImplPropertiesBuilder With()
        {
            return Builder()
                .MaxUnreadNotificationCount(MaxUnreadNotificationCount);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeCqSocialNotificationsImplNotificationManagerImplProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqSocialNotificationsImplNotificationManagerImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialNotificationsImplNotificationManagerImplProperties</param>
        /// <param name="right">Compared (ComAdobeCqSocialNotificationsImplNotificationManagerImplProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqSocialNotificationsImplNotificationManagerImplProperties left, ComAdobeCqSocialNotificationsImplNotificationManagerImplProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqSocialNotificationsImplNotificationManagerImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialNotificationsImplNotificationManagerImplProperties</param>
        /// <param name="right">Compared (ComAdobeCqSocialNotificationsImplNotificationManagerImplProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqSocialNotificationsImplNotificationManagerImplProperties left, ComAdobeCqSocialNotificationsImplNotificationManagerImplProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqSocialNotificationsImplNotificationManagerImplProperties.
        /// </summary>
        public sealed class ComAdobeCqSocialNotificationsImplNotificationManagerImplPropertiesBuilder
        {
            private ConfigNodePropertyInteger _MaxUnreadNotificationCount;

            internal ComAdobeCqSocialNotificationsImplNotificationManagerImplPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialNotificationsImplNotificationManagerImplProperties.MaxUnreadNotificationCount property.
            /// </summary>
            /// <param name="value">MaxUnreadNotificationCount</param>
            public ComAdobeCqSocialNotificationsImplNotificationManagerImplPropertiesBuilder MaxUnreadNotificationCount(ConfigNodePropertyInteger value)
            {
                _MaxUnreadNotificationCount = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqSocialNotificationsImplNotificationManagerImplProperties.
            /// </summary>
            /// <returns>ComAdobeCqSocialNotificationsImplNotificationManagerImplProperties</returns>
            public ComAdobeCqSocialNotificationsImplNotificationManagerImplProperties Build()
            {
                Validate();
                return new ComAdobeCqSocialNotificationsImplNotificationManagerImplProperties(
                    MaxUnreadNotificationCount: _MaxUnreadNotificationCount
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}