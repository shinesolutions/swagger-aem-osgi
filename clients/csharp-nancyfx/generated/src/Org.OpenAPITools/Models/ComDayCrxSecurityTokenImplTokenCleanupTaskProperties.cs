using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCrxSecurityTokenImplTokenCleanupTaskProperties
    /// </summary>
    public sealed class ComDayCrxSecurityTokenImplTokenCleanupTaskProperties:  IEquatable<ComDayCrxSecurityTokenImplTokenCleanupTaskProperties>
    { 
        /// <summary>
        /// EnableTokenCleanupTask
        /// </summary>
        public ConfigNodePropertyBoolean EnableTokenCleanupTask { get; private set; }

        /// <summary>
        /// SchedulerExpression
        /// </summary>
        public ConfigNodePropertyString SchedulerExpression { get; private set; }

        /// <summary>
        /// BatchSize
        /// </summary>
        public ConfigNodePropertyInteger BatchSize { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCrxSecurityTokenImplTokenCleanupTaskProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCrxSecurityTokenImplTokenCleanupTaskProperties()
        {
        }

        private ComDayCrxSecurityTokenImplTokenCleanupTaskProperties(ConfigNodePropertyBoolean EnableTokenCleanupTask, ConfigNodePropertyString SchedulerExpression, ConfigNodePropertyInteger BatchSize)
        {
            
            this.EnableTokenCleanupTask = EnableTokenCleanupTask;
            
            this.SchedulerExpression = SchedulerExpression;
            
            this.BatchSize = BatchSize;
            
        }

        /// <summary>
        /// Returns builder of ComDayCrxSecurityTokenImplTokenCleanupTaskProperties.
        /// </summary>
        /// <returns>ComDayCrxSecurityTokenImplTokenCleanupTaskPropertiesBuilder</returns>
        public static ComDayCrxSecurityTokenImplTokenCleanupTaskPropertiesBuilder Builder()
        {
            return new ComDayCrxSecurityTokenImplTokenCleanupTaskPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCrxSecurityTokenImplTokenCleanupTaskPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCrxSecurityTokenImplTokenCleanupTaskPropertiesBuilder</returns>
        public ComDayCrxSecurityTokenImplTokenCleanupTaskPropertiesBuilder With()
        {
            return Builder()
                .EnableTokenCleanupTask(EnableTokenCleanupTask)
                .SchedulerExpression(SchedulerExpression)
                .BatchSize(BatchSize);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCrxSecurityTokenImplTokenCleanupTaskProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCrxSecurityTokenImplTokenCleanupTaskProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCrxSecurityTokenImplTokenCleanupTaskProperties</param>
        /// <param name="right">Compared (ComDayCrxSecurityTokenImplTokenCleanupTaskProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCrxSecurityTokenImplTokenCleanupTaskProperties left, ComDayCrxSecurityTokenImplTokenCleanupTaskProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCrxSecurityTokenImplTokenCleanupTaskProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCrxSecurityTokenImplTokenCleanupTaskProperties</param>
        /// <param name="right">Compared (ComDayCrxSecurityTokenImplTokenCleanupTaskProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCrxSecurityTokenImplTokenCleanupTaskProperties left, ComDayCrxSecurityTokenImplTokenCleanupTaskProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCrxSecurityTokenImplTokenCleanupTaskProperties.
        /// </summary>
        public sealed class ComDayCrxSecurityTokenImplTokenCleanupTaskPropertiesBuilder
        {
            private ConfigNodePropertyBoolean _EnableTokenCleanupTask;
            private ConfigNodePropertyString _SchedulerExpression;
            private ConfigNodePropertyInteger _BatchSize;

            internal ComDayCrxSecurityTokenImplTokenCleanupTaskPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCrxSecurityTokenImplTokenCleanupTaskProperties.EnableTokenCleanupTask property.
            /// </summary>
            /// <param name="value">EnableTokenCleanupTask</param>
            public ComDayCrxSecurityTokenImplTokenCleanupTaskPropertiesBuilder EnableTokenCleanupTask(ConfigNodePropertyBoolean value)
            {
                _EnableTokenCleanupTask = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCrxSecurityTokenImplTokenCleanupTaskProperties.SchedulerExpression property.
            /// </summary>
            /// <param name="value">SchedulerExpression</param>
            public ComDayCrxSecurityTokenImplTokenCleanupTaskPropertiesBuilder SchedulerExpression(ConfigNodePropertyString value)
            {
                _SchedulerExpression = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCrxSecurityTokenImplTokenCleanupTaskProperties.BatchSize property.
            /// </summary>
            /// <param name="value">BatchSize</param>
            public ComDayCrxSecurityTokenImplTokenCleanupTaskPropertiesBuilder BatchSize(ConfigNodePropertyInteger value)
            {
                _BatchSize = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCrxSecurityTokenImplTokenCleanupTaskProperties.
            /// </summary>
            /// <returns>ComDayCrxSecurityTokenImplTokenCleanupTaskProperties</returns>
            public ComDayCrxSecurityTokenImplTokenCleanupTaskProperties Build()
            {
                Validate();
                return new ComDayCrxSecurityTokenImplTokenCleanupTaskProperties(
                    EnableTokenCleanupTask: _EnableTokenCleanupTask,
                    SchedulerExpression: _SchedulerExpression,
                    BatchSize: _BatchSize
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}