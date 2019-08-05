using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqWcmNotificationImplNotificationManagerImplProperties
    /// </summary>
    public sealed class ComDayCqWcmNotificationImplNotificationManagerImplProperties:  IEquatable<ComDayCqWcmNotificationImplNotificationManagerImplProperties>
    { 
        /// <summary>
        /// EventTopics
        /// </summary>
        public ConfigNodePropertyArray EventTopics { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqWcmNotificationImplNotificationManagerImplProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqWcmNotificationImplNotificationManagerImplProperties()
        {
        }

        private ComDayCqWcmNotificationImplNotificationManagerImplProperties(ConfigNodePropertyArray EventTopics)
        {
            
            this.EventTopics = EventTopics;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqWcmNotificationImplNotificationManagerImplProperties.
        /// </summary>
        /// <returns>ComDayCqWcmNotificationImplNotificationManagerImplPropertiesBuilder</returns>
        public static ComDayCqWcmNotificationImplNotificationManagerImplPropertiesBuilder Builder()
        {
            return new ComDayCqWcmNotificationImplNotificationManagerImplPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqWcmNotificationImplNotificationManagerImplPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqWcmNotificationImplNotificationManagerImplPropertiesBuilder</returns>
        public ComDayCqWcmNotificationImplNotificationManagerImplPropertiesBuilder With()
        {
            return Builder()
                .EventTopics(EventTopics);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqWcmNotificationImplNotificationManagerImplProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqWcmNotificationImplNotificationManagerImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmNotificationImplNotificationManagerImplProperties</param>
        /// <param name="right">Compared (ComDayCqWcmNotificationImplNotificationManagerImplProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqWcmNotificationImplNotificationManagerImplProperties left, ComDayCqWcmNotificationImplNotificationManagerImplProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqWcmNotificationImplNotificationManagerImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmNotificationImplNotificationManagerImplProperties</param>
        /// <param name="right">Compared (ComDayCqWcmNotificationImplNotificationManagerImplProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqWcmNotificationImplNotificationManagerImplProperties left, ComDayCqWcmNotificationImplNotificationManagerImplProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqWcmNotificationImplNotificationManagerImplProperties.
        /// </summary>
        public sealed class ComDayCqWcmNotificationImplNotificationManagerImplPropertiesBuilder
        {
            private ConfigNodePropertyArray _EventTopics;

            internal ComDayCqWcmNotificationImplNotificationManagerImplPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqWcmNotificationImplNotificationManagerImplProperties.EventTopics property.
            /// </summary>
            /// <param name="value">EventTopics</param>
            public ComDayCqWcmNotificationImplNotificationManagerImplPropertiesBuilder EventTopics(ConfigNodePropertyArray value)
            {
                _EventTopics = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqWcmNotificationImplNotificationManagerImplProperties.
            /// </summary>
            /// <returns>ComDayCqWcmNotificationImplNotificationManagerImplProperties</returns>
            public ComDayCqWcmNotificationImplNotificationManagerImplProperties Build()
            {
                Validate();
                return new ComDayCqWcmNotificationImplNotificationManagerImplProperties(
                    EventTopics: _EventTopics
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}