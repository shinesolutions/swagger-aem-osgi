using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqWcmCoreImplEventPagePostProcessorProperties
    /// </summary>
    public sealed class ComDayCqWcmCoreImplEventPagePostProcessorProperties:  IEquatable<ComDayCqWcmCoreImplEventPagePostProcessorProperties>
    { 
        /// <summary>
        /// Paths
        /// </summary>
        public ConfigNodePropertyArray Paths { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqWcmCoreImplEventPagePostProcessorProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqWcmCoreImplEventPagePostProcessorProperties()
        {
        }

        private ComDayCqWcmCoreImplEventPagePostProcessorProperties(ConfigNodePropertyArray Paths)
        {
            
            this.Paths = Paths;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqWcmCoreImplEventPagePostProcessorProperties.
        /// </summary>
        /// <returns>ComDayCqWcmCoreImplEventPagePostProcessorPropertiesBuilder</returns>
        public static ComDayCqWcmCoreImplEventPagePostProcessorPropertiesBuilder Builder()
        {
            return new ComDayCqWcmCoreImplEventPagePostProcessorPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqWcmCoreImplEventPagePostProcessorPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqWcmCoreImplEventPagePostProcessorPropertiesBuilder</returns>
        public ComDayCqWcmCoreImplEventPagePostProcessorPropertiesBuilder With()
        {
            return Builder()
                .Paths(Paths);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqWcmCoreImplEventPagePostProcessorProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqWcmCoreImplEventPagePostProcessorProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmCoreImplEventPagePostProcessorProperties</param>
        /// <param name="right">Compared (ComDayCqWcmCoreImplEventPagePostProcessorProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqWcmCoreImplEventPagePostProcessorProperties left, ComDayCqWcmCoreImplEventPagePostProcessorProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqWcmCoreImplEventPagePostProcessorProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmCoreImplEventPagePostProcessorProperties</param>
        /// <param name="right">Compared (ComDayCqWcmCoreImplEventPagePostProcessorProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqWcmCoreImplEventPagePostProcessorProperties left, ComDayCqWcmCoreImplEventPagePostProcessorProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqWcmCoreImplEventPagePostProcessorProperties.
        /// </summary>
        public sealed class ComDayCqWcmCoreImplEventPagePostProcessorPropertiesBuilder
        {
            private ConfigNodePropertyArray _Paths;

            internal ComDayCqWcmCoreImplEventPagePostProcessorPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqWcmCoreImplEventPagePostProcessorProperties.Paths property.
            /// </summary>
            /// <param name="value">Paths</param>
            public ComDayCqWcmCoreImplEventPagePostProcessorPropertiesBuilder Paths(ConfigNodePropertyArray value)
            {
                _Paths = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqWcmCoreImplEventPagePostProcessorProperties.
            /// </summary>
            /// <returns>ComDayCqWcmCoreImplEventPagePostProcessorProperties</returns>
            public ComDayCqWcmCoreImplEventPagePostProcessorProperties Build()
            {
                Validate();
                return new ComDayCqWcmCoreImplEventPagePostProcessorProperties(
                    Paths: _Paths
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}