using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqNotificationImplNotificationServiceImplProperties
    /// </summary>
    public sealed class ComDayCqNotificationImplNotificationServiceImplProperties:  IEquatable<ComDayCqNotificationImplNotificationServiceImplProperties>
    { 
        /// <summary>
        /// EventFilter
        /// </summary>
        public ConfigNodePropertyString EventFilter { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqNotificationImplNotificationServiceImplProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqNotificationImplNotificationServiceImplProperties()
        {
        }

        private ComDayCqNotificationImplNotificationServiceImplProperties(ConfigNodePropertyString EventFilter)
        {
            
            this.EventFilter = EventFilter;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqNotificationImplNotificationServiceImplProperties.
        /// </summary>
        /// <returns>ComDayCqNotificationImplNotificationServiceImplPropertiesBuilder</returns>
        public static ComDayCqNotificationImplNotificationServiceImplPropertiesBuilder Builder()
        {
            return new ComDayCqNotificationImplNotificationServiceImplPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqNotificationImplNotificationServiceImplPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqNotificationImplNotificationServiceImplPropertiesBuilder</returns>
        public ComDayCqNotificationImplNotificationServiceImplPropertiesBuilder With()
        {
            return Builder()
                .EventFilter(EventFilter);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqNotificationImplNotificationServiceImplProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqNotificationImplNotificationServiceImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqNotificationImplNotificationServiceImplProperties</param>
        /// <param name="right">Compared (ComDayCqNotificationImplNotificationServiceImplProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqNotificationImplNotificationServiceImplProperties left, ComDayCqNotificationImplNotificationServiceImplProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqNotificationImplNotificationServiceImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqNotificationImplNotificationServiceImplProperties</param>
        /// <param name="right">Compared (ComDayCqNotificationImplNotificationServiceImplProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqNotificationImplNotificationServiceImplProperties left, ComDayCqNotificationImplNotificationServiceImplProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqNotificationImplNotificationServiceImplProperties.
        /// </summary>
        public sealed class ComDayCqNotificationImplNotificationServiceImplPropertiesBuilder
        {
            private ConfigNodePropertyString _EventFilter;

            internal ComDayCqNotificationImplNotificationServiceImplPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqNotificationImplNotificationServiceImplProperties.EventFilter property.
            /// </summary>
            /// <param name="value">EventFilter</param>
            public ComDayCqNotificationImplNotificationServiceImplPropertiesBuilder EventFilter(ConfigNodePropertyString value)
            {
                _EventFilter = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqNotificationImplNotificationServiceImplProperties.
            /// </summary>
            /// <returns>ComDayCqNotificationImplNotificationServiceImplProperties</returns>
            public ComDayCqNotificationImplNotificationServiceImplProperties Build()
            {
                Validate();
                return new ComDayCqNotificationImplNotificationServiceImplProperties(
                    EventFilter: _EventFilter
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}