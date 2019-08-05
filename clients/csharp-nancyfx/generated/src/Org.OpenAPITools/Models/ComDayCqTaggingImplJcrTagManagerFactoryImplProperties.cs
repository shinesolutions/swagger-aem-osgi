using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqTaggingImplJcrTagManagerFactoryImplProperties
    /// </summary>
    public sealed class ComDayCqTaggingImplJcrTagManagerFactoryImplProperties:  IEquatable<ComDayCqTaggingImplJcrTagManagerFactoryImplProperties>
    { 
        /// <summary>
        /// ValidationEnabled
        /// </summary>
        public ConfigNodePropertyBoolean ValidationEnabled { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqTaggingImplJcrTagManagerFactoryImplProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqTaggingImplJcrTagManagerFactoryImplProperties()
        {
        }

        private ComDayCqTaggingImplJcrTagManagerFactoryImplProperties(ConfigNodePropertyBoolean ValidationEnabled)
        {
            
            this.ValidationEnabled = ValidationEnabled;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqTaggingImplJcrTagManagerFactoryImplProperties.
        /// </summary>
        /// <returns>ComDayCqTaggingImplJcrTagManagerFactoryImplPropertiesBuilder</returns>
        public static ComDayCqTaggingImplJcrTagManagerFactoryImplPropertiesBuilder Builder()
        {
            return new ComDayCqTaggingImplJcrTagManagerFactoryImplPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqTaggingImplJcrTagManagerFactoryImplPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqTaggingImplJcrTagManagerFactoryImplPropertiesBuilder</returns>
        public ComDayCqTaggingImplJcrTagManagerFactoryImplPropertiesBuilder With()
        {
            return Builder()
                .ValidationEnabled(ValidationEnabled);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqTaggingImplJcrTagManagerFactoryImplProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqTaggingImplJcrTagManagerFactoryImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqTaggingImplJcrTagManagerFactoryImplProperties</param>
        /// <param name="right">Compared (ComDayCqTaggingImplJcrTagManagerFactoryImplProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqTaggingImplJcrTagManagerFactoryImplProperties left, ComDayCqTaggingImplJcrTagManagerFactoryImplProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqTaggingImplJcrTagManagerFactoryImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqTaggingImplJcrTagManagerFactoryImplProperties</param>
        /// <param name="right">Compared (ComDayCqTaggingImplJcrTagManagerFactoryImplProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqTaggingImplJcrTagManagerFactoryImplProperties left, ComDayCqTaggingImplJcrTagManagerFactoryImplProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqTaggingImplJcrTagManagerFactoryImplProperties.
        /// </summary>
        public sealed class ComDayCqTaggingImplJcrTagManagerFactoryImplPropertiesBuilder
        {
            private ConfigNodePropertyBoolean _ValidationEnabled;

            internal ComDayCqTaggingImplJcrTagManagerFactoryImplPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqTaggingImplJcrTagManagerFactoryImplProperties.ValidationEnabled property.
            /// </summary>
            /// <param name="value">ValidationEnabled</param>
            public ComDayCqTaggingImplJcrTagManagerFactoryImplPropertiesBuilder ValidationEnabled(ConfigNodePropertyBoolean value)
            {
                _ValidationEnabled = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqTaggingImplJcrTagManagerFactoryImplProperties.
            /// </summary>
            /// <returns>ComDayCqTaggingImplJcrTagManagerFactoryImplProperties</returns>
            public ComDayCqTaggingImplJcrTagManagerFactoryImplProperties Build()
            {
                Validate();
                return new ComDayCqTaggingImplJcrTagManagerFactoryImplProperties(
                    ValidationEnabled: _ValidationEnabled
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}