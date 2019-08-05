using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties
    /// </summary>
    public sealed class ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties:  IEquatable<ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties>
    { 
        /// <summary>
        /// EventFilter
        /// </summary>
        public ConfigNodePropertyString EventFilter { get; private set; }

        /// <summary>
        /// MinThreadPoolSize
        /// </summary>
        public ConfigNodePropertyInteger MinThreadPoolSize { get; private set; }

        /// <summary>
        /// MaxThreadPoolSize
        /// </summary>
        public ConfigNodePropertyInteger MaxThreadPoolSize { get; private set; }

        /// <summary>
        /// CqWcmWorkflowTerminateOnActivate
        /// </summary>
        public ConfigNodePropertyBoolean CqWcmWorkflowTerminateOnActivate { get; private set; }

        /// <summary>
        /// CqWcmWorklfowTerminateExclusionList
        /// </summary>
        public ConfigNodePropertyArray CqWcmWorklfowTerminateExclusionList { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties()
        {
        }

        private ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties(ConfigNodePropertyString EventFilter, ConfigNodePropertyInteger MinThreadPoolSize, ConfigNodePropertyInteger MaxThreadPoolSize, ConfigNodePropertyBoolean CqWcmWorkflowTerminateOnActivate, ConfigNodePropertyArray CqWcmWorklfowTerminateExclusionList)
        {
            
            this.EventFilter = EventFilter;
            
            this.MinThreadPoolSize = MinThreadPoolSize;
            
            this.MaxThreadPoolSize = MaxThreadPoolSize;
            
            this.CqWcmWorkflowTerminateOnActivate = CqWcmWorkflowTerminateOnActivate;
            
            this.CqWcmWorklfowTerminateExclusionList = CqWcmWorklfowTerminateExclusionList;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties.
        /// </summary>
        /// <returns>ComDayCqWcmWorkflowImplWcmWorkflowServiceImplPropertiesBuilder</returns>
        public static ComDayCqWcmWorkflowImplWcmWorkflowServiceImplPropertiesBuilder Builder()
        {
            return new ComDayCqWcmWorkflowImplWcmWorkflowServiceImplPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqWcmWorkflowImplWcmWorkflowServiceImplPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqWcmWorkflowImplWcmWorkflowServiceImplPropertiesBuilder</returns>
        public ComDayCqWcmWorkflowImplWcmWorkflowServiceImplPropertiesBuilder With()
        {
            return Builder()
                .EventFilter(EventFilter)
                .MinThreadPoolSize(MinThreadPoolSize)
                .MaxThreadPoolSize(MaxThreadPoolSize)
                .CqWcmWorkflowTerminateOnActivate(CqWcmWorkflowTerminateOnActivate)
                .CqWcmWorklfowTerminateExclusionList(CqWcmWorklfowTerminateExclusionList);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties</param>
        /// <param name="right">Compared (ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties left, ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties</param>
        /// <param name="right">Compared (ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties left, ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties.
        /// </summary>
        public sealed class ComDayCqWcmWorkflowImplWcmWorkflowServiceImplPropertiesBuilder
        {
            private ConfigNodePropertyString _EventFilter;
            private ConfigNodePropertyInteger _MinThreadPoolSize;
            private ConfigNodePropertyInteger _MaxThreadPoolSize;
            private ConfigNodePropertyBoolean _CqWcmWorkflowTerminateOnActivate;
            private ConfigNodePropertyArray _CqWcmWorklfowTerminateExclusionList;

            internal ComDayCqWcmWorkflowImplWcmWorkflowServiceImplPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties.EventFilter property.
            /// </summary>
            /// <param name="value">EventFilter</param>
            public ComDayCqWcmWorkflowImplWcmWorkflowServiceImplPropertiesBuilder EventFilter(ConfigNodePropertyString value)
            {
                _EventFilter = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties.MinThreadPoolSize property.
            /// </summary>
            /// <param name="value">MinThreadPoolSize</param>
            public ComDayCqWcmWorkflowImplWcmWorkflowServiceImplPropertiesBuilder MinThreadPoolSize(ConfigNodePropertyInteger value)
            {
                _MinThreadPoolSize = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties.MaxThreadPoolSize property.
            /// </summary>
            /// <param name="value">MaxThreadPoolSize</param>
            public ComDayCqWcmWorkflowImplWcmWorkflowServiceImplPropertiesBuilder MaxThreadPoolSize(ConfigNodePropertyInteger value)
            {
                _MaxThreadPoolSize = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties.CqWcmWorkflowTerminateOnActivate property.
            /// </summary>
            /// <param name="value">CqWcmWorkflowTerminateOnActivate</param>
            public ComDayCqWcmWorkflowImplWcmWorkflowServiceImplPropertiesBuilder CqWcmWorkflowTerminateOnActivate(ConfigNodePropertyBoolean value)
            {
                _CqWcmWorkflowTerminateOnActivate = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties.CqWcmWorklfowTerminateExclusionList property.
            /// </summary>
            /// <param name="value">CqWcmWorklfowTerminateExclusionList</param>
            public ComDayCqWcmWorkflowImplWcmWorkflowServiceImplPropertiesBuilder CqWcmWorklfowTerminateExclusionList(ConfigNodePropertyArray value)
            {
                _CqWcmWorklfowTerminateExclusionList = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties.
            /// </summary>
            /// <returns>ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties</returns>
            public ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties Build()
            {
                Validate();
                return new ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties(
                    EventFilter: _EventFilter,
                    MinThreadPoolSize: _MinThreadPoolSize,
                    MaxThreadPoolSize: _MaxThreadPoolSize,
                    CqWcmWorkflowTerminateOnActivate: _CqWcmWorkflowTerminateOnActivate,
                    CqWcmWorklfowTerminateExclusionList: _CqWcmWorklfowTerminateExclusionList
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}