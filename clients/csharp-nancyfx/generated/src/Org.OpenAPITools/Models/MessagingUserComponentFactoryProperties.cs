using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// MessagingUserComponentFactoryProperties
    /// </summary>
    public sealed class MessagingUserComponentFactoryProperties:  IEquatable<MessagingUserComponentFactoryProperties>
    { 
        /// <summary>
        /// Priority
        /// </summary>
        public ConfigNodePropertyInteger Priority { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use MessagingUserComponentFactoryProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public MessagingUserComponentFactoryProperties()
        {
        }

        private MessagingUserComponentFactoryProperties(ConfigNodePropertyInteger Priority)
        {
            
            this.Priority = Priority;
            
        }

        /// <summary>
        /// Returns builder of MessagingUserComponentFactoryProperties.
        /// </summary>
        /// <returns>MessagingUserComponentFactoryPropertiesBuilder</returns>
        public static MessagingUserComponentFactoryPropertiesBuilder Builder()
        {
            return new MessagingUserComponentFactoryPropertiesBuilder();
        }

        /// <summary>
        /// Returns MessagingUserComponentFactoryPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>MessagingUserComponentFactoryPropertiesBuilder</returns>
        public MessagingUserComponentFactoryPropertiesBuilder With()
        {
            return Builder()
                .Priority(Priority);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(MessagingUserComponentFactoryProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (MessagingUserComponentFactoryProperties.
        /// </summary>
        /// <param name="left">Compared (MessagingUserComponentFactoryProperties</param>
        /// <param name="right">Compared (MessagingUserComponentFactoryProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (MessagingUserComponentFactoryProperties left, MessagingUserComponentFactoryProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (MessagingUserComponentFactoryProperties.
        /// </summary>
        /// <param name="left">Compared (MessagingUserComponentFactoryProperties</param>
        /// <param name="right">Compared (MessagingUserComponentFactoryProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (MessagingUserComponentFactoryProperties left, MessagingUserComponentFactoryProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of MessagingUserComponentFactoryProperties.
        /// </summary>
        public sealed class MessagingUserComponentFactoryPropertiesBuilder
        {
            private ConfigNodePropertyInteger _Priority;

            internal MessagingUserComponentFactoryPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for MessagingUserComponentFactoryProperties.Priority property.
            /// </summary>
            /// <param name="value">Priority</param>
            public MessagingUserComponentFactoryPropertiesBuilder Priority(ConfigNodePropertyInteger value)
            {
                _Priority = value;
                return this;
            }


            /// <summary>
            /// Builds instance of MessagingUserComponentFactoryProperties.
            /// </summary>
            /// <returns>MessagingUserComponentFactoryProperties</returns>
            public MessagingUserComponentFactoryProperties Build()
            {
                Validate();
                return new MessagingUserComponentFactoryProperties(
                    Priority: _Priority
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}