using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties
    /// </summary>
    public sealed class ComDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties:  IEquatable<ComDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties>
    { 
        /// <summary>
        /// Paths
        /// </summary>
        public ConfigNodePropertyArray Paths { get; private set; }

        /// <summary>
        /// ExcludedPaths
        /// </summary>
        public ConfigNodePropertyArray ExcludedPaths { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties()
        {
        }

        private ComDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties(ConfigNodePropertyArray Paths, ConfigNodePropertyArray ExcludedPaths)
        {
            
            this.Paths = Paths;
            
            this.ExcludedPaths = ExcludedPaths;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties.
        /// </summary>
        /// <returns>ComDayCqWcmCoreImplEventRepositoryChangeEventListenerPropertiesBuilder</returns>
        public static ComDayCqWcmCoreImplEventRepositoryChangeEventListenerPropertiesBuilder Builder()
        {
            return new ComDayCqWcmCoreImplEventRepositoryChangeEventListenerPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqWcmCoreImplEventRepositoryChangeEventListenerPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqWcmCoreImplEventRepositoryChangeEventListenerPropertiesBuilder</returns>
        public ComDayCqWcmCoreImplEventRepositoryChangeEventListenerPropertiesBuilder With()
        {
            return Builder()
                .Paths(Paths)
                .ExcludedPaths(ExcludedPaths);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties</param>
        /// <param name="right">Compared (ComDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties left, ComDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties</param>
        /// <param name="right">Compared (ComDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties left, ComDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties.
        /// </summary>
        public sealed class ComDayCqWcmCoreImplEventRepositoryChangeEventListenerPropertiesBuilder
        {
            private ConfigNodePropertyArray _Paths;
            private ConfigNodePropertyArray _ExcludedPaths;

            internal ComDayCqWcmCoreImplEventRepositoryChangeEventListenerPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties.Paths property.
            /// </summary>
            /// <param name="value">Paths</param>
            public ComDayCqWcmCoreImplEventRepositoryChangeEventListenerPropertiesBuilder Paths(ConfigNodePropertyArray value)
            {
                _Paths = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties.ExcludedPaths property.
            /// </summary>
            /// <param name="value">ExcludedPaths</param>
            public ComDayCqWcmCoreImplEventRepositoryChangeEventListenerPropertiesBuilder ExcludedPaths(ConfigNodePropertyArray value)
            {
                _ExcludedPaths = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties.
            /// </summary>
            /// <returns>ComDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties</returns>
            public ComDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties Build()
            {
                Validate();
                return new ComDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties(
                    Paths: _Paths,
                    ExcludedPaths: _ExcludedPaths
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}