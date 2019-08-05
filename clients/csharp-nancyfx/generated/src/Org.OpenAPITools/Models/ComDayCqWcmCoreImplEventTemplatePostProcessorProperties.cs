using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqWcmCoreImplEventTemplatePostProcessorProperties
    /// </summary>
    public sealed class ComDayCqWcmCoreImplEventTemplatePostProcessorProperties:  IEquatable<ComDayCqWcmCoreImplEventTemplatePostProcessorProperties>
    { 
        /// <summary>
        /// Paths
        /// </summary>
        public ConfigNodePropertyString Paths { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqWcmCoreImplEventTemplatePostProcessorProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqWcmCoreImplEventTemplatePostProcessorProperties()
        {
        }

        private ComDayCqWcmCoreImplEventTemplatePostProcessorProperties(ConfigNodePropertyString Paths)
        {
            
            this.Paths = Paths;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqWcmCoreImplEventTemplatePostProcessorProperties.
        /// </summary>
        /// <returns>ComDayCqWcmCoreImplEventTemplatePostProcessorPropertiesBuilder</returns>
        public static ComDayCqWcmCoreImplEventTemplatePostProcessorPropertiesBuilder Builder()
        {
            return new ComDayCqWcmCoreImplEventTemplatePostProcessorPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqWcmCoreImplEventTemplatePostProcessorPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqWcmCoreImplEventTemplatePostProcessorPropertiesBuilder</returns>
        public ComDayCqWcmCoreImplEventTemplatePostProcessorPropertiesBuilder With()
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

        public bool Equals(ComDayCqWcmCoreImplEventTemplatePostProcessorProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqWcmCoreImplEventTemplatePostProcessorProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmCoreImplEventTemplatePostProcessorProperties</param>
        /// <param name="right">Compared (ComDayCqWcmCoreImplEventTemplatePostProcessorProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqWcmCoreImplEventTemplatePostProcessorProperties left, ComDayCqWcmCoreImplEventTemplatePostProcessorProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqWcmCoreImplEventTemplatePostProcessorProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmCoreImplEventTemplatePostProcessorProperties</param>
        /// <param name="right">Compared (ComDayCqWcmCoreImplEventTemplatePostProcessorProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqWcmCoreImplEventTemplatePostProcessorProperties left, ComDayCqWcmCoreImplEventTemplatePostProcessorProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqWcmCoreImplEventTemplatePostProcessorProperties.
        /// </summary>
        public sealed class ComDayCqWcmCoreImplEventTemplatePostProcessorPropertiesBuilder
        {
            private ConfigNodePropertyString _Paths;

            internal ComDayCqWcmCoreImplEventTemplatePostProcessorPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqWcmCoreImplEventTemplatePostProcessorProperties.Paths property.
            /// </summary>
            /// <param name="value">Paths</param>
            public ComDayCqWcmCoreImplEventTemplatePostProcessorPropertiesBuilder Paths(ConfigNodePropertyString value)
            {
                _Paths = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqWcmCoreImplEventTemplatePostProcessorProperties.
            /// </summary>
            /// <returns>ComDayCqWcmCoreImplEventTemplatePostProcessorProperties</returns>
            public ComDayCqWcmCoreImplEventTemplatePostProcessorProperties Build()
            {
                Validate();
                return new ComDayCqWcmCoreImplEventTemplatePostProcessorProperties(
                    Paths: _Paths
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}