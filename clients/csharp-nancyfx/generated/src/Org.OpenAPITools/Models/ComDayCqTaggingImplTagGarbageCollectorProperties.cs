using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqTaggingImplTagGarbageCollectorProperties
    /// </summary>
    public sealed class ComDayCqTaggingImplTagGarbageCollectorProperties:  IEquatable<ComDayCqTaggingImplTagGarbageCollectorProperties>
    { 
        /// <summary>
        /// SchedulerExpression
        /// </summary>
        public ConfigNodePropertyString SchedulerExpression { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqTaggingImplTagGarbageCollectorProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqTaggingImplTagGarbageCollectorProperties()
        {
        }

        private ComDayCqTaggingImplTagGarbageCollectorProperties(ConfigNodePropertyString SchedulerExpression)
        {
            
            this.SchedulerExpression = SchedulerExpression;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqTaggingImplTagGarbageCollectorProperties.
        /// </summary>
        /// <returns>ComDayCqTaggingImplTagGarbageCollectorPropertiesBuilder</returns>
        public static ComDayCqTaggingImplTagGarbageCollectorPropertiesBuilder Builder()
        {
            return new ComDayCqTaggingImplTagGarbageCollectorPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqTaggingImplTagGarbageCollectorPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqTaggingImplTagGarbageCollectorPropertiesBuilder</returns>
        public ComDayCqTaggingImplTagGarbageCollectorPropertiesBuilder With()
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

        public bool Equals(ComDayCqTaggingImplTagGarbageCollectorProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqTaggingImplTagGarbageCollectorProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqTaggingImplTagGarbageCollectorProperties</param>
        /// <param name="right">Compared (ComDayCqTaggingImplTagGarbageCollectorProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqTaggingImplTagGarbageCollectorProperties left, ComDayCqTaggingImplTagGarbageCollectorProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqTaggingImplTagGarbageCollectorProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqTaggingImplTagGarbageCollectorProperties</param>
        /// <param name="right">Compared (ComDayCqTaggingImplTagGarbageCollectorProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqTaggingImplTagGarbageCollectorProperties left, ComDayCqTaggingImplTagGarbageCollectorProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqTaggingImplTagGarbageCollectorProperties.
        /// </summary>
        public sealed class ComDayCqTaggingImplTagGarbageCollectorPropertiesBuilder
        {
            private ConfigNodePropertyString _SchedulerExpression;

            internal ComDayCqTaggingImplTagGarbageCollectorPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqTaggingImplTagGarbageCollectorProperties.SchedulerExpression property.
            /// </summary>
            /// <param name="value">SchedulerExpression</param>
            public ComDayCqTaggingImplTagGarbageCollectorPropertiesBuilder SchedulerExpression(ConfigNodePropertyString value)
            {
                _SchedulerExpression = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqTaggingImplTagGarbageCollectorProperties.
            /// </summary>
            /// <returns>ComDayCqTaggingImplTagGarbageCollectorProperties</returns>
            public ComDayCqTaggingImplTagGarbageCollectorProperties Build()
            {
                Validate();
                return new ComDayCqTaggingImplTagGarbageCollectorProperties(
                    SchedulerExpression: _SchedulerExpression
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}