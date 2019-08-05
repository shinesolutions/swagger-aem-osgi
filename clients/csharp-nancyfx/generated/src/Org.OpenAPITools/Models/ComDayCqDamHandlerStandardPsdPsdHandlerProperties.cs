using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqDamHandlerStandardPsdPsdHandlerProperties
    /// </summary>
    public sealed class ComDayCqDamHandlerStandardPsdPsdHandlerProperties:  IEquatable<ComDayCqDamHandlerStandardPsdPsdHandlerProperties>
    { 
        /// <summary>
        /// LargeFileThreshold
        /// </summary>
        public ConfigNodePropertyInteger LargeFileThreshold { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqDamHandlerStandardPsdPsdHandlerProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqDamHandlerStandardPsdPsdHandlerProperties()
        {
        }

        private ComDayCqDamHandlerStandardPsdPsdHandlerProperties(ConfigNodePropertyInteger LargeFileThreshold)
        {
            
            this.LargeFileThreshold = LargeFileThreshold;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqDamHandlerStandardPsdPsdHandlerProperties.
        /// </summary>
        /// <returns>ComDayCqDamHandlerStandardPsdPsdHandlerPropertiesBuilder</returns>
        public static ComDayCqDamHandlerStandardPsdPsdHandlerPropertiesBuilder Builder()
        {
            return new ComDayCqDamHandlerStandardPsdPsdHandlerPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqDamHandlerStandardPsdPsdHandlerPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqDamHandlerStandardPsdPsdHandlerPropertiesBuilder</returns>
        public ComDayCqDamHandlerStandardPsdPsdHandlerPropertiesBuilder With()
        {
            return Builder()
                .LargeFileThreshold(LargeFileThreshold);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqDamHandlerStandardPsdPsdHandlerProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqDamHandlerStandardPsdPsdHandlerProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamHandlerStandardPsdPsdHandlerProperties</param>
        /// <param name="right">Compared (ComDayCqDamHandlerStandardPsdPsdHandlerProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqDamHandlerStandardPsdPsdHandlerProperties left, ComDayCqDamHandlerStandardPsdPsdHandlerProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqDamHandlerStandardPsdPsdHandlerProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamHandlerStandardPsdPsdHandlerProperties</param>
        /// <param name="right">Compared (ComDayCqDamHandlerStandardPsdPsdHandlerProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqDamHandlerStandardPsdPsdHandlerProperties left, ComDayCqDamHandlerStandardPsdPsdHandlerProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqDamHandlerStandardPsdPsdHandlerProperties.
        /// </summary>
        public sealed class ComDayCqDamHandlerStandardPsdPsdHandlerPropertiesBuilder
        {
            private ConfigNodePropertyInteger _LargeFileThreshold;

            internal ComDayCqDamHandlerStandardPsdPsdHandlerPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqDamHandlerStandardPsdPsdHandlerProperties.LargeFileThreshold property.
            /// </summary>
            /// <param name="value">LargeFileThreshold</param>
            public ComDayCqDamHandlerStandardPsdPsdHandlerPropertiesBuilder LargeFileThreshold(ConfigNodePropertyInteger value)
            {
                _LargeFileThreshold = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqDamHandlerStandardPsdPsdHandlerProperties.
            /// </summary>
            /// <returns>ComDayCqDamHandlerStandardPsdPsdHandlerProperties</returns>
            public ComDayCqDamHandlerStandardPsdPsdHandlerProperties Build()
            {
                Validate();
                return new ComDayCqDamHandlerStandardPsdPsdHandlerProperties(
                    LargeFileThreshold: _LargeFileThreshold
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}