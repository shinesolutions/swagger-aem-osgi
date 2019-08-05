using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqDamCoreImplDamChangeEventListenerProperties
    /// </summary>
    public sealed class ComDayCqDamCoreImplDamChangeEventListenerProperties:  IEquatable<ComDayCqDamCoreImplDamChangeEventListenerProperties>
    { 
        /// <summary>
        /// ChangeeventlistenerObservedPaths
        /// </summary>
        public ConfigNodePropertyArray ChangeeventlistenerObservedPaths { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqDamCoreImplDamChangeEventListenerProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqDamCoreImplDamChangeEventListenerProperties()
        {
        }

        private ComDayCqDamCoreImplDamChangeEventListenerProperties(ConfigNodePropertyArray ChangeeventlistenerObservedPaths)
        {
            
            this.ChangeeventlistenerObservedPaths = ChangeeventlistenerObservedPaths;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqDamCoreImplDamChangeEventListenerProperties.
        /// </summary>
        /// <returns>ComDayCqDamCoreImplDamChangeEventListenerPropertiesBuilder</returns>
        public static ComDayCqDamCoreImplDamChangeEventListenerPropertiesBuilder Builder()
        {
            return new ComDayCqDamCoreImplDamChangeEventListenerPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqDamCoreImplDamChangeEventListenerPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqDamCoreImplDamChangeEventListenerPropertiesBuilder</returns>
        public ComDayCqDamCoreImplDamChangeEventListenerPropertiesBuilder With()
        {
            return Builder()
                .ChangeeventlistenerObservedPaths(ChangeeventlistenerObservedPaths);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqDamCoreImplDamChangeEventListenerProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqDamCoreImplDamChangeEventListenerProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreImplDamChangeEventListenerProperties</param>
        /// <param name="right">Compared (ComDayCqDamCoreImplDamChangeEventListenerProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqDamCoreImplDamChangeEventListenerProperties left, ComDayCqDamCoreImplDamChangeEventListenerProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqDamCoreImplDamChangeEventListenerProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreImplDamChangeEventListenerProperties</param>
        /// <param name="right">Compared (ComDayCqDamCoreImplDamChangeEventListenerProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqDamCoreImplDamChangeEventListenerProperties left, ComDayCqDamCoreImplDamChangeEventListenerProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqDamCoreImplDamChangeEventListenerProperties.
        /// </summary>
        public sealed class ComDayCqDamCoreImplDamChangeEventListenerPropertiesBuilder
        {
            private ConfigNodePropertyArray _ChangeeventlistenerObservedPaths;

            internal ComDayCqDamCoreImplDamChangeEventListenerPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplDamChangeEventListenerProperties.ChangeeventlistenerObservedPaths property.
            /// </summary>
            /// <param name="value">ChangeeventlistenerObservedPaths</param>
            public ComDayCqDamCoreImplDamChangeEventListenerPropertiesBuilder ChangeeventlistenerObservedPaths(ConfigNodePropertyArray value)
            {
                _ChangeeventlistenerObservedPaths = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqDamCoreImplDamChangeEventListenerProperties.
            /// </summary>
            /// <returns>ComDayCqDamCoreImplDamChangeEventListenerProperties</returns>
            public ComDayCqDamCoreImplDamChangeEventListenerProperties Build()
            {
                Validate();
                return new ComDayCqDamCoreImplDamChangeEventListenerProperties(
                    ChangeeventlistenerObservedPaths: _ChangeeventlistenerObservedPaths
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}