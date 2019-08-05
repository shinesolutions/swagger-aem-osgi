using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqWcmCoreImplAuthoringUIModeServiceImplProperties
    /// </summary>
    public sealed class ComDayCqWcmCoreImplAuthoringUIModeServiceImplProperties:  IEquatable<ComDayCqWcmCoreImplAuthoringUIModeServiceImplProperties>
    { 
        /// <summary>
        /// AuthoringUIModeServiceDefault
        /// </summary>
        public ConfigNodePropertyString AuthoringUIModeServiceDefault { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqWcmCoreImplAuthoringUIModeServiceImplProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqWcmCoreImplAuthoringUIModeServiceImplProperties()
        {
        }

        private ComDayCqWcmCoreImplAuthoringUIModeServiceImplProperties(ConfigNodePropertyString AuthoringUIModeServiceDefault)
        {
            
            this.AuthoringUIModeServiceDefault = AuthoringUIModeServiceDefault;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqWcmCoreImplAuthoringUIModeServiceImplProperties.
        /// </summary>
        /// <returns>ComDayCqWcmCoreImplAuthoringUIModeServiceImplPropertiesBuilder</returns>
        public static ComDayCqWcmCoreImplAuthoringUIModeServiceImplPropertiesBuilder Builder()
        {
            return new ComDayCqWcmCoreImplAuthoringUIModeServiceImplPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqWcmCoreImplAuthoringUIModeServiceImplPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqWcmCoreImplAuthoringUIModeServiceImplPropertiesBuilder</returns>
        public ComDayCqWcmCoreImplAuthoringUIModeServiceImplPropertiesBuilder With()
        {
            return Builder()
                .AuthoringUIModeServiceDefault(AuthoringUIModeServiceDefault);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqWcmCoreImplAuthoringUIModeServiceImplProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqWcmCoreImplAuthoringUIModeServiceImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmCoreImplAuthoringUIModeServiceImplProperties</param>
        /// <param name="right">Compared (ComDayCqWcmCoreImplAuthoringUIModeServiceImplProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqWcmCoreImplAuthoringUIModeServiceImplProperties left, ComDayCqWcmCoreImplAuthoringUIModeServiceImplProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqWcmCoreImplAuthoringUIModeServiceImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmCoreImplAuthoringUIModeServiceImplProperties</param>
        /// <param name="right">Compared (ComDayCqWcmCoreImplAuthoringUIModeServiceImplProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqWcmCoreImplAuthoringUIModeServiceImplProperties left, ComDayCqWcmCoreImplAuthoringUIModeServiceImplProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqWcmCoreImplAuthoringUIModeServiceImplProperties.
        /// </summary>
        public sealed class ComDayCqWcmCoreImplAuthoringUIModeServiceImplPropertiesBuilder
        {
            private ConfigNodePropertyString _AuthoringUIModeServiceDefault;

            internal ComDayCqWcmCoreImplAuthoringUIModeServiceImplPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqWcmCoreImplAuthoringUIModeServiceImplProperties.AuthoringUIModeServiceDefault property.
            /// </summary>
            /// <param name="value">AuthoringUIModeServiceDefault</param>
            public ComDayCqWcmCoreImplAuthoringUIModeServiceImplPropertiesBuilder AuthoringUIModeServiceDefault(ConfigNodePropertyString value)
            {
                _AuthoringUIModeServiceDefault = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqWcmCoreImplAuthoringUIModeServiceImplProperties.
            /// </summary>
            /// <returns>ComDayCqWcmCoreImplAuthoringUIModeServiceImplProperties</returns>
            public ComDayCqWcmCoreImplAuthoringUIModeServiceImplProperties Build()
            {
                Validate();
                return new ComDayCqWcmCoreImplAuthoringUIModeServiceImplProperties(
                    AuthoringUIModeServiceDefault: _AuthoringUIModeServiceDefault
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}