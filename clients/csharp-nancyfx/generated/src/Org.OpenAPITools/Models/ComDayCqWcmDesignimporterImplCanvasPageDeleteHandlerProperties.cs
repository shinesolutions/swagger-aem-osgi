using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties
    /// </summary>
    public sealed class ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties:  IEquatable<ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties>
    { 
        /// <summary>
        /// MinThreadPoolSize
        /// </summary>
        public ConfigNodePropertyInteger MinThreadPoolSize { get; private set; }

        /// <summary>
        /// MaxThreadPoolSize
        /// </summary>
        public ConfigNodePropertyInteger MaxThreadPoolSize { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties()
        {
        }

        private ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties(ConfigNodePropertyInteger MinThreadPoolSize, ConfigNodePropertyInteger MaxThreadPoolSize)
        {
            
            this.MinThreadPoolSize = MinThreadPoolSize;
            
            this.MaxThreadPoolSize = MaxThreadPoolSize;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties.
        /// </summary>
        /// <returns>ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerPropertiesBuilder</returns>
        public static ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerPropertiesBuilder Builder()
        {
            return new ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerPropertiesBuilder</returns>
        public ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerPropertiesBuilder With()
        {
            return Builder()
                .MinThreadPoolSize(MinThreadPoolSize)
                .MaxThreadPoolSize(MaxThreadPoolSize);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties</param>
        /// <param name="right">Compared (ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties left, ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties</param>
        /// <param name="right">Compared (ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties left, ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties.
        /// </summary>
        public sealed class ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerPropertiesBuilder
        {
            private ConfigNodePropertyInteger _MinThreadPoolSize;
            private ConfigNodePropertyInteger _MaxThreadPoolSize;

            internal ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties.MinThreadPoolSize property.
            /// </summary>
            /// <param name="value">MinThreadPoolSize</param>
            public ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerPropertiesBuilder MinThreadPoolSize(ConfigNodePropertyInteger value)
            {
                _MinThreadPoolSize = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties.MaxThreadPoolSize property.
            /// </summary>
            /// <param name="value">MaxThreadPoolSize</param>
            public ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerPropertiesBuilder MaxThreadPoolSize(ConfigNodePropertyInteger value)
            {
                _MaxThreadPoolSize = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties.
            /// </summary>
            /// <returns>ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties</returns>
            public ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties Build()
            {
                Validate();
                return new ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties(
                    MinThreadPoolSize: _MinThreadPoolSize,
                    MaxThreadPoolSize: _MaxThreadPoolSize
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}