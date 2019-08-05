using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties
    /// </summary>
    public sealed class ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties:  IEquatable<ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties>
    { 
        /// <summary>
        /// NonValidChars
        /// </summary>
        public ConfigNodePropertyString NonValidChars { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties()
        {
        }

        private ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties(ConfigNodePropertyString NonValidChars)
        {
            
            this.NonValidChars = NonValidChars;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties.
        /// </summary>
        /// <returns>ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorPropertiesBuilder</returns>
        public static ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorPropertiesBuilder Builder()
        {
            return new ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorPropertiesBuilder</returns>
        public ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorPropertiesBuilder With()
        {
            return Builder()
                .NonValidChars(NonValidChars);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties</param>
        /// <param name="right">Compared (ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties left, ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties</param>
        /// <param name="right">Compared (ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties left, ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties.
        /// </summary>
        public sealed class ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorPropertiesBuilder
        {
            private ConfigNodePropertyString _NonValidChars;

            internal ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties.NonValidChars property.
            /// </summary>
            /// <param name="value">NonValidChars</param>
            public ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorPropertiesBuilder NonValidChars(ConfigNodePropertyString value)
            {
                _NonValidChars = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties.
            /// </summary>
            /// <returns>ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties</returns>
            public ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties Build()
            {
                Validate();
                return new ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties(
                    NonValidChars: _NonValidChars
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}